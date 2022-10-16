import java.util.Scanner;
class circleexp1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double s;
        n=sc.nextInt();
        double r=3.14;
        s=r*n*n;
        System.out.format("%.2f",s);
    }
}


