package com.ubaldi;

import org.jetbrains.annotations.Contract;

import static java.lang.System.out;

public class Frazione {

    //constructor with default values
    public Frazione() {
        this(0, 1);
    }

    //constructor https://www.guru99.com/java-constructors.html
    public Frazione(int num, int den) {
        this.num = num;
        this.den = den;
        reduceFraction(); //lo chiamo da lì per avere l'incapsulamento
    }


    //instance var
    private int num;
    private int den;


    @Contract(pure = true)
    private int getCalcolaMCD(int a, int b) {
        int r;
        while(b != 0) //termina quando b = 0
        {
            r = a % b;
            a = b;
            b = r;
        }
        return a; //... e quando il resto n-esimo è 0, l'mcd è il resto n-1esimo
    }

    private void reduceFraction(){ //non ha più senso chiamarla da fuori essendo chiamata dal costruttore
        this.num = num;
        this.den = den;
        int mcd = getCalcolaMCD(num, den);
        num = num / mcd;
        den = den / mcd;
    }

    public void stampaSuConsole() {

        out.println("------------");
        if (den == 0){
            out.println("WARNING! il denominatore è " + this.den + " [ZERO]:");
        }
        out.println("La frazione si riduce a: " +  this.num + "/" + this.den);

    }

    //accessors methods: An accessor method is used to return the value of a private field

    public int getNumerator(){
        return num;
    }

    public int getDenominator(){
        return den;
    }


}
