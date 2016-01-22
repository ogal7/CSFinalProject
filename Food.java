public class Food extends Items{

  //instance vars
  private boolean isRotten;
  
// constructor
public Food() {
	isRotten = false;
}

// methods
public Food(String n, int p, int m,  boolean r) {
	name = n;
	price = p;
	maintanance = m;
	isRotten = false;
}

public String toString() {
	String retStr = "";
	String maintananceLevel = "Low";
	if (maintanance >= 5){
		maintananceLevel = "High";
	} 
	String isFresh = "Yes";
	if (isRotten == true){
		isFresh = "No";
	}
	retStr = name + "\t$"+ price + "\t Maintanance Level: " + maintananceLevel + " Fresh?: " + isFresh+"\n";	
	return retStr;
}
}
//
