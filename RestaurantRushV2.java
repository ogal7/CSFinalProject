import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 extends Directory{
   
    

 
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
	double priceScale = Double.parseDouble(Keyboard.readString());
	RestaurantV2 starter = new RestaurantV2(name, size, priceScale);
	
	System.out.println("Alright, before you pick food items you gotta do some budgetting:");
	System.out.println("You have $100,000 in funds. ");
	
	// Add 
	
	//food items
	
	//Items selection = new Items();
	//System.out.println(selection);
	printITEMS_DIR();
	System.out.println("Please Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print("\t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    Object og = ITEMS_DIR.get(itemRow);
	    starter.menu.add(og);
	    ctr++;
	}
	
	Employee staff = new Employee();
	//ArrayList staffLis = new ArrayList<Employee>();
	System.out.println("Menu filled. Now let's pick out staff members");
	System.out.println(staff);
	System.out.println("Please Enter the number of the rows you wish to add to your staff. You may choose 5 members");
	ctr = 0;
	while (ctr < 5) {
		int itemRow = Integer.parseInt(Keyboard.readString());
		Employee staffer = (Employee)staff.employeeDir.get(itemRow);
		staffLis.add(staffer);
		ctr++;
	}
	
	//Decor lala = new Decor() 
	 int lighting;
	 boolean hasBooths;
         boolean hasKaraoke;
         boolean hasLiveEnt;
         boolean hasCarpets;
         int musicVol;
         boolean hasBar;
	System.out.println("Now it's time to customize your restaurant's ambiance");
	System.out.println("Do you want to add booths to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasBooths = true;
	}
	else {hasBooths = false;}
	System.out.println("Do you want to add Karaoke to your restaurant? (type y/n): ");
	 ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasKaraoke = true;
	}
	else {
		hasKaraoke = false;
	}
	System.out.println("Do you want to add Live Entertainment to your restaurant? (type y/n): ");
	ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasLiveEnt = true;
	}
	else {hasLiveEnt = false;}
	System.out.println("Do you want to add carpets to your restaurant? (type y/n): ");
	 ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasCarpets= true;
	}
	else {hasCarpets=false;}
	System.out.println("Do you want to add a bar to your restaurant? (type y/n): ");
	 ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasBar = true;
	}
	else {hasBar = false;}
	
	System.out.println("How strong do you want you lighting to be? (Please type a number from 0-10): ");
		lighting = Integer.parseInt(Keyboard.readString());
	System.out.println("How loud do you want your music to be? (Please type a number from 0-10):");
		musicVol = Integer.parseInt(Keyboard.readString());
	
	
	

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
   
  
