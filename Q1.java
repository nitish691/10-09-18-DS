import java.util.*;
class Q1
{
	static int cal(int arr[],int n)
	{
	int max = arr[0];
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] > max)
			{
			max = arr[i];	
			}
		}
		return max;
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter the elements of array ");
		for(int i=0;i<n;i++)
		{
		arr[i] = sc.nextInt();	
		}
		
		System.out.println('\n');
		System.out.print("Entered elements are ");
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
		System.out.print("Maximum element is "+cal(arr,n));
	}
}