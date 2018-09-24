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
12.	 public static void main(String args[]){  
13.	   Student s1=new Student(101,"Raj","lucknow");  
14.	   Student s2=new Student(102,"Vijay","ghaziabad");  
15.	     
16.	   System.out.println(s1);//compiler writes here s1.toString()  
17.	   System.out.println(s2);//compiler writes here s2.toString()  
18.	 }  
19.	}  
