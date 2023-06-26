package fr.dai5.java.client;

public class ClientEntreprise extends ClientAbstract {

	private String raisonSociale;
	
	public ClientEntreprise(String identifiant, String raisonSociale,
			String adresse, String telephone, String mail, double tvaIntracommunautaire) {
		super(identifiant, adresse, telephone, mail, tvaIntracommunautaire);
		this.raisonSociale = raisonSociale;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

}
