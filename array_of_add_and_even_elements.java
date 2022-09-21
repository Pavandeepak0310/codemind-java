import java.util.*;
class ArrayOfOddAndEvenElements
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            ArrayList<Integer>list1 = new ArrayList<Integer>();
            for(int i=0; i<N; i++)
                list1.add(sc.nextInt());
            for(int i : list1) 
            {
                if(i%2!= 0)
                    System.out.print(i + " ");
            }
            for(int i : list1) 
            {
                if(i%2== 0)
                    System.out.print(i + " ");
            }
            
        sc.close();
    }
}