import cs1.Keyboard; 
import java.util.ArrayList;   

public class RestaurantV2 extends Directory implements MonthlyPackages{


  // Instance vars
    private int month;
    private double cashMoney;
    protected ArrayList<Waiter> waiterDir;
    protected ArrayList<Manager> managerDir;
    protected ArrayList<Chef> chefDir;
    protected ArrayList<Items> menu;
    private double startOfMonthMoney;
    private String name;
    private int size;
    private double priceScale;
    private int lighting;
    private boolean hasBooths;
    private boolean hasKaraoke;
    private boolean hasLiveEnt;
    private boolean hasCarpets;
    private int musicVol;
    private boolean hasBar;
    private double expenses;
    private double cleanliness;
    private double ambiance; //out of 10
    private boolean hasDrugs;
    private double rating;
    private boolean hasSeasonalPackage;
  //Constructor
    public RestaurantV2(){
    	name = "";
    	priceScale = 1;
	cashMoney = 100000;
	waiterDir = new ArrayList<Waiter>();
	chefDir = new ArrayList<Chef>();
	managerDir = new ArrayList<Manager>();
	menu = new ArrayList<Items>();
	//startOfMonthMoney = 0;
	size = 5;
	lighting = 7;
	hasBooths = false;
	hasKaraoke = false;
	hasLiveEnt = false;
	hasCarpets = false;
	musicVol = 4;
	hasBar = false;
	month = 0;
	expenses = 0;
	cleanliness = this.getCleanlinessInit();
	rating = 10.0;
	hasSeasonalPackage = false;
    }
    
    
    public RestaurantV2(String n,int sz, double ps) {
    	name = n;
    	size = sz;
    	priceScale = ps;
    	cashMoney = 100000;
	waiterDir = new ArrayList<Waiter>();
	chefDir = new ArrayList<Chef>();
	managerDir = new ArrayList<Manager>();
	menu = new ArrayList<Items>();
	//startOfMonthMoney = 0;
	size = 5;
	lighting = 7;
	hasBooths = false;
	hasKaraoke = false;
	hasLiveEnt = false;
	hasCarpets = false;
	musicVol = 4;
	hasBar = false;
	month = 0;
	expenses = 0;
	hasSeasonalPackage = false;
	cleanliness = this.getCleanlinessInit();
    }
    
  // Methods

    public int getMonth(){
	return month;
    }
    
    public void january(){
	System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    setCleanliness(10);
	    Food k = new Food("Kale Salad", 10, 2,  false);
	    menu.add(k);
	}
    }

     public void february(){
	 System.out.println("\033[37mIt's February, and love is in the air \033[31m<3 \033[37m\n This month, you can purchase champagne and have a Valentine's Day themed celebration to attract customers! \n But you can only do it in February!");
	System.out.print("\033[34mDo you want to purchase the February Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Bev w = new Bev("Champagne", 20, 3, true);
	    menu.add(w);
	    rating += 1;
	}
     }

     public void march(){
	 System.out.println("\033[37m It's March! \n You have been introduced to the black market, and if you add illegal substances to your food, your customers will become addicted to coming ;) \n But it can only happen in March!");
	System.out.print("\033[34mDo you want to purchase the March Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    hasDrugs = true;
	    rating += 3;
	}
     }

     public void april(){
	 System.out.println("\033[37mAPRIL FOOLS! \n Everybody's in a goofy mood this month! \n This package comes with Jell-O and oreos with toothpaste! \n Get everyone in your restaurant laughing this month!");
	System.out.print("\033[34mDo you want to purchase the April Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    rating +=1;
	    Food k = new Food("Jell-O", 3, 1,  false);
	    menu.add(k);
	    Food j = new Food("Oreos with Toothpaste", 2, 2,  false);
	    menu.add(j);
	}
    }

     public void may(){
	 System.out.println("\033[37mApril showers bring May flowers! \n Everyone is excited for the temperatures to rise and the flowers to bloom. \n This month, you can purchase flowers to decorate your restaurant, and add rose water to your menu! \n This is a once-a-year opportunity!");
	System.out.print("\033[34mDo you want to purchase the May Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Bev k = new Bev("RoseWater", 7, 2, false);
	    menu.add(k);
	}
     }

     public void june(){
	 System.out.println("\033[37mWhat time is it? \n SUMMAH TAHM!!! \n It's June, and all of the students are out of school. \n This month, you can add ice cream to the menu for mass appeal! \n But it can only happen in June!");
	System.out.print("\033[34mDo you want to purchase the June Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food k = new Food("Ice Cream", 4, 2,  false);
	    menu.add(k);
	    rating += 1;
	}
    }

     public void july(){
     	 System.out.println("\033[37mHAPPY FOURTH OF JULY!!! \n It's July, and everyone's trying to support this awful country. \n This month, you can add festive items to your menu, like Fireworks Ice Cream and Patriotic Ice Cream soda! This is a july only offer so you better get the hot stuff while it lasts!");
	System.out.print("\033[34mDo you want to purchase the July Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food k = new Food("Fireworks Ice Cream", 5, 2, false);
	    Bev a = new Bev("Patriotic Ice Cream Soda", 6, 2, false);
	    menu.add(k);
	    menu.add(a);
	    rating +=1;
	}
    }

     public void august(){
     	 System.out.println("\033[37mHip Hip Hurray for Summer! It's August, and everyone's working to keep cool from the heat.\n This month you can add classy items like Rose and Tapas to end the summer with triumph!\n ");
	System.out.print("\033[34mDo you want to purchase the August Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Bev r = new Bev("Rose", 8, 1, true);
	    Food t = new Food("Tapas", 7, 2, false);
	    menu.add(r);
	    menu.add(t);
	}
    }

     public void september(){
     	 System.out.println("\033[37mWell damn it's back to school and work! \n It's September, and everyone's getting back into the swing of things.\n This month, you can purchase Cosmopolitans and Carbonara.");
	System.out.print("\033[34mDo you want to purchase the September Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food x = new Food("Carbonara", 8, 3, false);
	    Bev y = new Bev("Cosmopolitan", 7, 3, true);
	    menu.add(x);
	    menu.add(y);
	}
    }

     public void october(){
     	 System.out.println("\033[37mHAPPY HALLOWEEN!!\n It's October so prepare to spook your customers with how scarily good your food is! \n This month, you can add Pumpkin Pie, Pumpkin Spice Lattes, and Candy Cake! - This is a limited time offer!");
	System.out.print("\033[34mDo you want to purchase the October Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food x = new Food("Pumpkin Pie", 5, 3, false);
	    Food z = new Food("Candy Cake", 5, 3, false);
	    Bev y = new Bev("Pumpkin Spice Latte", 3, 2, false);
	    menu.add(x);
	    menu.add(y);
	    menu.add(z);
	}
    }

     public void november(){
     	 System.out.println("\033[37mIt's getting colder! \n It's November, and Thanksgiving is coming up! \n This month, you can add a Thanksgiving Dinner to your menu, complete with Turkey, Mashed Potatoes, Gravy, Cranberry Sauce, and Stuffing! And don't forget dessert~Apple Pie is also included! ");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food x = new Food("Thanksgiving Dinner", 20, 4, false);
	    Food z = new Food("Apple Pie", 5, 3, false);
	    menu.add(x);
	    menu.add(z);
	}
    }

     public void december(){
     	 System.out.println("\033[37mHappy Holidays! Let it go, Let it go! \n It's December, and the cold never bothered you anyway.\n This month, you can add Eggnog, Yule Log Cake, Peppermint Mocha Lattes, and Chili Bread Bowls! This offer only lasts for December!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food x = new Food("Chili Bread Bowl", 6, 2, false);
	    Food z = new Food("Yule Log Cake", 5, 3, false);
	    Bev y = new Bev("Egg Nog", 3, 1, false);
	    Bev a = new Bev("Peppermint Mocha Latte", 4, 2, false);
	    menu.add(x);
	    menu.add(y);
	    menu.add(z);
	    menu.add(a);
	}
    }
    
	public boolean isAlive () {
		if (cashMoney < 0) {
			return false;
		}
		else {return true;}
	}
	
    public String printMenu(){
	String retStr = "";
	for (int i = 0; i < menu.size(); i++){
	   retStr += "\t" + (i+1) + ") " + menu.get(i) + "\n";
	}
	return retStr;
    }
    
    public double getCleanlinessInit() {
	double rating = 0;
	int num = 0;
	for (Manager x: managerDir) {
		rating += x.getRating();
		num += 1;
	}
	rating = (double) rating/num; 
	return rating;
}
    public void setCleanliness(double d){
	cleanliness = d;
    }
    

	public double getAmbiance() {
		return ambiance;
	}
	public void setAmbiance(double r) {
		ambiance = r;
	}

    public String printWaiterDir(){
	String retStr = "";
	for (int i = 0; i < waiterDir.size(); i++){
	   retStr +=  (i+1) + ") " + waiterDir.get(i) + "\n";
	}
	return retStr;
    }

    public String printChefDir(){
	String retStr = "";
	for (int i = 0; i < chefDir.size(); i++){
	   retStr += (i+1) + ") " + chefDir.get(i) + "\n";
	}
	return retStr;
    }

    public String printManagerDir(){
	String retStr = "";
	for (int i = 0; i < managerDir.size(); i++){
	   retStr += (i+1) + ") " + managerDir.get(i) + "\n";
	}
	return retStr;
    }

    public void runOperations(int months){ //
	String ans = "";
	double num = 0;
	double startOfMonthMoney = cashMoney;

	// MENU
	System.out.println("\033[35mThis is your current menu: \n" + this.printMenu());
	System.out.println("\033[32mCurrent Funds: $" + cashMoney);
	System.out.print("\033[34mWould you like to change the menu? (y/n)     \033[36m");
	ans = Keyboard.readString();
	if (ans.equals("y")){
	    // ADDING ITEMS
	    System.out.print("\033[34mDo you want to add items to your menu? (y/n)    \033[36m");
	    ans = Keyboard.readString();
	    if (ans.equals("y")){
		System.out.println("\033[35mThese are the items you can choose from: \n");
		this.printITEMS_DIR();
		System.out.println("\033[34mPlease enter the number of the row you wish to add to your menu \033[36m");
		while (ans.equals("y")) {
		    System.out.print("\t Row: ");
		    int itemRow = Integer.parseInt(Keyboard.readString());
		    Items og = (Items)ITEMS_DIR.get(itemRow);
		    this.menu.add(og);
		    System.out.print("\033[34mContinue adding? (y/n)    \033[36m");
		    ans = Keyboard.readString();
		}
	    }
	    // REMOVING ITEMS
	    System.out.print("\033[34mDo you want to remove items to your menu? (y/n)    \033[36m");
	    ans = Keyboard.readString();
	    if (ans.equals("y")){
		System.out.println("\033[35mThis is your current menu: \n");
		System.out.println(this.printMenu());
		System.out.println("\033[34mPlease enter the number of the row you wish to remove from your menu \033[36m");
		while (ans.equals("y")) {
		    System.out.print("\t Row: ");
		    int itemRow = Keyboard.readInt();
		    this.menu.remove(itemRow - 1);
		    System.out.print("\033[34mWant to remove something else? (y/n)    \033[36m");
		    ans = Keyboard.readString();
		}
	    }
	} // END OF MENU EDITS
		    
	// EMPLOYEES
	System.out.println("\n\033[32mCurrent Funds: $" + cashMoney);
	System.out.print("\033[34mDo you want to shake up your staff? (y/n)     \033[36m");
	ans = Keyboard.readString();
	while (ans.equals("y")){
	    System.out.print("\033[34mIndicate the department you want to improve (Waitstaff/Chefs/Managers):  \033[36m");
	    ans = Keyboard.readString();
	    // CHEFS
	    if (ans.equals("chefs") || ans.equals("Chefs") || ans.equals("chef") || ans.equals("Chef")){
		System.out.println("\033[35mThese are your chefs:");
		System.out.println(this.printChefDir());
		System.out.println("\033[31mThe way to improve your chefs is to send them to culinary school. \nChefs will be able to work while they are in school, but their salary will increase.\n\033[34mHow many years would you like to send your chefs to culinary school? \033[36m");
		System.out.print(" \t # of years (0 - 10): ");
		num = Keyboard.readInt();
		for (Object i : chefDir){
		    //Chef a = new Chef();
		    //i = a;
		    ((Chef)i).setCookingKnowledge(   ((Chef)i).getCookingKnowledge() + num);
		    if (((Chef)i).getCookingKnowledge() > 10) ((Chef)i).setCookingKnowledge(10);
		    ((Chef)i).setSalary(((Chef)i).getSalary() * (1 + num * .1));
		}
	    }
	    // WAITERS
	    if (ans.equals("Waitstaff") || ans.equals("waitstaff")){
		System.out.println("\033[35mThese are your waiters:"); 
		System.out.println(this.printWaiterDir());
		System.out.println("\033[31mThe way to improve your waitstaff is to train them. \nWaiters' accuracy and precision will improve, but their salary will increase. \n\033[34mHow many weeks would you like to train your waitstaff? \033[36m");
		System.out.print(" \t # of weeks (0 - 10): ");
		num = Keyboard.readInt();
		for (Object i : waiterDir){
		    ((Waiter)i).setAccuracy(((Waiter)i).getAccuracy() + num);
		    if (((Waiter)i).getAccuracy() > 10) ((Waiter)i).setAccuracy(10);
		 
		    ((Waiter)i).setSalary(((Waiter)i).getSalary() * (1 + num * .1));
		}
	    }
	    // MANAGERS
	    if (ans.equals("Managers") || ans.equals("managers") || ans.equals("manager") || ans.equals("Manager") ){
		System.out.println("\033[35mThese are your managers: \n");
		System.out.println(this.printManagerDir());
		System.out.println("\033[31mThe way to improve your managers is to be nice to them. \nManagers' greediness will decrease and their ratings willg go up, but their salary\nwill increase because you will have to take them out to dinner. \n\033[34mHow many times do you want to take your managers out to dinner? \033[36m");
		System.out.print(" \t # of times (0 - 10): ");
		num = Keyboard.readInt();
		for (Object i : managerDir){
		    ((Manager)i).setGreediness(((Manager)i).getGreediness() - num);
		    if (((Manager)i).getGreediness() < 0) ((Manager)i).setGreediness(0);
		    ((Manager)i).setRating(((Manager)i).getRating() + (.1 * num));
		    if (((Manager)i).getRating() > 1) ((Manager)i).setRating(1);
		    ((Manager)i).setSalary(((Manager)i).getSalary() * (1 + num * .1));
		}
	    }
	    System.out.print("\033[34mDo you want to continue shaking up your staff? (y/n)    \033[36m");
	    ans = Keyboard.readString();
	} // END OF EMPLOYEE EDITS

	// VIBE CHANGES
	System.out.println("\033[35mAlright! Now for the fun stuff! ");
	System.out.println("\n \033[32mCurrent Funds: $" + cashMoney + " NOTE: If you improved your staff, their salary at the end of the month will be higher" );
	System.out.print("\033[34mDo you want to change the vibe of your restaurant? (y/n)     \033[36m");
	ans = Keyboard.readString();
	System.out.println("\033[35mVibe status of " + name + ": ");
	if (hasBooths()){
	    System.out.println("\t It's got booths");
	}
	if (hasKara()){
	    System.out.println("\t It's got karaoke");
	}
	if (hasLiveEnt()){
	    System.out.println("\t It's got live entertainment");
	}
	if (hasBar()){
	    System.out.println("\t It's got a bar");
	}
	if (hasCarpet()){
	    System.out.println("\t It's got a carpet");
	}
	System.out.println("\t It's lighting is set to " + lighting);
	System.out.println("\t It's music volume is set to " + musicVol);
	while (ans.equals("y")){
	    // BOOTHS
	    if (! (hasBooths())){
		System.out.print("\033[34mDo you want to add \033[31mbooths \033[34mto your restaurant? (type y/n): \033[36m");
		ans = Keyboard.readString();
		this.makeBooths((ans.equals("y")));
	    }
	    // KARAOKE
	    if (! (hasKara())){
		System.out.print("\033[34mDo you want to add \033[31mKaraoke\033[34m to your restaurant? (type y/n): \033[36m");
		ans = Keyboard.readString();
		this.setKara((ans.equals("y")));
	    }
	    // LIVE ENTERTAINMENT
	    if (! (hasLiveEnt())){
		System.out.print("\033[34mDo you want to add \033[31mLive Entertainment\033[34m to your restaurant? (type y/n): \033[36m");
		ans = Keyboard.readString();
		this.setLiveEnt((ans.equals("y")));
	    }
	    // CARPETS
	    if (! (hasCarpet())){
		System.out.print("\033[34mDo you want to add \033[31mcarpets \033[34mto your restaurant? (type y/n): \033[36m");
		ans = Keyboard.readString();
		this.setCarpet((ans.equals("y")));
	    }
	    // BAR
	    if (! (hasBar())){
		System.out.print("\033[34mDo you want to add a \033[31mbar\033[34m to your restaurant? (type y/n): \033[36m");
		ans = Keyboard.readString();
		this.makeBar((ans.equals("y")));
	    }
	    // LIGHTING
	    System.out.print("\033[34mHow strong do you want you \033[31mlighting \033[34mto be? (Please type a\033[31m number \033[31mfrom 0-10): \033[36m");
	    lighting = Integer.parseInt(Keyboard.readString());
	    this.setLight(lighting);
	    if (lighting > 8) {ambiance -=1;}
    
	    // MUSIC VOLUME
	    System.out.print("\033[34mHow loud do you want your \033[31mmusic\033[34m to be? (Please type a\033[31m number\033[31m from 0-10): \033[36m");
	    musicVol = Integer.parseInt(Keyboard.readString());
	    this.setVolume(musicVol);
	    if (musicVol > 8) {ambiance -=1;}
	    ans = "n";
    	}
	
    	DEA officer = new DEA();
    	FDA officer2 = new FDA();

    	if (hasDrugs == true) {
    		if ( ((int)(Math.random()*10))%4 == 0   ) {
    			System.out.println( "\033[37m" + officer.getName() + " from the DEA have shut down your operation. You lost.");
    			cashMoney = 0;
			System.exit(0);
    		}
    	}
		
		if ( (int) (Math.random() * 10) == 5 || cleanliness < 5) {
			officer2.setPassedInspection(false);
			System.out.println("\033[37m" + officer2.getName() + " from the FDA has shut you down because you have E. Coli");
			System.exit(0);
		}
    }


   	


    public void customize(){
	if (hasSeasonalPackage && (month%3 != 0)){
	    System.out.println("\033[35m You have a seasonal package!");
	    return;
	}
	if (month%3 == 0) {
    		System.out.print("\033[34mWould you like to purchase a seasonal package? \nIt lasts 3 months and costs less than 3 monthly packages! (type y/n): \033[36m");
    		if (Keyboard.readString().equals("y")) {
    			if (month == 0) {
			    this.setPackage(0);
    			}
    			if (month == 3) {
			    this.setPackage(3);
    			}
    			if (month == 6) {
			    this.setPackage(6);
    			}
    			if (month == 9) {
			    this.setPackage(9);
    			}
			return;	
    		} 
    	}// END OF SEASONAL EDITS
	System.out.print("\033[34mWould you like to hear the special features of the month? (type y/n): \033[36m");
	if ((Keyboard.readString().equals("y"))) {
		if (month % 12 == 0){
		    this.january();
		}
		if (month % 12 == 1){
		    this.february();
		}
		if (month % 12 == 2){
		    this.march();
		}
		if (month % 12 == 3){
		    this.april();
		}
		if (month % 12 == 4){
		    this.may();
		}
		if (month % 12 == 5){
		    this.june();
		}
		if (month % 12 == 6){
		    this.july();
		}
		if (month % 12 == 7){
		    this.august();
		}
		if (month % 12 == 8){
		    this.september();
		}
		if (month % 12 == 9){
		    this.october();
		}
		if (month % 12 == 10){
		    this.november();
		}
		if (month % 12 == 11){
		    this.december();
		}
	    }

	
    }// end of customize


    
	
    


    public void calculateExpenses(){
	expenses = 0;
	for (Manager i : managerDir){
	    expenses += i.getSalary();
	}
	for (Chef i : chefDir){
	    expenses += i.getSalary();
	}
	for (Waiter i : waiterDir){
	    expenses += i.getSalary();
	}
	for (Items i : menu){
	    expenses += i.getPrice();
	}
	cashMoney -= expenses;
    }
	
    
    
    public  void calculateRevenue(){
	String fixThis = "";
	double revenue = 0;
	double menuCapacity = 0;   //finito
       double waiterCapacity = 0; //finito
       double chefCapacity = 0;   //finito
       double managerCapacity = 0;//finito
       

       // FINDING MENU CAPACITY
       for (Items item : menu){
	   if (item instanceof Food){
	       if (((Food)item).getRottenness() == false){
		   menuCapacity += (item.getPrice()*priceScale);
	       }
	   }
       }
       for (Items item : menu){
	   if (item instanceof Bev){
	       if (((Bev)item).hasAlcohol() == true){
		   menuCapacity += (item.getPrice() * priceScale * 1.2);
	       }
	       else {
		   menuCapacity += (item.getPrice() *priceScale);
	       }
	   }
       }
       for (Items item : menu){
	   menuCapacity -= (item.getMaintenance() * 2);
       } 
       menuCapacity /= .4;
       menuCapacity *= size * 15;

       // FINDING WAITER CAPACITY
       for (Waiter waiter : waiterDir){
	   waiterCapacity +=  waiter.getSalary() * (.5 + (waiter.getRating() + waiter.getAccuracy() + waiter.getSpeed()) / 10);
       }
       for (Waiter waiter : waiterDir){
	   if (waiter.getFromJail() == true){
	       waiterCapacity -= 150;//felons are capable too!
	   }
       } 

       // FINDING CHEF CAPACITY
       for (Chef chef : chefDir){
	   chefCapacity += chef.getSalary() * (.5 + (chef.getRating() + chef.getSpeed() + chef.getAccuracy() + chef.getCookingKnowledge()) / 15);
       }
       chefCapacity *= 18 * chefCapacity / 5000;

       // FINDING MANAGER CAPACITY
       for (Manager manager : managerDir){
	   managerCapacity = manager.getSalary() * (.5 + manager.getRating() - manager.getGreediness() / 10)  * 120;
       }

       // SETTING REVENUE 
       if (menuCapacity <= waiterCapacity && menuCapacity <= managerCapacity && menuCapacity <= chefCapacity){
	   revenue = menuCapacity;
	   fixThis = "menu!";
       }
       if(waiterCapacity <= menuCapacity && waiterCapacity <= managerCapacity && waiterCapacity <= chefCapacity){
	   revenue = waiterCapacity;
	   fixThis = "waitstaff!";
       }
       if (chefCapacity <= waiterCapacity && chefCapacity <= managerCapacity && chefCapacity <= menuCapacity){
	   revenue = chefCapacity;
	   fixThis = "chefs!";
       }
       if(managerCapacity <= menuCapacity && managerCapacity <= waiterCapacity && managerCapacity <= chefCapacity){
	   revenue = managerCapacity;
	   fixThis = "managers!";
       }
       // Check for revenue

       revenue *= (1 + rating/10);
       cashMoney += revenue;
       System.out.println("\033[32mAfter " + (month + 1) + " months of owning a restaurant, you started this month with $" + startOfMonthMoney + ", spent $" + expenses+ " and brought in $" + revenue +" in revenue. There is a problem with your " + fixThis + " You should probably fix that. You now have $" + cashMoney + " in the bank.");
       System.out.print("\033[34mReady for month " + (month + 2) + "? (type y/n): \033[36m");
       if (Keyboard.readString().equals("y")){
	   month++;
       }
       else {
	   return;
       }

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

    public void setPackage(int m) {
    	if (m == 0) {
	     System.out.println("\033[35mYou have added the Winter Package! \n Your restaurant has been decorated with snowflakes and snowmen, and is offering lasagna and hot chocolate to customers!");
	    cashMoney -= 1000;
    	}
    	if (m == 3) {
	     System.out.println("\033[35mYou have added the Spring Package! \n Your restaurant has been decorated with fresh flowers and string lights, and is offering spring salmon and chocolate milk to customers!");
	     cashMoney -= 1000;
    	}
    	if (m == 6){
	    System.out.println("\033[35mYou have added the Summer Package! \n Your restaurant has been decorated with surfboards and tiki torches, and is offering smoothies and hotlemonade to customers!");
    		cashMoney -= 1000;
    	}
    	if (m == 9) {
    		System.out.println("\033[35mYou have added the Fall Package! \n Your restaurant has been decorated with leaves and gords, and is offering chili and chai tea lattes to customers!");	
    		cashMoney -= 1000;
    	}
    } 


    // get methods
     public int getLight(){
	return lighting;
    }
        
     public boolean hasKara() {
	return hasKaraoke;
    }
        
    public boolean hasLiveEnt() {
	return hasLiveEnt;
    }
        
    public int getVolume() {
	return musicVol;
    }
        
    public boolean hasBar() {
	return hasBar;
    }

    public boolean hasBooths() {
	return hasBooths;
    }
	
    public boolean hasCarpet() {
	return hasCarpets;
    }
    public double getCashMoney(){
	return cashMoney;
    }
    public String getName(){
	return name;
    }

}
  
