import java.util.*;
import java.lang.*;
import java.io.*;

/* Quick Sort */
class Codechef
{
    public static void quickSort(int[] arr, int p, int r)
    {
        if(p<r)
        {
            int q = partition(arr, p, r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
            
        }
    }
    public static int partition(int[] arr, int p, int r)
    {
        int x = arr[r];
        int i = p-1;
        for(int j=0; j<=r-1;j++)
        {
            if(arr[j]<x)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[i+1];
        arr[i+1] = temp;
        
        return i+1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
		    arr[i] = sc.nextInt();    
		}
		quickSort(arr,0,n-1);
		for(int i=0; i<n; i++)
		{
		    System.out.println(arr[i]);    
		}
	}
}
