import java.util.*;
public class binary_pallindrome 
{
    int[] decimaltobinary(int a)
    {
        int i, k=7;
        int b[] = new int[8];
        //changing to binary representation
        while(a>0)
        {
            if(a%2==0)
            {
                b[k] = 0;
                k--;
                a = a/2;
            }
            else
            {
                b[k] = 1;
                k--;
                a = a/2;
            }
        }
        return b;
    }
    static void check_pallindrome(int A[])
    {
        int m = 7;
        int i, flag=0;
        int B[] = new int[8];
        //Reversing the original and storing in another array
        for(i=0;i<8;i++)
        {
            B[m] = A[i];
            m--;
        }
        System.out.print("Binary               ");
        for(i=0;i<8;i++)
        {
            System.out.print(A[i]);
        }
        System.out.println(" ");
        System.out.print("Reversed Binary      ");
        for(i=0;i<8;i++)
        {
            System.out.print(B[i]);
        }
        System.out.println(" ");
        //setting the flag appropriately
        for(i=0;i<8;i++)
        {
            if(A[i] == B[i])
            {
                flag = 1;
            }
            else
            {
                flag=0;
                break;
            }
        }
        //check flag variable
        if(flag == 1)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
        System.out.println(" ");
        
        
    }
     
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = ob.nextInt();
        binary_pallindrome bp = new binary_pallindrome();
        int arr[] = bp.decimaltobinary(n);
        check_pallindrome(arr);
    }
        
}