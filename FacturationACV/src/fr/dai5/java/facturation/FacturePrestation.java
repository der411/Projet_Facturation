package fr.dai5.java.facturation;
import java.util.ArrayList;
import java.util.Calendar;

import fr.dai5.java.client.ClientAbstract;
import fr.dai5.java.prestataire.Prestataire;

public class FacturePrestation extends FactureAbstract {

	private ArrayList<LigneDeCommandePrestation> ldcPrestation;
	
	public FacturePrestation(int identifiant, Calendar dateFacture, Calendar dateEcheance, ClientAbstract client,
			Prestataire prestataire, ArrayList<LigneDeCommandePrestation> ldcPrestation) {
		super(identifiant, dateFacture, dateEcheance, client, prestataire);
		this.ldcPrestation = ldcPrestation; 
	}

	public ArrayList<LigneDeCommandePrestation> getLdcPrestation() {
		return ldcPrestation;
	}

	public void setLdcPrestation(ArrayList<LigneDeCommandePrestation> ldcPrestation) {
		this.ldcPrestation = ldcPrestation;
	}
	
	public double getTotalHT() {
		double totalHT = 0;
		
		for(int i = 0 ; i < ldcPrestation.size() ; i++) {
			totalHT += ldcPrestation.get(i).getPrixHT();
		}
		return totalHT;
	}
	
	public double getTotalTTC() {
		double totalTTC = 0;
		
		for(int i = 0 ; i < ldcPrestation.size() ; i++) {
			totalTTC += ldcPrestation.get(i).getPrixTTC();
		}
		
		return totalTTC;
	}
}
