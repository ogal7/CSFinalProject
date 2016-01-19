

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
        
        //chefs
        Chef a = new Chef ("Lisa", 100000.0, .9, 8, 8, 8, 9 );
        employeeDir.add(a);
        Chef b = new Chef ("Bart", 50000, .5, 6, 2, 6, 3 );
        employeeDir.add(b);
        Chef c = new Chef ("Homer", 10000, .1, 1, 5, 2, 1 );
        employeeDir.add(c);
        Chef d = new Chef ("Marge", 60000, .6, 2, 7, 7, 2 );
        employeeDir.add(d);
        Chef e = new Chef ("Spongebob", 10, .2, 1, 1, 1, 6 );
        employeeDir.add(e);
        Chef f = new Chef ("Patrick Star", 5, .1, 1, 1, 1, 2 );
        employeeDir.add(f);
        Chef g = new Chef ("Squidward", 120000, .8, 4, 10, 10, 6 );
        employeeDir.add(g);
        
        
        //managers
        Manager x = new Manager("Meredith", 100000, .7, 10, 9, 9, 2);
        employeeDir.add(x);
        Manager y = new Manager("Cristina", 200000, .9, 10, 10, 10, 5);
        employeeDir.add(y);
        Manager z = new Manager("George", 80000, .6, 7, 7, 8, 1);
        employeeDir.add(z);
        Manager xx = new Manager("Alex", 80000, .7, 9, 6, 8,6);
        employeeDir.add(xx);
        Manager yy= new Manager("Izzie", 80000, .6 , 7, 9, 9, 1);
        employeeDir.add(yy);
        Manager zz = new Manager("Miranda Bailey", 300000, .9, 8, 10, 10, 2);
        employeeDir.add(zz);
        Manager aa = new Manager("Callie", 100000,  .8, 9, 9, 9, 3);
        employeeDir.add(aa);
        
        //waiters
        Waiter m = new Waiter("Ted", 50000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Robin", 60000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Lily", 55000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Marshall", 47000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Barney", 40000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Ranjit", 70000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
         Waiter m = new Waiter("Patrice", 65000, double rat, int s, int prec, int acc, int clums, boolean isfel);
        employeeDir.add(m)
        
        
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
