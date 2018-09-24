1.	import java.util.StringTokenizer;  
2.	public class Simple{  
3.	 public static void main(String args[]){  
4.	   StringTokenizer st = new StringTokenizer("my name is khan"," ");  
5.	     while (st.hasMoreTokens()) {  
6.	         System.out.println(st.nextToken());  
7.	     }  
8.	   }  
9.	}  
