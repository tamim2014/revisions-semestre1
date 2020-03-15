// 1) Calculatrice.java

/**********************************************************
 *
 * Ecrivez un programme Calculatrice pour afficher 
 * la somme, multiplication, soustraction, division 
 * et le module de deux nombres. 
 *
 * Premier nombre: 125
 * Deuxieme nombre: 24
 *
 ***********************************************************/

public class Calculatrice{

	public static void main (String [] args){
		
		int n1 = 125;
		int n2 = 24;
		
		int somme = n1 + n2;
		int multiplication = n1*n2;
		int soustraction = n1-n2;
		int division = n1/n2;
		int module = n1%n2;
		
		System.out.println(n1 + "+" + n2 + "=" + somme);
		System.out.println(n1 + "x" + n2 + "=" + multiplication);		
		System.out.println(n1 + "-" + n2 + "=" + soustraction);
		System.out.println(n1 + "/" + n2 + "=" + division);		
		System.out.println(n1 + "%" + n2 + "=" + module);		
	}
}

// 2) Chaine.java

/********************************************************
 *
 * Afficher la longueur d'une chaine de caracteres.
 * Chainede test: 
 *  "Master Handi - L'informatique au service du Handicap"
 *
 *********************************************************/

public class Chaine{

	public static void main(String[] args){
		
		String chaineT = "Master Handi - L'informatique au service du Handicap";
		
		System.out.println("La longueur de la chaine'"++"' est:" + chaineT.length() );
		
	}

}

// 3) Degres.java

/*********************************************************
 *
 * En utilisant la formule C = (F - 32)x 5/9 
 * Ecrivez un programme Degres pour 
 * convertir la temperature de Fahrenheit en degres Celsius.
 *
 **********************************************************/

public class Degres{

	public static void main(String[] args){
		
		double tempF = 212; // degres Fahrenheit		
		double tempC = (tempF - 32)*5/9;  // Formule: 	C = (F-32)x5/9
		
		System.out.println(tempF + " degres F  =  " + tempC + " en degres Celsius.");
		
	}

}

// 4) Tableau.java

/***************************************************************************
 * 
 * Afficher la somme des elements de Trois tableaux d'entiers de longueur 3
 *
 * Donnees de test:
 *   tableau1 = {1, 2, 3}
 *   tableau2 = {5, 11, 2}
 *   tableau3 = {7, 0, 0}
 *
 **************************************************************************/

public class Tableau{


	public static void main(String[] args){
		
		
		int[] tableau1 = {1,2,3};
		int[] tableau2 = {5,11,2};		
		int[] tableau3 = {7,0,0};
		
		int s1, s2, s3;
		
		s1 = tableau1[0] + tableau1[1] + tableau1[2];
		s2 = tableau2[0] + tableau2[1] + tableau2[2];		
		s3 = tableau3[0] + tableau3[1] + tableau3[2];
				
		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);
		System.out.println("S3 = " + s3);		
		
		// Calculer la somme dinamiquement => Ex: tableau1
		
		s1 = 0;
		
		for(int i = 0; i < tableau1.length; i++){
			s1 = s1 + tableau1[i]; // s1 += tableau[i];
		}		
		
		System.out.println("S1 = " + s1);
	}


}