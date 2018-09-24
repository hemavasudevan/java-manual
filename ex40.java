1.	class Bank{  
2.	int getRateOfInterest(){return 0;}  
3.	}  
4.	  
5.	class SBI extends Bank{  
6.	int getRateOfInterest(){return 8;}  
7.	}  
8.	  
9.	class ICICI extends Bank{  
10.	int getRateOfInterest(){return 7;}  
11.	}  
12.	class AXIS extends Bank{  
13.	int getRateOfInterest(){return 9;}  
14.	}  
15.	  
16.	class Test3{  
17.	public static void main(String args[]){  
18.	Bank b1=new SBI();  
19.	Bank b2=new ICICI();  
20.	Bank b3=new AXIS();  
21.	System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
22.	System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
23.	System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
24.	}  
25.	}  
