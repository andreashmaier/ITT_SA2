package de.gbsschulen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 
 * @author andreasmaier
 *
 */
@XmlRootElement
@Entity
public class Artikel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int artnr;
	private String bezeichnung;
	private String gruppe;
	private double vkpreis;
	private int lief;
	private double ekpreis;
	private int lieferzeit;
	private int mindbestand;
	private String hinweis;
	private int mengebestellt;
	private int mwst;
	private int aktiv;
	private String inaktivam;
	private String inaktivvon;
	public int getArtnr() {
		return artnr;
	}
	public void setArtnr(int artnr) {
		this.artnr = artnr;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getGruppe() {
		return gruppe;
	}
	public void setGruppe(String gruppe) {
		this.gruppe = gruppe;
	}
	public double getVkpreis() {
		return vkpreis;
	}
	public void setVkpreis(double vkpreis) {
		this.vkpreis = vkpreis;
	}
	public int getLief() {
		return lief;
	}
	public void setLief(int lief) {
		this.lief = lief;
	}
	public double getEkpreis() {
		return ekpreis;
	}
	public void setEkpreis(double ekpreis) {
		this.ekpreis = ekpreis;
	}
	public int getLieferzeit() {
		return lieferzeit;
	}
	public void setLieferzeit(int lieferzeit) {
		this.lieferzeit = lieferzeit;
	}
	public int getMindbestand() {
		return mindbestand;
	}
	public void setMindbestand(int mindbestand) {
		this.mindbestand = mindbestand;
	}
	public String getHinweis() {
		return hinweis;
	}
	public void setHinweis(String hinweis) {
		this.hinweis = hinweis;
	}
	public int getMengebestellt() {
		return mengebestellt;
	}
	public void setMengebestellt(int mengebestellt) {
		this.mengebestellt = mengebestellt;
	}
	public int getMwst() {
		return mwst;
	}
	public void setMwst(int mwst) {
		this.mwst = mwst;
	}
	public int getAktiv() {
		return aktiv;
	}
	public void setAktiv(int aktiv) {
		this.aktiv = aktiv;
	}
	public String getInaktivam() {
		return inaktivam;
	}
	public void setInaktivam(String inaktivam) {
		this.inaktivam = inaktivam;
	}
	public String getInaktivvon() {
		return inaktivvon;
	}
	public void setInaktivvon(String inaktivvon) {
		this.inaktivvon = inaktivvon;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aktiv;
		result = prime * result + artnr;
		result = prime * result + ((bezeichnung == null) ? 0 : bezeichnung.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ekpreis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((gruppe == null) ? 0 : gruppe.hashCode());
		result = prime * result + ((hinweis == null) ? 0 : hinweis.hashCode());
		result = prime * result + ((inaktivam == null) ? 0 : inaktivam.hashCode());
		result = prime * result + ((inaktivvon == null) ? 0 : inaktivvon.hashCode());
		result = prime * result + lief;
		result = prime * result + lieferzeit;
		result = prime * result + mengebestellt;
		result = prime * result + mindbestand;
		result = prime * result + mwst;
		temp = Double.doubleToLongBits(vkpreis);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikel other = (Artikel) obj;
		if (aktiv != other.aktiv)
			return false;
		if (artnr != other.artnr)
			return false;
		if (bezeichnung == null) {
			if (other.bezeichnung != null)
				return false;
		} else if (!bezeichnung.equals(other.bezeichnung))
			return false;
		if (Double.doubleToLongBits(ekpreis) != Double.doubleToLongBits(other.ekpreis))
			return false;
		if (gruppe == null) {
			if (other.gruppe != null)
				return false;
		} else if (!gruppe.equals(other.gruppe))
			return false;
		if (hinweis == null) {
			if (other.hinweis != null)
				return false;
		} else if (!hinweis.equals(other.hinweis))
			return false;
		if (inaktivam == null) {
			if (other.inaktivam != null)
				return false;
		} else if (!inaktivam.equals(other.inaktivam))
			return false;
		if (inaktivvon == null) {
			if (other.inaktivvon != null)
				return false;
		} else if (!inaktivvon.equals(other.inaktivvon))
			return false;
		if (lief != other.lief)
			return false;
		if (lieferzeit != other.lieferzeit)
			return false;
		if (mengebestellt != other.mengebestellt)
			return false;
		if (mindbestand != other.mindbestand)
			return false;
		if (mwst != other.mwst)
			return false;
		if (Double.doubleToLongBits(vkpreis) != Double.doubleToLongBits(other.vkpreis))
			return false;
		return true;
	}
	
	
	
}
