/* Restaurant.java represents the individual establishments 
   in a user's restaurant chain */


public class Restaurant {

  // ~~~~~~~~~~~INSTANCE VARS~~~~~~~~~~
  private String name;
  private boolean hasRats;
  private boolean hasFlies;
  private Employee[] managers;
  private Employee[] chefs;
  private Employee[] waiters;
  private items[][][] menu;  
  private int starRating;  // scale from 1-5
  private int popularity;  // scale from 1-10
  private int fanciness;   // scale from 1-10
  private int healthiness; // scale from 1-10
  private int size;        // scale from 1-10
  
  // ~~~~~~~~~~~~~CONSTRUCTOR~~~~~~~~~~~~~
  public Restaurant(){
     name = "Restaurant";
     hasRats = false;
     hasFlies = false;
     managers = {Manager()};
     chefs = {Chef(), Chef()};
     menu = {Bevs(), Food()};
     starRating = 3;
     popularity = 5;
     fanciness = 5
     healthiness = 5;
     size = 5;
  }
  
  
  // ~~~~~~~~~~~~METHODS~~~~~~~~~~~~~
  
  // add new Manager, Chef, or Waiter
  public void addEmployee(Employee[] o, Employee worker){
     Employee newO = new Employee[o.length + l];
     for (int i = 0; i < o.length; i++){
        newO[i] = o[i];
     }
     newO[o.length] = worker;}
  
  // stringifies arrays
  public String printArray(Object[] a){
     String retStr = "";
     for (int i = 0; i < a.length - 1; i++){
        retStr =+ a[i] + ", ";
     }
     retStr =+ a[length - 1];
     return retStr;}
  
  // hasRats
  public void setRats(boolean b){
     hasRats = b;}
  public boolean getRats(){
     return hasRats;}
  
  // hasFlies
  public void setFlies(boolean b){
     hasFlies = b;}
  public boolean getFlies(){
     return hasFlies;}
     
  // name
  public void setName(String s){
     name = s;}
  public String toString(){
     return name;}
  
  // managers
  public void setManager(Employee newMan){
     managers = addEmployee(managers, newMan);}
   public String getManagers(){
      return printArray(managers);}
      
   // chefs
  public void setChef(Employee newChef){
     chefs = addEmployee(managers, newChef);}
   public String getChefs(){
      return printArray(chefs);}
      
   // waiters
  public void setWaiter(Employee newWaiter){
     waiters = addEmployee(managers, newWaiter);}
   public String getWaiters(){
      return printArray(waiters);}
  
  // menu
  public void addItem(Object[] o){
     menu = add
  }
  public String getMenu(){
     return printArray(menu);}
  
  // starRating
  public void setStarRating(){
     double avgEmployeeRating = 
     double avgEmployeeSpeed = 
     double avgEmployeeprecision = 
     starRating = 
  }
  public int getStarRating(){
     return starRating;}
     
   // popularity
  // public void setPopularity(){}
  public int getPopularity(){
     return popularity;}
     
   // fanciness
  // public void setFanciness(){}
  public int getFanciness(){
     return fanciness;}
     
   // healthiness
  // public void setHealthiness(){}
  public int getHealthiness(){
     return healthiness;}
     
   // size
  public void setSize(int i){
     if (i > 10 || i < 1){
        throw Exception ("Your size cannot be greater than 10 or less than 1");}
     size = i;}
  public int getSize(){
     return size;}
}
