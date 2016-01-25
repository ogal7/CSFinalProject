public interface MonthlyPackages{

    public void january(RestaurantV2 r){
	System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    r.setCleanliness(10);
	    Food k = new Food("Kale Salad", 10, 2,  false);
	    r.menu.add(k);
	}
    }

     public void february(){
	 System.out.println("\033[37mIt's February, and love is in the air \033[31m<3 \033[37m\n This month, you can purchase champagne and have a Valentine's Day themed celebration to attract customers! \n But you can only do it in February!");
	System.out.print("\033[34mDo you want to purchase the February Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Bev w = new Bev("Champagne", 20, 3, true);
	    r.menu.add(w);
	    rating += 1;
	}
     }

     public void march(){
	 System.out.println("\033[37m It's March! \n You have been introduced to the black market, and if you add illegal substances to your food, your customers will become addicted to coming ;) \n But it can only happen in March!");
	System.out.print("\033[34mDo you want to purchase the March Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    r.hasDrugs = true;
	    rating += 3;
	}
     }

     public void april(){
	 System.out.println("\033[37mAPRIL FOOLS! \n Everybody's in a goofy mood this month! \n This package comes with Jell-O and oreos with toothpaste! \n Get everyone in your restaurant laughing this month!");
	System.out.print("\033[34mDo you want to purchase the April Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    rating +=1;
	    Food k = new Food("Jell-O", 3, 1,  false);
	    r.menu.add(k);
	    Food j = new Food("Oreos with Toothpaste", 2, 2,  false);
	    r.menu.add(j);
	}
    }

     public void may(){
	 System.out.println("\033[37mApril showers brig May flowers! \n Everyone is excited for the temperatures to rise and the flowers to bloom. \n This month, you can purchase flowers to decorate your restaurant, and add rose water to your menu! \n This is a once-a-year opportunity!");
	System.out.print("\033[34mDo you want to purchase the May Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Bev k = new Bev("RoseWater", 7, 2, false);
	    r.menu.add(k);
	}
     }

     public void june(){
	 System.out.println("\033[37mWhat time is it? \n SUMMAH TAHM!!! \n It's June, and all of the students are out of school. \n This month, you can add ice cream to the menu for mass appeal! \n But it can only happen in June!");
	System.out.print("\033[34mDo you want to purchase the June Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    Food k = new Food("Ice Cream", 4, 2,  false);
	    r.menu.add(k);
	    rating += 1;
	}
    }

     public void july(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }

     public void august(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }

     public void september(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }

     public void october(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }

     public void november(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }

     public void december(){
     	 System.out.println("\033[37mHAPPY NEW YEAR!!! \n It's January, and everyone's working to keep their resolutions alive. \n This month, you can purchase cleaning supplies (which will keep those pesky FDA inspectors happy), and add a kale salad to your menu! \n But it can only happen in January!");
	System.out.print("\033[34mDo you want to purchase the January Package for $400? (type y/n): \033[36m");
	if (Keyboard.readString() == "y"){
	    
	}
    }
