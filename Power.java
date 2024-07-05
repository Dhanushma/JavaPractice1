package com.prep;


/**
 *  Implement power(base,exp) correctly. Assume exp is an integer.
 *
 */

public class Power {

  /* Given base and integer exponent, compute value of base raised to the power of exponent.
   * Can you implement a solution faster than O(exp)?
   */
  public static double power(double base, int exp) {
    if(exp == 0){
      return 1;
    }

    double temp ;
    temp = power(base, exp / 2);

    if(exp % 2 == 0){
      return temp * temp;
    }
    else{
      return base * temp * temp;
    }

  }

  /* returns true if all tests pass, false otherwise */
  public static boolean doTestsPass(double x, int y, double res) {
    boolean doTestsPass = true;
  double result = power(x,y);
  System.out.println(result);
    return  result == res;
  }

  public static void main( String[] args ) {
    if (doTestsPass(2.0,3,8.0))
      System.out.println("All Tests Pass");
    else
      System.out.println("There are test failures");
  }
 }
