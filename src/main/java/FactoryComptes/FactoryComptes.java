package FactoryComptes;

import Projet.Entite.*;

public class FactoryComptes implements IFactoryComptes{


   public   CompteCourant createCompteCourant( long num, double solde ,Client client)
       {
	 	// TODO Auto-generated method stub		
        CompteCourant  C;
		 C = new  CompteCourant(new CompteBasic(num,client,solde));
		 return C;
		

	}


	     public CompteEpargne createCompteEpargne(long num, double solde, Client client, double mont,
			CompteCourant compteC) {
		// TODO Auto-generated method stub
		
	     	CompteEpargne CE = new CompteEpargne(new CompteBasic(num,client,solde), mont,compteC);
		    return CE;
	}


}
