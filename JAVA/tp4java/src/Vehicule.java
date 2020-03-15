	
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
	
