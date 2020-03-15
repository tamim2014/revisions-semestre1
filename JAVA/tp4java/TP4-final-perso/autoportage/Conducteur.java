
/***************************************************************
* Dans cette classe on defini  les mthd pour :
* - Reservation  vehicule( pour un conducteur )
* - Retour  vehicule ( dans un site )
*****************************************************************/
public class Conducteur {
  
       private String nom, dateretrait, dateretour;
       private int tel;
       private Voiture voiture;
       private Camion camion;
     
       public Conducteur(String n, int tel) {    
         nom = n;
         tel = this.tel;
         dateretrait = null;
         dateretour = null;
         voiture  = null; 
         camion = null;                      
       }

       // Getters
       public String getNom(){ return this.nom; }
       public int getTel(){ return this.tel; }
       public Voiture getVoiture(){ return this.voiture; }
       public Camion getCamion(){ return this.camion; }
       public String getDateretrait(){ return this.dateretrait; }
       public String getDateretour(){ return this.dateretour; }
      
       // Setter
       public void setNom(String nom){ this.nom = nom; }
       public void setNom(int tel){ this.tel = tel; }
       public void setVoiture(Voiture voiture){ this.voiture = voiture; }
       public void setCamion(Camion camion){ this.camion = camion; }
       public void setDateretrait(String dateretrait){ 
           this.dateretrait = dateretrait; 
       }
       public void setDateretour(String dateretour){ 
           this.dateretour = dateretour; 
       }
         
       // Reservation 
       public void prendre_voiture(Voiture v){
           this.voiture=v;
       }
       // Retour
       public void rendre_voiture(Siteportage site){
         site.prendre_voiture(this.voiture);
         this.voiture=null;
       }

       // Affichage - Confirmation de la reservation
       public String toString(){
         String message, confirme, dates;
         message=" Reservation faite par: "+this.nom+"\n  Pour le vehicule";
         if(this.voiture != null){
           //confirme=" "+message+""+this.voiture.toString();
           confirme=" "+message+" "+voiture.getMarque()+" "+voiture.getModele();   
           dates="\n  Date: Du "+this.dateretrait+" au "+this.dateretour+"\n";
           confirme = confirme+" "+dates;
           return  confirme+"\n  Merci "+this.nom+" !";
         }else{
           //confirme=" "+message+" "+this.camion.toString();
           confirme=" "+message+" "+camion.getMarque()+" "+camion.getModele();
           dates="\n  Date: Du "+this.dateretrait+" au "+this.dateretour+"\n";
           confirme = confirme+" "+dates;
           return  confirme+"\n  Merci "+this.nom+" !";
         }             
       }
 }


