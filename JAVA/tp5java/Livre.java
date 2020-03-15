public class Livre 
{
	  private String nom;
	  private double prix;
	  private String auteur;
	  
	  public Livre(String n, double p, String auteur){
		 this.nom = n;
		 this.prix = p; 
		 this.auteur = auteur;
	  }

	  public String getNom(){return this.nom;}
	  public double getPrix(){return this.prix;}
	  public String getAuteur(){ return this.auteur;}

	  public String toString(){
		 return "Livre: "+this.nom+" - "+this.auteur+" : "+this.prix+"euros";
	  }
}
//..........................................................................
class Cd extends Livre
{
	  private int nbDePiste;

	  public Cd(String nom, double prix, String auteur, int nbPiste){
		 super(nom, prix, auteur);
		 this.nbDePiste = nbPiste;
	  }

	  public int getNbDePiste(){ return this.nbDePiste; }

	  public String toString(){
		 return "CD: "+getNom()+" - "+this.nbDePiste+" : "+getPrix()+"euros";
	  } 
}
//.............................................................................
public class Dvd extends Livre
{
	  private double duree;

	  public Dvd(String nom, double prix, String auteur, double duree){
		 super(nom, prix, auteur);
		 this.duree = duree;
	  }
	  
	  public double getDuree(){ return this.duree; }

	  public String toString(){
		 return "DVD: "+getNom()+" - "+this.duree+" : "+getPrix()+"euros";
	  } 
}

