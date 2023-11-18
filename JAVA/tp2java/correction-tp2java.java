
// 1) Pair.java

/******************************************************************
*
* Ecrivez un programme pour determiner si un nombre est pair. 
* Si c'est le cas:
*  Afficher tous les nombres pairs plus petits que lui (jusqu'a  0)
*
********************************************************************/

public class Pair{

	public static void main(String[] args){
		
		int nombre = 8;
        // int nombre = 9;

		if((nombre % 2) == 0) {
			System.out.println(nombre + " est pair");
			for(int i = 0; i <= nombre; i ++){			
				if( i%2 == 0) System.out.println(i);
			}
		}

		else
			System.out.println(nombre + " n'est pas pair");				
	}
}


// 2) SommeTableau.java

/***************************************************
 * 
 * Ecrivez un prgrm realisant la mm chose 
 * en employant Ã  la place de l'instruction for ,
 * une instruction while
 *
 **************************************************/


public class SommeTableau {
    
	public static void main(String args[]){
        System.out.println("\n ce truc est bien sympa ! \n mais ça n a rien avoir avec la question demandee  \n");
		int tb[] = {5, 10, 15, 20, 25, 30};	
		int som = 0;
		int i = 0;	
		  
		while(i<tb.length){
			som += tb[i];
			System.out.println("Somme partielle: " + som);	
			i++;
		}  
		System.out.println("Somme finale: " + som);
	}
}