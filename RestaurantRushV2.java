import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 extends Directory{
	
	
   
    public static void customize(RestaurantV2 starter) {
      	
	System.out.println("\033[31m Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	System.out.println("\033[35m These are the items you can add to your menu:");
	printITEMS_DIR();
	System.out.println("\033[34mPlease Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print(" \033[36m \t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    Items og = (Items)ITEMS_DIR.get(itemRow);
	    starter.menu.add(og);
	    ctr++;
       }
       //Employee staff = new Employee();
       //ArrayList staffLis = new ArrayList<Employee>();
       System.out.println("\033[31m Menu filled. Now let's pick out staff members");
       System.out.println("\033[34m You may pick six staff members.");
	
       System.out.println(" \033[35mThese are the chefs");
       printCHEF_DIR();
       System.out.println("\033[34m Which Chefs do you want to add to your squad? Please enter the two Chef numbers you want \n \t \033[36m # ");
           int itemRow = Integer.parseInt(Keyboard.readString());
	   Chef temp = (Chef) CHEF_DIR.get(itemRow);
	   starter.chefDir.add(temp);
	   System.out.println("\t \033[36m # ");
	   itemRow = Integer.parseInt(Keyboard.readString());
	   temp = (Chef) CHEF_DIR.get(itemRow);
	   starter.chefDir.add(temp);
	   System.out.println("\033[35m These are the managers:");
	   printMANAGER_DIR();
	   System.out.println("\033[34m Which Managers do you want to add to your squad? Please enter the two Manager numbers you want \n \t\033[36m # ");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Manager temp1 = (Manager) MANAGER_DIR.get(itemRow);
	    starter.managerDir.add(temp1);
	    System.out.println("\t \033[36m # ");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp1 = (Manager) MANAGER_DIR.get(itemRow);
	    starter.managerDir.add(temp1);
	System.out.println("\033[35m These are the waiters");
	printWAITER_DIR();
	System.out.println("\033[34m Which Waiters do you want to add to your squad? Please enter the two Waiter numbers you want \n \t\033[36m # ");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Waiter temp2 = (Waiter) WAITER_DIR.get(itemRow);
	    starter.waiterDir.add(temp2);
	    System.out.println("\t\033[36m # ");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp2 = (Waiter) WAITER_DIR.get(itemRow);
	    starter.waiterDir.add(temp2);
		
	int lighting;
        int musicVol;
   
	System.out.println("\033[31m Now it's time to customize your restaurant's ambiance");
	System.out.print("\033[34m Do you want to add booths to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
	starter.makeBooths((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add Karaoke to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setKara((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add Live Entertainment to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setLiveEnt((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add carpets to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.setCarpet((ans.equals("y")));
	 
	System.out.print("\033[34m Do you want to add a bar to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	starter.makeBar((ans.equals("y")));
	
	System.out.print("\033[34m How strong do you want you lighting to be? (Please type a number from 0-10): ");
	lighting = Integer.parseInt(Keyboard.readString());
	starter.setLight(lighting);
		
	System.out.print("\033[34m How loud do you want your music to be? (Please type a number from 0-10):");
	musicVol = Integer.parseInt(Keyboard.readString());
	starter.setVolume(musicVol);
 }  
   
   
   
  // Main
  public static void main(String [] args) {
    int months = 0;
    ArrayList menu = new ArrayList<Object>();
    ArrayList myDir = new ArrayList<Employee>();
      // Welcome intro: rules & regs
    System.out.println("\033c \033[40m \033[35m    \t\t\t \t\t     Welcome to Restaurant Rush!\n \n \t\t\t It's the beginning of January, and you want to open a Restaurant!");
    System.out.print("\033[34mWhat do you want to name your restaurant? \t \033[36m Name: ");
    String name = Keyboard.readString();
    System.out.print("\033[34mWhat size do you want the restaurant to be? Please pick a number from 1-10: \t \033[36m #");
    int size = Integer.parseInt(Keyboard.readString());
	
    System.out.print("\033[34mPlease pick a price scale. We will multiply the preset food item prices by this number: \t \033[36m x");
    int priceScale = Integer.parseInt(Keyboard.readString());
    RestaurantV2 starter = new RestaurantV2(name, size, priceScale);  
    customize(starter);

    // Play
    while (months < 3) {
		starter.runOperations(months);
		starter.calculateExpenses();
		starter.calculateRevenue();
		//starter.customizeMonthly(starter);
	// stillAlive();
		months++;
      }
    System.out.println("Test Complete!");
  }

}
   
  
