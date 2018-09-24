1.	class Testarray5{  
2.	public static void main(String args[]){  
3.	//creating two matrices  
4.	int a[][]={{1,3,4},{3,4,5}};  
5.	int b[][]={{1,3,4},{3,4,5}};  
6.	  
7.	//creating another matrix to store the sum of two matrices  
8.	int c[][]=new int[2][3];  
9.	  
10.	//adding and printing addition of 2 matrices  
11.	for(int i=0;i<2;i++){  
12.	for(int j=0;j<3;j++){  
13.	c[i][j]=a[i][j]+b[i][j];  
14.	System.out.print(c[i][j]+" ");  
15.	}  
16.	System.out.println();//new line  
17.	}  
18.	  
19.	}}  
