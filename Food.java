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
	maintenance = m;
	isRotten = false;
}

public String toString() {
	String retStr = "";
	String maintenanceLevel = "Low";
	if (maintenance >= 5){
		maintenanceLevel = "High";
	} 
	String isFresh = "Yes";
	if (isRotten == true){
		isFresh = "No";
	}
	retStr = name + "\t$"+ price + "\t Maintenance Level: " + maintenanceLevel + " Fresh?: " + isFresh+"\n";	
	return retStr;
}
<<<<<<< HEAD
    public boolean getRottenness(){
	return isRotten;
}
=======

>>>>>>> 02149a5869841c4ac4b726dd9974a14f5b25a26d
}
//
