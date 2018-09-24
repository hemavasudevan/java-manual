1.	mport java.util.regex.*;  
2.	public class RegexExample1{  
3.	public static void main(String args[]){  
4.	//1st way  
5.	Pattern p = Pattern.compile(".s");//. represents single character  
6.	Matcher m = p.matcher("as");  
7.	boolean b = m.matches();  
8.	  
9.	//2nd way  
10.	boolean b2=Pattern.compile(".s").matcher("as").matches();  
11.	  
12.	//3rd way  
13.	boolean b3 = Pattern.matches(".s", "as");  
14.	  
15.	System.out.println(b+" "+b2+" "+b3);  
16.	}}  
The . (dot) represents a single character.
1.	import java.util.regex.*;  
2.	class RegexExample2{  
3.	public static void main(String args[]){  
4.	System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
5.	System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
6.	System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
7.	System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
8.	System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
9.	}}  
