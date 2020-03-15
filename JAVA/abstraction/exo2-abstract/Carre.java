
public class Carre extends Rectangle
{
	
  private int cote;

  public Carre(int cte){
    super(cte , cte); 
    this.cote = cte;
  }


  public int getCote(){ 
  	return this.cote; 
  }


  public void setCote(int c){ 
  	this.cote = c; 
  }


  public String toString(){
    return "Carre : "+this.cote;
  }


}


