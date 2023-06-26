package fr.dai5.java.offre;

/**
 * Article que l'on souhaite vendre.
 * @author axelt
 *
 */
import java.util.Calendar;

public class Produit {
	
	private int identifiant;
	private int codeBarres;
	private String description;
	private CategorieProduit categorie;
	private double prix;
	private double tva;
	private Calendar dateFabrication;
	private Calendar dateExpiration;
	
	public Produit(int identifiant, int codeBarres, String description, CategorieProduit categorie,  
			double prix, double tva, Calendar dateFabrication, Calendar dateExpiration) {
		super();
		this.identifiant = identifiant;
		this.codeBarres = codeBarres;
		this.description = description;
		this.categorie = categorie;
		this.prix = prix;
		this.tva = tva;
		this.dateFabrication = dateFabrication;
		this.dateExpiration = dateExpiration;
	}

	public int getIdentifiant() {
		return identifiant;
	}
	
	public int getCodeBarres() {
		return codeBarres;
	}

	public void setCodeBarres(int codeBarres) {
		this.codeBarres = codeBarres;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategorieProduit getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieProduit categorie) {
		this.categorie = categorie;
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

	public Calendar getDateFabrication() {
		return dateFabrication;
	}

	public void setDateFabrication(Calendar dateFabrication) {
		this.dateFabrication = dateFabrication;
	}

	public Calendar getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Calendar dateExpiration) {
		this.dateExpiration = dateExpiration;
	} 
	
}
