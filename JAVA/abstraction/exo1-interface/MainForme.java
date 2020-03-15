public class MainForme
{
  public static void main(String[] args){

    // 1.INSTANCIATION
    
    Rectangle r1;
    r1 = new Rectangle(5,10);
    Carre c1 = new Carre(3);
    
    // 2.APPEL DES METHODES

    SR = r1.surface();
    SC = c1.surface();
    PR = r1.perimetre();
    PC = c1.perimetre();
     
    // 3.AFFICHAGE

    System.out.println(r1);
    System.out.println("Surface:"+SR);
    System.out.println("Perimettre:"+PR);

    System.out.println(c1);
    System.out.println("Surface:"+SC);
    System.out.println("Perimetre:"+PC);

  }

  /***************************
  
  RMQ1: Imlpementation par heritage

  La classe Carre implemente par
  heritage, les methodes:
   - Rectangle(int lo, int la)
   - perimetre()
   - surface()
   de la classe Rectangle
  ________________________
   RMQ2 : Appel mthd toString
   - System.out.println(
      varible d'instance);

  ****************************/

}


