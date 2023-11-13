package personnages;

public class Commercant extends Humain{
	private String bienVendu;

    public Commercant(String nom, String boissonFavorite, int argent, String bienVendu) {
        super(nom, boissonFavorite, argent);
        this.bienVendu = bienVendu;
    }

    // Method specific to Commercant
    public void seFaireExtorquer() {
        parler("- J’ai tout perdu! Le monde est trop injuste...");
    }

    // Method specific to Commercant
    public void recevoir(int argentRecu) {
    	
        parler("- " + argentRecu + " sous ! Je te remercie généreux donateur!");
        argent += argentRecu;
    }
}
