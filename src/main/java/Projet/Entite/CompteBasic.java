package Projet.Entite;


public class CompteBasic implements Compte{
	private long  numero;
	private Client client ;
	private double solde;
	/**
	 * 
	 */
	public CompteBasic(long  numero,Client cli,double solde) {
		// TODO Auto-generated constructor stub
	this.client= cli;
	this.numero = numero;
	this.solde = solde;
	}

	public long getNumero() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}
	public Client getClient() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getSolde () {
		return solde;
	}
	
	public boolean ExisteCompte() {
		// TODO Auto-generated method stub
		return this != null;
	}
	public String toString() {
		return "Le numero Est : "+numero+
				     " le Client est : "+client.tostring()+
				     "Le solde est : "+solde;
		}

	public void setSolde(double solde) {
		// TODO Auto-generated method stub
	this.	solde=solde;
	}


}
