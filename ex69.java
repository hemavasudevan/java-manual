1.	class Teststringcomparison1{  
2.	 public static void main(String args[]){  
3.	   String s1="Sachin";  
4.	   String s2="Sachin";  
5.	   String s3=new String("Sachin");  
6.	   String s4="Saurav";  
7.	   System.out.println(s1.equals(s2));//true  
8.	   System.out.println(s1.equals(s3));//true  
9.	   System.out.println(s1.equals(s4));//false  
10.	 }  
11.	}  
12.	class Teststringcomparison2{  
13.	 public static void main(String args[]){  
14.	   String s1="Sachin";  
15.	   String s2="SACHIN";  
16.	  
17.	   System.out.println(s1.equals(s2));//false  
18.	   System.out.println(s1.equalsIgnoreCase(s3));//true  
19.	 }  
20.	}  
