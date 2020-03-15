public class Compte
{
  private int numeroCompte;
  private String nomTitulaire;
  private int debitAutorise; // 1000 euros par defaut;
  private int decouvertMax; // 800 euros par defaut;
  private double solde; // 0 si pas d'depot initial

  public Compte(int num, String nom, int dba, int dcm, double solde){
    this.numeroCompte = num;
    this.nomTitulaire = nom;
    this.debitAutorise = dba;
    this.decouvertMax = dcm;
    this.solde = solde;
  } 

  public void crediter(double montant){ solde=solde+montant;}
  
  public void debiter(double montant){ 
     if(montant <= debitAutorise && solde >= -decouvertMax) 
       solde=solde-montant; 
     else 
      System.out.println("Montant trop eleve !") ;
  }  
   
  public String toString(){
        String msg1 = "\nCompte N°: "+this.numeroCompte+" - "+this.nomTitulaire+
		              "\n Decouvert autorise: "+this.decouvertMax+
					  "\n Debit autorise: "+this.debitAutorise +"\n Solde:  "+solde;
        String msg2 = "\nAttention "+this.nomTitulaire+
		               "! Votre compte Numero "+this.numeroCompte+
					   " est à découvert\nConsulter ci-dessous :  \n"+msg1;
         if(solde >= 0 ) return msg1;
         else return msg2;
  }
  
  public static void main(String[] args){
 
    Compte c1 = new Compte(1, "J.DUPONT", 1000, 800, 0);
    Compte c2 = new Compte(2, "C.DURANT", 6000,5000, 50000);
    Virement v1 = new Virement();
	
   // ETATS INITIAL
    System.out.println(c1); System.out.println(c2);
	
   // EVOLUTION DES COMPTES
    c1.crediter(500);
    c2.debiter(600); 
    c1.debiter(700);
    System.out.println(c1); System.out.println(c2);	
    v1.transfert( c2, c1, 1000);
		
	// ETATS FINAL
	System.out.println(c1); System.out.println(c2);  
  } 
}

//-------------------------------------------------------

class Virement
{

   public void transfert( Compte c1, Compte c2, double montant){
       c1.debiter(montant);
       c2.crediter(montant);
   }

}














     



