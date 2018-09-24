1.	class Operation{  
2.	 int square(int n){  
3.	  return n*n;  
4.	 }  
5.	}  
6.	  
7.	class Circle{  
8.	 Operation op;//aggregation  
9.	 double pi=3.14;  
10.	    
11.	 double area(int radius){  
12.	   op=new Operation();  
13.	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
14.	   return pi*rsquare;  
15.	 }  
           public static void main(String args[]){  
20.	   Circle c=new Circle();  
21.	   double result=c.area(5);  
22.	   System.out.println(result);  
23.	 }  
24.	}  
