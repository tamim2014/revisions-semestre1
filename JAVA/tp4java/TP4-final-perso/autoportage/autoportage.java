import java.util.Scanner; //pour recuperer les saisies utilisateur

/***************************************************************
* Dans cette classe on defini   :
* - Le menu de l'application ,
* - 7 de ses fonctionnalites ,
* - Et le pilotage du programme .
*****************************************************************/


public class autoportage {
    
     private static Scanner saisie = new Scanner(System.in);
    
     public static void menu(){

       System.out.println();
       System.out.println(" Pour reserver un vehicule.............: taper 1");
       System.out.println(" Pour rendre un vehicule...............: taper 2 ");

       System.out.println(" Liste des point de services...........: taper 3 ");
       System.out.println(" Liste des voitures disponibles........: taper 4 ");
       System.out.println(" Liste des camions disponibles.........: taper 5 ");

       System.out.println(" Supprimer une voitures hors service...: taper 6 ");
       System.out.println(" Supprimer un  camion   hors service...: taper 7 ");

       System.out.println(" Ajouter une nouvelle voiture..........: taper 8 ");
       System.out.println(" Ajouter un  nouveau  camion...........: taper 9 ");

       //System.out.println(" Liste des conducteurs depositaires....: taper 10\n");

     }
   
     public static void pointsDeService(){

       Siteportage site1 = MesObjets.getSite1();
       Siteportage site2 = MesObjets.getSite2(); 
       Siteportage site3 = MesObjets.getSite3(); 
       Siteportage site4 = MesObjets.getSite4();

       System.out.println("\nVoici nos points de service:\n");   
       System.out.println(site1+"\n"+site2+"\n"+site3+"\n"+site4+"\n");
     }

     public static void listVoitures(){

            Voiture v1  = MesObjets.getV1(); Voiture v2  = MesObjets.getV2(); 
            Voiture v3  = MesObjets.getV3(); Voiture v4  = MesObjets.getV4();
            Voiture v5  = MesObjets.getV5(); Voiture v6  = MesObjets.getV6(); 
            Voiture v7  = MesObjets.getV7(); Voiture v8  = MesObjets.getV8();
            Voiture v9  = MesObjets.getV9(); Voiture v10 = MesObjets.getV10();
            Voiture v11 = MesObjets.getV11();

            System.out.println("\nVoici notre parc de voitures:\n"); 
            System.out.println("Site du Bourget\n"+v1+"\n"+v2+"\n"+v3+"\n"+v4);         
            System.out.println("Paris Nord\n"+v5+"\n"+v6+"\n"+v7);           
            System.out.println("Paris centre\n"+v8+  "\n"+v9);      
            System.out.println("Orly Sud\n"+v10+"\n"+v11+"\n"); 

     }//fin listVoitures()

     public static void listCamions(){

            Camion C1 = MesObjets.getC1(); Camion C2  = MesObjets.getC2();
            Camion C3 = MesObjets.getC3(); Camion C4  = MesObjets.getC4();
            Camion C5 = MesObjets.getC5(); Camion C6  = MesObjets.getC6();
            Camion C7 = MesObjets.getC7(); Camion C8  = MesObjets.getC8();
            Camion C9 = MesObjets.getC9(); Camion C10 = MesObjets.getC10();

            System.out.println("\nVoici notre parc de camions:\n"); 
            System.out.println("Site du Bourget\n"+C1+"\n"+C2+"\n"+C3+"\n"+C4);         
            System.out.println("Paris Nord\n"+C5+"\n"+C6);           
            System.out.println("Paris centre\n"+C7+  "\n"+C8);      
            System.out.println("Orly Sud\n"+C9+"\n"+C10+"\n"); 

     }// fin listCamions()

 
     public static void supprimerVoiture(){

            Voiture v1  = MesObjets.getV1(); Voiture v2  = MesObjets.getV2(); 
            Voiture v3  = MesObjets.getV3(); Voiture v4  = MesObjets.getV4();
            Voiture v5  = MesObjets.getV5(); Voiture v6  = MesObjets.getV6(); 
            Voiture v7  = MesObjets.getV7(); Voiture v8  = MesObjets.getV8();
            Voiture v9  = MesObjets.getV9(); Voiture v10 = MesObjets.getV10();
            Voiture v11 = MesObjets.getV11();

            System.out.println("\nSUPRIMER UNE VOITURE HORS SERVICE:\n");
            System.out.print("\nIdentifiant de la voiture(exple:v11) ? ");
            String idVHS = saisie.nextLine();
            Voiture VHS;

            if(idVHS.equals("v1"))        VHS = v1;
            else if(idVHS.equals("v2"))   VHS = v2;
            else if(idVHS.equals("v3"))   VHS = v3;
            else if(idVHS.equals("v4"))   VHS = v4;
            else if(idVHS.equals("v5"))   VHS = v5;
            else if(idVHS.equals("v6"))   VHS = v6;
            else if(idVHS.equals("v7"))   VHS = v7;
            else if(idVHS.equals("v8"))   VHS = v8;
            else if(idVHS.equals("v9"))   VHS = v9;
            else if(idVHS.equals("v10"))  VHS = v10;
            else  VHS = v11;
            System.out.println("\nLa voiture "+VHS+" est supprimee\n");
            VHS = null;
            // implementer 1 new list pour verifier et confirmer la suppression 
     }

     public static void supprimerCamion(){

            Camion C1 = MesObjets.getC1(); Camion C2  = MesObjets.getC2();
            Camion C3 = MesObjets.getC3(); Camion C4  = MesObjets.getC4();
            Camion C5 = MesObjets.getC5(); Camion C6  = MesObjets.getC6();
            Camion C7 = MesObjets.getC7(); Camion C8  = MesObjets.getC8();
            Camion C9 = MesObjets.getC9(); Camion C10 = MesObjets.getC10();

	    System.out.println("\nSUPRIMER UN CAMION HORS SERVICE:\n");
            System.out.print("\nIdentifiant du camion(exple:C10) ? ");
            String idCHS = saisie.nextLine();
	    Camion CHS;
	    if(idCHS.equals("C1"))        CHS = C1;
            else if(idCHS.equals("C2"))   CHS = C2;
            else if(idCHS.equals("C3"))   CHS = C3;
            else if(idCHS.equals("C4"))   CHS = C4;
	    else if(idCHS.equals("C5"))   CHS = C5;
	    else if(idCHS.equals("C6"))   CHS = C6;
	    else if(idCHS.equals("C7"))   CHS = C7;
            else if(idCHS.equals("C8"))   CHS = C8;
            else if(idCHS.equals("C9"))   CHS = C9;
	    else  CHS = C10;
            System.out.println("\nLe camion "+CHS+" est supprime\n");
	    CHS = null; 
     }

     public static void ajouterVoiture(){

            Siteportage site1 = MesObjets.getSite1();
            Siteportage site2 = MesObjets.getSite2(); 
            Siteportage site3 = MesObjets.getSite3(); 
            Siteportage site4 = MesObjets.getSite4();
     
            Voiture v1  = MesObjets.getV1(); Voiture v2  = MesObjets.getV2(); 
            Voiture v3  = MesObjets.getV3(); Voiture v4  = MesObjets.getV4();
            Voiture v5  = MesObjets.getV5(); Voiture v6  = MesObjets.getV6(); 
            Voiture v7  = MesObjets.getV7(); Voiture v8  = MesObjets.getV8();
            Voiture v9  = MesObjets.getV9(); Voiture v10 = MesObjets.getV10();
            Voiture v11 = MesObjets.getV11();
 
            System.out.println("\nAJOUTER UNE NOUVELLE VOITURE:\n");
            System.out.print("\nSite de reference(exple:site1) : ");
            String sitereferent = saisie.nextLine();
            System.out.print("\nIdentifiant de la voiture(exple:v12) : ");
            String idvoiture = saisie.nextLine();
            System.out.print("\nMarque de la voiture(exple:NISSAN) : ");
            String marque = saisie.nextLine();
            System.out.print("\nModel de la voiture(exple:PRIMERA) : ");
            String model = saisie.nextLine();
            System.out.print("\nImmatriculation de la voiture(exple:AA007AA) : ");
            String matricul = saisie.nextLine();
            //Ajout des options
            System.out.print("\nBoite de vitesse(Manuelle/Automatique) : ");
            String boite = saisie.nextLine();
            System.out.print("\nNombres de portes(5/3) : ");
            int pt = saisie.nextInt();
            System.out.print("\nNombres de passagers : ");
            int ps = saisie.nextInt();
            System.out.print("\nClimatisation(true/false) : ");
            boolean clim = saisie.nextBoolean();
            

            Voiture nv;
            String newvoiture;
            Siteportage siteR=null;
            String nomSR =null;
            nv = new Voiture(marque,model, matricul,boite,pt,ps,clim ); 
                           
            if(sitereferent.equals("site1"))      siteR = site1;
            else if(sitereferent.equals("site2")) siteR = site2;
            else if(sitereferent.equals("site3")) siteR = site3;
            else                                siteR = site4;
                 
            siteR.setVoiture(nv);
            nomSR = siteR.getNom();//nom site retour
            
            newvoiture=" "+idvoiture+": "+marque+" | "+model+" | "+matricul+" | Options:";
            System.out.println("\n------------------------------------------\n");
            System.out.println(" La nouvelle voiture est ajoutee a "+nomSR);
            System.out.println(" "+newvoiture);
            System.out.println("\n------------------------------------------\n");

            System.out.println("New list: Mise a jour liste des voitures a "+nomSR+"\n");
 
            if(sitereferent.equals("site1"))
            System.out.println("\n"+v1+"\n"+v2+"\n"+v3+"\n"+v4+"\n "+idvoiture+": "+nv );
            else if(sitereferent.equals("site2"))         
            System.out.println("\n"+v5+"\n"+v6+"\n"+v7+"\n "+idvoiture+": "+nv);
            else if(sitereferent.equals("site3"))            
            System.out.println("\n"+v8+  "\n"+v9+"\n "+idvoiture+": "+nv); 
            else     
            System.out.println("\n"+v10+"\n"+v11+"\n "+idvoiture+": "+nv);
            System.out.println();
     }

     public static void ajouterCamion(){

            Siteportage site1 = MesObjets.getSite1();
            Siteportage site2 = MesObjets.getSite2(); 
            Siteportage site3 = MesObjets.getSite3(); 
            Siteportage site4 = MesObjets.getSite4();
     
            Camion C1 = MesObjets.getC1(); Camion C2  = MesObjets.getC2();
            Camion C3 = MesObjets.getC3(); Camion C4  = MesObjets.getC4();
            Camion C5 = MesObjets.getC5(); Camion C6  = MesObjets.getC6();
            Camion C7 = MesObjets.getC7(); Camion C8  = MesObjets.getC8();
            Camion C9 = MesObjets.getC9(); Camion C10 = MesObjets.getC10();
 
            System.out.println("\nAJOUTER UN NOUVEAU CAMION:\n");
            System.out.print("\nSite de retour(exple:site1) : ");
            String sitereferent = saisie.nextLine();
            System.out.print("\nIdentifiant du camion(exple:cam19) : ");
            String idcamion = saisie.nextLine();
			
			/********************************  Partie essentielle *********************/
			
            System.out.print("\nMarque du camion(exple:RENAULT) : ");
            String marque = saisie.nextLine();
            System.out.print("\nModel du camion(exple:EXPRESS) : ");
            String model = saisie.nextLine();
            System.out.print("\nImmatriculation du camion(exple:AA007AA) : ");
            String matricul = saisie.nextLine();
            //Ajout des options
            System.out.print("\nBoite de vitesse(Manuelle/Automatique) : ");
            String boite = saisie.nextLine();
            System.out.print("\nNombres de portes(5/3) : ");
            int pt = saisie.nextInt();
            System.out.print("\nNombres de passagers : ");
            int ps = saisie.nextInt();
            System.out.print("\nClimatisation(true/false) : ");
            boolean clim = saisie.nextBoolean();
            System.out.print("\nVolume interieur(en metre cube) : ");
            double volume = saisie.nextDouble();

            Camion nc;//nouveau camion
            String newcamion;
            Siteportage siteR=null;
            String nomSR =null;
            nc = new Camion(marque,model, matricul,boite,pt,ps,clim,volume ); 
			
			/********************************  Fin partie essentielle *********************/
                   
            
   
            if(sitereferent.equals("site1"))      siteR = site1;
            else if(sitereferent.equals("site2")) siteR = site2;
            else if(sitereferent.equals("site3")) siteR = site3;
            else                                  siteR = site4;
                 
            siteR.setCamion(nc);
            nomSR = siteR.getNom();//nom site retour
            
            newcamion=" "+idcamion+": "+marque+" | "+model+" | "+matricul+" | Options:";
            System.out.println("\n------------------------------------------\n");
            System.out.println(" Le nouveau camion est ajoutee a "+nomSR);
            System.out.println(" "+newcamion);
            System.out.println("\n------------------------------------------\n");

            System.out.println("New list: Mise a jour liste des camions a "+nomSR+"\n");
 
            if(sitereferent.equals("site1"))
            System.out.println("\n"+C1+"\n"+C2+"\n"+C3+"\n"+C4+"\n "+idcamion+": "+nc );
            else if(sitereferent.equals("site2"))         
            System.out.println("\n"+C5+"\n"+C6+"\n "+idcamion+": "+nc);
            else if(sitereferent.equals("site3"))            
            System.out.println("\n"+C7+  "\n"+C8+"\n "+idcamion+": "+nc); 
            else     
            System.out.println("\n"+C9+"\n"+C10+"\n "+idcamion+": "+nc);
            System.out.println();
  } 

  public static void main(String args[]){

        Siteportage site1 = MesObjets.getSite1();
        Siteportage site2 = MesObjets.getSite2(); 
        Siteportage site3 = MesObjets.getSite3(); 
        Siteportage site4 = MesObjets.getSite4();

        Camion C1 = MesObjets.getC1(); Camion C2  = MesObjets.getC2();
        Camion C3 = MesObjets.getC3(); Camion C4  = MesObjets.getC4();
        Camion C5 = MesObjets.getC5(); Camion C6  = MesObjets.getC6();
        Camion C7 = MesObjets.getC7(); Camion C8  = MesObjets.getC8();
        Camion C9 = MesObjets.getC9(); Camion C10 = MesObjets.getC10();
     
        Voiture v1  = MesObjets.getV1(); Voiture v2  = MesObjets.getV2(); 
        Voiture v3  = MesObjets.getV3(); Voiture v4  = MesObjets.getV4();
        Voiture v5  = MesObjets.getV5(); Voiture v6  = MesObjets.getV6(); 
        Voiture v7  = MesObjets.getV7(); Voiture v8  = MesObjets.getV8();
        Voiture v9  = MesObjets.getV9(); Voiture v10 = MesObjets.getV10();
        Voiture v11 = MesObjets.getV11();


        menu();

        System.out.print("\nChoisir une fonctionnalite: ");
        String action = saisie.nextLine(); 
        
        switch(action) {

            case "1" : Reservation.reserver();  break;

            case "2" : Retour.retourvehicule(); break;

            case "3" : pointsDeService();       break; 
    
            case "4" : listVoitures();          break;

            case "5" : listCamions();           break;

            case "6" : supprimerVoiture();      break;
      
            case "7" : supprimerCamion();       break;
            
            case "8" : ajouterVoiture();        break;
          
            case "9" : ajouterCamion();         break;  
                           
            default  : System.out.println("\nEntrer un nombre de 1 a 9\n"); break;
                                             
        }        
    }
 }


