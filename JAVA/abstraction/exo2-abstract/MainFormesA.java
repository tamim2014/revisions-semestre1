public class MainFormesA
{
  public static void main(String[] args){

    // 1.INSTANCIATION 

    Rectangle r1; 
    r1 = new Rectangle(5,10);
    Carre c1 = new Carre(3);

    // 2.APPEL DES METHODES

    surfaceR1=r1.surface();
    surfaceC1=c1.surface();
    perimetreR1=r1.perimetre();
    perimetreC1=c1.perimetre();
    
    // 3.AFFICHAGE

    System.out.println(r1);
    System.out.println("Surface:"+surfaceR1);
    System.out.println("Perimetre:"+perimetreR1);

    System.out.println(c1);//toString
    System.out.println("Surface:"+surfaceC1);
    System.out.println("Perimetre:"+perimetreC1);
  }
  
}
