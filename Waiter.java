// Does not need editing

public class Waiter extends Employee{

  // Instance vars
  protected boolean isFelon;
  
  // Constructor
  public Waiter(){
    name = "Esteban";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    accuracy = 7;
    isFelon = false;
  }
  
  public Waiter(String n, int req, double rat, int s, int acc, boolean isfel){
    name = "n";
    reqSalary = req;
    rating = rat;
    speed = s;
    accuracy = acc;
    isFelon = isfel;
  }
  
  
  public String toString() {
    	return "Waiter "+name+" needs to be paid an annual salary of $" + reqSalary + ". \nTheir rating is " 
    	+ rating + "\nTheir speed is " + speed + "\nTheir Attentiveness is " + accuracy 
    	+ ". \n Their clumsiness is " + clumsiness + ". \nCriminal Record? " + isFelon; 
    }
	
  // Methods
  
  public void setFromJail(boolean i){
    isFelon = i;}
  public boolean getFromJail(){
    return isFelon;}
	  
}
