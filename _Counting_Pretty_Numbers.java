import java.util.*;
class pretty
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for (int j=a;j<=b;j++)
            {
                int r;
                r=j%10;
                if (r==2 || r==3 || r==9)
                {
                    c+=1;
                }
            }
            System.out.println(c);
        }
    }
}




