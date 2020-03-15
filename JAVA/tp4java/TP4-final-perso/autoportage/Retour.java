import java.util.Scanner; //pour recuperer les saisies utilisateur

/*********************************************************************
* Dans cette classe on fait :
* - Instantiation des objets
* - Pilotage des classes pour la fonctionnalite : RESERVATION
*********************************************************************/

public class Retour {

  private static Scanner saisie = new Scanner(System.in);

  public static void retourvehicule(){ 

        Siteportage site1 = MesObjets.getSite1();
        Siteportage site2 = MesObjets.getSite2(); 
        Siteportage site3 = MesObjets.getSite3(); 
        Siteportage site4 = MesObjets.getSite4();

        Camion cam1 = MesObjets.getC1(); Camion cam2  = MesObjets.getC2();
        Camion cam3 = MesObjets.getC3(); Camion cam4  = MesObjets.getC4();
        Camion cam5 = MesObjets.getC5(); Camion cam6  = MesObjets.getC6();
        Camion cam7 = MesObjets.getC7(); Camion cam8  = MesObjets.getC8();
        Camion cam9 = MesObjets.getC9(); Camion cam10 = MesObjets.getC10();
     
        Voiture v1  = MesObjets.getV1(); Voiture v2  = MesObjets.getV2(); 
        Voiture v3  = MesObjets.getV3(); Voiture v4  = MesObjets.getV4();
        Voiture v5  = MesObjets.getV5(); Voiture v6  = MesObjets.getV6(); 
        Voiture v7  = MesObjets.getV7(); Voiture v8  = MesObjets.getV8();
        Voiture v9  = MesObjets.getV9(); Voiture v10 = MesObjets.getV10();
        Voiture v11 = MesObjets.getV11();
    
    System.out.println("\nTask2: RETOUR D'UN VEHICULE");
    System.out.println("\nVoici nos point de service:\n");   
    System.out.println(site1+"\n"+site2+"\n"+site3+"\n"+site4); 
    //1.CHOIX : SITE DE RETOUR( + list vehicules disponibles)
    System.out.print("\nVeuillez choisir votre site de retour(Par son nom): ");
    String nomsite = saisie.nextLine();

   //2. Informations demandees au retour d'un vehicule
    System.out.print("\nVoulez-vous rendre une voiture ou un camion ? ");
    String typevehicule = saisie.nextLine();
  
    System.out.print("\nCode vehicule(exples: v1 si voiture | cam3 si camion): ");
    String codevehicule = saisie.nextLine();

    System.out.print("\nNom conducteur depositaire: ");
    String nomconducteur = saisie.nextLine();

    System.out.print("\nDate de retrait : ");
    String dateretrait = saisie.nextLine();

    System.out.print("\nDate de retour : ");
    String dateretour = saisie.nextLine();

    System.out.print("\nTelephone conducteur: ");
    int tel = saisie.nextInt();

   Conducteur c = new Conducteur(nomconducteur, tel);

   Siteportage siteretour = new Siteportage(nomsite);

      Voiture v;
      Camion  cam;

      if(codevehicule.equals("v1"))        v = v1;
      else if(codevehicule.equals("v2"))   v = v2;
      else if(codevehicule.equals("v3"))   v = v3;
      else if(codevehicule.equals("v4"))   v = v4;
      else if(codevehicule.equals("v5"))   v = v5;
      else if(codevehicule.equals("v6"))   v = v6;
      else if(codevehicule.equals("v7"))   v = v7;
      else if(codevehicule.equals("v8"))   v = v8;
      else if(codevehicule.equals("v9"))   v = v9;
      else if(codevehicule.equals("v10"))  v = v10;
      else  v = v11;

      siteretour.setVoiture(v);

      if(codevehicule.equals("cam1")) cam = cam1;
      else if(codevehicule.equals("cam2")) cam = cam2;
      else if(codevehicule.equals("cam3")) cam = cam3;
      else if(codevehicule.equals("cam4")) cam = cam4;
      else if(codevehicule.equals("cam5")) cam = cam5;
      else if(codevehicule.equals("cam6")) cam = cam6;
      else if(codevehicule.equals("cam7")) cam = cam7;
      else if(codevehicule.equals("cam8")) cam = cam8;
      else if(codevehicule.equals("cam9")) cam = cam9;
      else cam = cam10; 
   
      siteretour.setCamion(cam);
       
      System.out.println("\n ---------------------------------------------\n");     
 
      if(typevehicule.equals("voiture")) 
      System.out.println(" La voiture "+v.getMarque()+" "+v.getModele()+" est rendue");
      if(typevehicule.equals("camion")) 
      System.out.println(" Le camion "+cam.getMarque()+" "+cam.getModele()+" est rendu");
      System.out.println(" Date de retour : "+dateretour);
      System.out.println(" Site de retour : "+nomsite);
    

      System.out.println("\n ---------------------------------------------\n"); 
      
     //VERIFICATION : Affichage pour verifier si le est bien fait
   
      if(typevehicule.equalsIgnoreCase("voiture")  ){      
	  System.out.println("\nNew list: voitures disponibles a "+nomsite+"\n"); 
          if( nomsite.equalsIgnoreCase("Bourget") ){ 
               
               if((v!=v1)&&(v!=v2)&&(v!=v3)&&(v!=v4))//evite les doublons
                  System.out.println(v+"\n"+v1+"\n"+v2+"\n"+v3+"\n"+v4);
               else
                  System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4);

          }else if( nomsite.equalsIgnoreCase("Paris Nord") ){

               if((v!=v5)&&(v!=v6)&&(v!=v7))
                  System.out.println(v+"\n"+v5+"\n"+v6+"\n"+v7);
               else
                  System.out.println(v5+"\n"+v6+"\n"+v7);
           
          }else if( nomsite.equalsIgnoreCase("Paris Centre") ){

               if((v!=v8)&&(v!=v9))
                  System.out.println(v+"\n"+v8+"\n"+v9);
               else
                  System.out.println(v8+"\n"+v9);
          
          }else {//if( nomsite.equalsIgnoreCase("Orly Sud") )

               if((v!=v10)&&(v!=v11))
                  System.out.println(v+"\n"+v10+"\n"+v11);
               else
                  System.out.println(v10+"\n"+v11);
            
          }
          
          System.out.println("\nLa voiture "+v.getMarque()+" "+v.getModele());
          System.out.println("\nEst maintenant disponible a "+nomsite);
          System.out.println(""); 

      }else if(typevehicule.equalsIgnoreCase("camion")){
	  System.out.println("\nNew list: camions disponibles a "+nomsite+"\n"); 
          if( nomsite.equalsIgnoreCase("Bourget") ){ 
             
              if((cam!=cam1)&&(cam!=cam2)&&(cam!=cam3)&&(cam!=cam4))//evite les doublons
                  System.out.println(cam+"\n"+cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4);
              else
                  System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4);
  
          }else if( nomsite.equalsIgnoreCase("Paris Nord") ){
          
              if((cam!=cam5)&&(cam!=cam6))
                  System.out.println(cam+"\n"+cam5+"\n"+cam6);
              else
                  System.out.println(cam5+"\n"+cam6);
      
          }else if( nomsite.equalsIgnoreCase("Paris Centre") ){

              if((cam!=cam7)&&(cam!=cam8))
                  System.out.println(cam+"\n"+cam7+"\n"+cam8);
              else
                  System.out.println(cam7+"\n"+cam8);
              
          }else {//if( nomsite.equalsIgnoreCase("Orly Sud") )

              if((cam!=cam9)&&(cam!=cam10))
                  System.out.println(cam+"\n"+cam9+"\n"+cam10);
              else
                  System.out.println(cam9+"\n"+cam10);
              
          } 

          System.out.println("\nLe camion "+cam.getMarque()+" "+cam.getModele());
          System.out.println("\nEst maintenant disponible a "+nomsite);
          System.out.println("");     
      }else{
          System.out.println("Erreur de saisie !");
          System.out.println("Veuillez corriger le nom du site de retour"); 
      }
       
  }// fin mthd rendrevehicule()
}
     

 

    

