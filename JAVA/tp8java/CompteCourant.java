
public class CompteCourant extends Compte
{
  protected int numeroCompte;
  protected String nomTitulaire;
  protected int debitAutorise; // 1000 euros par defaut;
  protected int decouvertMax; // 800 euros par defaut;
  protected double solde; // 0 si pas d'depot initial

  public CompteCourant(int num, String nom, int dba, int dcm, double solde){
    this.numeroCompte = num;
    this.nomTitulaire = nom;
    this.debitAutorise = dba;
    this.decouvertMax = dcm;
    this.solde = solde;
  } 
  public CompteCourant(int num, String nom, int dba, double solde){
    this.numeroCompte = num;
    this.nomTitulaire = nom;
    this.debitAutorise = dba;
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
        String msg1 = "\nCompte N°: "+this.numeroCompte+" - "+this.nomTitulaire+"\n Decouvert autorise: "+this.decouvertMax+"\n Debit autorise: "+this.debitAutorise +"\n Solde:  "+solde;
        String msg2 = "\nAttention "+this.nomTitulaire+"! Votre compte Numero "+this.numeroCompte+" est à découvert\nConsulter ci-dessous :  \n"+msg1;

         if(solde >= 0 ) return msg1;
         else return msg2;
  }
  
}
















     



