2.	interface A{  
3.	void a();//bydefault, public and abstract  
4.	void b();  
5.	void c();  
6.	void d();  
7.	}  
8.	  
9.	//Creating abstract class that provides the implementation of one method of A interface  
10.	abstract class B implements A{  
11.	public void c(){System.out.println("I am C");}  
12.	}  
13.	  
14.	//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
15.	class M extends B{  
16.	public void a(){System.out.println("I am a");}  
17.	public void b(){System.out.println("I am b");}  
18.	public void d(){System.out.println("I am d");}  
19.	}  
20.	  
21.	//Creating a test class that calls the methods of A interface  
22.	class Test5{  
23.	public static void main(String args[]){  
24.	A a=new M();  
25.	a.a();  
26.	a.b();  
27.	a.c();  
28.	a.d();  
29.	}}  
