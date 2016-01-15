public class RestaurantRush {
  
  // Instance vars
  private int monthsToGo = 12;
  private Restaurant[] openRestaurants;

  // Methods
  public static void play(Restaurant r) {}
  
  public static void stillAlive(Restaurant r){}

  public static void canExpand(Restaurant r){}
  
  public static void expandChain(){}
  
  public static void renovateRestaurant(Restaurant r){}

  public static void closeRestaurant(Restaurant r){}
  
  public static void lose(){}

  // Main
  public static void main(String [] args) {
    // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!         ");
    
    // Create Restaurant: name, workers, food, location
    Restaurant originalR = new Restaurant;
    
    
    // Play
    while (monthsToGo > 0 ) {
      stillAlive(originalR);
      canExpand(originalR);
      play(originalR);
      monthsToGo--;
      }
  }

}
