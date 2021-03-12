package FactoryClient;

import Projet.Entite.Client;

public class FactoryClient implements IFactoryClient  {

	public Client creatClient(long num, String name) {
		// TODO Auto-generated method stub
	return new Client(num,name);
	}

}
