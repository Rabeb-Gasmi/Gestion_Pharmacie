package FactoryClient;

import Projet.Entite.Client;


public interface IFactoryClient {
	Client creatClient(long num, String name);

}
