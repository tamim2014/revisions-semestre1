	
public class AutoPartage{
	
	public static void main (String[] args){
		
		// 1. INSTANCIATION
		
		Conducteur conducteur1 = new Conducteur("Marie", "0809020405");
		Voiture voiture1 = new Voiture("AA-999-AZ", "Peugeot", "308", 4, 5, true, true);
		Site site1 = new Site("AutoPartage1", "50 Rue de Lorem Ipsum");
		
		// 2. APPELs DES mthd toString( pour afficher ces 3 instances )

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

        // 3. APPELS DES METHODES et AFFICHAGE: 
		// * les motrices de la classe Conducteur et son toString()
        // * le toString()	de la classe Voiture			
		
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
	}
}	