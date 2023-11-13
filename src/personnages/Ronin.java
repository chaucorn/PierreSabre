package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	// COnstructor
	public Ronin(String nom, String boissonFavorite, int argent, int honneur) {
		super(nom, boissonFavorite, argent);
		this.honneur = 1;
	}

	public int getHonneur() {
		return honneur;
	}
	
	// Methode donner
	
	public void donner(Commercant beneficiare) {
		int don = (int) (argent * 0.1);
		argent -= don;
		parler("- " + beneficiare.getNom() + " prend ces " + don + " sous. ");
		beneficiare.recevoir(don);
	}
}
