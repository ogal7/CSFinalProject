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
    name = n;
    reqSalary = req;
    rating = rat;
    speed = s;
    accuracy = acc;
    isFelon = isfel;
  }
   
  
  public String toString() {
    	return "Waiter "+name+" needs to be paid an annual salary of $" + reqSalary + ". \n   Their rating is " 
    	+ rating + "\n   Their speed is " + speed + "\n   Their attentiveness is " + accuracy 
    	+ "\n   Criminal Record? " + isFelon+"\n"; 
    }
	
  // Methods
  
  public void setFromJail(boolean i){
    isFelon = i;}
  public boolean getFromJail(){
    return isFelon;}
	  
}
