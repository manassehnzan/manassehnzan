/* Def: A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes: */

//Example:

public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

    //Test it Now
    //Output:
    //Outputs 1969 Mustang
    //_____________________________________________________________


/* Def: Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. 
We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword. */

//Example:

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }

  
class Vehicle {
    protected String brand = "Ford";
    public void honk() {
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }
  
  class Vehicle {
    protected String brand = "Ford";
    public void honk() {
      System.out.println("Tuut, tuut!");
    }
  }
  ​
  class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
    }
  }
  ​
    //Test it Now
    //Output:

    //Tuut, tuut!
    //Ford Mustang
    //_____________________________________________________________


  /*Def: overloading With method overloading, multiple methods can have the same name with different parameters:*/

  //Example:

  public class Main {
    static int plusMethod(int x, int y) {
      return x + y;
    }
    
    static double plusMethod(double x, double y) {
      return x + y;
    }
    
    public static void main(String[] args) {
      int myNum1 = plusMethod(8, 5);
      double myNum2 = plusMethod(4.3, 6.26);
      System.out.println("int: " + myNum1);
      System.out.println("double: " + myNum2);
    }
  }

    //Test it Now
    //Output:
    
    //int: 13
    //double: 10.559999999999999
    //_____________________________________________________________


  /*Def: Overriding If subclass (child class) has the same method as declared in the parent class, 
  it is known as method overriding in Java.

If a subclass provides the specific implementation of the method that has been declared by one of its parent class, 
it is known as method overriding. */

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  

//Example:

class Bank{  
    int getRateOfInterest(){return 0;}  
    }  
    //Creating child classes.  
    class SBI extends Bank{  
    int getRateOfInterest(){return 8;}  
    }  
      
    class ICICI extends Bank{  
    int getRateOfInterest(){return 7;}  
    }  
    class AXIS extends Bank{  
    int getRateOfInterest(){return 9;}  
    }  
    //Test class to create objects and call the methods  
    class Test2{  
    public static void main(String args[]){  
    SBI s=new SBI();  
    ICICI i=new ICICI();  
    AXIS a=new AXIS();  
    System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }  
    }  

    //Test it Now
    //Output:

    //SBI Rate of Interest: 8
    //ICICI Rate of Interest: 7
    //AXIS Rate of Interest: 9