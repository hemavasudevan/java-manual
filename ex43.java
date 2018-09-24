1.	class Animal{  
2.	 void eat(){System.out.println("animal is eating...");}  
3.	}  
4.	  
5.	class Dog extends Animal{  
6.	 void eat(){System.out.println("dog is eating...");}  
7.	  
8.	 public static void main(String args[]){  
9.	  Animal a=new Dog();  
10.	  a.eat();  
11.	 }  
12.	}  
