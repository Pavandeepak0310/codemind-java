import java.util.*;
class FirstAndLastPair
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int j=0; j<N; j++)
                arr[j] = sc.nextInt();
            for(int i=0; i<N/2; i++)
                System.out.print(arr[i] + " " + arr[N-i-1] + " ");
            if(N%2 != 0)
                System.out.print(arr[N/2] + " 0");
        sc.close();
    }
}