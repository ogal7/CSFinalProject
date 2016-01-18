public class RestaurantRushV1 {
  
  // Instance vars
  private int monthsToGo = 12;
  private Restaurant[] openRestaurants;
  private double cashMoney = 0;
  private double waitstaff = 0;
  private double chefs = 0;
  private double managers = 0;
  private double food = 0;

  // Methods
  public static void play(Restaurant r) {
    cash /= (.4 * // costOfFood <-- need to find
  }
  
  public static void stillAlive(Restaurant r){}

  public static void renovateRestaurant(){
      double num = funds;
      
      // Food
      System.out.println("You have $" + cashMoney + ". How much would you like to spend on food?");
      for (String s: args){
        num = Double.parseD(s);}
      if (num < 0){
        System.out.println("You cannot withdraw a negative amount. Try a positive number.")}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      food += num;
      
      // Chefs
      System.out.println("You have $" + cashMoney + ". How much would you like to spend on chefs?");
      for (String s: args){
        num = Double.parseD(s);}
      if (num < 0){
        System.out.println("You cannot withdraw a negative amount. Try a positive number.")}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      chefs += num;
      
      // Waitstaff
      System.out.println("You have $" + cashMoney + " remaining. How much would you like to spend on waitstaff?");
      for (String s: args){
        num = Double.parseD(s);}
      if (num < 0){
        System.out.println("You cannot withdraw a negative amount. Try a positive number.")}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      waitstaff += num;
      
      // Managers
      System.out.println("You have $" + cashMoney + " remaining. How much would you like to spend on managers?");
      for (String s: args){
        num = Double.parseD(s);}
      if (num < 0){
        System.out.println("You cannot withdraw a negative amount. Try a positive number.")}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      managers += num;
  }

  public static void lose(){}

  // Main
  public static void main(String [] args) {
    // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!\n \n It's the beginning of January, and you want to \n open a Restaurant!");
    
    // Create Restaurant: name, workers, food, location
    Restaurant r = new Restaurant;
    
    System.out.println("You have $100,000 in funds. ");
    
    // Play
    while (monthsToGo > 0 ) {
      renovateRestaurant();
      play(r);
      stillAlive(r);
      monthsToGo--;
      }
  }

}
Status API Training Shop Blog About Pricing
