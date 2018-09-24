1.	class Student{  
2.	 int rollno;  
3.	 String name;  
4.	 String city;  
5.	  
6.	 Student(int rollno, String name, String city){  
7.	 this.rollno=rollno;  
8.	 this.name=name;  
9.	 this.city=city;  
10.	 }  
11.	   
12.	 public String toString(){//overriding the toString() method  
13.	  return rollno+" "+name+" "+city;  
14.	 }  
15.	 public static void main(String args[]){  
16.	   Student s1=new Student(101,"Raj","lucknow");  
17.	   Student s2=new Student(102,"Vijay","ghaziabad");  
18.	     
19.	   System.out.println(s1);//compiler writes here s1.toString()  
20.	   System.out.println(s2);//compiler writes here s2.toString()  
21.	 }  
22.	}  
