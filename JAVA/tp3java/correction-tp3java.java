
// 1) Moyenne.java

/**********************************************************
 *
 * En utilisant l'Exercice dâ€™application: La moyenne, 
 * on vous demande de factorises le code sur 2 methodes:

 * La 1ere fait de calcul de la moyenne;
 * La 2eme permet l'affichage des resultats.
 *
 ***********************************************************/

public class Moyenne{
	
	
	public static double calculeMoyenne(double[] n){		
      double somme = 0;
      for(int i = 0; i < n.length; i++){
          somme += n[i];          
      }
		return somme/n.length;
	}
	
	public static void afficheMoyenne(double moyenne){
		System.out.println("La moyenne est: " + moyenne);
	}

	public static void main(String[] args){
		
		// Prends les arguments( de type String) passes par ligne de commande  
		// et les convertit au type numerique double

		        double [] notes = new double[6];
		        notes[0] = Double.parseDouble(args [0]);
		        notes[1] = Double.parseDouble(args [1]);
		        notes[2] = Double.parseDouble(args [2]);
		        notes[3] = Double.parseDouble(args [3]);
		        notes[4] = Double.parseDouble(args [4]);
		        notes[5] = Double.parseDouble(args [5]);

		        
				  double moyenne = calculeMoyenne(notes);
				  afficheMoyenne(moyenne);
		
	}

}


// 2) TableauM.java

/***************************************************************
*
* Donnez un exemple de declaration, initialisation et affichage 
* d'un tableau 3x4 (3 lignes et 4 colonnes).
*
* Le contenu de chaque element du tableau sera : 
* la somme de sa ligne avec sa colonne:
*
****************************************************************/

public class TableauM {

	public static void main(String[] args){
		
		int[][] tabM = new int [3][4];
		
		for(int i = 0; i < tabM.length; i++){
			for(int j = 0; j < tabM[i].length; j++){
				tabM[i][j] = i + j;	
				System.out.print(tabM[i][j] + " ");
			}
			System.out.println();	
		}	
	}
}