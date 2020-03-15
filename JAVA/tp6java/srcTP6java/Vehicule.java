	
public abstract class Vehicule{

	protected String immatriculation;
	protected String marque;
	protected String modele;
	
	protected boolean boiteAutomatique;
	protected boolean enUtilisation;// !! sera utilisés dans la classe Conducteur
	


	public Vehicule(){}

	public Vehicule(String immatriculation, String marque, String modele,
					boolean boiteAutomatique)
	{
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.boiteAutomatique = boiteAutomatique;
		this.enUtilisation = false;// !	
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
       
    // TP6
    public boolean equals(Voiture v){
       
        String imm1 = this.getImmatriculation();
        String imm2 = v.getImmatriculation();
		
		if(imm1.equals(imm2)){ 
		    System.out.println("On a le meme immatriculation");
            return true;
        }else{
		    System.out.println("Les immatriculations sont differents");
            return false;
        }
	}

}
	
