import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        System.out.format("%.2f",32+(c*1.8));
        sc.close();
    }
}