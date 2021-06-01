import java.util.*;
import java.lang.*;
import java.io.*;

/* Merge Sort */
class Codechef
{
    public static void mergeSort(int[] arr, int p, int r)
    {
        if(p<r)
        {
            int q = p+(r-p)/2;
            mergeSort(arr,p,q);
            mergeSort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }
    public static void merge(int arr[], int p, int q, int r)
    {
        int n1 = q-p+1;
        int n2 = r-q;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for(int i=0;i<n1;i++)
        {
            left[i] = arr[p+i];
        }
        
        for(int j=0;j<n2;j++)
        {
            right[j] = arr[q+1+j];
        }
        int i=0;
        int j=0;
        int k=p;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i = i+1;
                k = k+1;
            }
            else
            {
               arr[k] = right[j];
                j = j+1;
                k=k+1;
            }
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
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
		mergeSort(arr,0,n-1);
		
		for(int i=0; i<n; i++)
		{
		    System.out.println(arr[i]);    
		}
	}
}
