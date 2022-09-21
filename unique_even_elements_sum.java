import java.util.*;
class UniqueEvenSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0; i<n; i++)
            hash.add(sc.nextInt());
        int sum = 0;
        for(int i : hash)
        {
            if(i % 2 == 0)
                sum = sum + i;
        }
        System.out.print(sum);
        sc.close();
        
    }
}