
import java.util.*;
import java.lang.*;
import java.io.*;


//Program to print 1 to n using recursion

class Codechef
{
   static void print(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
}
