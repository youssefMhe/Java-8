package tn.esprit.service;
import javax.ejb.Remote; 
@Remote 
public interface CompteBancaireRemot {
	void retirerArgent(String personne, int montant) ;
	 void verserArgent(String personne, int montant) ;

}
