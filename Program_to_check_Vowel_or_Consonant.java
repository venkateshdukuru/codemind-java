
import java.util.*;
class checkNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        if (s=='a' || s=='A' || s=='e' || s=='E' || s=='I' || s=='i' || s=='o' || s=='O' || s=='u' || s=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
             System.out.println("Consonant");
        }
    }
}