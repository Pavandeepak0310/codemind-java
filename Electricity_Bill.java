import java.util.Scanner;
class ElectricityBill
{
    public static void main(String args[])
    {
        String a,b;
        int c;
        float d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextInt();
        if(c <=199)
        {
            d = (float)(c*1.20+100);
            System.out.format("%.2f",d);
        }
        else if(c>=200 && c < 400)
        {
            d=(float)(c*1.50+100);
            System.out.format("%.2f",d);
        }
        else if(c == 400)
        {
            d=(float)(c*1.80+100);
            System.out.format("%.2f",d);
        }
        else if(c > 400 && c < 600)
        {
            d=(float)(c*1.80);
            d=(float)(d + (d*0.15));
            System.out.format("%.2f",d);
        }
        else
        {
         d=(float)(c*2.00);
            d=(float)(d+(d*0.15));
            System.out.format("%.2f",d);
    }
}
}