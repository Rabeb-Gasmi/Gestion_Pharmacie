package Projet.Entite;


public class CompteEpargne  extends DecoratorCompte{
   private double montant_transfere;
   private CompteCourant compteC;
   
	/**
	 * @param num
	 * @param cli
	 */
	public CompteEpargne(CompteBasic compB ,double mont,CompteCourant comp) {
		super(compB);
		this.montant_transfere = mont;
		this.compteC = comp;
		
		// TODO Auto-generated constructor stub
	}
	public void cree_Compte() {
   
	}
	
	public boolean  verifierSolde() {
		return compteC.getSolde()>montant_transfere;
	
	}
	
	public void transfere() {
		if(verifierSolde()) {  compteC .setSolde(getSolde()-montant_transfere);}
		
	}
	/**
	 * @return the compteC
	 */
	public CompteCourant getCompteC() {
		return compteC;
	}
	/**
	 * @return the montant_transfere
	 */
	public double getMontant_transfere() {
		return montant_transfere;
	}
	
	public String toString() {
		return "Le Montant transfere est : "+montant_transfere+
				     "Le Compte Courant Est : "+compteC.toString();	
		}
	public void printData() {
		System.out.println(toString());
	}
	

}
