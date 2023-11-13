package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
        // Create an instance of the Humain class
        Humain prof = new Humain("Prof", "kombucha", 54);

        // Scenario
        prof.direBonjour();
        prof.acheter("boisson", 12);
        prof.boire();
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
    }
}
