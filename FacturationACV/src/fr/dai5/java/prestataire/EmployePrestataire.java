package fr.dai5.java.prestataire;

import fr.dai5.java.facturation.EntiteAbstract;

public class EmployePrestataire extends EntiteAbstract {
	
	private Prestataire entreprise;
	private String poste;
	private CategorieEmploye categorieEmploye;
	private ServiceEmploye serviceEmploye;

	public EmployePrestataire(String identifiant, String adresse, String telephone, 
			String mail, Prestataire entreprise, CategorieEmploye categorieEmploye,
			ServiceEmploye serviceEmploye) {
		super(identifiant, adresse, telephone, mail);
		this.entreprise = entreprise;
		this.categorieEmploye = categorieEmploye;
		this.serviceEmploye = serviceEmploye;
	}

	public Prestataire getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Prestataire entreprise) {
		this.entreprise = entreprise;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public CategorieEmploye getCategorieEmploye() {
		return categorieEmploye;
	}

	public void setCategorieEmploye(CategorieEmploye categorieEmploye) {
		this.categorieEmploye = categorieEmploye;
	}

	public ServiceEmploye getServiceEmploye() {
		return serviceEmploye;
	}

	public void setServiceEmploye(ServiceEmploye serviceEmploye) {
		this.serviceEmploye = serviceEmploye;
	}
	
}
