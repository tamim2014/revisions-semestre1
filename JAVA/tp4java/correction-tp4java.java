  /****************************************************************/
 /***************** CLASSE VEHICULE ******************************/
/****************************************************************/	

public abstract class Vehicule{

	protected String immatriculation;
	protected String marque;
	protected String modele;
	
	protected boolean boiteAutomatique;
	protected boolean enUtilisation;// !! sera utilisés dans la classe Conducteur
	
	public Vehicule(){}
	// - enUtilisation est exclu des paramettre constructeur . POURQUOI ?
	// Car les valeurs de ce paramettre seront gerées par toString() dans la classe Voiture
	public Vehicule(String immatriculation, String marque, String modele,
					boolean boiteAutomatique)
	{
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.boiteAutomatique = boiteAutomatique;// ???
		this.enUtilisation = false;	// !!!	
	}	

	//accesseur et mutateurs
	public String getImmatriculation(){ return this.immatriculation; }		
	public String getMarque(){ return this.marque; }
	public String getModele(){ return this.modele; }
	public boolean getBoiteAutomatique(){ return this.boiteAutomatique; }
	public boolean getEnUtilisation(){ return this.enUtilisation; }
	
	public void setImmatriculation(String immatriculation){this.immatriculation = immatriculation;}
	public void setMarque(String marque){ this.marque = marque; }
	public void setModele(String modele){ this.modele = modele; }
	public void setBoiteAutomatique(boolean boiteAutomatique){ this.boiteAutomatique = boiteAutomatique;}
	public void setEnUtilisation(boolean enUtilisation){this.enUtilisation = enUtilisation;}
		
	public abstract String toString();

}
	
  /****************************************************************/
 /***************** CLASSE VOITURE* ******************************/
/****************************************************************/
	
public class Voiture extends Vehicule{
	
	private int nbPortes;
	private int nbPassagers; 
	private boolean clim;
	
	public Voiture(){}
	// - enUtilisation est exclu des paramettre constructeur . POURQUOI ?
    // Car ce paramettre est geré par toString()		
	public Voiture(String immatriculation, String marque, String modele, int nbPortes, 
	               int nbPassagers, boolean clim, boolean boiteAutomatique)
	{
		super(immatriculation, marque, modele, boiteAutomatique);
		this.nbPortes = nbPortes;
		this.nbPassagers = nbPassagers;
		this.clim = clim;
	}
	
	//accesseur et mutateurs:Pas de setter pour clim. POURQUOI ? 
	
	public int getNbPortes(){return this.nbPortes; }
	public int getNbPassagers(){ return this.nbPassagers;}
	public boolean getClim(){ return this.clim; }
			
	public void setNbPortes(int nbPortes){ this.nbPortes = nbPortes; }	
	public void setNbPassagers(int nbPassagers){ this.nbPassagers = nbPassagers; }
	//Affichage	
	public String toString(){
		String enUtilisation = (this.getEnUtilisation()==true? "En utilisation": "Libre");	
		return this.getMarque()+"-"+this.getModele()+": \'"+this.getImmatriculation()+"\' ("+enUtilisation+")";
	}	
}

  /****************************************************************/
 /***************** CLASSE CONDUCTEUR* ***************************/
/**********Elle envoie de message à la classe VEHICULE***********/	

public class Conducteur{
	
	private String prenom;
	private String tel;
	private Vehicule vehiculeEnCours;
	
	//-vehiculeEnCours est exclu des parametres constructeurs. POURQUOI?
   // Car les valeurs de ce paramettre seront gerées par toString() 	
	public Conducteur(String prenom, String tel){
		this.prenom = prenom;
		this.tel = tel;
		this.vehiculeEnCours = null;
	}
	
	//accesseur et mutateurs
	
	public String getPrenom(){ return this.prenom; }	
	public String getTel(){ return this.tel; }	
	public Vehicule getVehiculeEnCours(){ return this.vehiculeEnCours; }
			
	public void setPrenom(String prenom){ this.prenom = prenom; }	
	public void setTel(String tel){ this.tel = tel; }	
	public void setVehiculeEnCours(Vehicule vehiculeEnCours){this.vehiculeEnCours = vehiculeEnCours;}
	
	// Affichage: "Vehicule en cours"	OU  "Pas de vehicule" ?
	
	public String toString(){
		return "Prenom: "+this.getPrenom()+"\nTel: "+this.getTel()+"\n"+ "Vehicule en cours : "+ (this.getVehiculeEnCours() == null?"Pas de vehicule":this.getVehiculeEnCours());
	} 
	
	// Deux methodes motrices: Envoi de messages à la classe Vehicule
	
	public void prendreVehicule(Vehicule vehicule){
		this.setVehiculeEnCours(vehicule);
		this.getVehiculeEnCours().setEnUtilisation(true);
	}

	public void rendreVehicule(){
		this.getVehiculeEnCours().setEnUtilisation(false);
		this.setVehiculeEnCours(null);
	}		
}


  /****************************************************************/
 /***************** CLASSE SITE* *********************************/
/****************************************************************/


public class Site{
	
	private String nom, localisation;
		
	public Site(String nom, String localisation){		
		this.nom = nom;
		this.localisation = localisation;		
	}
	
	//accesseur et mutateurs
	
	public String getNom(){ return this.nom; }	
	public String getLocalisation(){ return this.localisation;}
			
	public void setNom(String nom){ this.nom = nom; }
	public void setLocalisation(String localisation){ this.localisation = localisation;}
			
	public String toString(){
		return "Site "+this.getNom()+" : "+this.getLocalisation();
	}
		
}


  /****************************************************************/
 /***************** CLASSE AutoPortage* **************************/
/****************************************************************/	


public class AutoPartage{
	
	public static void main (String[] args){
		
		// 1. INSTANCIATION
		
		Conducteur conducteur1 = new Conducteur("Marie", "0809020405");
		Voiture voiture1 = new Voiture("AA-999-AZ", "Peugeot", "308", 4, 5, true, true);
		Site site1 = new Site("AutoPartage1", "50 Rue de Lorem Ipsum");
		
		// 2. APPELs DES mthd toString( pour afficher ces 3 instances )

		System.out.println("\n---------------------------------------");		
		System.out.println(site1);
		System.out.println("---------------------------------------");
		System.out.println("Conducteur");
		System.out.println("---------------------------------------");		
		System.out.println(conducteur1);
		System.out.println("\n---------------------------------------");
		System.out.print("Vehicule : ");
		System.out.println(voiture1);
		System.out.println("---------------------------------------");

        // 3. APPELS DES METHODES et AFFICHAGE: 
		// * les motrices de la classe Conducteur et son toString()
        // * le toString()	de la classe Voiture			
		
		conducteur1.prendreVehicule(voiture1);
		System.out.println("\n---------------------------------------");
		System.out.println("Prendre Vehicule");
		System.out.println("---------------------------------------");		
		System.out.println("Conducteur");
		System.out.println("---------------------------------------");		
		System.out.println(conducteur1);		
		System.out.println("---------------------------------------");		
		System.out.print("Vehicule : ");
		System.out.println(voiture1);
		System.out.println("---------------------------------------");

		conducteur1.rendreVehicule();
		System.out.println("\n---------------------------------------");
		System.out.println("Rendre Vehicule");
		System.out.println("---------------------------------------");		
		System.out.println("Conducteur");
		System.out.println("---------------------------------------");		
		System.out.println(conducteur1);		
		System.out.println("---------------------------------------");		
		System.out.print("Vehicule : ");
		System.out.println(voiture1);
		System.out.println("---------------------------------------");		
	}
}	