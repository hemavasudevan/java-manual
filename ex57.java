1.	class Student18 implements Cloneable{  
2.	int rollno;  
3.	String name;  
4.	  
5.	Student18(int rollno,String name){  
6.	this.rollno=rollno;  
7.	this.name=name;  
8.	}  
9.	  
10.	public Object clone()throws CloneNotSupportedException{  
11.	return super.clone();  
12.	}  
13.	  
14.	public static void main(String args[]){  
15.	try{  
16.	Student18 s1=new Student18(101,"amit");  
17.	  
18.	Student18 s2=(Student18)s1.clone();  
19.	  
20.	System.out.println(s1.rollno+" "+s1.name);  
21.	System.out.println(s2.rollno+" "+s2.name);  
22.	  
23.	}catch(CloneNotSupportedException c){}  
24.	  
25.	}  
26.	}  
