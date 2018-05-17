package de.gbsschulen;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/**
 * 
 * @author andreasmaier
 *
 */
public class ArtikelService {

	private EntityManagerFactory emf;
	private EntityManager em;

	public ArtikelService() {
		emf = Persistence.createEntityManagerFactory("Artikel");
		em = emf.createEntityManager();
	}

	public void close() {

		if (em != null) {
			em.close();
		}

		if (emf != null) {
			emf.close();
		}
	}

	public Artikel find(int artnr) {
		return em.find(Artikel.class, artnr);
	}

	public List<Artikel> receiveList() {
		TypedQuery<Artikel> query = em.createQuery("SELECT a from Artikel a", Artikel.class);
		return query.getResultList();
	}
	
	public List<Artikel> receiveList(double vkpreis){
		List<Artikel> list = receiveList();
		List<Artikel> newList = new ArrayList<>();
		for (Artikel artikel : list) {
			if (artikel.getVkpreis() >= vkpreis) {
				newList.add(artikel);
			}
		}
		return newList;
	}
	
	public Artikel delete(int artnr) {
		Artikel artikel = find(artnr);
		if (artikel != null) {
			em.getTransaction().begin();
			em.remove(artikel);
			em.getTransaction().commit();
		}
		return artikel;
	}
}
