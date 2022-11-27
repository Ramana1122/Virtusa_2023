import java.lang.*;
import java.util.Scanner;
class Main
{
    static int Digits(int n)
    {
        int largest = 0;
        int smallest = 9;

        while(n != 0)
        {
            int r = n % 10;
            largest = Math.max(r, largest);
            smallest = Math.min(r, smallest);

            n = n / 10;
        }
        return largest;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner cs = new Scanner (System.in);
        System.out.println ("Enter the number");
        int n = cs.nextInt ();
        System.out.println ("Enter the number");
        int n1 = cs.nextInt ();
        System.out.println ("Enter the number");
        int n2 = cs.nextInt ();
        Digits(n);
        Digits(n1);
        Digits(n2);

    }
}

