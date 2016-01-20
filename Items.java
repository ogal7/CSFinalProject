import java.util.ArrayList;

public class Items {


  // Instance vars
  
  }
  
  //Methods
  public String toString() {
    String retStr="Here are the items you can put on your menu: \n         FOODS        \n";
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

