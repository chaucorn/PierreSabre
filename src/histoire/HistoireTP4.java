package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
        // Create an instance of the Humain class
        Humain prof = new Humain("Prof", "kombucha", 54);
        Commercant marco = new Commercant("Marco", "the", 0, null);

        // Scenario
        prof.direBonjour();
        prof.acheter("boisson", 12);
        prof.boire();
        prof.acheter("jeu", 2);
        prof.acheter("kimono", 50);
        
        marco.direBonjour();
        marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();
    }
}
