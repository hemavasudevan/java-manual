1.	class OverloadingCalculation1{  
2.	  void sum(int a,long b){System.out.println(a+b);}  
3.	  void sum(int a,int b,int c){System.out.println(a+b+c);}  
4.	  
5.	  public static void main(String args[]){  
6.	  OverloadingCalculation1 obj=new OverloadingCalculation1();  
7.	  obj.sum(20,20);//now second int literal will be promoted to long  
8.	  obj.sum(20,20,20);  
9.	  
10.	  }  
11.	}  
