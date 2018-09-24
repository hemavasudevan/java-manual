1.	class Testarray2{  
2.	static void min(int arr[]){  
3.	int min=arr[0];  
4.	for(int i=1;i<arr.length;i++)  
5.	 if(min>arr[i])  
6.	  min=arr[i];  
7.	  
8.	System.out.println(min);  
9.	}  
10.	  
11.	public static void main(String args[]){  
12.	  
13.	int a[]={33,3,4,5};  
14.	min(a);//passing array to method  
15.	  
16.	}}  
