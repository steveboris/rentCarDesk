package mietwagen;

public class Rechnung {
	
	// Constructor with argument
	public Rechnung(String content) {
		//Anzahl von Rechnungen auf eins mehr
		counter++;

		this.content = content;
	}
	
	// Default constructor.
	public Rechnung() {
		counter++;
	}
	
	// Getters and Setters
	public String getRechnungsNr() {
		return rechnungsNr;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public String erzeugeRechnung() {
		return "FIRMA "  + counter; 
	}

	public String toString() {
		return erzeugeRechnung();
	}
	
	// Attribute
	private String rechnungsNr; // ID
	private String content;
	public static int counter = 0;
}
