import java.util.ArrayList;

public class Directory {

   protected static final ArrayList CHEF_DIR = new ArrayList<Chef>();;
   protected static final ArrayList MANAGER_DIR = new ArrayList<Manager>();; 
   protected static final ArrayList WAITER_DIR = new ArrayList<Waiter>(); 
   protected static final ArrayList ITEMS_DIR = new ArrayList<Items>();

public Directory(){
    Chef a = new Chef ("Lisa", 5500, .9, 8,8, 9. );
    CHEF_DIR.add(a);
    Chef b = new Chef ("Bart", 4500, .5, 6, 2, 3. );
    CHEF_DIR.add(b);
    Chef c = new Chef ("Homer", 4000, .1, 1, 5, 1. );
    CHEF_DIR.add(c);
    Chef d = new Chef ("Marge", 5000, .6, 2, 7, 2. );
    CHEF_DIR.add(d);
    Chef e = new Chef ("Spongebob", 4500, .2, 1, 1, 6. );
    CHEF_DIR.add(e);
    Chef f = new Chef ("Patrick Star", 4000, .1, 1, 1, 2. );
    CHEF_DIR.add(f);
    Chef g = new Chef ("Squidward", 5500, .8, 4, 10, 6. );
    CHEF_DIR.add(g);
        
    //managers
    Manager x = new Manager("Meredith", 5000, .7, 10, 2,1);
    MANAGER_DIR.add(x);
    Manager y = new Manager("Cristina", 4750, .9, 10, 5,1);
    MANAGER_DIR.add(y);
    Manager z = new Manager("George", 4500, .6, 7, 1,1);
    MANAGER_DIR.add(z);
    Manager xx = new Manager("Alex", 5250, .7, 9, 6,1);
    MANAGER_DIR.add(xx);
    Manager yy = new Manager("Izzie", 4750, .6 , 7, 1,1);
     MANAGER_DIR.add(yy);
    Manager zz = new Manager("Miranda Bailey", 4500, .9, 8,  2,1);
    MANAGER_DIR.add(zz);
    Manager aa = new Manager("Callie", 4500,  .8, 9, 3,1);
    MANAGER_DIR.add(aa);
        
    //String n, double req, double rat, int s, int acc, boolean isfel    
    //waiters
    Waiter m = new Waiter("Ted", 2000, .7, 7, 9, false);
    WAITER_DIR.add(m);
    Waiter n = new Waiter("Robin", 1900, .9, 9, 10,  false);
    WAITER_DIR.add(n);
    Waiter o = new Waiter("Lily", 1500, .8, 7, 10, false);
    WAITER_DIR.add(o);
    Waiter p = new Waiter("Marshall", 1500, .7, 7, 8, false);
    WAITER_DIR.add(p);
    Waiter q = new Waiter("Barney", 1500, .9, 10, 5,  true);
    WAITER_DIR.add(q);
    Waiter r = new Waiter("Ranjit", 1400, .9, 6, 9,  false);
    WAITER_DIR.add(r);
    Waiter s = new Waiter("Patrice", 1500, .8, 7, 6, false);
    WAITER_DIR.add(s);
        
        // items
    Items poe =      new Food("Pizza            ", 4, 1, false);
    ITEMS_DIR.add(poe);
    Items lala =     new Food("Spaghetti        ", 7, 1, false);
    ITEMS_DIR.add(lala);
    Items dipsy =    new Food("Chicken Burrito  ", 7, 2, false);
    ITEMS_DIR.add(dipsy);
    Food TW =        new Food("Guacamole        ", 5, 3, false);
    ITEMS_DIR.add(TW);
    Food Barnie =    new Food("Sushi            ", 7, 4, false);
    ITEMS_DIR.add(Barnie);
    Food hacker =    new Food("Steak            ", 15, 4, false);
    ITEMS_DIR.add(hacker); 
    Food troy =      new Food("Hamburger        ", 10, 4, false);
    ITEMS_DIR.add(troy);
    Food gabriella = new Food("Veggie Burger    ", 9, 2, false);
    ITEMS_DIR.add(gabriella);
    Food sharpay =   new Food("Chicken Tacos    ", 7, 2, false);
    ITEMS_DIR.add(sharpay);
    Food Dora =      new Food("Pancakes         ", 5, 1, false);
    ITEMS_DIR.add(Dora);
    Food Boots =     new Food("Waffles          ", 5, 1, false);
    ITEMS_DIR.add(Boots);
    Food Diego =     new Food("Mozzarella Panini", 9, 2, false);
    ITEMS_DIR.add(Diego);
    Food Barbie =    new Food("Veggie Panini     ", 9, 2, false); 
    ITEMS_DIR.add(Barbie);
    Food zach =      new Food("Caesar Salad      ", 7, 2, false);
    ITEMS_DIR.add(zach);
    Food cody =      new Food("Falafel           ", 6, 1, false);
    ITEMS_DIR.add(cody);
    
    Bev AA = new Bev ("Beer           ", 6, 1, true);
    ITEMS_DIR.add(AA);
    Bev bb = new Bev ("Merlot         ", 10, 2, true);
    ITEMS_DIR.add(bb);
    Bev cc = new Bev ("Sparkling Water", 1, 1,false);
    ITEMS_DIR.add(cc);
    Bev dd = new Bev ("Margherita     ", 7, 3,true);
    ITEMS_DIR.add(dd);
    Bev ee = new Bev ("Lemonade       ", 2, 3,false);
    ITEMS_DIR.add(ee);
  }






public static void printCHEF_DIR(){
    for (int i = 0; i < CHEF_DIR.size(); i++){
	System.out.println((i+1) + ") " + CHEF_DIR.get(i));
    }
}

public static void printMANAGER_DIR(){
    for (int i = 0; i < MANAGER_DIR.size(); i++){
      System.out.println((i+1) + ") " + MANAGER_DIR.get(i));
    }
}

  public static void printWAITER_DIR(){
    for (int i = 0; i < WAITER_DIR.size(); i++){
      System.out.println((i+1) + ") " + WAITER_DIR.get(i));
    }
  }
    
 public static void printITEMS_DIR(){
    for (int i = 0; i < ITEMS_DIR.size(); i++){
	if (i == 0){
	    System.out.println("FOOD ITEMS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FOOD ITEMS");
	}
	if (i == 15){
	    System.out.println("BEVERAGES~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BEVERAGES");
	}
	System.out.println(" \t " + (i + 1) + ") " + ITEMS_DIR.get(i));
    }
 }
  
}
    
