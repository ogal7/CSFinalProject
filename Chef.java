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
    precision = 7;
    accuracy = 7;
    cookingKnowledge = 2;
  }
  
  
  public Chef(String n, double req, double ratin, int s, int prec, int acc, int cK ){
    name = n;
    reqSalary = req;
    rating = ratin;
    speed = s;
    precision = prec;
    accuracy = acc;
    cookingKnowledge = cK;
  }
	
  // Methods
  public void setCookingKnowledge(int i){
    cookingKnowledge = i;}
  public int getCookingKnowledge(){
    return cookingKnowledge;}
	  
}
//
