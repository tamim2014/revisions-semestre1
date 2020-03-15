import java.util.Scanner; //pour recuperer les saisies utilisateur

/*********************************************************************
* Dans cette classe on fait :
* - Instantiation des objets
* - Pilotage des classes pour la fonctionnalite : RESERVATION
*********************************************************************/

public class Reservation {

  private static Scanner saisie = new Scanner(System.in);

  public static void reserver(){ 

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

    System.out.println("\nVoici nos point de service:\n");   
    System.out.println(site1+"\n"+site2+"\n"+site3+"\n"+site4); 
    //1.CHOIX : SITE DE RETRAIT( + list vehicules disponibles)
    System.out.print("\nVeuillez choisir votre site de retrait(Par son nom): ");
    String nomsite = saisie.nextLine();
    //2.CHOIX : TYPE DE VEHICULE( voiture ou camion )
    System.out.print("\nVoulez-vous une voiture ou un camion: ");
    String typevehicule = saisie.nextLine();
      if(typevehicule.equalsIgnoreCase("voiture")  ){      
	  System.out.println("\nVoici les voitures disponibles a "+nomsite+"\n"); 
          if( nomsite.equalsIgnoreCase("Bourget") ){ 
               System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4);//appel toString()
          }else if( nomsite.equalsIgnoreCase("Paris Nord") ){
              System.out.println(v5+"\n"+v6+"\n"+v7);
          }else if( nomsite.equalsIgnoreCase("Paris Centre") ){
              System.out.println(v8+"\n"+v9);
          }else {//if( nomsite.equalsIgnoreCase("Orly Sud") )
              System.out.println(v10+"\n"+v11);
          }

      }else if(typevehicule.equalsIgnoreCase("camion")){
	  System.out.println("\nVoici les camion disponibles a "+nomsite+"\n"); 
          if( nomsite.equalsIgnoreCase("Bourget") ){ 
               System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4);
          }else if( nomsite.equalsIgnoreCase("Paris Nord") ){
              System.out.println(cam5+"\n"+cam6);
          }else if( nomsite.equalsIgnoreCase("Paris Centre") ){
              System.out.println(cam7+"\n"+cam8);
          }else {//if( nomsite.equalsIgnoreCase("Orly Sud") )
              System.out.println(cam9+"\n"+cam10);
          }     
      }else{
          System.out.println("Erreur de saisie - choisir voiture ou camion");
      }
  
   //3 .CHOIX  DU VEHICULE

    System.out.print("\nFaites votre choix - code vehicule(exple v1 ou cam3): ");
    String codevehicule = saisie.nextLine();

    System.out.print("\nNom conducteur: ");
    String nomconducteur = saisie.nextLine();

    System.out.print("\nDate retrait prevue: ");
    String dateretrait = saisie.nextLine();

    System.out.print("\nDate retour prevue: ");
    String dateretour = saisie.nextLine();

    System.out.print("\nTelephone conducteur: ");
    int tel = saisie.nextInt();

   Conducteur c = new Conducteur(nomconducteur,tel);

   /***************************SITE ORLY SUD*************************/
   if(nomsite.equalsIgnoreCase("Orly Sud")){

    switch(codevehicule) {

     case "v10" :
      c.setVoiture(v10);  
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v10 = null ;
      site4.setVoiture(v10);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);          
      if( v10 == null) System.out.println(v11);
      else System.out.println(v10+"\n"+v11); break;  

     case "v11" :
      c.setVoiture(v11);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v11 = null ;
      site4.setVoiture(v11);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);           
      if( v11 == null) System.out.println(v10);
      else System.out.println(v10+"\n"+v11);  break;
       
      case "cam9" :
      c.setCamion(cam9);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam9 = null ;
      site4.setCamion(cam9);

      //appel toString() de la classe Conducteur 
      System.out.println("\n ---------------------------------------------\n");    
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 

      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam9 == null) System.out.println(cam10);
      else System.out.println(cam9+"\n"+cam10); break;

      case "cam10" :
      c.setCamion(cam10);  
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam10 = null ;
      site4.setCamion(cam10);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam10 == null) System.out.println(cam9);
      else System.out.println(cam9+"\n"+cam10); break;   
        
     default :
       System.out.println("\nCe vehicule n'est pas disponible a "+nomsite+"\n");
       break; 
     }// fin switch codevehicule 
   System.out.println();  
   }// fin if site Orly Sud 


   /***************************SITE PARIS CENTRE*************************/
   if(nomsite.equalsIgnoreCase("Paris Centre")){

    switch(codevehicule) {

     case "v8" :
      c.setVoiture(v8);     
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v8 = null ;
      site3.setVoiture(v8);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);          
      if( v8 == null) System.out.println(v9);
      else System.out.println(v8+"\n"+v9); break;  

     case "v9" :
      c.setVoiture(v9);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v9 = null ;
      site3.setVoiture(v9);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);           
      if( v9 == null) System.out.println(v8);
      else System.out.println(v8+"\n"+v9);  break;
       
      case "cam7" :
      c.setCamion(cam7);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam7 = null ;
      site3.setCamion(cam7);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam7 == null) System.out.println(cam8);
      else System.out.println(cam7+"\n"+cam8); break;

      case "cam8" :
      c.setCamion(cam8);     
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam8 = null ;
      site3.setCamion(cam8);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam8 == null) System.out.println(cam7);
      else System.out.println(cam7+"\n"+cam8); break;   
        
     default :
       System.out.println("\nCe vehicule n'est pas disponible a "+nomsite+"\n");
       break; 
     }// fin switch codevehicule 
   System.out.println();  
   }// fin if site Paris centre 

   /**************************SITE PARIS NORD*******************************/

   if(nomsite.equalsIgnoreCase("Paris Nord")){

    switch(codevehicule) {

     case "v5" :
      c.setVoiture(v5);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v5 = null ;
      site2.setVoiture(v5);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);          
      if( v5 == null) System.out.println(v6+"\n"+v7);
      else System.out.println(v5+"\n"+v6+"\n"+v7); break;  

     case "v6" :
      c.setVoiture(v6);
      
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v6 = null ;
      site2.setVoiture(v6);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew lis: voiture disponibles a "+nomsite);           
      if( v6 == null) System.out.println(v5+"\n"+v7);
      else System.out.println(v1+"\n"+v5+"\n"+v6+"\n"+v7);  break;
       
     case "v7" :
      c.setVoiture(v7);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v7 = null ;
      site2.setVoiture(v7);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voitures disponibles a "+nomsite);           
      if( v7 == null) System.out.println(v5+"\n"+v6);
      else System.out.println(v5+"\n"+v6+"\n"+v7); break; 

      case "cam5" :
      c.setCamion(cam5);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam5 = null ;
      site2.setCamion(cam5);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam5 == null) System.out.println(cam6);
      else System.out.println(cam5+"\n"+cam6); break;

      case "cam6" :
      c.setCamion(cam6);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam6 = null ;
      site2.setCamion(cam6);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam6 == null) System.out.println(cam5);
      else System.out.println(cam1+"\n"+cam5+"\n"+cam6); break;   
        
     default :
       System.out.println("\nCe vehicule n'est pas disponible a "+nomsite+"\n");
       break; 
     }// fin switch codevehicule 
   System.out.println();  
   }// fin if site Paris Nord 

   /**************************SITE DU BOURGET*******************************/

   if(nomsite.equalsIgnoreCase("Bourget")){

    switch(codevehicule) {

     case "v1" :
      c.setVoiture(v1);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v1 = null ;
      site1.setVoiture(v1);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);          
      if( v1 == null) System.out.println(v2+"\n"+v3+"\n"+v4);
      else System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4); break;  

     case "v2" :
      c.setVoiture(v2);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v2 = null ;
      site1.setVoiture(v2);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voiture disponibles a "+nomsite);           
      if( v2 == null) System.out.println(v1+"\n"+v3+"\n"+v4);
      else System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4);  break;
       
     case "v3" :
      c.setVoiture(v3);      
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v3 = null ;
      site1.setVoiture(v3);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voitures disponibles a "+nomsite);           
      if( v3 == null) System.out.println(v1+"\n"+v2+"\n"+v4);
      else System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4); break; 

     case "v4" :
      c.setVoiture(v4);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      v4 = null ;
      site1.setVoiture(v4);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString();  
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: voitures disponibles a "+nomsite+"\n"); 
      if( v4 == null) System.out.println(v1+"\n"+v2+"\n"+v3);
      else System.out.println(v1+"\n"+v2+"\n"+v3+"\n"+v4); break; 

      case "cam1" :
      c.setCamion(cam1);     
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam1 = null ;
      site1.setCamion(cam1);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n");// pas c.toString(); lui ca va pas 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam1 == null) System.out.println(cam2+"\n"+cam3+"\n"+cam4);
      else System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4); break;

      case "cam2" :
      c.setCamion(cam2);  
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam2 = null ;
      site1.setCamion(cam2);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam2 == null) System.out.println(cam1+"\n"+cam3+"\n"+cam4);
      else System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4); break;
 
      case "cam3" :
      c.setCamion(cam3);    
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam3 = null ;
      site1.setCamion(cam3);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam3 == null) System.out.println(cam1+"\n"+cam2+"\n"+cam4);
      else System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4); break; 

      case "cam4" :
      c.setCamion(cam4);   
      c.setDateretrait(dateretrait);
      c.setDateretour(dateretour);
      cam4 = null ;
      site1.setCamion(cam4);
      System.out.println("\n ---------------------------------------------\n");     
      System.out.println(c+"\n"); 
      System.out.println("\n ---------------------------------------------\n"); 
      //Affichage pour verifier si la reservation est bien faite
      System.out.println("\nNew list: Camions disponibles a "+nomsite);          
      if( cam4 == null) System.out.println(cam1+"\n"+cam2+"\n"+cam3);
      else System.out.println(cam1+"\n"+cam2+"\n"+cam3+"\n"+cam4); break;
     
        
     default :
       System.out.println("\nCe vehicule n'est pas disponible a "+nomsite+"\n");
       break; 
   }// fin switch codevehicule 
  System.out.println();  
 }// fin if site du Bourget 
}// fin mthd reservation()
}
     

 

    

