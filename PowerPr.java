package com.prep;

public class PowerPr {

	  /* Given base and integer exponent, compute value of base raised to the power of exponent.
	   */
	  public static double power(double base, int exp) {
	    
	    if(exp ==0 ){
	      return 1;
	    }
	    double temp = power(base, exp/2);
	    if(temp % 2 == 0){
	      return temp * temp;
	    }
	    else{
	      return base * temp * temp;
	    }
	  }

	  public static boolean doTestPass() {
	    boolean testsPass = true;
	    double result = power(2.2,2);
	    System.out.println(result);
	    return testsPass && result==4.84;
	  }

	  public static void main( String[] args ) {
	    if(doTestPass()){
	      System.out.println("Pass");
	    }
	    else{
	      System.out.println("There are failures");
	    }
	  }
	}