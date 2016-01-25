// Does not need editing

public class Chef extends Employee{

  // Instance vars
  private double cookingKnowledge;
  
  // Constructor
  public Chef(){
    name = "bob";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    accuracy = 7;
    cookingKnowledge = 2;
  }
  
  
  public Chef(String n, double req, double rating, int s, int acc, double cK ){
    name = n;
    reqSalary = req;
    rating = rating;
    speed = s;
    accuracy = acc;
    cookingKnowledge = cK;
  }
	
  // Methods
  public void setCookingKnowledge(double i){
    cookingKnowledge = i;}
  public double getCookingKnowledge(){
    return cookingKnowledge;}
    
    
    public String toString() {
    	return "Chef "+name+" needs to be paid a monthly salary of $" + reqSalary + ". \n   Their rating is " 
    	+ rating + "\n   Their speed is " + speed + "\n   Their Attentiveness is " + accuracy 
    	+ ". \n   Their cooking experience is " + cookingKnowledge + " years\n"; 
    }
	  
}
//
