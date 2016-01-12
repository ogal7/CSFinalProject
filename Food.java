public class Food {

  //instance vars
  private String[][] food;//name, price, likelihood to go bad 

  String [] foodS = {"Pizza", "Spaghetti", "Spaghetti with Meatballs, "Hamburger", "Cheeseburger",
  "Turkeyburger", "Italian Panini with Mozzarella and Pesto", "Buffalo Chicken Panini", "Veggie Lover's Panini",
  "Fish Tacos", "Steak Tacos", "Chicken Tacos", "Chicken Burrito Bowl", "Steak Burrito Bowl", "Sofritas Bowl",
  "Salmon Avocado Sushi", "Spicy Tuna Sushi", "California Roll", "Veggie Sushi", "Chicken Lo Mein", "General Tso's chicken};
  String [] priceS = {};
  String [] rotting = {};

  public Food() {
    food = new String[30][3];
  
  }
  
  
  public Food(int n){
  
  
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
