	
public class Camion extends Vehicule{
	
	private int nbPortes;
	private int nbPassagers; 
	private boolean clim;
	private double volume;
	
	public Camion(){}
		
	public Camion(String immatriculation, String marque, String modele, int nbPortes, 
	               int nbPassagers, boolean clim, boolean boiteAutomatique, double volume)
	{
		super(immatriculation, marque, modele, boiteAutomatique);
		this.nbPortes = nbPortes;
		this.nbPassagers = nbPassagers;
		this.clim = clim;
		this.volume=volume;
	}
	
	//accesseur et mutateurs:Pas de setter pour clim. POURQUOI ? 
	
	public int getNbPortes(){return this.nbPortes; }
	public int getNbPassagers(){ return this.nbPassagers;}
	public boolean getClim(){ return this.clim; }
	public double getVolume(){ return this.volume; }
			
	public void setNbPortes(int nbPortes){ this.nbPortes = nbPortes; }	
	public void setNbPassagers(int nbPassagers){ this.nbPassagers = nbPassagers; }
	//Affichage	
	public String toString(){
		String enUtilisation = (this.getEnUtilisation()==true? "En utilisation": "Libre");	
		return this.getMarque()+"-"+this.getModele()+": \'"+this.getImmatriculation()+"\' ("+enUtilisation+")";
	}	
}
