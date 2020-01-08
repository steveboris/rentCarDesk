package mietwagen;

public class Fahrzeug {
	private String kennzeichen;
	private String modelname;
	private String farbe;
	private String kaufdatum;
	private String kaufsvertragsnr;
	private String tüv;
	private String versichNr;
	private String klasse;
	private Double mietwagen;
	private String typ;
	private int tankvolumen;
	private int mietdauer;
	private int geschwindigkeit;
	private String marke;

	public Fahrzeug() {

	}

	public Fahrzeug(String kennzeichen, String modelname, String farbe, String marke) {
		this.kennzeichen = kennzeichen;
		this.modelname = modelname;
		this.farbe = farbe;
		this.marke = marke;

	}

	public String getKennzeichen() {
		return kennzeichen;

	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public double benzinVerbrauch() {
		return 0;

	}

	public double gefahrenekm() {
		return 0;
	}
	
	public String toString() {
		return "\nKennzeichnen:" + kennzeichen + "\nMarke: " + marke + "\nModel: " + modelname +
				"\nFarbe " + farbe;
	}
	
}
