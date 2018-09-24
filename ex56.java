2.	package com.javatpoint;  
3.	public class Student{  
4.	private String name;  
5.	   
6.	public String getName(){  
7.	return name;  
8.	}  
9.	public void setName(String name){  
10.	this.name=name  
11.	}  
12.	}  
1.	//save as Test.java  
2.	package com.javatpoint;  
3.	class Test{  
4.	public static void main(String[] args){  
5.	Student s=new Student();  
6.	s.setname("vijay");  
7.	System.out.println(s.getName());  
8.	}  
9.	}  
