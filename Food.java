// Does not need editing

public class Food {

  //instance vars
  private boolean isRotten;
  
// constructor
public Food() {
	isRotten = false;
}

// methods
public Food(String n, int p, boolean r) {
	name = n;
	price = p;
	maintanance = 1;
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
	retStr = name + "\t$"+ price + "\t Maintanance Level: " + maintananceLevel + " Fresh?: " + isFresh;	
	return retStr;
}
}
//
