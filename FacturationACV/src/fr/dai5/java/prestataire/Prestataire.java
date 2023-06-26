package fr.dai5.java.prestataire;

import java.util.ArrayList;

import fr.dai5.java.facturation.EntiteAbstract;
import fr.dai5.java.facturation.MoyenPaiement;

public class Prestataire extends EntiteAbstract {

	private String raisonSociale;
	private ArrayList<MoyenPaiement> moyensPaiment; 
	private int siren;
	private String numTva;
	
	public Prestataire(String identifiant, String adresse, String telephone, String mail, String raisonSociale,
			ArrayList<MoyenPaiement> moyensPaiment,int siren,String numTva) {
		super(identifiant, adresse, telephone, mail);
		this.raisonSociale = raisonSociale;
		this.moyensPaiment = moyensPaiment;
		this.siren = siren;
		this.numTva = numTva;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public ArrayList<MoyenPaiement> getMoyensPaiment() {
		return moyensPaiment;
	}

	public void setMoyensPaiment(ArrayList<MoyenPaiement> moyensPaiment) {
		this.moyensPaiment = moyensPaiment;
	}

	public int getSiren() {
		return siren;
	}

	public void setSiren(int siren) {
		this.siren = siren;
	}

	public String getNumTva() {
		return numTva;
	}

	public void setNumTva(String numTva) {
		this.numTva = numTva;
	}
	
}
