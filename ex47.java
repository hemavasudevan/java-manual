1.	abstract class Bike{  
2.	   Bike(){System.out.println("bike is created");}  
3.	   abstract void run();  
4.	   void changeGear(){System.out.println("gear changed");}  
5.	 }  
6.	  
7.	 class Honda extends Bike{  
8.	 void run(){System.out.println("running safely..");}  
9.	 }  
10.	 class TestAbstraction2{  
11.	 public static void main(String args[]){  
12.	  Bike obj = new Honda();  
13.	  obj.run();  
14.	  obj.changeGear();  
15.	 }  
16.	}  
