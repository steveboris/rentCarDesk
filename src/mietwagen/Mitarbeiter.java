package mietwagen;

import java.util.ArrayList;

public class Mitarbeiter {

	public Mitarbeiter() {
		
	}
	
	public String getMitarbeiterId() {
		return mitarbeiterId;
	}


	public void setMitarbeiterId(String mitarbeiterId) {
		this.mitarbeiterId = mitarbeiterId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	// Methoden
	public void KundeAnlegen(ArrayList<Kunde> kundeList, Kunde nk) {
		 kundeList.add(nk);  // nk -> newKunde
 	}
	
	public void fahrzeugsAnlangen(ArrayList<Fahrzeug> fahrzeugsList, Fahrzeug nf) {
		fahrzeugsList.add(nf);
	}
	
	public void doReservation(ArrayList<Bestellung> Bestellungslist, Bestellung nb) {
		Bestellungslist.add(nb);
	}

	
	private String mitarbeiterId;
	private String name;
}



	
