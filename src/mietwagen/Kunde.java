package mietwagen;

import java.util.ArrayList;

public class Kunde {
	
	private String kdnr;
	private String name;
	private String adresse;
	private String geb;
	private int kontoNr;
	private int schufaNr;
	private int versichNr;
	
	public Kunde() {
				
	}
	
	public Kunde(String kdnr, String name, String adresse, String geb) {
		this.kdnr = kdnr;
		this.name = name;
		this.adresse = adresse;
		this.geb = geb;
	}
	
	public String getKdnr() {
		return kdnr; 
	}
	
	public void setKdnr(String kdnr) {
		this.kdnr = kdnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getGeb() {
		return geb;
	}

	public void setGeb(String geb) {
		this.geb = geb;
	}

	public int getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(int kontoNr) {
		this.kontoNr = kontoNr;
	}

	public int getSchufaNr() {
		return schufaNr;
	}

	public void setSchufaNr(int schufaNr) {
		this.schufaNr = schufaNr;
	}

	public int getVersichNr() {
		return versichNr;
	}

	public void setVersichNr(int versichNr) {
		this.versichNr = versichNr;
	}
	
	public int rechneGebdatum () {
		return 0;	
	}
	
	
	public String toString() {
		return "\nKundennummer: " + kdnr +"\nKundenname: " + name +  "\nAdresse: " + adresse
				+ "\nGeburtstag:" + geb +"\nKontennummer: " + kontoNr + "\nSchufanummer: " + 
				schufaNr + "\nVersichungsnummer:" + versichNr + "\n\nBestellte Autos: ";
		
	}  
}
