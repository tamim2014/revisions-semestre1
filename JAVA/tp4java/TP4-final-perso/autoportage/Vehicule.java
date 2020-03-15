
public class Vehicule {

   private String marque, modele, matricul,idvehicule;
   // attibuts options vehicule
   private int portes, passagers;
   private String boite;
   private boolean clim;
   private double dimension;
   

   // Constructeurs

   public Vehicule(String m,String mod,String num,String b,int pt,int ps,boolean clim){
      marque=m;
      modele=mod;
      matricul=num;
      idvehicule=null;
     
      boite = b;
      portes = pt;
      passagers = ps;
      this.clim = clim;        
   }
   
   public Vehicule(String m,String mod,String num,String b,int pt,int ps,boolean clim,double dim){
      marque=m;
      modele=mod;
      matricul=num;
      idvehicule=null;
     
      boite = b;
      portes = pt;
      passagers = ps;
      this.clim = clim;
      dimension = dim;    
   }

 
   // Getters
   public String getMarque(){ return this.marque; }
   public String getModele(){ return this.modele; }
   public String getmatricul(){ return this.matricul; }

   public String getBoite(){ return this.boite; }
   public int getPortes(){ return this.portes; }
   public int getPassagers(){ return this.passagers; }
   public boolean getClim(){ return this.clim; }
   public double getDimension(){ return this.dimension; }


   // Setters
   public void setMarque(String marque){ this.marque = marque; }
   public void setModele(String model){ this.modele = modele; }
   public void setMatricul(String matricul){this.matricul=matricul;}

   public void setBoite(String boite){ this.boite = boite; }
   public void setPortes(int portes){ this.portes = portes; }
   public void setPassagers(int passagers){this.passagers = passagers ;}
   public void setClim(boolean clim){ this.clim = clim; }
   public void setDimension(double dimension){ this.dimension = dimension; }

   // Affichage 
  
   public String toString(){ 

     if(this.dimension > 10){
        return " "+this.marque+" | "+this.modele+" | "+this.matricul+" | B."+this.boite+"-"+this.portes+"portes-"+this.passagers+"passagers-clim:"+this.clim+"-"+this.dimension+"m3";
     }else{
        return " "+this.marque+" | "+this.modele+" | "+this.matricul+" | B."+this.boite+"-"+this.portes+"portes-"+this.passagers+"passagers-clim:"+this.clim;
       
      }
        
    } 

}

//-----------------------------------------------

class Voiture extends Vehicule {
     
 public Voiture(String m, String mod, String num,String b,int pt, int ps, boolean clim){
     super(m,mod,num,b,pt,ps,clim);
   }
}

//-------------------------------------------------

class Camion extends Vehicule {
     
   public Camion(String m, String mod, String num,String b,int pt, int ps,  boolean clim, double dim){
     super(m,mod,num,b,pt,ps,clim,dim);
   }
}



