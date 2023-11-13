package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
        // Create an instance of the Humain class
        Humain prof = new Humain("Prof", "kombucha", 54);
        Commercant marco = new Commercant("Marco", "the", 0, null);
        Yakuza lenoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
        Ronin roro = new Ronin("Roro", "shochu", 60, 1);

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
        
        lenoir.direBonjour();
        lenoir.extorquer(marco);
        
        roro.direBonjour();
        roro.donner(marco);
        
        
        
    }
}
