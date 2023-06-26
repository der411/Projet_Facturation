package fr.dai5.java.client;

public class ClientParticulier extends ClientAbstract {

	private String nom;
	private String prenom;
	
	public ClientParticulier(String identifiant, String nom, String prenom,
			String adresse, String telephone, String mail, double tvaIntracommunautaire) {
		super(identifiant, adresse, telephone, mail, tvaIntracommunautaire);
		this.nom = nom;
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
