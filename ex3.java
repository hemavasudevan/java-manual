1.	class Student2{  
2.	 int rollno;  
3.	 String name;  
4.	  
5.	 void insertRecord(int r, String n){  //method  
6.	  rollno=r;  
7.	  name=n;  
8.	 }  
9.	  
10.	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
11.	  
12.	 public static void main(String args[]){  
13.	  Student2 s1=new Student2();  
14.	  Student2 s2=new Student2();  
15.	  
16.	  s1.insertRecord(111,"Karan");  
17.	  s2.insertRecord(222,"Aryan");  
18.	  
19.	  s1.displayInformation();  
20.	  s2.displayInformation();  
         }
        }
