1.	class TestArrayCopyDemo {  
2.	    public static void main(String[] args) {  
3.	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
4.	                'i', 'n', 'a', 't', 'e', 'd' };  
5.	        char[] copyTo = new char[7];  
6.	  
7.	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
8.	        System.out.println(new String(copyTo));  
9.	    }  
10.	}  
