public class Bev {

  //instance vars
  private boolean hasAlcohol;
  
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
	retStr=name + "\n\t$"+ price + "\n\tDifficulty: " + maintenance+"\n\tAlcoholic? :" + hasAlcohol;	
	return retStr;
}
}
//uml done
