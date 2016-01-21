import java.util.ArrayList;

public interface Directory {

   final ArrayList CHEF_DIR = new ArrayList<Chef>();;
   final ArrayList MANAGER_DIR = new ArrayList<Manager>();; 
   final ArrayList WAITER_DIR = new ArrayList<Waiter>(); 
   final ArrayList ITEMS_DIR = new ArrayList<Items>();

public Directory(){
  String name = "la";
  fill();
}

public void fill();




public void printCHEF_DIR();/*{
    for (int i = 0; i < CHEF_DIR.size(); i++){
      System.out.println(CHEF_DIR.get(i));
    }
}
*/
public void printMANAGER_DIR();/*{
    for (int i = 0; i < MANAGER_DIR.size(); i++){
      System.out.println(MANAGER_DIR.get(i));
    }
}
*/  
  public void printWAITER_DIR();/*{
    for (int i = 0; i < WIATER_DIR.size(); i++){
      System.out.println(WAITER_DIR.get(i));
    }
  }
  */  
 public void printITEMS_DIR();/*{
    for (int i = 0; i < ITEMS_DIR.size(); i++){
      System.out.println(ITEMS_DIR.get(i));
    }
 }*/
  
}
    
