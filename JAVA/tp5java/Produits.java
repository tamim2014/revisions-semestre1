

public class Produits
{
  public static void main(String[] args){
   
      // INSTANCIATION

      Livre livre1=new Livre("Les miserable",19.99, "Victor Hugo");
      Livre livre2=new Livre("L'aveuglement",7.8, "Jose Saramago");
      Dvd dvd1=new Dvd("Adieux Olympia",26.0, "Jacques Brel", 147.0);
      Dvd dvd2=new Dvd("Live Palais des sports",9.0,"Charles Aznavour",97.0);
      Cd cd1=new Cd("Essenciel",13.0,"Zazie",14);
   
      // AFFICHAGE 

      System.out.println(livre1);
      System.out.println(livre2);
      System.out.println(cd1);
      System.out.println(dvd1);
      System.out.println(dvd2);     
  }
  
}


