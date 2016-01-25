// Does not need editing

public class Manager extends Employee{

  // Instance vars
  private double greediness;
  private double orgo;

  // Constructor
  public Manager(){
    name = "Mr. Mosby";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    accuracy = 7;
    greediness = 2;
    orgo = (double) speed * accuracy;
  }
  
  public Manager(String n, int req, double rat, int s, int acc, int gred){
    name = n;
    reqSalary = req;
    rating = rat;
    speed = s;
    accuracy = acc;
    greediness = gred;
  }
	
  // Methods
  public void setGreediness(double i){
    greediness = i;}
 
  public double getGreediness(){
    return greediness;}
    
    
    public String toString() {
    	return "Manager "+name+" needs to be paid a monthly salary of $" + reqSalary + ". \n   Their rating is " 
    	+ rating + "\n   Their speed is " + speed + "\n   Their Attentiveness is " + accuracy 
    	+ ". \n   Their greediness is " + greediness + ". \n   Their organization level is " + orgo+"\n"; 
    }
	  
}

