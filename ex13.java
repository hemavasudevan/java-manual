1.	class Student4{  
2.	    int id;  
3.	    String name;  
4.	      
5.	    Student4(int i,String n){  
6.	    id = i;  
7.	    name = n;  
8.	    }  
9.	    void display(){System.out.println(id+" "+name);}  
10.	   
11.	    public static void main(String args[]){  
12.	    Student4 s1 = new Student4(111,"Karan");  
13.	    Student4 s2 = new Student4(222,"Aryan");  
14.	    s1.display();  
15.	    s2.display();  
16.	   }  
17.	}  
