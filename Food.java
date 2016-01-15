// Does not need editing

public class Food {

  //instance vars
  private String name;
  private int price;
  private int rotting;
  
// constructor
public Food() {
	name = "Apple";
	price = 1;
	rotting = 1;
}

// methods
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
//
