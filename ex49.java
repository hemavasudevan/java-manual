1.	interface Printable{  
2.	void print();  
3.	}  
4.	interface Showable{  
5.	void print();  
6.	}  
7.	  
8.	class TestTnterface1 implements Printable,Showable{  
9.	public void print(){System.out.println("Hello");}  
10.	public static void main(String args[]){  
11.	TestTnterface1 obj = new TestTnterface1();  
12.	obj.print();  
13.	 }  
14.	}  
