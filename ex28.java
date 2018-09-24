1.	class A{  
2.	void msg(){System.out.println("Hello");}  
3.	}  
4.	class B{  
5.	void msg(){System.out.println("Welcome");}  
6.	}  
7.	class C extends A,B{//suppose if it were  
8.	   
9.	 Public Static void main(String args[]){  
10.	   C obj=new C();  
11.	   obj.msg();//Now which msg() method would be invoked?  
12.	}  
13.	}  
