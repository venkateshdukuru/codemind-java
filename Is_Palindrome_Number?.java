import java.util.*;
class pal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,t,n=sc.nextInt();
        t=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if (sum==t)
        {
            System.out.println("2");
        }
        else
        {
            System.out.println("1");
        }
    }
}