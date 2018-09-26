/*
*
* @Class GCD & Fibonacci
* @Author Phạm Thiên Long
*
* */
import java.util.Scanner;

public class Lab03Bt1
{
    public static int temp = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(USCLN(a, b));
        Fibonacci(0, 1);
    }

    /*
    * function find GCD
    * */
    public static int USCLN(int a, int b) {
        if (b == 0)
            return a;
        else
        {
            return USCLN(b, a % b);
        }
    }

    /*
    * function println Fibonacci number
    * */
    public static int Fibonacci(int a, int b)
    {
        temp++;
        if (a == 0 && b == 1)
        {
            System.out.print(a + " " + b + " ");
        }
        if (temp <= 10)
        {
            System.out.print(a + b);
            System.out.print(" ");
            return Fibonacci(b, a + b);
        }
        else
        {
            return 0;
        }
    }
}
