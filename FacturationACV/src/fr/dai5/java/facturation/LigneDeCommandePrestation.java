package fr.dai5.java.facturation;
import fr.dai5.java.offre.CategoriePrestation;
import fr.dai5.java.offre.Prestation;
import fr.dai5.java.prestataire.EmployePrestataire;

public class LigneDeCommandePrestation {

	private Prestation prestation;
	private int duree;
	private double fraisAnnexes;
	private String descriptionFrais;
	private CategoriePrestation categoriePrestation;
	private EmployePrestataire employePrestataire;
	
	public LigneDeCommandePrestation(Prestation prestation, int duree, double fraisAnnexes, String descriptionFrais,
			CategoriePrestation categoriePrestation, EmployePrestataire employePrestataire) {
		this.prestation = prestation;
		this.duree = duree;
		this.fraisAnnexes = fraisAnnexes;
		this.descriptionFrais = descriptionFrais;
		this.categoriePrestation = categoriePrestation;
		this.employePrestataire = employePrestataire;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public double getFraisAnnexes() {
		return fraisAnnexes;
	}

	public void setFraisAnnexes(double fraisAnnexes) {
		this.fraisAnnexes = fraisAnnexes;
	}

	public String getDescriptionFrais() {
		return descriptionFrais;
	}

	public void setDescriptionFrais(String descriptionFrais) {
		this.descriptionFrais = descriptionFrais;
	}

	public CategoriePrestation getCategoriePrestation() {
		return categoriePrestation;
	}

	public void setCategoriePrestation(CategoriePrestation categoriePrestation) {
		this.categoriePrestation = categoriePrestation;
	}

	public EmployePrestataire getEmployePrestataire() {
		return employePrestataire;
	}

	public void setEmployePrestataire(EmployePrestataire employePrestataire) {
		this.employePrestataire = employePrestataire;
	}

	public double getPrixHT() {
		return prestation.getPrix() * duree + fraisAnnexes;
	}
	
	public double getPrixTTC() {
		return ((prestation.getPrix() * duree + fraisAnnexes) / 100 * prestation.getTva());
	}
}
