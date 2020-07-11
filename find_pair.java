import java.util.Arrays;
public class Main
{
	public static void pairs(int a[], int k)
	{
	   Arrays.sort(a);
	   int flag=0;
	   int n=a.length;
	   int low=0;
	   int high=n-1;
	   while(low<high)
	   {
	       if(a[low]+a[high]==k)
	       {
	           System.out.println("Pair found, "+a[low]+"+"+a[high]+"="+k);
	           flag++;
	       }
	       if(a[low]+a[high]<k)
	       low++;
	       
	       else
	       high--;
	   }
	   if(flag==0)
	   System.out.println("Pair not found");
	}
	public static void main(String[] args) 
	{
	    int[] a={8,7,2,3,6,9,4,1,5};
	    int k=10;
	    pairs(a,k);
	}
}
