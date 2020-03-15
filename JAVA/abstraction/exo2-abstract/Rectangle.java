


public class Rectangle extends Forme
{
  private int longueur;
  private int largeur;
  public Rectangle(int longr, int largr){
    this.longueur = longr;
    this.largeur = largr;
  }  
  public int getLongeur() { return this.longueur; }
  public int getLargeur() { return this.largeur; }
  public void setLongeur( int lo) { this.longueur=lo; }
  public void setLargeur( int la) { this.largeur=la; }

  public int perimetre(){
    return 2*(this.longueur + this.largeur);
  }
  public int surface(){
    return this.longueur * this.largeur;
  }
  public String toString(){
    return "Rectangle:"+this.longueur+"X"+this.largeur;
  }
}


