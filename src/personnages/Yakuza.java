package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation;
	
	// COnstructor
	public Yakuza(String nom, String boissonFavorite, int argent, String clan, int reputation) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = (reputation < 4) ? 4 : reputation;
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
	
	public void perdre() {
		int lost = argent;
		reputation -= 1;
		argent = 0;
		parler("- J’ai perdu mon duel et mes " + lost + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation += 1;
		parler("- Ce ronin pensait vraiment battre Yaku Le Noir du clan de Warsong ? Je l'ai dépouillé de ses " + gain + "sous");
	}
	
	
}
