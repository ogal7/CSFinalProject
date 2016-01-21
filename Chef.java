// Does not need editing

public class Chef extends Employee{

  // Instance vars
  private int cookingKnowledge;
  
  // Constructor
  public Chef(){
    name = "bob";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    accuracy = 7;
    cookingKnowledge = 2;
  }
  
  
  public Chef(String n, double req, double rating, int s, int acc, int cK ){
    name = n;
    reqSalary = req;
    rating = rating;
    speed = s;
    accuracy = acc;
    cookingKnowledge = cK;
  }
	
  // Methods
  public void setCookingKnowledge(int i){
    cookingKnowledge = i;}
  public int getCookingKnowledge(){
    return cookingKnowledge;}
    
    
    public String toString() {
    	return "Chef "+name+" needs to be paid an annual salary of $" + reqSalary + ". \nTheir rating is " 
    	+ rating + "\nTheir speed is " + speed + "\nTheir Attentiveness is " + accuracy 
    	+ ". \n Their cooking experience is " + cookingKnowledge + "years"; 
    }
	  
}
//
