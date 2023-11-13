package personnages;

public class Humain {
	private String nom;
    private String boissonFavorite;
    private int argent;

    // Constructor
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    // Getter for nom
    public String getNom() {
        return nom;
    }

    // Getter for argent
    public int getArgent() {
        return argent;
    }

    // Method to say hello
    public void direBonjour() {
        parler("- Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    // Method to drink
    public void boire() {
        parler("- Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    // Method to buy something
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
        	parler("- J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
        	argent -= prix;
        } else {
            parler("- Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
            		+ prix + " sous .");
        }
    }

    // Method to gain money
    public void gagnerArgent(int gain) {
        argent += gain;
        parler("- J'ai gagné " + gain + " euros ! Maintenant, j'ai " + argent + " euros.");
    }

    // Method to lose money
    public void perdreArgent(int perte) {
        argent -= perte;
        parler("- J'ai perdu " + perte + " euros. Maintenant, il me reste " + argent + " euros.");
    }

    // Private method to speak
    protected void parler(String texte) {
        System.out.println(texte);
    }
}
