package fr.dai5.java.facturation;
import java.util.ArrayList;
import java.util.Calendar;

import fr.dai5.java.client.ClientAbstract;
import fr.dai5.java.prestataire.Prestataire;

public class FactureProduit extends FactureAbstract {

	private ArrayList<LigneDeCommandeProduit> ldcProduit;
	
	public FactureProduit(int identifiant, Calendar dateFacture, Calendar dateEcheance, ClientAbstract client,
			Prestataire prestataire, ArrayList<LigneDeCommandeProduit> ldcProduit) {
		super(identifiant, dateFacture, dateEcheance, client, prestataire);
		this.ldcProduit = ldcProduit; 
	}

	public ArrayList<LigneDeCommandeProduit> getLdcProduit() {
		return ldcProduit;
	}

	public void setLdcProduit(ArrayList<LigneDeCommandeProduit> ldcProduit) {
		this.ldcProduit = ldcProduit;
	}
	
	public double getTotalHT() {
		double totalHT = 0;
		
		for(int i = 0 ; i < ldcProduit.size() ; i++) {
			totalHT += ldcProduit.get(i).getPrixHT();
		}
		return totalHT;
	}
	
	public double getTotalTTC() {
		double totalTTC = 0;
		
		for(int i = 0 ; i < ldcProduit.size() ; i++) {
			totalTTC += ldcProduit.get(i).getPrixTTC();
		}
		
		return totalTTC;
	}
}
