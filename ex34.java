1.	class Vehicle{  
2.	  Vehicle(){System.out.println("Vehicle is created");}  
3.	}  
4.	  
5.	class Bike5 extends Vehicle{  
6.	  Bike5(){  
7.	   super();//will invoke parent class constructor  
8.	   System.out.println("Bike is created");  
9.	  }  
10.	  public static void main(String args[]){  
11.	   Bike5 b=new Bike5();  
12.	        
13.	}  
14.	}  
