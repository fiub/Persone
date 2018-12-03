package com.ubaldi;

import java.io.PrintStream;

import static java.lang.System.out;

public class Frazione {
    public int num;
    public int den;

    public void stampaSuConsole() {

        out.println("------------");
        out.println( num + " diviso " + den + " fa " + num / den);//Stampa frazione

    }

}
