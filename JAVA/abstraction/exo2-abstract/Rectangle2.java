public abstract class Forme 
{
   abstract int surface();
   abstract int perimetre();
}


public class Rectangle extends Forme
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
    int p=2*(this.longueur + this.largeur);
    return  p;
  }


  public int surface(){
    return this.longueur * this.largeur;
  }


  public String toString(){
    String show;
    show=+this.longueur+"X"+this.largeur;
    return "Rectangle:"+show;
  }

  
}

/**********************************

Lorsqu’une classe hérite d’une 
classe abstraite, elle doit :

  • implémenter toutes les méthodes 
    abstraites de sa classe mère 
    (en les dotant d’un corps) ;

*********************************/


