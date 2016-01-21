// Does not need editing

public class Manager extends Employee{

  // Instance vars
  private int greediness;
  private int orgo;
  //ososos
  // Constructor
  public Manager(){
    name = "Mr. Mosby";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    accuracy = 7;
    greediness = 2;
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
  public void setGreediness(int i){
    greediness = i;}
  public int getGreediness(){
    return greediness;}
    
    
    public String toString() {
    	return "Manager "+name+" needs to be paid an annual salary of $" + reqSalary + ". \nTheir rating is " 
    	+ rating + "\nTheir speed is " + speed + "\nTheir Attentiveness is " + accuracy 
    	+ ". \n Their greediness is " + greediness + ". \nTheir organization level is " + orgo; 
    }
	  
}

