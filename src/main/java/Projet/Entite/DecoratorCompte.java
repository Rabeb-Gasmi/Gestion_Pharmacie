package Projet.Entite;

public class DecoratorCompte implements Compte{
 Compte  compte ;

	/**
	 * 
	 */
	public DecoratorCompte(Compte compte) {
		// TODO Auto-generated constructor stub
	 this. compte = compte;
	}

	public long getNumero() {
		// TODO Auto-generated method stub
		return compte.getNumero();
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return compte.getNom();
	}

	public Client getClient() {
		// TODO Auto-generated method stub
		return compte.getClient();
		
	}
	@Override
	public String toString() {
		return "Numero De Compte "+getNumero()+
				     compte.toString();
		
	}
	public double getSolde() {
			// TODO Auto-generated method stub
			return compte.getSolde();
		}
	public void setSolde(double s) {
			// TODO Auto-generated method stub
			compte.setSolde(s);
		}

	public void setClient(Client cli) {
		// TODO Auto-generated method stub
		
	}

	public void setNumero(long num) {
		// TODO Auto-generated method stub
		
	}

	public boolean ExisteCompte() {
		// TODO Auto-generated method stub
		return compte!=null;
	}

}
