import java.util.Scanner;
class NextPrimePalindrome
{
    public static int ispalin(int y)
    {
        int k = y;
        int sum = 0;
        while(k > 0)
        {
            int r = k%10;
            sum = sum*10 + r;
            k = k/10;
        }
        if(sum == y)
            return y;
        else
            return isprime(y+1);
    }
    public static int isprime(int x)
    {
        int c = 0;
        for(int i=2; i<=(int)Math.sqrt(x); i++)
        {
            if(x%i == 0)
                c = 1;
        }
        if(c == 0)
            return ispalin(x);
        else
            return isprime(x+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(isprime(N+1));
        sc.close();
    }
}