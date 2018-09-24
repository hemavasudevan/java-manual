2.	package pack;  
3.	class A{  
4.	  void msg(){System.out.println("Hello");}  
5.	}  
1.	//save by B.java  
2.	package mypack;  
3.	import pack.*;  
4.	class B{  
5.	  public static void main(String args[]){  
6.	   A obj = new A();//Compile Time Error  
7.	   obj.msg();//Compile Time Error  
8.	  }  
9.	}  
