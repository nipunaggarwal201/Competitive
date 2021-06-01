import java.util.*;
import java.lang.*;
import java.io.*;

/* Insertion Sort */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
		    arr[i] = sc.nextInt();    
		}
		
		for(int i=1; i<n; i++)
		{
		    int j = i-1;
		    int key = arr[i];
		    while(j>=0 && key<arr[j])
		    {
		        arr[j+1] = arr[j];
		        j = j-1;
		    }
		    arr[j+1] = key;
		}
		for(int i=0; i<n; i++)
		{
		    System.out.println(arr[i]);    
		}
	}
}
