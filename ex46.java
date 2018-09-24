1.	abstract class Bike{  
2.	  abstract void run();  
3.	}  
4.	  
5.	class Honda4 extends Bike{  
6.	void run(){System.out.println("running safely..");}  
7.	  
8.	public static void main(String args[]){  
9.	 Bike obj = new Honda4();  
10.	 obj.run();  
11.	}  
12.	}  
