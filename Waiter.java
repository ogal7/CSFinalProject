// Does not need editing

public class Waiter extends Employee{

  // Instance vars
  protected boolean isFelon;
  protected int clumsiness;
  
  // Constructor
  public Waiter(){
    name = "Esteban"
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    precision = 7;
    accuracy = 7;
    clumsiness = 2;
    isFelon = false
  }
  
  public Waiter(String n, double req, double rat, int s, int prec, int acc, int clums, boolean isfel){
    name = "n";
    reqSalary = req;
    rating = rat;
    speed = s;
    precision = prec;
    accuracy = acc;
    clumsiness = clums;
    isFelon = isfel;
  }
	
  // Methods
  
  public void setFromJail(boolean i){
    isFelon = i;}
  public boolean getFromJail(){
    return isFelon;}
	  
}
