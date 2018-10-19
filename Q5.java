import java.util.*;
class Q5
{
	static void reverse(int arr[])
	{
		for(int i=0;i<arr.length/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
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
		
		System.out.println();
		System.out.print("Entered elements are ");
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println('\n');
		
		System.out.print("After reversing ");
		reverse(arr);
	}
}