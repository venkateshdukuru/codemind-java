import java.util.Scanner;
class share
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=0,a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        r=a-(2*b);
        if(a==0 && b%2==0)
            System.out.println("YES");
        else if (a==0 && b%2!=0)
            System.out.println("NO");
        else if(r%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
        