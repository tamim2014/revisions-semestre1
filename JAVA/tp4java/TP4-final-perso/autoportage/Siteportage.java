
/***************************************************************
* Dans cette classe on defini aussi les mthd pour :
* - Reservation  vehicule( pour un conducteur )
* - Retour  vehicule ( dans un site )
*****************************************************************/

public class Siteportage {
  
       private String nom, localisation;
       private Voiture voiture ;
       private Camion camion;
       
            
       public Siteportage(String n, String l) {    
         nom = n;
         localisation = l;
         voiture  = null; 
         camion = null;                         
       }
      // un 2em constructeur( pour le retour d'un vehicule)
       public Siteportage(String n) {    
         nom = n;
         localisation = null;
         voiture  = null; 
         camion = null;                         
       }
       //Getters
       public String getNom(){ return this.nom; }
       public String getLocalisationn(){ return this.localisation; }
       public Voiture getVoiture(){ return this.voiture; }
       public Camion getCamion(){ return this.camion; }

       //Setters
       public void setNom(String nom){ this.nom = nom; }
       public void setVoiture(Voiture voiture){ this.voiture = voiture; }
       public void setCamion(Camion camion){ this.camion = camion; }
       public void setLocalisation(String localisation){ 
         this.localisation = localisation; 
       }
           
       //Affichage
       public String toString(){
         return "  Site de......... "+this.nom+" : "+this.localisation ;
       }

       //Reservation
       public void prendre_voiture(Voiture v){
         this.voiture=v;
       }

       //Retour
       public void rendre_voiture(Conducteur p){
         p.prendre_voiture(this.voiture);
         this.voiture=null;
       }
 }


