public class Chef extends Employee{

  // Instance vars
  private int cookingKnowledge;
  
  // Constructor
  public Chef(){
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    precision = 7;
    accuracy = 7;
    cookingKnowledge = 2;
  }
	
  // Methods
  public void setCookingKnowledge(int i){
    greediness = i;}
  public int getCookingKnowledge(){
    return cookingKnowledge;}
	  
}
//
