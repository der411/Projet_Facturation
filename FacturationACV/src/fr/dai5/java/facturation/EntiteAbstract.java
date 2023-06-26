package fr.dai5.java.facturation;

public abstract class EntiteAbstract {

	private String identifiant;
	private String adresse;
	private String telephone;
	private String mail;
	
	public EntiteAbstract(String identifiant, String adresse, String telephone, String mail) {
		this.identifiant = identifiant;
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getIdentifiant() {
		return identifiant;
	}
	
}
