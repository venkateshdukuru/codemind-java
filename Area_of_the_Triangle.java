import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        double s,t,area;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(a+b+c)/2;
        t=s*(s-a)*(s-b)*(s-c);
        area=Math.sqrt(t);
        System.out.format("%.2f",area);
    }
}