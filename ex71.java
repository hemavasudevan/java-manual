1.	class Teststringcomparison4{  
2.	 public static void main(String args[]){  
3.	   String s1="Sachin";  
4.	   String s2="Sachin";  
5.	   String s3="Ratan";  
6.	   System.out.println(s1.compareTo(s2));//0  
7.	   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
8.	   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
9.	 }  
10.	}  
