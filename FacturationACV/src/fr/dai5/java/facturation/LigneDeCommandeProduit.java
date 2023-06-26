package fr.dai5.java.facturation;
import fr.dai5.java.offre.Produit;

public class LigneDeCommandeProduit {
	
	private Produit produit;
	private int quantite;
	private String uniteDeMesure;
	
	public LigneDeCommandeProduit(Produit produit, int quantite, String uniteDeMesure) {
		this.produit = produit;
		this.quantite = quantite;
		this.uniteDeMesure = uniteDeMesure;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getUniteDeMesure() {
		return uniteDeMesure;
	}

	public void setUniteDeMesure(String uniteDeMesure) {
		this.uniteDeMesure = uniteDeMesure;
	}

	public double getPrixHT() {
		return produit.getPrix() * quantite;
	}
	
	public double getPrixTTC() {
		return (produit.getPrix() * quantite / 100 * produit.getTva());
	}
}
