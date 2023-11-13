package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	// COnstructor
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = (reputation < 0) ? 0 : reputation;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}
	
	// Methode extorquer
	
	public void extorquer(Commercant victime) {
		parler("- Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler("- " + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		int stolen = victime.getArgent();
		argent += stolen;
		parler("- J’ai piqué les " + stolen +" sous de Marco, ce qui me fait " + argent + " sous dans  ma poche. Hi ! Hi !");
		victime.argent = 0;
		reputation += 1;
	}
}
