// Does not need editing

public class Manager extends Employee{

  // Instance vars
  private int greediness;
  //ososos
  // Constructor
  public Manager(){
    name = "Mr. Mosby";
    reqSalary = 75000.0;
    rating = .8;
    speed = 7;
    precision = 7;
    accuracy = 7;
    greediness = 2;
  }
  
  public Manager(String n, double req, double rat, int s, int prec, int acc, int gred){
    name = n;
    reqSalary = req;
    rating = rat;
    speed = s;
    precision = prec;
    accuracy = acc;
    greediness = gred;
  }
	
  // Methods
  public void setGreediness(int i){
    greediness = i;}
  public int getGreediness(){
    return greediness;}
	  
}

