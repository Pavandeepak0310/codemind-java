import java.util.*;
class ValueSameAsCount
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int c=0;
            int N = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<Integer>();
            ArrayList<Integer>list1 = new ArrayList<Integer>();
            for(int i=0; i<N; i++)
                list.add(sc.nextInt());
            for(int i : list)
            {
                if(!list1.contains(i))
                    list1.add(i);
            }
            for(int i : list1) 
            {
                if(i == Collections.frequency(list,i))
                {
                    c++;
                }
            }
            System.out.print(c);
            
        sc.close();
    }
}