import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 extends Directory{
	
	
   
    public static void customize(RestaurantV2 starter) {
      	
	System.out.println("\033[31m Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	System.out.println("\033[35m These are the items you can add to your menu:");
	printITEMS_DIR();
	System.out.println("\033[34mPlease enter the \033[31mnumber\033[34m of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print(" \033[36m \t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    Items og = (Items)ITEMS_DIR.get(itemRow - 1);
	    starter.menu.add(og);
	    ctr++;
       }
       //Employee staff = new Employee();
       //ArrayList staffLis = new ArrayList<Employee>();
       System.out.println("\033[31m Menu filled. Now let's pick out staff members");
       System.out.println("\033[34m You may pick six staff members.");
	
       System.out.println(" \033[35mThese are the chefs");
       printCHEF_DIR();
       System.out.print("\033[34m Which\033[31m Chefs\033[34m do you want to add to your squad? Please enter the two Chef numbers you want \n \033[36m \t #");
           int itemRow = Integer.parseInt(Keyboard.readString());
	   Chef temp = (Chef) CHEF_DIR.get(itemRow - 1);
	   starter.chefDir.add(temp);
	   System.out.print("\t \033[36m#");
	   itemRow = Integer.parseInt(Keyboard.readString());
	   temp = (Chef) CHEF_DIR.get(itemRow -1);
	   starter.chefDir.add(temp);
	   System.out.println("\033[35m These are the managers:");
	   printMANAGER_DIR();
	   System.out.print("\033[34m Which\033[31m Managers\033[34m do you want to add to your squad? Please enter the two Manager numbers you want \n \033[36m \t #");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Manager temp1 = (Manager) MANAGER_DIR.get(itemRow - 1);
	    starter.managerDir.add(temp1);
	    System.out.print("\t \033[36m#");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp1 = (Manager) MANAGER_DIR.get(itemRow - 1);
	    starter.managerDir.add(temp1);
	System.out.println("\033[35m These are the waiters");
	printWAITER_DIR();
	System.out.print("\033[34m Which \033[31mWaiters\033[34m do you want to add to your squad? Please enter the two Waiter numbers you want \n \033[36m\t #");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    Waiter temp2 = (Waiter) WAITER_DIR.get(itemRow - 1);
	    starter.waiterDir.add(temp2);
	    System.out.print("  \t\033[36m #");
	    itemRow = Integer.parseInt(Keyboard.readString());
	    temp2 = (Waiter) WAITER_DIR.get(itemRow - 1);
	    starter.waiterDir.add(temp2);
		
	int lighting;
        int musicVol;
   
	System.out.println("\033[31m Now it's time to customize your restaurant's ambiance!");
	System.out.print("\033[34m Do you want to add\033[31m booths \033[34mto your restaurant? (type y/n): \033[36m");
	String ans = Keyboard.readString();
	starter.makeBooths((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add \033[31mkaraoke \033[34mto your restaurant? (type y/n): \033[36m");
	ans = Keyboard.readString();
	starter.setKara((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add\033[31m live entertainment\033[34m to your restaurant? (type y/n): \033[36m");
	ans = Keyboard.readString();
	starter.setLiveEnt((ans.equals("y")));
	
	System.out.print("\033[34m Do you want to add \033[31mcarpets\033[34m to your restaurant? (type y/n):\033[36m ");
	ans = Keyboard.readString();
	starter.setCarpet((ans.equals("y")));
	 
	System.out.print("\033[34m Do you want to add a\033[31m bar \033[34mto your restaurant? (type y/n):\033[36m ");
	ans = Keyboard.readString();
	starter.makeBar((ans.equals("y")));
	
	System.out.print("\033[34m How strong do you want you\033[31m lighting\033[34m to be? (Please type a \033[31mnumber\033[34m from 0-10):\033[36m ");
	lighting = Integer.parseInt(Keyboard.readString());
	starter.setLight(lighting);
	if (lighting > 7) {starter.setAmbiance(starter.getAmbiance() - 1);}
		
	System.out.print("\033[34m How loud do you want your \033[31mmusic\033[34m to be? (Please type a\033[31m number\033[34m from 0-10): \033[36m");
	musicVol = Integer.parseInt(Keyboard.readString());
	starter.setVolume(musicVol);
	if (musicVol > 8) {starter.setAmbiance(starter.getAmbiance() -1);}
 }  
   
   
   
  // Main
  public static void main(String [] args) {
    int totalMonths = 12;
    int ans = 0;
    double target$ = 1000000;
    ArrayList menu = new ArrayList<Object>();
    ArrayList myDir = new ArrayList<Employee>();
      // Welcome intro: rules & regs
    System.out.println("\033c \033[40m \033[35m    \t\t\t \t\t     Welcome to Restaurant Rush!\n \n \t\t\t It's the beginning of January, and you want to open a Restaurant!");
    System.out.print("\033[34mWhat do you want to\033[31m name \033[34myour restaurant? \t \033[36m Name: ");
    String name = Keyboard.readString();
    System.out.print("\033[34mWhat \033[31msize\033[34m do you want the restaurant to be? Please pick a number from 1-10: \t \033[36m #");
    int size = Integer.parseInt(Keyboard.readString());
	
    System.out.print("\033[34mPlease pick a \033[31mprice scale in decimal form\033[34m. We will multiply the preset food item prices by this number: \t \033[36m x");
    double priceScale = (double) Keyboard.readDouble();
    RestaurantV2 starter = new RestaurantV2(name, size, priceScale);  
    System.out.println("Would you rather play to make money or to see if you can survive a number of years? (type $/#): \033[36m");
    if (Keyboard.readString().equals("$")){
	totalMonths = 100000;
	System.out.print("Do you want to play for $1,000,000 (for amateurs), $2 million (for seasoned restaurant owners), or 3 years (for restaurant geniuses)? (type 1, 2, or 3): \033[36m");
	ans = Integer.parseInt(Keyboard.readString());
	target$ *= ans;
    }
	     
    else {
	System.out.print("Do you want to play for 1 year (for first-timers), 2 years (for experienced folk), or 3 years (for restaurant experts)? (type 1, 2, or 3): \033[36m");
	 ans = Integer.parseInt(Keyboard.readString());
	 totalMonths *= ans;
	 target$ = 1000000000;
    }
    customize(starter);
    starter.calculateExpenses();
    starter.calculateRevenue();
    // Play
    

    while (starter.getMonth() < totalMonths) {

	starter.runOperations(starter.getMonth());
	starter.customize();
	starter.calculateExpenses();
	starter.calculateRevenue();
	if (starter.getCashMoney() >= target$){
	    System.out.println("YOUR RESTAURANT, " + starter.getName() + "MADE OVER $" +target$ +"! YOU WIN !");
	    System.exit(0);
	}
	if (starter.isAlive() == false) {
	    System.out.println("You lost.");
	    System.exit(0);
	}
      }
    System.out.println("YOUR RESTAURANT," + starter.getName() + "SURVIVED FOR " + ans + "YEARS! YOU WIN!");
  }

}
      
      
