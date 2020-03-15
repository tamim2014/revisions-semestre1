	
public class Conducteur{
	
	private String prenom;
	private String tel;
	private Vehicule vehiculeEnCours;
		
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
	
	// Attention ici!
	public void prendreVehicule(Vehicule vehicule){
		this.setVehiculeEnCours(vehicule);
		this.getVehiculeEnCours().setEnUtilisation(true);
	}

	public void rendreVehicule(){
		this.getVehiculeEnCours().setEnUtilisation(false);
		this.setVehiculeEnCours(null);
	}		
}



