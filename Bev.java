public class Bev extends Items {

  //instance vars
  private boolean hasAlcohol;
  private int maintenance;
  
public Bev() {
	hasAlcohol = false;
}


public Bev(String n, int p, int m, boolean a) {
	name = n;
	price = p;
	maintenance = m;
  	hasAlcohol = a;
}

public String toString() {
	String retStr = ""; 
	retStr=name + "\t$"+ price + "\tDifficulty: " + maintenance+"\tAlcoholic? :" + hasAlcohol + "\n";	
	return retStr;
	}
	
    public boolean hasAlcohol(){
	return hasAlcohol;
    }
}
//uml done
