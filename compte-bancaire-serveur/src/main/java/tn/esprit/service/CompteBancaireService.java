package tn.esprit.service;





import javax.ejb.Singleton;

@Singleton
public class  CompteBancaireService implements  CompteBancaireLocal , CompteBancaireRemot { 


public int  solde = 0; 
@Override
public void retirerArgent(String personne, int montant) {
	// TODO Auto-generated method stub
	solde= solde+ montant; 
	System.out.println(solde);
	
	
}

@Override
public void verserArgent(String personne, int montant) {
	// TODO Auto-generated method stub
	solde= solde+ montant; 
	
	System.out.println(solde);
	
} 

}  