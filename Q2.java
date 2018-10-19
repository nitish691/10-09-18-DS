import java.util.*;
class Q2
{
	static void sorting(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		
		System.out.print("After bubble sorting ");
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");	
		}
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
		
		System.out.print("Entered elements are ");
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");	
		}
		
		System.out.print('\n');
		
		sorting(arr,n);
	}
}