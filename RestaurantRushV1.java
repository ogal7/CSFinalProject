public class RestaurantRushV1 {


 
  // Main
  public static void main(String [] args) {
      int months = 0;
      ArrayList menu = new ArrayList<Items>();
      // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!\n \n It's the beginning of January, and you want to \n open a Restaurant!");

	System.out.println("What do you want to name your restaurant?");
	String name = Keyboard.readString();
	System.out.println("What size do you want the restaurant to be? Please pick a number from 1-10:");
	int size = Integer.parseInt(keyboard.readString());
	System.out.println("Please pick a price scale. We will multiply the preset food item prices by this number: ");
	float priceScale = Float.parseFloat(keyboard.readString());
	RestaurantV1 starter = new RestaurantV1(name, size, priceScale);
	System.out.println("Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	starter.runOperations();
	//food items
	Items selection = new Items();
	System.out.println(selection);
	System.out.println("Please Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
		int itemrow = Integer.parseInt(keyboard.readString());
		Item og = selection.directory.get(itemrow);
		menu.add(og);
		ctr++;
	}
	System.out.println("Menu filled. Now let's pick out staff members");
	
	

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
