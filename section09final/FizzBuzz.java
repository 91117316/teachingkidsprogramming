package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    for (int j = 0; j < 100; j++)
    {
      System.out.println(j);
      if (j % 3 == 0)
      {
        System.out.println("Fizz");
      }
      if (j % 5 == 0)
      {
        System.out.println("Buzz");
      }
      if (j % 15 == 0)
      {
        System.out.println("FizzBuzz");
      }
    }
    //    For more complete directions see this page
    //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
}
