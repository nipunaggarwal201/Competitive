
import java.util.*;
import java.lang.*;
import java.io.*;


//Program to print n to 1 using recursion

class Codechef
{
   static void print(int n)
    {
        
        System.out.print(n+" ");
        if(n==1)
        {
            return;
        }
        print(n-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
}
