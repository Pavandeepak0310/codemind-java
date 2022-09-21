import java.util.Scanner;
class FindTwoDistinctPrimeNumbersWithGivenProduct
{
    public static int isprime(int x)
    {
        for(int i=2; i<=(int)Math.sqrt(x); i++)
        {
            if(x%i == 0)
                return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                int p = isprime(i);
                int q = isprime(n/i);
                if(p == 1 && q == 1)
                {
                    System.out.print(i + " " + n/i);
                    c = 1;
                    break;
                }
            }
        }
        if(c == 0)
            System.out.print(-1);
        sc.close();
    }
}