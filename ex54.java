2.	package pack;  
3.	public class A{  
4.	protected void msg(){System.out.println("Hello");}  
5.	}  
1.	//save by B.java  
2.	package mypack;  
3.	import pack.*;  
4.	  
5.	class B extends A{  
6.	  public static void main(String args[]){  
7.	   B obj = new B();  
8.	   obj.msg();  
9.	  }  
10.	}  
