package mietwagen;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		
		Kunde k = new Kunde();
		k.setKdnr("1");
		Kunde k2 = new Kunde("2", "adama", "metens", "02.03.2018");
		
		k2.setKontoNr(1256355);
		
		Fahrzeug f = new Fahrzeug("stz", "Ml240", "rot", "Mercedes");
		Fahrzeug f2 = new Fahrzeug("auto2", "Golf", "Black", "Volkswagen");
		
		ArrayList<Fahrzeug> cars = new ArrayList<Fahrzeug>();
		cars.add(f);

		// orders
		Bestellung bestellung = new Bestellung("18-12-2019", k2, cars, "20-12-2019", "30-12-2019", 500.0f);
		//System.out.println(bestellung.toString());
		//System.out.println(bestellung.erzeugeRechnung());
		
		cars.add(f2);
		Bestellung bestellung2 = new Bestellung("18-12-2019", k2, cars, "19-12-2019", "29-12-2019", 255);
		System.out.println(bestellung2.toString());
		System.out.println(bestellung2.erzeugeRechnung());
	}

}
