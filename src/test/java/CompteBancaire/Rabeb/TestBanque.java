package CompteBancaire.Mehdi_bachir;
import Projet.Entite.*;

	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;

	import FactoryComptes.FactoryComptes;
	import FactoryClient.*;

public class TestBanque {
	
	
		private CompteEpargne compteE;
		private CompteCourant compteC;
		private Client client ;
		
		FactoryComptes compteF= new FactoryComptes();
		FactoryClient clientF = new FactoryClient();
		
		@Before
		public void initialise_data() {
		     client=	clientF.creatClient(2111111, "Elmehdi");
			 compteC =   compteF.createCompteCourant(1, 3000, client);
			 compteE =  compteF.createCompteEpargne(3, 5000, client, 200, compteC);
		     client.addCompte(compteE);
		}
		
		@Test
		public void tester_si_compteCourant_Contient_un_montant() {
			Assert.assertEquals(true, compteE.verifierSolde());		
        
		}
		@Test
		public void tester_si_client_Existe_ou_pas() {
			Assert.assertEquals(false, client.ExisteClient());
			
			
		}
		
		@Test
			public void tester_si_un_client_est_au_niveu_riche()
			{
				Assert.assertEquals(true, client.niveauSalaire());
			}

		
		
		
		

	}

