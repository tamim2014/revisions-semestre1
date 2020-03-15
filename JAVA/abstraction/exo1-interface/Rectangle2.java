public interface Forme 
{
   public int surface();
   public int perimetre();
}

public class Rectangle implements Forme
{
  private int longueur;
  private int largeur;

  public Rectangle(int longr, int largr){
    this.longueur = longr;
    this.largeur = largr;
  } 

  public int getLongeur() { 
    return this.longueur; 
  }
  public int getLargeur() { 
    return this.largeur; 
  }
  public void setLongeur( int lo) { 
    this.longueur=lo; 
  }
  public void setLargeur( int la) { 
    this.largeur=la; 
  }

  public int perimetre(){
    return 2*(longueur+largeur);
  }

  public int surface(){
    longueur = this.longueur;
    largeur = this.largeur;
    return longueur * largeur;
  }

  public String toString(){
    lo = this.longueur;
    la = this.largeur;
    return "Rectangle:"+lo+"X"+la;
  }

}


