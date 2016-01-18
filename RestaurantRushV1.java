public class RestaurantRushV1 {


 
  // Main
  public static void main(String [] args) {
      int months = 0;
      // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!\n \n It's the beginning of January, and you want to \n open a Restaurant!");

    RestaurantV1 tester = new RestaurantV1();
    
    System.out.println("You have $100,000 in funds. ");
    
    // Play
    while (months < 3) {
	tester.runOperations();
	tester.calculateRevenue();
	// stillAlive();
	months++;
      }
    System.out.println("Test Complete!");
  }

}
