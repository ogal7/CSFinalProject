import java.util.ArrayList;
import cs1.Keyboard; 
   

public class RestaurantRushV2 {
    protected ArrayList employeeDir = new ArrayList<Employee>();
        Employee a = new Chef ("Lisa", 100000.0, .9, 8, 8, 8, 9 );
        employeeDir.add(a);
        Employee b = new Chef ("Bart", 50000, .5, 6, 2, 6, 3 );
        employeeDir.add(b);
        Employee c = new Chef ("Homer", 10000, .1, 1, 5, 2, 1 );
        employeeDir.add(c);
        Chef d = new Chef ("Marge", 60000, .6, 2, 7, 7, 2 );
        employeeDir.add(d);
        Chef e = new Chef ("Spongebob", 10, .2, 1, 1, 1, 6 );
        employeeDir.add(e);
        Chef f = new Chef ("Patrick Star", 5, .1, 1, 1, 1, 2 );
        employeeDir.add(f);
        Chef g = new Chef ("Squidward", 120000, .8, 4, 10, 10, 6 );
        employeeDir.add(g);
        
        //managers
        Manager x = new Manager("Meredith", 100000, .7, 10, 9, 9, 2);
        employeeDir.add(x);
        Manager y = new Manager("Cristina", 200000, .9, 10, 10, 10, 5);
        employeeDir.add(y);
        Manager z = new Manager("George", 80000, .6, 7, 7, 8, 1);
        employeeDir.add(z);
        Manager xx = new Manager("Alex", 80000, .7, 9, 6, 8,6);
        employeeDir.add(xx);
        Manager yy = new Manager("Izzie", 80000, .6 , 7, 9, 9, 1);
        employeeDir.add(yy);
        Manager zz = new Manager("Miranda Bailey", 300000, .9, 8, 10, 10, 2);
        employeeDir.add(zz);
        Manager aa = new Manager("Callie", 100000,  .8, 9, 9, 9, 3);
        employeeDir.add(aa);
        
        //waiters
        Waiter m = new Waiter("Ted", 50000, .7, 7, 7, 9, 9, false);
        employeeDir.add(m);
        Waiter n = new Waiter("Robin", 60000, .9, 9, 10, 9, 2, false);
        employeeDir.add(n);
        Waiter o = new Waiter("Lily", 55000, .8, 7, 10, 7, 4, false);
        employeeDir.add(o);
        Waiter p = new Waiter("Marshall", 47000, .7, 7, 8, 9, 7, false);
        employeeDir.add(p);
        Waiter q = new Waiter("Barney", 40000, .6 , 10, 5, 6, 6, true);
        employeeDir.add(q);
        Waiter r = new Waiter("Ranjit", 70000, .9, 6, 9, 8, 2, false);
        employeeDir.add(r);
        Waiter s = new Waiter("Patrice", 65000, .8, 7, 10, 9, 6, false);
        employeeDir.add(s);

 
 public String toString() {
        String retStr="Here are the Employees you can put on your Staff: \n         Chefs \n";
    //creates a directory for the user to pick items from
        for (int x = 0; x< employeeDir.size() - 14 ; x ++) {
        retStr+="\n" + x + "~" + employeeDir.get(x);
    }
    retStr += "\n      Managers";
    for (int x = 7; x< employeeDir.size()-7; x ++) {
      retStr+="\n" + x + "~"+ employeeDir.get(x);
    }
    
    for (int x = 14; x <employeeDir.size(); x++) {
        retStr+="\n"+ x + "~" + employeeDir.get(x);
    }
    
    return retStr;
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
	
	Items selection = new Items();
	Employee staff = new Employee();
	ArrayList staffLis = new ArrayList<Employee>();
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
	System.out.println("Please Enter the number of the rows you wish to add to your staff. You may choose 5 members");
	ctr = 0;
	while (ctr < 5) {
		int itemRow = Integer.parseInt(Keyboard.readString());
		Employee staffer = (Employee)staff.employeeDir.get(itemRow);
		staffLis.add(staffer);
		ctr++;
	}
	
	
	

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
   
  
