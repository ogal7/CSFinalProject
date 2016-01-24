import cs1.Keyboard; 
import java.util.ArrayList;   

public class RestaurantV2 extends Directory{


  // Instance vars
    private int month;
    private double cashMoney;
    private ArrayList waiterDir;
    protected ArrayList foodDir;
    protected ArrayList managerDir;
    protected ArrayList chefDir;
    protected ArrayList bevDir;
    private double startOfMonthMoney;
    private String name;
    private int size;
    private int priceScale;
    private int lighting;
    private boolean hasBooths;
    private boolean hasKaraoke;
    private boolean hasLiveEnt;
    private boolean hasCarpets;
    private int musicVol;
    private boolean hasBar;

  //Constructor
    public RestaurantV2(){
    	name = "";
    	priceScale = 1;
	cashMoney = 100000;
	waiterDir = new ArrayList<Waiter>();
	chefDir = new ArrayList<Chef>();
	managerDir = new ArrayList<Manager>();
	foodDir = new ArrayList<Food>();
	bevDir = new ArrayList<Bev>();
	startOfMonthMoney = 0;
	size = 5;
	lighting = 7;
	hasBooths = false;
	hasKaraoke = false;
	hasLiveEnt = false;
	hasCarpets = false;
	musicVol = 4;
	hasBar = false;
    }
    
    
    public RestaurantV2(String n,int sz, int ps) {
    	name = n;
    	size = sz;
    	priceScale = ps;
    	cashMoney = 100000;
	waiterDir = new ArrayList<Waiter>();
	chefDir = new ArrayList<Chef>();
	managerDir = new ArrayList<Manager>();
	menu = new ArrayList<Food>();
	startOfMonthMoney = 0;
	size = 5;
	lighting = 7;
	hasBooths = false;
	hasKaraoke = false;
	hasLiveEnt = false;
	hasCarpets = false;
	musicVol = 4;
	hasBar = false;
    }
    
  // Methods
    // public static void stillAlive(){}

    public String printMenu(){
	for (int i = 0; i < menu.size(); i++){
	    System.out.println(menu.get(i));
	}
    }

    public String printWaiterDir(){
	for (int i = 0; i < waiterDir.size(); i++){
	    System.out.println(waiterDir.get(i));
	}
    }

    public String printChefDir(){
	for (int i = 0; i < chefDir.size(); i++){
	    System.out.println(chefDir.get(i));
	}
    }

    public String printManagerDir(){
	for (int i = 0; i < managerDir.size(); i++){
	    System.out.println(managerDir.get(i));
	}
    }

    public void runOperations(){ //
	String ans = "";
	double num = 0;
	expenses = 0;
	startofMonthMoney = cashMoney;

	// MENU
	System.out.println("This is your current menu: \n" + this.printMenu() + " \n ** menu above **");
	System.out.print("Current Funds: $" + cashMoney);
	System.out.print("Would you like to change the menu? (y/n)     ");
	ans = Keyboard.readString();
	if (ans.equals("y")){
	    // ADDING ITEMS
	    System.out.print("Do you want to add items to your menu? (y/n)    ");
	    ans = Keyboard.readString();
	    if (ans.equals("y")){
		System.out.println("These are the items you can choose from: \n" + this.printITEMS_DIR() + "\n ** options above **");
		System.out.println("Please enter the number of the row you wish to add to your menu \n");
		while (ans.equals("y")) {
		    System.out.print("\t Row: ");
		    int itemRow = Integer.parseInt(Keyboard.readString());
		    Object og = ITEMS_DIR.get(itemRow);
		    this.menu.add(og);
		    System.out.print("Continue adding? (y/n)    ");
		    ans = Keyboard.readString();
		}
	    }
	    // REMOVING ITEMS
	    System.out.print("Do you want to remove items to your menu? (y/n)    ");
	    ans = Keyboard.readString();
	    if (ans.equals("y")){
		System.out.println("This is your current menu: \n" + this.printMenu() + " \n ** menu above **");
		System.out.println("Please enter the number of the row you wish to remove from your menu \n");
		while (ans.equals("y")) {
		    System.out.print("\t Row: ");
		    int itemRow = Keyboard.readInt();
		    this.menu.remove(itemRow);
		    System.out.print("Want to remove sonmething else? (y/n)    ");
		    ans = Keyboard.readString();
		}
	    }
	} // END OF MENU EDITS
		    
	// EMPLOYEES
	System.out.print("\n Current Funds: $" + cashMoney);
	System.out.print("Do you want to shake up your staff? (y/n)     ");
	ans = Keyboard.readString();
	while (ans.equals("y")){
	    System.out.println("Indicate the department you want to improve (Waitstaff/Chefs/Managers");
	    ans = Keyboard.readString();
	    // CHEFS
	    if (ans.equals("chefs") || ans.equals("Chefs") || ans.equals("chef") || ans.equals("Chef")){
		System.out.println("These are your chefs: \n" + this.printChefDir() + "\n ** Chefs listed above **");
		System.out.println("The way to improve your chefs is to send them to culinary school. \n Chefs will be able to work while they are in school, but their salary will increase.\n How many years would you like to send your chefs to culinary school? ");
		System.out.print(" \t # of years (0 - 10): ");
		num = Keyboard.readInt;
		for (Chef i : chefDir){
		    i.setCookingKnowledge(i.getCookingKnowledge() + num);
		    if (i.getCookingKnowledge() > 10) i.setCookingKnowledge(10);
		    i.setSalary(i.getSalary() * (1 + num * .1));
		}
	    }
	    // WAITERS
	    if (ans.equals("Waitstaff") || ans.equals("waitstaff")){
		System.out.println("These are your waiters: \n" + this.printWaiterDir() + "\n ** Waiters listed above **");
		System.out.println("The way to improve your waitstaff is to train them. \n Waiters' accuracy and precision will improve, but their salary will increase. \n How many weeks would you like to train your waitstaff? ");
		System.out.print(" \t # of weeks (0 - 10): ");
		num = Keyboard.readInt;
		for (Waiter i : waiterDir){
		    i.setAccuracy(i.getAccuracy() + num);
		    if (i.getAccuracy() > 10) i.setAccuracy(10);
		    i.setPrecision(i.getPrecision() + num);
		    if (i.getPrecision() > 10) i.setPrecision(10);
		    i.setSalary(i.getSalary() * (1 + num * .1));
		}
	    }
	    // MANAGERS
	    if (ans.equals("Managers") || ans.equals("managers") || ans.equals("manager") || ans.equals("Manager") ){
		System.out.println("These are your managers: \n" + this.printManagerDir() + "\n ** Managers listed above **");
		System.out.println("The way to improve your managers is to be nice to them. \n Managers' greediness will decrease and their ratings willg go up, but their salary will increase because you will have to take them out to dinner. \n How many times do you want to take your managers out to dinner? ");
		System.out.print(" \t # of times (0 - 10): ");
		num = Keyboard.readInt;
		for (Managers i : managerDir){
		    i.setGreediness(i.getGreediness() - num);
		    if (i.getGreediness() < 0) i.setGreediness(0);
		    i.setRating(i.getRating() + (.1 * num));
		    if (i.getRating() > 1) i.setRating(1);
		    i.setSalary(i.getSalary() * (1 + num * .1));
		}
	    }
	    System.out.println("Do you want to continue shaking up your staff? (y/n)    ");
	    ans = Keyboard.readString();
	} // END OF EMPLOYEE EDITS

	// VIBE CHANGES
	System.put.println("Alright! Now for the fun stuff! ");
	System.out.println("\n Current Funds: $" + cashMoney + " NOTE: If you improved your staff, their salary at the end of the month will be higher" );
	System.out.print("Do you want to change the vibe of your restaurant? (y/n)     ");
	ans = Keyboard.readString();
	int lighting;
        int musicVol;
	while (ans.equals("y")){
	    // BOOTHS
	    System.out.println("Do you want to add booths to your restaurant? (type y/n): ");
	    String ans = Keyboard.readString();
	    this.makeBooths((ans.equals("y")));
	    // KARAOKE
	    System.out.println("Do you want to add Karaoke to your restaurant? (type y/n): ");
	    ans = Keyboard.readString();
	    this.setKara((ans.equals("y")));
	    // LIVE ENTERTAINMENT
	    System.out.println("Do you want to add Live Entertainment to your restaurant? (type y/n): ");
	    ans = Keyboard.readString();
	    this.setLiveEnt((ans.equals("y")));
	    // CARPETS
	    System.out.println("Do you want to add carpets to your restaurant? (type y/n): ");
	    ans = Keyboard.readString();
	    this.setCarpet((ans.equals("y")));
	    // BAR
	    System.out.println("Do you want to add a bar to your restaurant? (type y/n): ");
	    ans = Keyboard.readString();
	    this.makeBar((ans.equals("y")));
	    // LIGHTING
	    System.out.println("How strong do you want you lighting to be? (Please type a number from 0-10): ");
	    lighting = Integer.parseInt(Keyboard.readString());
	    this.setLight(lighting);
	    // MUSIC VOLUME
	    System.out.println("How loud do you want your music to be? (Please type a number from 0-10):");
	    musicVol = Integer.parseInt(Keyboard.readString());
	    this.setVolume(musicVol);
    	}
	
	// SEASONAL CHANGES
    	if (months%3 == 0) {
    		System.out.println("Would you like to purchase a seasonal package? (y/n)");
    		if (Keyboard.readString().equals("y")) {
    			if (months == 0) {
			    System.out.println("You have added the Winter Package! \n Your restaurant has been decorated with snowflakes and snowmen, and is offering lasagna and hot chocolate to customers!");
			    this.setPackage(0);
    			}
    			if (months == 3) {
			    System.out.println("You have added the Spring Package! \n Your restaurant has been decorated with fresh flowers and string lights, and is offering spring salmon and chocolate milk to customers!");
			    this.setPackage(3);
    			}
    			if (months == 6) {
			    System.out.println("You have added the Summer Package! \n Your restaurant has been decorated with surfboards and tiki torches, and is offering smoothies and hotlemonade to customers!");
			    this.setPackage(6);
    			}
    			if (months == 9) {
			    System.out.println("You have added the Fall Package! \n Your restaurant has been decorated with leaves and gords, and is offering chili and chai tea lattes to customers!");
			    this.setPackage(9);
    			}
    		}
    	}// END OF SEASONAL EDITS

	// MONTHLY SPECIALS: to come but calcRev > monthly specials
    }

    
   public  void calculateRevenue(){
       double revenue = 0;
       foodCapacity = food / 0.4;
       waitstaffCapacity = waitstaff * 12.5;
       if (month == 0){
	   lastMonthChefCapacity = 18 * chefs * chefs / 5000;
       }
       chefCapacity = lastMonthChefCapacity;
       lastMonthChefCapacity = chefs * (chefs / 5000) * 18;
       if (chefCapacity > 2){
	   chefCapacity = 20 * chefs;
       }
       managerCapacity = managers * 120;
       // Set revenue
       if (foodCapacity <= waitstaffCapacity && foodCapacity <= managerCapacity && foodCapacity <= chefCapacity){
	   revenue = foodCapacity;}
       if(waitstaffCapacity <= foodCapacity && waitstaffCapacity <= managerCapacity && waitstaffCapacity <= chefCapacity){
	   revenue = waitstaffCapacity;}
       if (chefCapacity <= waitstaffCapacity && chefCapacity <= managerCapacity && chefCapacity <= foodCapacity){
	   revenue = chefCapacity;}
       if(managerCapacity <= foodCapacity && managerCapacity <= waitstaffCapacity && managerCapacity <= chefCapacity){
	   revenue = managerCapacity;}
       // Check for revenue
       
       System.out.println("revenue = " +revenue+ "\n foodCapacity = " + foodCapacity + "\n waitstaffCapacity = " + waitstaffCapacity + "\n managerCapacity = " + managerCapacity + "\n chefCapacity = " + chefCapacity);
       cashMoney += revenue;
       System.out.println("After " + (month + 1) + " months of owning a restaurant, you started this month with $" + startMoney + ", spent $" + expenses+ " and brought in $" + revenue +
			  " in revenue. You now have $" + cashMoney + " in the bank.");
       month++;

    }
      

//set methods

       
    public  void setLight(int l){
	lighting = l;
    }
        
    public void setKara(boolean b) {
	hasKaraoke = b;
    }
        
    public void setLiveEnt(boolean le) {
	hasLiveEnt = le;
    }
        
    public void setVolume(int g) {
	musicVol = g;
    }
        
    public void makeBar(boolean h) {
	hasBar = h;
    }

    public void makeBooths(boolean d) {
	    hasBooths = d;
    }
	
    public void setCarpet(boolean r) {
	hasCarpets = r;
    }

 

    // public static void lose(){}

}
 
