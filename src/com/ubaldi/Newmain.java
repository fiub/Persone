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

    public void run (String[] args) throws Exception
    {
        // code
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        Frazione first = new Frazione();
        Frazione second = new Frazione();
        Frazione third = new Frazione();
        Frazione fourth = new Frazione();
        first.num = a;
        first.den = b;
        second.num = c;
        second.den = d;
        third.num = e;
        third.den = a;
        fourth.num = b;
        fourth.den = c;
        first.stampaSuConsole();
        first.reduceFraction();
        first.stampaSuConsole();
        second.stampaSuConsole();
        second.reduceFraction();
        second.stampaSuConsole();
        third.stampaSuConsole();
        third.reduceFraction();
        third.stampaSuConsole();
        fourth.stampaSuConsole();
        fourth.reduceFraction();
        fourth.stampaSuConsole();


    }
}
