import java.util.*;
class LastEvenNumberIndex
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int c = 0;
            ArrayList<Integer>list1 = new ArrayList<Integer>();
            for(int i=0; i<N; i++)
            {
                list1.add(sc.nextInt());
                if(list1.get(i) % 2 == 0)
                    c = i;
            }
            System.out.print(c);
        sc.close();
    }
}