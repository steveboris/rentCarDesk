/**
 * 
 */
package mietwagen;

import java.util.ArrayList;

/**
 * Bestellung.java
 * @author vmont
 *
 */
public class Bestellung {

	/**
	 * Constrructor
	 */
	public Bestellung(String heutzigesDatum, Kunde kunde, ArrayList<Fahrzeug> fahrzeug, 
					  String annahmeDatum, String rueckgabeDatum, float preis) {
		
		// erhoert den BestellungsList Zahl auf 1
		counter++;
		
		setHeutzigesDatum(heutzigesDatum);
		setKunde(kunde);
		setFahrzeug(fahrzeug);
		setAnnahmeDatum(annahmeDatum);
		setRueckgabeDatum(rueckgabeDatum);
		setPreise(preis);
	}
	
	public Bestellung() {
		counter++;
	}
	
	// getters and Setters	
	public String getBuchungsNr() {
		return bestellungsNr;
	}

//	public void setBuchungsNr(String buchungsNr) {
//		this.bestellungsNr = buchungsNr;
//	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	public ArrayList<Fahrzeug> getFahrzeug() {
		return fahrzeug;
	}

	public void setFahrzeug(ArrayList<Fahrzeug> fahrzeug) {
		this.fahrzeug = fahrzeug;
	}

	public String getHeutzigesDatum() {
		return heutzigesDatum;
	}

	public void setHeutzigesDatum(String heutzigesDatum) {
		this.heutzigesDatum = heutzigesDatum;
	}

	public String getAnnahmeDatum() {
		return annahmeDatum;
	}

	public void setAnnahmeDatum(String annahmeDatum) {
		this.annahmeDatum = annahmeDatum;
	}

	public String getRueckgabeDatum() {
		return rueckgabeDatum;
	}

	public void setRueckgabeDatum(String rueckgabeDatum) {
		this.rueckgabeDatum = rueckgabeDatum;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreise(float preis) {
		this.preis = preis;
	}

	public Rechnung getRechnungsNr() {
		return rechnung;
	}

	public void setRechnungsNr(Rechnung rechnung) {
		this.rechnung = rechnung;
	}
	
	/*
	 * erzeugenBestellungsNr - Funktion fuer die Erzeugerung einer BestellungsNummer
	 * BestellungsNr ->
	 */
	private String erzeugBestellungsNr() {
		return kunde.getName().substring(0, 3) + kunde.getGeb().substring(8) + "-" + counter;
	}
	
	/*
	 * erzeugeRechnung
	 * this create and use an instance of the Object Rechnung.
	 */
	public String erzeugeRechnung() {
		StringBuilder sb = new StringBuilder();
		rechnung = new Rechnung();
		sb.append(rechnung.toString() + "\n");
		sb.append("Kunde Name: " + kunde.getName() + "\n");
		sb.append("Bestellungsliste: " + fahrzeug.toString() + "\n");
		sb.append("Gesammt Preis: " + preis + " Euro\n");

		return sb.toString();
	}
	
	public String toString() {
		StringBuilder content = new StringBuilder();
		content.append("****************************************************************************\n");
		content.append("BestellungsNummer: " + erzeugBestellungsNr() + "\n");
		content.append("Datum: " + heutzigesDatum + "\n");
		content.append("Information zum kunde: " + kunde.toString() + "\n");
		content.append(fahrzeug.toString() + "\n");
		content.append("Annahme Datum: " + annahmeDatum + "\n");
		content.append("Rueckgabe Datum: " + rueckgabeDatum + "\n");
		content.append("Preis: " + preis + " Euro\n\n");
		content.append("Ihre Rechnung wurde erstellt. (Rechnung aufnachen oder link zeigen lassen->spaeter)");
		content.append("\n****************************************************************************\n");
		
		return content.toString();
	}

	//Attribute
	private String bestellungsNr; // auto generated
	private Kunde kunde;
	private ArrayList<Fahrzeug> fahrzeug = new ArrayList<Fahrzeug>();
	private int anzahl; // nb of cars
	private float caution;
	private String heutzigesDatum;
	private String annahmeDatum; // von Typ DateTime spaeter zu implementieren
	private String rueckgabeDatum;
	private float preis;
	private Rechnung rechnung; // auto genarated
	public static int counter = 0;
}
