import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 extends Directory{
	
	
   
    public static void customize(RestaurantV2 starter) {
      	
	System.out.println("Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	
	printITEMS_DIR();
	System.out.println("Please Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print("\t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    Object og = ITEMS_DIR.get(itemRow);
	    starter.foodDir.add(og);
	    ctr++;
       }
       //Employee staff = new Employee();
       //ArrayList staffLis = new ArrayList<Employee>();
       System.out.println("Menu filled. Now let's pick out staff members");
       System.out.println("You may pick six staff members.");
	
       System.out.println("These are the chefs");
       printCHEF_DIR();
       System.out.println("Which Chefs do you want to add to your squad? Please enter the two Chef numbers you want:");
           int itemRow = Integer.parseInt(Keyboard.readString());
	   Chef temp = (Chef) CHEF_DIR.get(itemRow);
	   starter.chefDir.add(temp);
	   itemRow = Integer.parseInt(Keyboard.readString());
	   temp = (Chef) CHEF_DIR.get(itemRow);
	   starter.chefDir.add(temp);
	   System.out.println("These are the managers:");
	   printMANAGER_DIR();
	   System.out.println("Which Managers do you want to add to your squad? Please enter the two Manager numbers you want:");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Manager temp1 = (Manager) MANAGER_DIR.get(itemRow);
	    starter.managerDir.add(temp1);
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp1 = (Manager) MANAGER_DIR.get(itemRow);
	    starter.managerDir.add(temp1);
	System.out.println("These are the waiters");
	printWAITER_DIR();
	System.out.println("Which Waiters do you want to add to your squad? Please enter the two Waiter numbers you want:");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Waiter temp2 = (Waiter) WAITER_DIR.get(itemRow);
	    starter.waiterDir.add(temp2);
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp2 = (Waiter) WAITER_DIR.get(itemRow);
	    starter.waiterDir.add(temp2);
		
	int lighting;
        int musicVol;
   
	System.out.println("Now it's time to customize your restaurant's ambiance");
	System.out.println("Do you want to add booths to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
	starter.makeBooths((ans.equals("y")));
	
	System.out.println("Do you want to add Karaoke to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setKara((ans.equals("y")));
	
	System.out.println("Do you want to add Live Entertainment to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setLiveEnt((ans.equals("y")));
	
	System.out.println("Do you want to add carpets to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setCarpet((ans.equals("y")));
	 
	System.out.println("Do you want to add a bar to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.makeBar((ans.equals("y")));
	
	System.out.println("How strong do you want you lighting to be? (Please type a number from 0-10): ");
	lighting = Integer.parseInt(Keyboard.readString());
	starter.setLight(lighting);
		
	System.out.println("How loud do you want your music to be? (Please type a number from 0-10):");
	musicVol = Integer.parseInt(Keyboard.readString());
	starter.setVolume(musicVol);
 }  
   
   
   
  // Main
  public static void main(String [] args) {
    int months = 0;
    ArrayList menu = new ArrayList<Object>();
    ArrayList myDir = new ArrayList<Employee>();
      // Welcome intro: rules & regs
    System.out.println("          Welcome to Restaurant Rush!\n \n It's the beginning of January, and you want to \n open a Restaurant!");
    System.out.print("What do you want to name your restaurant? \n \t Name: ");
    String name = Keyboard.readString();
    System.out.print("What size do you want the restaurant to be? Please pick a number from 1-10: \n \t");
    int size = Integer.parseInt(Keyboard.readString());
	
    System.out.print("Please pick a price scale. We will multiply the preset food item prices by this number: \n \t");
    int priceScale = Integer.parseInt(Keyboard.readString());
    RestaurantV2 starter = new RestaurantV2(name, size, priceScale);  
    customize(starter);

    // Play
    while (months < 3) {
		starter.runOperations();
		starter.calculateRevenue();
		//starter.customizeMonthly(starter);
	// stillAlive();
		months++;
      }
    System.out.println("Test Complete!");
  }

}
   
  
