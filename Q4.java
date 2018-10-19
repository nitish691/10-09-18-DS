import java.util.*;
class Q4
{
	public static void main(String ars[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of rows ");
		int n = sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	
		System.out.println('\n');
		System.out.print("After waveform ");
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				for(int j=n-1;j>=0;j--)
				{
				System.out.print(arr[i][j]+",");
				}
			}
			else
			{
				for(int j=0;j<n;j++)
				{
				System.out.print(arr[i][j]+",");
				}
			}

		}
		
	}
}