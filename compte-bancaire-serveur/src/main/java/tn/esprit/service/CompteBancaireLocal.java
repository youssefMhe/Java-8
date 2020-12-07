package tn.esprit.service;
import javax.ejb.Local; 
@Local 
public interface CompteBancaireLocal {
	void retirerArgent(String personne, int montant) ;
	 void verserArgent(String personne, int montant) ;


}
