import cs1.Keyboard; 
   

public class RestaurantV1 {


  // Instance vars
    private int month;
    private double cashMoney;
    private double waitstaff;
    private double chefs;
    private double managers;
    private double food;
    private double waitstaffCapacity;
    private double foodCapacity;
    private double managerCapacity;
    private double chefCapacity;
    private double lastMonthChefCapacity;
    private double startMoney;
    private double expenses;

  //Constructor
    public RestaurantV1(){
	cashMoney = 100000;
	waitstaff = 0;
	chefs = 0;
	managers = 0;
	food = 0;
	foodCapacity = 0;
	waitstaffCapacity = 0;
	chefCapacity = 
	managerCapacity = 0;
	startMoney = 0;
	expenses = 0;
	
    }
    
  // Methods
    // public static void stillAlive(){}


    public void runOperations(){ //
	double num = 0;
	expenses = 0;
	startMoney = cashMoney;
      // Food
      System.out.print("You have $" + cashMoney + ". How much would you like to spend on food?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive amount.");
	  num = Double.parseDouble(Keyboard.readString());
      }
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. You have $"+ cashMoney+ ". Try a smaller amount.");
      	cashMoney+=num;//this way if someone tries to overdraw money it won't actually leave the account
      	num = Double.parseDouble(Keyboard.readString());
      	cashMoney-=num;
      }//at this point the moneys already been withdrawn.
      food += num;
      expenses += num;
      
      // Chefs
      System.out.print("You have $" + cashMoney + ". How much would you like to spend on chefs?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive amount.");
	  num = Double.parseDouble(Keyboard.readString());
      }
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. You have $"+ cashMoney+ ". Try a smaller amount.");
      	cashMoney+=num;//this way if someone tries to overdraw money it won't actually leave the account
      	num = Double.parseDouble(Keyboard.readString());
      	cashMoney-=num;
      }//at this point the moneys already been withdrawn.
      chefs += num;
      expenses += num;
    /*  
      System.out.print("You have $" + cashMoney + ". How much would you like to spend on chefs?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive amount.");}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      chefs += num;
      expenses += num;
      */
      // Waitstaff
     /* System.out.print("You have $" + cashMoney + " remaining. How much would you like to spend on waitstaff?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive number.");}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      waitstaff += num;
      expenses += num;
      */
      System.out.print("You have $" + cashMoney + ". How much would you like to spend on Waitstaff?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive amount.");
	  num = Double.parseDouble(Keyboard.readString());
      }
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. You have $"+ cashMoney+ ". Try a smaller amount.");
      	cashMoney+=num;//this way if someone tries to overdraw money it won't actually leave the account
      	num = Double.parseDouble(Keyboard.readString());
      	cashMoney-=num;
      }//at this point the moneys already been withdrawn.
      waitstaff += num;
      expenses += num;
      
     
      // Managers
    /*  System.out.print("You have $" + cashMoney + " remaining. How much would you like to spend on managers?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive number.");}
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. Try a smaller number.");}
      managers += num;
      expenses += num;
    } */
    System.out.print("You have $" + cashMoney + ". How much would you like to spend on Managers?  $");
      num = Double.parseDouble(Keyboard.readString());
      if (num < 0){
	  System.out.println("You cannot withdraw a negative amount. Try a positive amount.");
	  num = Double.parseDouble(Keyboard.readString());
      }
      cashMoney -= num;
      if (cashMoney < 0){
        System.out.println("You cannot overdraw your funds. You have $"+ cashMoney+ ". Try a smaller amount.");
      	cashMoney+=num;//this way if someone tries to overdraw money it won't actually leave the account
      	num = Double.parseDouble(Keyboard.readString());
      	cashMoney-=num;
      }//at this point the moneys already been withdrawn.
      managers += num;
      expenses += num;
    
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
      

    // public static void lose(){}

public static void play () {
	//create new restaurant
	System.out.println("Welcome to Restaurant Rush! The aim of the game is to create the most successful restaurant \n");
	System.out.println("What do you want to name your restaurant?");
	String name = Keyboard.readString();
	System.out.println("What size do you want the restaurant to be? Please pick a number from 1-10:");
	int size = Integer.parseInt(keyboard.readString());
	System.out.println("Please pick a price scale. We will multiply the preset food item prices by this number: ");
	float priceScale = Float.parseFloat(keyboard.readString());
	Restaurant starter = new Restaurant(name, size, priceScale);
	//
}

    


}
