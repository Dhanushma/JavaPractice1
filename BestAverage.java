package com.prep;

import java.io.*;
import java.util.*;

//  Find the best average grade.
//  Given a list of student test scores
//  Each student may have more than one test score in the list.


class BestAverage
{
  public static Integer bestAvgGrade(String[][] scores)
  {
    int res = 0;
    Map<String, List<String>> stMap = new HashMap<>();
    for( String [] arr : scores){
      String student = arr[0];
      String val = arr[1];
      if(stMap.containsKey(student)){
        stMap.get(student).add(val);
      }
      else{
        List<String> list = new ArrayList<>();
        list.add(val);
        stMap.put(student,list);
      }
      

    }
    for(String st: stMap.keySet()){
      double average = stMap.get(st).stream().mapToInt(s ->Integer.valueOf(s)).average().getAsDouble();
      if( average > res){
        res = (int) average;
      }
    }
    return res;
  }

  public static boolean pass()
  {
    String[][] s1 = { { "Rohan", "84" },
               { "Sachin", "102" },
               { "Ishan", "55" },
               { "Sachin", "18" } };

    return bestAvgGrade(s1) == 84;
  }

  public static void main(String[] args)
  {
    if(pass())
    {
      System.out.println("Pass");
    }
    else
    {
      System.out.println("Some Fail");
    }
  }
}



