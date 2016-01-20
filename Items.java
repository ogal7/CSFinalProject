import java.util.ArrayList;

public class Items {


  // Instance vars
  public ArrayList<Object> directory;
  Food a;
  Food b;
  Food c;
  Food d;
  Food e;
  Food f;
  Food g;
  Food h;
  Food i;
  Food j;
  Food k;
  Food l;
  Food m;
  Food n;
  Food o;
  
  Bev aa;
  Bev bb;
  Bev cc;
  Bev dd;
  Bev ee;
  
  public Items() {
    a = new Food("Pizza", 4, 1);
    directory.add(a);
    b = new Food("Spaghetti", 7, 1);
    directory.add(b);
    c = new Food("Chicken Burrito", 7, 2);
    directory.add(c);
    d = new Food("Guacamole", 5, 3);
    directory.add(d);
    e = new Food("Sushi", 7, 4);
    directory.add(e);
    f = new Food("Steak", 15, 4);
    directory.add(f);
    g = new Food("Hamburger", 10, 4);
    directory.add(g);
    h = new Food("Veggie Burger", 9, 2);
    directory.add(h);
    i = new Food("Chicken Tacos", 7, 2);
    directory.add(i);
    j = new Food("Pancakes", 5, 1);
    directory.add(j);
    k = new Food("Waffles", 5, 1);
    directory.add(k);
    l = new Food("Mozzarella Panini", 9, 2);
    directory.add(l);
    m = new Food("Veggie Panini", 9, 2);
    directory.add(m);
    n = new Food("Caesar Salad", 7, 2);
    directory.add(n);
    o = new Food("Falafel", 6, 1);
    directory.add(o);
    
    aa = new Bev ("beer", 6, 1, true);
    directory.add(aa);
    bb = new Bev ("Merlot", 10, 2, true);
    directory.add(bb);
    cc = new Bev ("Sparkling Water", 1, 1,false);
    directory.add(cc);
    dd = new Bev ("Margherita", 7, 3,true);
    directory.add(dd);
    ee = new Bev ("Lemonade", 2, 3,false);
    directory.add(ee);

  }
  
  //Methods
  public String toString() {
    String retStr="Here are the items you can put on your menu: \n         FOODS \n";
    //creates a directory for the user to pick items from
    for (int x = 0; x < directory.size() - 5 ; x ++) {
      retStr+="\n" + x + "~" + directory.get(x);
    }
    retStr += "\n      BEVERAGES";
    for (int x = directory.size() - 5; x< directory.size(); x ++) {
      retStr+="\n" + x + "~"+ directory.get(x);
    }
    return retStr;
  }
}

