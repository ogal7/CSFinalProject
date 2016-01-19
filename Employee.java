

public abstract class Employee { 
    
    //instance vars//
    private double reqSalary;
    private double rating;
    private int speed;
    private int precision;
    private int accuracy;
    private String name;
    private ArrayList employeeDir = new ArrayList<Employee>();
    
    
    //constructor
    
    public Employee () {
        // 7 of each job
        Chef a = new Chef ("Lisa", 100000.0, .9, 8, 8, 8, 9 );
        employeeDir.add(a);
        Chef b = new Chef ("Bart", 50000, .5, 6, 2, 6, 3 );
        employeeDir.add(a);
        Chef c = new Chef ("Homer", reqsalary, rating, speed, precision, accuracy, cookingknowledge )
        employeeDir.add(a);
        Chef d = new Chef ("Marge", reqsalary, rating, speed, precision, accuracy, cookingknowledge )
        employeeDir.add(a);
        Chef e = new Chef ("Spongebob", reqsalary, rating, speed, precision, accuracy, cookingknowledge )
        employeeDir.add(a);
        Chef f = new Chef ("Patrick Star", reqsalary, rating, speed, precision, accuracy, cookingknowledge )
        employeeDir.add(a);
        Chef g = new Chef ("Squidward", reqsalary, rating, speed, precision, accuracy, cookingknowledge )
        employeeDir.add(a);
    }
    
    
    // methods
    public double getSalary (){
    	return salary;}
    public void setSalary (double sal){
    	salary = sal;}

    public double getRating(){
    	return rating;}
    public void setRating(double d){
    	rating = d;}

    public static int getSpeed(){
    	return speed;}
    public void int setSpeed(int s){
    	speed = s;}
    
    public static int getPrecision(){
    	return precision; }
    public void setPrecision(int p){
    	precision = p;}
    
    public static int getAccuracy(){
    	return accuracy;}
    public static void setAccuracy(int a){
    	accuracy = a;}
    
//uml

    }

}
