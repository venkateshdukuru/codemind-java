import java.util.*;
class FibNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n>2)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n=n-1;
        }
        
    }
}

