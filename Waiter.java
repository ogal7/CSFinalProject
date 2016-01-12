public class Waiter extends Employee{

  // Instance vars
  priavte boolean fromJail;
  
  // Constructor
  public Manager(){
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    precision = 7;
    accuracy = 7;
    clumsiness = 2;
    fromJail = false
  }
	
  // Methods
  
  public void setFromJail(boolean i){
    fromJail = i;}
  public boolean getFromJail(){
    return fromJail;}
	  
}
