
/***************************************************************
* Dans cette classe on defini   :
* - Tous mes objets 
* - Pour les appeler ailleurs 
*****************************************************************/
public class MesObjets {

 static Siteportage site1 = new Siteportage("Bourget     ","2,av JJ 93350 Le Bourget");
 static Voiture v1 = new Voiture("v1: Peugeot","3008   ","AA879AA","automatiq",5,5,true);
 static Voiture v2 = new Voiture("v2: Citroen","C4     ","AB349EA","manuel   ",3,2,true);
 static Voiture v3 = new Voiture("v3: Renault","CAPTURE","AC949EA","manuel   ",3,5,true);
 static Voiture v4 = new Voiture("v4: Citroen","C3     ","AB339AA","manuel   ",5,5,true); 
 static Camion C1 = new Camion("cam1: Iveco  ","330      ","AB777AA","manuel   ",3,2,true,24);
 static Camion C2 = new Camion("cam2: Renault","Master I ","BB444AA","manuel   ",3,2,true,15);
 static Camion C3 = new Camion("cam3: Lancia ","Jota     ","AA555AA","manuel   ",5,9,true,22);
 static Camion C4 = new Camion("cam4: Bianchi","Visconteo","CB222AA","manuel   ",3,2,false,24);
 static Siteportage site2 = new Siteportage("Paris Nord  ","Roissy Charles De Gaulle");
 static Voiture v5 = new Voiture("v5: BMW   ","Z4 GT3   ","BM333BB","automatiq",5,5,true); 
 static Voiture v6 = new Voiture("v6: TOYOTA","RAV4     ","CC666CC","automatiq",3,2,true);
 static Voiture v7 = new Voiture("v7: LANCIA","EPSILONE ","CC777CA","automatiq",5,5,true);                   
 static Camion C5 = new Camion("cam5: Bianchi","Visconteo","CB222CC","manuel   ",5,9,true,22);
 static Camion C6 = new Camion("cam6: FORD   ","TRANSIT 2","CC666EE","manuel   ",5,9,false,15);
 static Siteportage site3 = new Siteportage("Paris Centre","2, bd Aragon 75005 Paris");
 static Voiture v8  = new Voiture("v8: LAMBORGHINI","EVO     ","LL333BB","manuel   ",5,5,true);
 static Voiture v9  = new Voiture("v9: MASERATTI  ","GBL     ","AA333AB","manuel   ",3,2,true);
 static Camion C7 = new Camion("cam7: FIAT  ","TALENTO ","LL333AA","manuel   ",3,9,false,24);
 static Camion C8 = new Camion("cam8: FIAT  ","DUCO    ","AA333EE","automatiq",3,2,true,15);
 static Siteportage site4 = new Siteportage("Orly Sud    ","7, av Pascal 94310 0rly");
 static Voiture v10  = new Voiture("v10: Bugatti","DIVO       ","LL333BB","manuel   ",3,2,true);
 static Voiture v11  = new Voiture("v11: Bentley","Continental","AA333AA","manuel   ",5,5,true);
 static Camion C9  = new Camion("cam9: RENAULT ","KANGOO   ","LL333CC","manuel   ",5,9,true,22);
 static Camion C10 = new Camion("cam10: RENAULT","EXPRESS  ","AA333EE","manuel   ",5,7,false,15);

 public static Siteportage getSite1(){ return site1; }
 public static Siteportage getSite2(){ return site2; }
 public static Siteportage getSite3(){ return site3; }
 public static Siteportage getSite4(){ return site4; }

 public static Voiture getV1(){ return v1; }
 public static Voiture getV2(){ return v2; }
 public static Voiture getV3(){ return v3; }
 public static Voiture getV4(){ return v4; }
 public static Voiture getV5(){ return v5; }
 public static Voiture getV6(){ return v6; }
 public static Voiture getV7(){ return v7; }
 public static Voiture getV8(){ return v8; }
 public static Voiture getV9(){ return v9; }
 public static Voiture getV10(){ return v10; }
 public static Voiture getV11(){ return v11; }

 public static Camion getC1(){ return C1; }
 public static Camion getC2(){ return C2; }
 public static Camion getC3(){ return C3; }
 public static Camion getC4(){ return C4; }
 public static Camion getC5(){ return C5; }
 public static Camion getC6(){ return C6; }
 public static Camion getC7(){ return C7; }
 public static Camion getC8(){ return C8; }
 public static Camion getC9(){ return C9; }
 public static Camion getC10(){ return C10; }

}


