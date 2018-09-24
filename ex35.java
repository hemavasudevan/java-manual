1.	class Person{  
2.	void message(){System.out.println("welcome");}  
3.	}  
4.	  
5.	class Student16 extends Person{  
6.	void message(){System.out.println("welcome to java");}  
7.	  
8.	void display(){  
9.	message();//will invoke current class message() method  
10.	super.message();//will invoke parent class message() method  
11.	}  
12.	  
13.	public static void main(String args[]){  
14.	Student16 s=new Student16();  
15.	s.display();  
16.	}  
17.	}  
