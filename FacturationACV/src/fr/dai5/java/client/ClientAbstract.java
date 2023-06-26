package fr.dai5.java.client;

import fr.dai5.java.facturation.EntiteAbstract;

public abstract class ClientAbstract extends EntiteAbstract {

	private double tvaIntracommunautaire;
	
	public ClientAbstract(String identifiant, String adresse, String telephone, String mail,
			double tvaIntracommunautaire) {
		super(identifiant, adresse, telephone, mail);
		this.tvaIntracommunautaire = tvaIntracommunautaire;
	}

	public double getTvaIntracommunautaire() {
		return tvaIntracommunautaire;
	}

	public void setTvaIntracommunautaire(double tvaIntracommunautaire) {
		this.tvaIntracommunautaire = tvaIntracommunautaire;
	}
	
}
