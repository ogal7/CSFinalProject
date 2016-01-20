import java.util.ArrayList;

public class Employee { 
    
    //instance vars//
    protected double reqSalary;
    protected double rating;
    protected int speed;
    protected int precision;
    protected int accuracy;
    protected String name;
    protected ArrayList employeeDir = new ArrayList<Employee>();
    Chef a;
    Chef b;
    Chef c;
    Chef d;
    Chef e;
    Chef f;
    Chef g;
    
    
    Manager x;
    Manager y;
    Manager z;
    Manager xx;
    Manager yy;
    Manager zz;
    Manager aa;
    
    
    Waiter m;
    Waiter n;
    Waiter o;
    Waiter p;
    Waiter q;
    Waiter r;
    Waiter s;
    
    
    //constructor
    
    public Employee () {
        // 7 of each job
        //chefs
        a = new Chef ("Lisa", 100000.0, .9, 8, 8, 8, 9 );
        employeeDir.add(a);
        b = new Chef ("Bart", 50000, .5, 6, 2, 6, 3 );
        employeeDir.add(b);
        c = new Chef ("Homer", 10000, .1, 1, 5, 2, 1 );
        employeeDir.add(c);
        d = new Chef ("Marge", 60000, .6, 2, 7, 7, 2 );
        employeeDir.add(d);
        e = new Chef ("Spongebob", 10, .2, 1, 1, 1, 6 );
        employeeDir.add(e);
        f = new Chef ("Patrick Star", 5, .1, 1, 1, 1, 2 );
        employeeDir.add(f);
        g = new Chef ("Squidward", 120000, .8, 4, 10, 10, 6 );
        employeeDir.add(g);
        
        //managers
        x = new Manager("Meredith", 100000, .7, 10, 9, 9, 2);
        employeeDir.add(x);
        y = new Manager("Cristina", 200000, .9, 10, 10, 10, 5);
        employeeDir.add(y);
        z = new Manager("George", 80000, .6, 7, 7, 8, 1);
        employeeDir.add(z);
        xx = new Manager("Alex", 80000, .7, 9, 6, 8,6);
        employeeDir.add(xx);
        yy = new Manager("Izzie", 80000, .6 , 7, 9, 9, 1);
        employeeDir.add(yy);
        zz = new Manager("Miranda Bailey", 300000, .9, 8, 10, 10, 2);
        employeeDir.add(zz);
        aa = new Manager("Callie", 100000,  .8, 9, 9, 9, 3);
        employeeDir.add(aa);
        
        //waiters
        m = new Waiter("Ted", 50000, .7, 7, 7, 9, 9, false);
        employeeDir.add(m);
        n = new Waiter("Robin", 60000, .9, 9, 10, 9, 2, false);
        employeeDir.add(n);
        o = new Waiter("Lily", 55000, .8, 7, 10, 7, 4, false);
        employeeDir.add(o);
        p = new Waiter("Marshall", 47000, .7, 7, 8, 9, 7, false);
        employeeDir.add(p);
        q = new Waiter("Barney", 40000, .6 , 10, 5, 6, 6, true);
        employeeDir.add(q);
        r = new Waiter("Ranjit", 70000, .9, 6, 9, 8, 2, false);
        employeeDir.add(r);
        s = new Waiter("Patrice", 65000, .8, 7, 10, 9, 6, false);
        employeeDir.add(s);
    }
    
    public String toString() {
        String retStr="Here are the Employees you can put on your Staff: \n         Chefs \n";
    //creates a directory for the user to pick items from
        for (int x = 0; x< employeeDir.size() - 14 ; x ++) {
        retStr+="\n" + x + "~" + employeeDir.get(x);
    }
    retStr += "\n      Managers";
    for (int x = 7; x< employeeDir.size()-7; x ++) {
      retStr+="\n" + x + "~"+ employeeDir.get(x);
    }
    
    for (int x = 14; x <employeeDir.size(); x++) {
        retStr+="\n"+ x + "~" + employeeDir.get(x);
    }
    
    return retStr;
  }

    //nvm
    
    // methods
    public double getSalary (){
    	return reqSalary;}
    	
    public void setSalary (double sal){
    	reqSalary = sal;}

    public double getRating(){
    	return rating;}
    	
    public void setRating(double d){
    	rating = d;}

    public int getSpeed(){
    	return speed;}
    
    
    public void setSpeed(int s){
    	speed = s;}
    
    public int getPrecision(){
    	return precision; }
    public void setPrecision(int p){
    	precision = p;}
    
    public int getAccuracy(){
    	return accuracy;}
    public void setAccuracy(int a){
    	accuracy = a;}
    
//uml

    }


