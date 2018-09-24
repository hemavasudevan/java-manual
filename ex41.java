1.	class Animal{  
2.	void eat(){System.out.println("eating");}  
3.	}  
4.	  
5.	class Dog extends Animal{  
6.	void eat(){System.out.println("eating fruits");}  
7.	}  
8.	  
9.	class BabyDog extends Dog{  
10.	void eat(){System.out.println("drinking milk");}  
11.	  
12.	public static void main(String args[]){  
13.	Animal a1,a2,a3;  
14.	a1=new Animal();  
15.	a2=new Dog();  
16.	a3=new BabyDog();  
17.	  
18.	a1.eat();  
19.	a2.eat();  
20.	a3.eat();  
21.	}  
22.	}  
