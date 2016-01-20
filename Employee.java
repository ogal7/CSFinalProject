import java.util.ArrayList;

public class Employee { 
    
    //instance vars//
    protected double reqSalary;
    protected double rating;
    protected int speed;
    protected int accuracy;
    protected String name;
    
    
    //constructor
    
    public Employee () {
        
    }
    */
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


