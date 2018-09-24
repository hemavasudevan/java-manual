1.	class A{  
2.	private int data=40;  
3.	private void msg(){System.out.println("Hello java");}  
4.	}  
5.	  
6.	public class Simple{  
7.	 public static void main(String args[]){  
8.	   A obj=new A();  
9.	   System.out.println(obj.data);//Compile Time Error  
10.	   obj.msg();//Compile Time Error  
11.	   }  
12.	}  
