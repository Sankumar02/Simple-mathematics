package com.Class.org;

public class Mathematics {
	
	Integer a=2;
	 
	Integer b=3;
	
	int c=32;
	
	int d=2;
	
    int e=7;
    
    Integer g=e-d;
  	
    long f=(long)(a+b+c);
    
    public void add() {
		
    	System.out.println("Addition of a,b and c is "+f);
    }
   
    public void sub() {
    	
    	System.out.println("Subraction of e and d is "+g);
    	
    }

	public static void main(String[] args) {
		
        Mathematics addition = new Mathematics();
        addition.add();
        Mathematics subraction= new Mathematics();
        subraction.sub();
	}

}
