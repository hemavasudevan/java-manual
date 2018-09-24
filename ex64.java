1.	public class WrapperExample2{    
2.	public static void main(String args[]){    
3.	//Converting Integer to int    
4.	Integer a=new Integer(3);    
5.	int i=a.intValue();//converting Integer to int  
6.	int j=a;//unboxing, now compiler will write a.intValue() internally    
7.	    
8.	System.out.println(a+" "+i+" "+j);    
9.	}}    
