1.	public class WrapperExample1{  
2.	public static void main(String args[]){  
3.	//Converting int into Integer  
4.	int a=20;  
5.	Integer i=Integer.valueOf(a);//converting int into Integer  
6.	Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
7.	  
8.	System.out.println(a+" "+i+" "+j);  
9.	}}  
