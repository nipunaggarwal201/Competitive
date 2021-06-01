import java.util.*;
import java.lang.*;
import java.io.*;

/* Bubble Sort */
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
		
		for(int i=0;i<n;i++)
		{
		    boolean flag = false;
		    for(int j=0;j<n-1;j++)
		    {
		        if(arr[j]>arr[j+1])
		        {
		            arr[j] = arr[j] + arr[j+1];
		            arr[j+1] = arr[j] - arr[j+1];
		            arr[j] = arr[j] - arr[j+1];
		            
		            flag=true;
		        }
		    }
		    if(!flag)
		    {
		        break;
		    }
		}
		
		for(int i=0; i<n; i++)
		{
		    System.out.println(arr[i]);    
		}
		 
	}
}
