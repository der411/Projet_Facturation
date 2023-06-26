package fr.dai5.java.facturation;
import java.util.Calendar;
import fr.dai5.java.client.*;
import fr.dai5.java.prestataire.*;

public abstract class FactureAbstract {

	private int identifiant;
	private Calendar dateFacture;
	private Calendar dateEcheance;
	private ClientAbstract client;
	private Prestataire prestataire;

	public FactureAbstract(int identifiant, Calendar dateFacture, Calendar dateEcheance, 
			ClientAbstract client, Prestataire prestataire) {
		this.identifiant = identifiant;
		this.dateFacture = dateFacture;
		this.dateEcheance = dateEcheance;
		this.client = client;
		this.prestataire = prestataire;
	}

	public int getIdentifiant() {
		return identifiant;
	} 

	public Calendar getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Calendar dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Calendar getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(Calendar dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public ClientAbstract getClient() {
		return client;
	}

	public void setClient(ClientAbstract client) {
		this.client = client;
	}

	public Prestataire getPrestataire() {
		return prestataire;
	}

	public void setPrestataire(Prestataire prestataire) {
		this.prestataire = prestataire;
	}

}
