import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 {

 
  // Main
  public static void main(String [] args) {
      int months = 0;
      ArrayList menu = new ArrayList<Object>();
      // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!\n \n It's the beginning of January, and you want to \n open a Restaurant!");

	System.out.print("What do you want to name your restaurant? \n \t Name: ");
	String name = Keyboard.readString();
	System.out.print("What size do you want the restaurant to be? Please pick a number from 1-10: \n \t");
	int size = Integer.parseInt(Keyboard.readString());
	System.out.print("Please pick a price scale. We will multiply the preset food item prices by this number: \n \t");
	double priceScale = Double.parseDouble(Keyboard.readString());
	RestaurantV2 starter = new RestaurantV2(name, size, priceScale);
	System.out.println("Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	starter.runOperations();
	//food items
	Items selection = new Items();
	System.out.println(selection);
	System.out.println("Please Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print("\t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    Object og = selection.directory.get(itemRow);
	    menu.add(og);
	    ctr++;
	}
	System.out.println("Menu filled. Now let's pick out staff members");
	System.out.println("");
	

    // Play
    while (months < 3) {
	starter.runOperations();
	starter.calculateRevenue();
	// stillAlive();
	months++;
      }
    System.out.println("Test Complete!");
  }

}

