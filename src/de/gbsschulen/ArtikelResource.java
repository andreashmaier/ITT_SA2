package de.gbsschulen;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
/**
 * 
 * @author andreasmaier
 *
 */
@Path("/artikel")
public class ArtikelResource {

	private ArtikelService artikelService = new ArtikelService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{artnr}")
	public Artikel getArtikel(@PathParam("artnr") int artnr) {
		return artikelService.find(artnr);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Artikel> getAllArtikels() {
		return artikelService.receiveList();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/query")
	public List<Artikel> getAllArtikels(@QueryParam("vkpreis") double vkpreis) {
		return artikelService.receiveList(vkpreis);
	}

	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{artnr}")
	public String delete(@PathParam("artnr") int artnr) {
		Artikel artikel = artikelService.delete(artnr);
		if (artikel != null) {
			return "gelöscht: Artikelnummer: " + artikel.getArtnr() + " Bezeichung: " + artikel.getBezeichnung();
		}
		return "Kein Artikel mit " + artnr + " vorhanden!";
	}
}
