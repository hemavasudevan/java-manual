3.	package pack;  
4.	public class A{  
5.	public void msg(){System.out.println("Hello");}  
6.	}  
1.	//save by B.java  
2.	  
3.	package mypack;  
4.	import pack.*;  
5.	  
6.	class B{  
7.	  public static void main(String args[]){  
8.	   A obj = new A();  
9.	   obj.msg();  
10.	  }  
11.	}  
