package Projet.Entite;
import java.util.*;


public class Client {
	private long numero = 0;
	private String name=null;
	ArrayList<Compte> comptes;
	/**
	 * 
	 */
	public Client(long num, String name) {
		// TODO Auto-generated constructor stub
		this.numero =num;
		this.name = name;
		comptes = new ArrayList<Compte>();

	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the numero
	 */
	public long getNumero() {
		return numero;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String tostring() {
		String chaine = "Nom Client est :"+name+
				    "Numero du Client est :"+numero;
		for(int i =0;i<comptes.size();i++) {
			chaine.concat(comptes.get(i).toString());
		}
		return chaine;
	}
	
	/**
	 * @return the comptes
	 */
	public ArrayList<Compte> getComptes() {
		return comptes;
	}
	
	public void addCompte(Compte c) {
		comptes.add(c);
	}
	public boolean ExisteClient() {
		return this.name != null && this.numero != 0;
	}
	public boolean niveauSalaire() {
		return  calculeSalaire()>=4000;
	}
	public double calculeSalaire() {
		double count = 0;
		for(int i = 0;i< comptes.size();i++) {
			count +=comptes.get(i).getSolde();
		}
		return count;
	}


}
