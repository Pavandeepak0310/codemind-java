import java.util.Scanner;
class Multiply
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a,b;
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.format("%.2f",+(a*b));
        sc.close();
    }
}