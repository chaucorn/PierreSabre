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
	
	public void provoquer(Yakuza adversaire) {
		parler("- Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand!");
		int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			argent += adversaire.argent;
			honneur += 1;
			parler("- Je t’ai eu petit yakuza!");
			adversaire.perdre();
		} else {
			honneur -= 1;
			int lost = argent;
			parler("- J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(lost);
			argent = 0;
		}
	}
}
