import java.util.ArrayList;

public class Items {

 // Instance vars
  protected String name;
  protected double price;
  protected int maintenance;

// Constructor
public Items(){
  name = "smoothie";
  price = 1;
  maintenance = 1;
}
  
  // Methods
  public double getPrice(){
   return this.price;
  }
  
  public int getMaintenance(){
   return maintenance;
  }
}

