package it.develhope.otheroperators;

public class testing
{
    public static void main (String arg[])
    {
        int a=15+5-4;
        //a=16
        int b=a+1;
        if (b %2==0)
        {
            System.out.println("the number is even");
        }
        else
        {
            System.out.println("the number is odd");
        }
        if (b*(b+1) %3==0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
