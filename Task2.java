// Student Grade Calculator

import java.util.Scanner;
public class Task2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float s1, s2, s3, s4, s5, sum, sub = 5, avg;
      String grade;
      System.out.println("enter your marks of five subjects:");
      s1 = sc.nextFloat();
      s2 = sc.nextFloat();
      s3 = sc.nextFloat();
      s4 = sc.nextFloat();
      s5 = sc.nextFloat();
      sum = s1 + s2 + s3 + s4 + s5;
      avg = sum / sub;

      if (avg >= 90)
         grade = "A+";
      else if (avg < 90 && avg >= 80)
         grade = "A";
      else if (avg < 80 && avg >= 70)
         grade = "B";
      else if (avg < 70 && avg >= 60)
         grade = "B+";
      else if (avg < 60 && avg >= 50)
         grade = "C";
      else
         grade = "D";

      System.out
            .println("your total marks are- " + sum + " and your percentage is " + avg + "%  and grade is " + grade);

      sc.close();
   }
}