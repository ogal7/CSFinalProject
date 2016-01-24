import java.util.ArrayList;

public class Employee { 
    
    //instance vars//
    protected double reqSalary;
    protected double rating;
    protected double speed;
    protected double accuracy;
    protected String name;
    
    
    //constructor
    public Employee () {
        reqSalary = 7500;
        rating = 5;
        speed = 5;
        accuracy = 7;
        name = "Shrek";
    }
    
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
    
    

    
    public double getAccuracy(){
    	return accuracy;}
    
    public void setAccuracy(double a){
    	accuracy = a;}
    
//uml

    }


