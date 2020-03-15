
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


 