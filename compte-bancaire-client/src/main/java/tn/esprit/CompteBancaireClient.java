package tn.esprit;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import tn.esprit.service.*;


public class CompteBancaireClient {

	public static void main(String[] args) throws NamingException { 
		String jndiName = "compte-bancaire-serveur/CompteBancaireService!tn.esprit.service.CompteBancaireRemot";
	Context context = new InitialContext();
	CompteBancaireRemot proxy = (CompteBancaireRemot) context.lookup(jndiName);
	proxy.verserArgent("Mourad", 20); 
	proxy.verserArgent("Mohamed", 10); 
	proxy.verserArgent("aa", 209); 
	proxy.verserArgent("dddd", 100); 
	proxy.verserArgent("cc", 207); 
	proxy.verserArgent("csx", 1540); 
	}
	

}
