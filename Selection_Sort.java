package Sorting_Techniques;
import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=1;i<arr.length;i++)
		{
			int e=arr.length-i;
			int max=0;
			for(int j=0;j<=e;j++)
			{
				if(arr[max]<arr[j])
					max=j;
			}
			int tmp=arr[max];
			arr[max]=arr[e];
			arr[e]=tmp;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
