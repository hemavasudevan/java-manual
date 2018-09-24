1.	class Vehicle{  
2.	  int speed=50;  
3.	}  
4.	class Bike3 extends Vehicle{  
5.	  int speed=100;  
6.	  void display(){  
7.	   System.out.println(speed);//will print speed of Bike   
8.	  }  
9.	  public static void main(String args[]){  
10.	   Bike3 b=new Bike3();  
11.	   b.display();  
12.	}  
13.	}  
