package Practise;

import java.util.Scanner;

public class j1
{
 public static void main(String[] args) 
 {
	 
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 int b = sc.nextInt();
 
  j1 j =new j1();
  j.sum(a,b );
  sub(a, b);
 }
 
 public void sum(int a, int b)
 {
	 int sum = a+b;
	 System.out.println("Sum of two number is = " +sum);
 }
 
 public static void sub(int a, int b)
 {
	 int sub = a-b;
	 System.out.println("Sub of two number is = " +sub);
 }
}
