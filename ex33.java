1.	class Vehicle{  
2.	  int speed=50;  
3.	}  
4.	  
5.	class Bike4 extends Vehicle{  
6.	  int speed=100;  
7.	      
8.	  void display(){  
9.	   System.out.println(super.speed);//will print speed of Vehicle now  
10.	  }  
11.	  public static void main(String args[]){  
12.	   Bike4 b=new Bike4();  
13.	   b.display();  
14.	     
15.	}  
16.	}  
