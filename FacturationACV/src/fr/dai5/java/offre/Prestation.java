package fr.dai5.java.offre;

/**
 * Service rendu par un prestataire.
 * @author axelt
 *
 */ 

public class Prestation {
	
	private int identifiant;
	private String description;
	private double prix;
	private double tva;
	
	public Prestation(int identifiant, String description, double prix, double tva) {
		super();
		this.identifiant = identifiant;
		this.description = description;
		this.prix = prix;
		this.tva = tva;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}
	
}
