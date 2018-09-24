1.	class A{  
2.	A getA(){  
3.	return this;  
4.	}  
5.	void msg(){System.out.println("Hello java");}  
6.	}  
7.	  
8.	class Test1{  
9.	public static void main(String args[]){  
10.	new A().getA().msg();  
11.	}  
12.	}  
