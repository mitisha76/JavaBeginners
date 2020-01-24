//Give an array of positive integers.Your task is to find the leaders in the array.
import java.util.*;
public class FindLeader {
	static void print(int[] arr)
	{
		int size=arr.length;

        int max_from_right =  arr[size-1]; 
   
        System.out.print(max_from_right + " "); 
       
        for (int i = size-2; i >= 0; i--) 
        { 
            if (max_from_right < arr[i]) 
            {            
            max_from_right = arr[i]; 
            System.out.print(max_from_right + " "); 
            } 
        } 
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		print(a);
		
	}

}
