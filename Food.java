public class Food {

  //instance vars
  private String[][] food;//name, price, likelihood to go bad 

  String [] foodS = {"Pizza", "Spaghetti", "Spaghetti with Meatballs", "Hamburger", "Cheeseburger",
  "Turkeyburger", "Italian Panini with Mozzarella and Pesto", "Buffalo Chicken Panini", "Veggie Lover's Panini",
  "Fish Tacos", "Steak Tacos", "Chicken Tacos", "Chicken Burrito Bowl", "Steak Burrito Bowl", "Sofritas Bowl",
  "Salmon Avocado Sushi", "Spicy Tuna Sushi", "California Roll", "Veggie Sushi", "Chicken Lo Mein", "General Tso's chicken"};
  String [] priceS = {"3","7", "8", "10","9","11","11","12", "6", "8", "6", "8", "9", "10", "7", "7", "5", "4", "7", "6", "7"};
  String [] rotting = {"1","1", "2", "3","3", "2", "1", "2", "2", "2", "3", "2", "2", "3", "2", "4", "4", "2","2", "2", "2"};

  public Food() {
    food = new String[21][3];
    for (int row = 0; row < food.length; row ++) {
    	for (int col = 0; col < food[row].length; col ++) {
    		if (col == 0) {
    			food[row][col] = foodS[row*3 + col];	
    		}
    		else if (col == 1) {
    			food[row][col] = priceS[row*3 + col];
    		}
    		else {
    			food[row][col]= rotting[row*3 + col];	
    		}
    	}
    }
  }
  
  public String toString() {
  	String retStr = "";
  	for (int r = 0; r < food.length; r ++) {
  		retStr+="\n";
  		for (int c = 0; c < food[r].length; c++) {
  			retStr += (3*r + c)+ "\t"+ food[r][c] + "~";
  		}
  	}
  	return retStr;
  }
  
  
  public static void print1( int[][] a ) {
		for (int x = 0; x<a.length; x++) {
			for (int y = 0; y< a[x].length; y++) {//nested for loop structure to gain access to 2D
				System.out.print(a[x][y]+" ");		
			}
			System.out.println();
		}		
 	}


}
