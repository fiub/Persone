package com.ubaldi;

//https://stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context

public class Newmain {

    public static void main (String[] args)
    {
        try
        {
            Newmain obj = new Newmain ();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }

// instance variables
    public int a = 21;
    public int b = 7;
    public int c = 14;
    public int d = 15;
    public int e = 3;
    public int f = 0;

    public void run (String[] args) throws Exception
    {
        // code
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        Frazione first = new Frazione(a,b);
        Frazione second = new Frazione(c,d);
        Frazione third = new Frazione(e,a);
        Frazione fourth = new Frazione(b,c);
        Frazione fifth = new Frazione(e,f);
        Frazione sixth = new Frazione();


        first.stampaSuConsole();
        //first.reduceFraction();
        first.stampaSuConsole();
        second.stampaSuConsole();
        //second.reduceFraction();
        second.stampaSuConsole();
        third.stampaSuConsole();
        //third.reduceFraction();
        third.stampaSuConsole();
        fourth.stampaSuConsole();
        //fourth.reduceFraction();
        fourth.stampaSuConsole();
        fifth.stampaSuConsole();
        //fifth.reduceFraction();
        fifth.stampaSuConsole();
        sixth.stampaSuConsole();
        //sixth.reduceFraction();
        sixth.stampaSuConsole();

        int n1 = first.getNumerator();
        int d1 = first.getDenominator();
        int n2 = second.getNumerator();
        int d2 = second.getDenominator();

        Frazione somma = new Frazione();
        int n0 = somma.sum2FractionsN(n1,d1,n2,d2);
        int d0 = somma.sum2FractionsD(d1,d2);

        somma.stampaSuConsole();


    }
}
