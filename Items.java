import java.util.ArrayList;

public class Items {

  // Instance vars
  public ArrayList<Object>() directory;
  
  public Items() {
    Food a = new Food("Pizza", 4, 1);
    directory.add(a);
    Food b = new Food("Spaghetti", 7, 1);
    directory.add(b);
    Food c = new Food("Chicken Burrito", 7, 2);
    directory.add(c);
    Food d = new Food("Guacamole", 5, 3);
    directory.add(d);
    Food e = new Food("Sushi", 7, 4);
    directory.add(e);
    Food f = new Food("Steak", 15, 4);
    directory.add(f);
    Food g = new Food("Hamburger", 10, 4);
    directory.add(g);
    Food h = new Food("Veggie Burger", 9, 2);
    directory.add(h);
    Food i = new Food("Chicken Tacos", 7, 2);
    directory.add(i);
    Food j = new Food("Pancakes", 5, 1);
    directory.add(j);
    Food k = new Food("Waffles", 5, 1);
    directory.add(k);
    Food l = new Food("Mozzarella Panini", 9, 2);
    directory.add(l);
    Food m = new Food("Veggie Panini", 9, 2);
    directory.add(m);
    Food n = new Food("Caesar Salad", 7, 2);
    directory.add(n);
    Food o = new Food("Falafel", 6, 1);
    directory.add(o);
    
    Bevs aa = new Bev ("beer", 6, 1, true);
    directory.add(aa);
    Bevs bb = new Bev ("Merlot", 10, 2, true);
    directory.add(bb);
    Bevs cc = new Bev ("Sparkling Water", 1, 1,false);
    directory.add(cc);
    Bevs dd = new Bev ("Margherita", 7, 3,true);
    directory.add(dd);
    Bevs ee = new Bev ("Lemonade", 2, 3,false);
    directory.add(ee);

  }
  
  public String toString() {
    String retStr="";
    //creates a directory for the user to pick items from
    for (int x = 0; x< directory.length ; x ++) {
      retStr+="\n" + directory.get(x);
    }
    return retStr;
  }
  // Constructor
  
  //Methods
//
