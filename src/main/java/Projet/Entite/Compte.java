package Projet.Entite;


public interface Compte {
	Client getClient();
//	double getSolde();
	long getNumero();
	String getNom();
    void setClient(Client cli);
	void setNumero(long num);
	String toString();
	double getSolde();
	void setSolde(double solde);
	boolean ExisteCompte();
	/**
	 * @return
	 */

}
