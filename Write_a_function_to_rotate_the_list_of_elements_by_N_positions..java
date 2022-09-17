import java.util.*;
class WriteAFunctionToRotateTheListOfElementsByNPositions
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            ArrayList<Integer>list = new ArrayList<Integer>();
            for(int j=0; j<N; j++)
                list.add(sc.nextInt());
            int k = sc.nextInt();
            Collections.rotate(list,k);
            for(int i : list)
                System.out.print(i + " ");
        sc.close();
    }
}