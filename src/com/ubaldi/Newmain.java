package com.ubaldi;

//https://stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context
import static java.lang.System.out;

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
    public int a = 3;
    public int b = 4;
    public int c = 7;
    public int d = 4;
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

/*
        first.stampaSuConsole();
        second.stampaSuConsole();
        third.stampaSuConsole();
        fourth.stampaSuConsole();
        fifth.stampaSuConsole();
        sixth.stampaSuConsole();*/

        int n1 = first.getNumerator();
        int d1 = first.getDenominator();
        out.println("il get sulla prima frazione mi dà " +  n1 + "/" + d1);

        int n2 = second.getNumerator();
        int d2 = second.getDenominator();
        out.println("il get sulla seconda frazione mi dà " +  n2 + "/" + d2);


        Frazione somma = new Frazione();
        int n0 = somma.sum2FractionsN(n1,d1,n2,d2);
        int d0 = somma.sum2FractionsD(d1,d2);
        out.println("il calcolo della somma non ridotto mi dà " +  n0 + "/" + d0);
        Frazione somma1 = new Frazione(n0,d0);
        somma1.stampaSuConsole();

    }
}
