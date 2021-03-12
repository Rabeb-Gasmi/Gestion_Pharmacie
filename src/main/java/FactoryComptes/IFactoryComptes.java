package FactoryComptes;

import Projet.Entite.*;

public interface IFactoryComptes {
    CompteCourant createCompteCourant( long num, double solde ,Client client);
    CompteEpargne createCompteEpargne( long num, double  solde, Client client, double mont,CompteCourant compteC );
}
