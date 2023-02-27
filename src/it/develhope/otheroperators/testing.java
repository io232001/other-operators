package it.develhope.otheroperators;

public class testing
{
    public static void main (String arg[])
    {
        int a=15;
        int b=++a+1;
        b %=2==0?++b:b;
        int c=b*(b+1);
        System.out.println(b%2!=0);
        System.out.println(c%3==0);
    }

}
