1.	class A{  
2.	public static void main(String args[]){  
3.	StringBuilder sb=new StringBuilder("Hello ");  
4.	sb.insert(1,"Java");//now original string is changed  
5.	System.out.println(sb);//prints HJavaello  
6.	}  
7.	}  
