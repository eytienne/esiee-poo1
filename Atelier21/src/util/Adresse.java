package util;

public class Adresse {
	private String voie, complement, codePostal, ville;

	public Adresse(String voie, String complement, String codePostal, String ville) {
		this.voie = voie;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return this.voie 
				+ (this.complement != null && !this.complement.isEmpty() ? " (" + this.complement + ")" : "") + ", "
				+ this.codePostal + " " + this.ville;
	}

}
