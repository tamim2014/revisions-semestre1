
public class Site{
	
	private String nom, localisation;
	private Voiture voiture ; // pour l'ajout d'une voiture
    private Camion camion;    // pour l'ajout d'une camionnette
		
	public Site(String nom, String localisation){		
		this.nom = nom;
		this.localisation = localisation;
		voiture  = null; 
        camion = null; 		
	}
	
	//accesseur et mutateurs
	
	public String getNom(){ return this.nom; }	
	public String getLocalisation(){ return this.localisation;}
			
	public void setNom(String nom){ this.nom = nom; }
	public void setLocalisation(String localisation){ ...}
			
	public String toString(){
		return "Site "+this.getNom()+" : "+this.getLocalisation();
	}
	
	// Pour l'ajout d'un vehicule
	public void setCamion(Camion camion){ this.camion = camion; }
	public void setVoiture(Voiture voiture){ ... }
	
     
		
}


 