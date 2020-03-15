

public class CompteEpargne extends CompteCourant
{  
  private double tauxInteretAnnuel;
 
  public CompteEpargne(int num, String nom, int dba, double solde, double TIA){
    super(num, nom, dba, solde);
    this.tauxInteretAnnuel = TIA;
  } 

  public void debiter(double montant){ 
     if(montant <= this.debitAutorise && this.solde>0 && solde >= montant) 
       this.solde=this.solde-montant; 
     else 
      System.out.println("\nCompte Numero "+this.numeroCompte+": Echec retrait!\nLe montant depasse votre solde("+this.solde+" Euros).") ;
  } 

  public double soldEpargneAnuel(){ 
      solde = solde + tauxInteretAnnuel; 
      return solde;
  }  
   
  public String toString(){
	    double solde = this.soldEpargneAnuel();
        String msg = "\nCompte N°: "+this.numeroCompte+" - "+this.nomTitulaire+"\n Debit autorise: "+this.debitAutorise +" Euros\n Solde:  "+solde+" Euros";
        return msg;     
  }
  
  public static void main(String[] args){
  
    CompteEpargne c3 = new CompteEpargne(3, "LOVELACE", 1000, 10, 1.25);
    CompteEpargne c4 = new CompteEpargne(4, "CURIE", 2000, 7000, 0.75);

    Virement v1 = new Virement();
	
    // ETATS INITIAL
    System.out.println(c3); System.out.println(c4);
	

    // EVOLUTION DES COMPTES
    c3.debiter(300);
    c4.debiter(600); 
    c3.crediter(500);
    System.out.println(c3); System.out.println(c4);	
    v1.transfert( c3, c4, 1000);
	
	
	// ETATS FINAL
	System.out.println(c3); System.out.println(c4);  
  }
  
}

//-------------------------------------------------------

class Virement 
{
   public void transfert( CompteEpargne ce1, CompteEpargne ce2, double montant){
	   if( ce1.solde > montant){ 
	         ce1.debiter(montant);
			 ce2.crediter(montant);		   
	   }else{
		   System.out.println("\nEchec virement: Solde insuffisant !");
	   }
   
   }
}














     



