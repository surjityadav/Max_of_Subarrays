
import java.util.Scanner;


public class Max_of_subarray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("");
        int k=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Output:");
        for(int i=0;i<=n-k;i++)
        {
            int max=a[i];
            for(int j=0;j<k;j++)
            {
                if(max<a[i+j])
                {
                    max=a[i+j];
                }
            }
            System.out.print(max+" ");
        }
        
    }
    
}
