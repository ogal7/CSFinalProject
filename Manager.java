public class Manager extends Employee{

  // Instance vars
  private int greediness;
  
  // Constructor
  public Manager(){
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    precision = 7;
    accuracy = 7;
    greediness = 2;
  }
	
  // Methods
  public void setGreediness(int i){
    greediness = i;}
  public int getGreediness(){
    return greediness;}
	  
}
