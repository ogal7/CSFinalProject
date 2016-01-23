import cs1.Keyboard; 
import java.util.ArrayList;   

public class RestaurantV2 extends Directory{


  // Instance vars
    private int month;
    private double cashMoney;
    private ArrayList waiterDir;
    private ArrayList foodDir;
    private ArrayList managerDir;
    private ArrayList chefDir;
    private ArrayList bevDir;
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
	chefDir = new ArrayList<Chef>;
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
	chefDir = new ArrayList<Chef>;
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
	    System.out.println(size.get(i));
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
	    // Adding Items
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
	    // Removing Items
	    System.out.print("Do you want to remove items to your menu? (y/n)    ");
	    ans = Keyboard.readString();
	    if (ans.equals("y")){
		System.out.println("This is your current menu: \n" + menu + " \n ** menu above **");
		System.out.println("Please enter the number of the row you wish to remove from your menu \n");
		while (ans.equals("y")) {
		    System.out.print("\t Row: ");
		    int itemRow = Keyboard.readInt();
		    this.menu.remove(itemRow);
		    System.out.print("Want to remove sonmething else? (y/n)    ");
		    ans = Keyboard.readString();
		}
	    }
	}

	// STAFF
	
	}
		    
	
	// Employees
	System.out.print("\n Current Funds: $" + cashMoney);
	System.out.print("Do you want to shake up your staff? (y/n)     ");
	ans = Keyboard.readString();
	while (ans.equals("y")){
	    System.out.println("Indicate the department you want to improve (Waitstaff/Chefs/Managers");
	    ans = Keyboard.readString();
	    if (ans.equals("chefs") || ans.equals("Chefs") || ans.equals("chef") || ans.equals("Chef")){
		// 
	    }
	    if (ans.equals("Waitstaff") || ans.equals("waitstaff")){
		// EDIT STAFF DIR
	    }
	    if (ans.equals("Managers") || ans.equals("managers") || ans.equals("manager") || ans.equals("Manager") ){
		// EDIT STAFF DIR
	    }
	    System.out.println("Do you want to continue shaking up your staff? (y/n)    ");
	}

	// 
	System.out.print("Current Funds: $" + cashMoney);
	System.out.print("Would you like to change the menu? (y/n)     ");
	ans = Keyboard.readString();
	
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


	
	//
}
