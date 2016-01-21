import java.util.ArrayList;

public interface Directory {

  protected final ArrayList CHEF_DIR = new ArrayList<Chef>();
  protected final ArrayList MANAGER_DIR = new ArrayList<Manager>();
  protected final ArrayList WAITER_DIR = new ArrayList<Waiter>();
  protected final ArrayList ITEMS_DIR = new ArrayList<Items>();

public Directory(){
   
}

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
    Manager x = new Manager("Meredith", 100000, .7, 10, 2);
    MANAGER_DIR.add(x);
    Manager y = new Manager("Cristina", 200000, .9, 10, 5);
    MANAGER_DIR.add(y);
    Manager z = new Manager("George", 80000, .6, 7, 1);
    MANAGER_DIR.add(z);
    Manager xx = new Manager("Alex", 80000, .7, 9, 6);
    MANAGER_DIR.add(xx);
    Manager yy = new Manager("Izzie", 80000, .6 , 7, 1);
     MANAGER_DIR.add(yy);
    Manager zz = new Manager("Miranda Bailey", 300000, .9, 8,  2);
    MANAGER_DIR.add(zz);
    Manager aa = new Manager("Callie", 100000,  .8, 9, 3);
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
  
}
    
