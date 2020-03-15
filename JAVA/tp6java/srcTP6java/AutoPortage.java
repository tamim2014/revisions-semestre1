import java.util.Scanner; //pour recuperer les saisies utilisateur

public class AutoPortage{

        private static Scanner saisie = new Scanner(System.in);
        static Site site1 = new Site("AutoPartage1", "50 Rue de Lorem Ipsum");
        public static Site getSite1(){ return site1;}

        public static void menu(){
	        System.out.println();
	        System.out.println(" (1) Ajouter une camionnette");
	        System.out.println(" (2) Ajouter une voiture");
	        System.out.println(" (3) Afficher les vehicules");
	        System.out.println(" (0) Quitter ");
        }

        public static void ajouterCamion(){
        	System.out.print("\nMarque  : ");       String marque = saisie.nextLine();            
            System.out.print("\nModel  : ");        String model = saisie.nextLine();           
            System.out.print("\nMatriculation : "); String matricul = saisie.nextLine();
            
            //Ajout des options

            System.out.print("\nBoite(true/false) : ");
            //String boite = saisie.nextLine();
			boolean boite = saisie.nextBoolean();
            System.out.print("\nNombres de portes: ");      int pt = saisie.nextInt();          
            System.out.print("\nNombres de passagers : ");  int ps = saisie.nextInt();         
            System.out.print("\nClim(true/false) : ");  boolean clim = saisie.nextBoolean();          
            System.out.print("\nVolume interieur: ");  double volume = saisie.nextDouble();
            
			Camion nc = new Camion(matricul, marque, model, pt, ps, clim, boite, volume );
            site1.setCamion(nc); 
            System.out.println("\nLa nouvelle camionnette est ajoutee.\n");
        }
		
		public static void ajouterVoiture(){
        	System.out.print("\nMarque  : ");       String marque = saisie.nextLine();            
            System.out.print("\nModel  : ");        String model = saisie.nextLine();           
            System.out.print("\nMatriculation : "); String matricul = saisie.nextLine();           
            //Ajout des options
            System.out.print("\nBoite(true/false):"); boolean boite = saisie.nextBoolean();			
            System.out.print("\nNombres de portes: ");      int pt = saisie.nextInt();          
            System.out.print("\nNombres de passagers : ");  int ps = saisie.nextInt();         
            System.out.print("\nClim(true/false) : ");  boolean clim = saisie.nextBoolean();          
            
	        Voiture nv = new Voiture(matricul, marque, model, pt, ps, clim, boite);
            site1.setVoiture(nv); 
			
            System.out.println("\nLa nouvelle voiture est ajoutee.\n");
        }

		public static void quitter(){ System.exit(0); }
	
		public static void main (String[] args){
				
			Conducteur conducteur1 = new Conducteur("Marie", "0809020405");

			Voiture voiture1 = new Voiture("AA-999-AZ", "Peugeot", "308", 4, 5, true, true);
			Voiture voiture2 = new Voiture("AA-999-AZ", "Renault", "CAPTURE", 4, 5, true, true);
			Voiture voiture3 = new Voiture("AA-999-AS", "Fiat", "500", 4, 5, true, true);
			//Site site1 = new Site("AutoPartage1", "50 Rue de Lorem Ipsum");
			Site site1 = getSite1();
			
			System.out.println("\n---------------------------------------");		
			System.out.println(site1);
			System.out.println("---------------------------------------");
			System.out.println("Conducteur");
			System.out.println("---------------------------------------");		
			System.out.println(conducteur1);
			System.out.println("\n---------------------------------------");
			System.out.print("Vehicule : ");
			System.out.println(voiture1);
			System.out.println("---------------------------------------");

					
					
			
			conducteur1.prendreVehicule(voiture1);
			System.out.println("\n---------------------------------------");
			System.out.println("Prendre Vehicule");
			System.out.println("---------------------------------------");		
			System.out.println("Conducteur");
			System.out.println("---------------------------------------");		
			System.out.println(conducteur1);		
			System.out.println("---------------------------------------");		
			System.out.print("Vehicule : ");
			System.out.println(voiture1);
			System.out.println("---------------------------------------");

			conducteur1.rendreVehicule();
			System.out.println("\n---------------------------------------");
			System.out.println("Rendre Vehicule");
			System.out.println("---------------------------------------");		
			System.out.println("Conducteur");
			System.out.println("---------------------------------------");		
			System.out.println(conducteur1);		
			System.out.println("---------------------------------------");		
			System.out.print("Vehicule : ");
			System.out.println(voiture1);
			System.out.println("---------------------------------------");	

			// TP6: Question1(mthd equals)

			System.out.println("\nTP6\n");
			System.out.println("---------------------------------------");
			System.out.print("1er test de comparaison : ");
			voiture1.equals(voiture2);
			System.out.println("---------------------------------------");
			System.out.print("2em test de comparaison : ");
			voiture1.equals(voiture3);
			System.out.println();
			
			// Appels des methodes du menu
			
		    menu();
			System.out.print("\nChoisir une fonctionnalite: ");
			String action = saisie.nextLine(); 
			
			switch(action) {
				case "1" : ajouterCamion();  break;
				case "2" : ajouterVoiture(); break;
				case "3" : System.out.println("Site1\n"+v1+"\n"+v2+"\n"+v3);  break;    
				case "0" : quitter();        break;                           
				default  : System.out.println("\nEntrer un nombre de 0 a 4\n"); break;                                            
			}  	
		}
}


