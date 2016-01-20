// Does not need editing

public class Bev {

  //instance vars
  String name;
  int price;
  int maintenance;
  boolean hasAlcohol;
  
public Bev() {
	name = "Apple Juice";
	price = 1;
	maintenance = 1;
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
	retStr=name + "   ~   $"+ price + "   ~   " + maintenance+"   ~   " + hasAlcohol;	
	return retStr;
}
}
//uml done
