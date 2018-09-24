1.	class Bike{  
2.	  final void run(){System.out.println("running");}  
3.	}  
4.	     
5.	class Honda extends Bike{  
6.	   void run(){System.out.println("running safely with 100kmph");}  
7.	     
8.	   public static void main(String args[]){  
9.	   Honda honda= new Honda();  
10.	   honda.run();  
11.	   }  
12.	}  
