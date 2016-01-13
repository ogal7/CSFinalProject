public class Food {

  //instance vars
  private String[][] food;//name, price, likelihood to go bad 
  String name;
  int price;
  int rotting;
  
public Food() {
	name = "Apple";
	price = 1;
	rotting = 1;
	
}


public Food(String n, int p, int r) {
	name = n;
	price = p;
	rotting = r;
}

public String toString() {
	String retStr = "";
	retStr=name + "   ~   $"+ price + "   ~   " + rotting+" ";	
	return retStr;
}
}
