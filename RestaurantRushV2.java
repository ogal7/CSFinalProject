import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 implements Directory{
    

  public void fill() {
    Chef a = new Chef ("Lisa", 100000.0, .9, 8,8, 9 );
    CHEF_DIR.add(a);
    Chef b = new Chef ("Bart", 50000, .5, 6, 2, 3 );
    CHEF_DIR.add(b);
    Chef c = new Chef ("Homer", 10000, .1, 1, 5, 1 );
    CHEF_DIR.add(c);
    Chef d = new Chef ("Marge", 60000, .6, 2, 7, 2 );
    CHEF_DIR.add(d);
    Chef e = new Chef ("Spongebob", 10, .2, 1, 1, 6 );
    CHEF_DIR.add(e);
    Chef f = new Chef ("Patrick Star", 5, .1, 1, 1, 2 );
    CHEF_DIR.add(f);
    Chef g = new Chef ("Squidward", 120000, .8, 4, 10, 6 );
    CHEF_DIR.add(g);
        
    //managers
    Manager x = new Manager("Meredith", 100000, .7, 10, 2,1);
    MANAGER_DIR.add(x);
    Manager y = new Manager("Cristina", 200000, .9, 10, 5,1);
    MANAGER_DIR.add(y);
    Manager z = new Manager("George", 80000, .6, 7, 1,1);
    MANAGER_DIR.add(z);
    Manager xx = new Manager("Alex", 80000, .7, 9, 6,1);
    MANAGER_DIR.add(xx);
    Manager yy = new Manager("Izzie", 80000, .6 , 7, 1,1);
     MANAGER_DIR.add(yy);
    Manager zz = new Manager("Miranda Bailey", 300000, .9, 8,  2,1);
    MANAGER_DIR.add(zz);
    Manager aa = new Manager("Callie", 100000,  .8, 9, 3,1);
    MANAGER_DIR.add(aa);
        
    //waiters
    Waiter m = new Waiter("Ted", 50000, .7, 7, 9, false);
    WAITER_DIR.add(m);
    Waiter n = new Waiter("Robin", 60000, .9, 9, 10, false);
    WAITER_DIR.add(n);
    Waiter o = new Waiter("Lily", 55000, .8, 7, 10, false);
    WAITER_DIR.add(o);
    Waiter p = new Waiter("Marshall", 47000, .7, 7, 8, false);
    WAITER_DIR.add(p);
    Waiter q = new Waiter("Barney", 40000, .6 , 10, 5, true);
    WAITER_DIR.add(q);
    Waiter r = new Waiter("Ranjit", 70000, .9, 6, 9, false);
    WAITER_DIR.add(r);
    Waiter s = new Waiter("Patrice", 65000, .8, 7, 9, false);
    WAITER_DIR.add(s);
        
        // items
    a = new Food("Pizza", 4, 1, false);
    ITEMS_DIR.add(a);
    b = new Food("Spaghetti", 7, 1, false);
    ITEMS_DIR.add(b);
    c = new Food("Chicken Burrito", 7, 2, false);
    ITEMS_DIR.add(c);
    d = new Food("Guacamole", 5, 3, false);
    ITEMS_DIR.add(d);
    e = new Food("Sushi", 7, 4, false);
    ITEMS_DIR.add(e);
    f = new Food("Steak", 15, 4, false);
    ITEMS_DIR.add(f);
    g = new Food("Hamburger", 10, 4, false);
    ITEMS_DIR.add(g);
    h = new Food("Veggie Burger", 9, 2, false);
    ITEMS_DIR.add(h);
    i = new Food("Chicken Tacos", 7, 2, false);
    ITEMS_DIR.add(i);
    j = new Food("Pancakes", 5, 1, false);
    ITEMS_DIR.add(j);
    k = new Food("Waffles", 5, 1, false);
    ITEMS_DIR.add(k);
    l = new Food("Mozzarella Panini", 9, 2, false);
    ITEMS_DIR.add(l);
    m = new Food("Veggie Panini", 9, 2, false);
    ITEMS_DIR.add(m);
    n = new Food("Caesar Salad", 7, 2, false);
    ITEMS_DIR.add(n);
    o = new Food("Falafel", 6, 1, false);
    ITEMS_DIR.add(o);
    
    aa = new Bev ("beer", 6, 1, true);
    ITEMS_DIR.add(aa);
    bb = new Bev ("Merlot", 10, 2, true);
    ITEMS_DIR.add(bb);
    cc = new Bev ("Sparkling Water", 1, 1,false);
    ITEMS_DIR.add(cc);
    dd = new Bev ("Margherita", 7, 3,true);
    ITEMS_DIR.add(dd);
    ee = new Bev ("Lemonade", 2, 3,false);
    ITEMS_DIR.add(ee);
  }

public String <error>() {
	return "";
}


 public void printCHEF_DIR(){
    for (int i = 0; i < CHEF_DIR.size(); i++){
      System.out.println(CHEF_DIR.get(i));
    }
}

public void printMANAGER_DIR(){
    for (int i = 0; i < MANAGER_DIR.size(); i++){
      System.out.println(MANAGER_DIR.get(i));
    }
}
 
  public void printWAITER_DIR(){
    for (int i = 0; i < WIATER_DIR.size(); i++){
      System.out.println(WAITER_DIR.get(i));
    }
  }
    
 public void printITEMS_DIR(){
    for (int i = 0; i < ITEMS_DIR.size(); i++){
      System.out.println(ITEMS_DIR.get(i));
    }
 }

 
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
	
	//Items selection = new Items();
	//System.out.println(selection);
	Directory x = new Directory();
	System.out.println("Please Enter the number of the rows you wish to add to your menu. You must choose 15 items\n");
	int ctr = 0;
	while (ctr < 15) {
	    System.out.print("\t" + (ctr + 1) + ": ");
	    int itemRow = Integer.parseInt(Keyboard.readString());
	    item og = x.ITEMS_DIR.get(itemRow);
	    menu.add(og);
	    ctr++;
	}
	
	//Employee staff = new Employee();
	//ArrayList staffLis = new ArrayList<Employee>();
	System.out.println("Menu filled. Now let's pick out staff members");
	System.out.println(x.CHEF_DIR);
	System.out.println(x.MANAGER_DIR);
	System.out.println(x.WAITER_DIR);
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
	String ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasKaraoke = true;
	}
	else {
		hasKaraoke = false;
	}
	System.out.println("Do you want to add Live Entertainment to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasLiveEnt = true;
	}
	else {hasLiveEnt = false;}
	System.out.println("Do you want to add carpets to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
	if (ans.equals("y")) {
		hasCarpets= true;
	}
	else {hasCarpets=false;}
	System.out.println("Do you want to add a bar to your restaurant? (type y/n): ");
	String ans = Keyboard.readString();
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
   
  
