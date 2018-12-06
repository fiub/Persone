package com.ubaldi;

import org.jetbrains.annotations.Contract;

import static java.lang.System.out;

public class Frazione {
    public int num;
    public int den;
    private int sopra;
    private int sotto;
    private int mcd;

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

    /*

    @Contract(pure = true)
    private int reduceFraction(int n, int mcd) {
    n = n/mcd;
    return n;
    }

    */

    private String reduceFraction(){
        this.num = num;
        this.den = den;
        this.mcd = mcd;
        this.sopra = sopra;
        this.sotto = sotto;
        switch (sopra = num / mcd) {
        }
        switch (sotto = den / mcd) {
        }
        String frac = Integer.toString(num/mcd) + "/" + Integer.toString(den/mcd);
        final String frac1 = frac;
        return frac1;
    }

    public void stampaSuConsole() {

        mcd = getCalcolaMCD(num,den);
        out.println("------------");
        out.println(num + "/" + den + " si riduce a: " +  reduceFraction());
        out.println(num + "/" + den + " si riduce a: " +  sopra + "/" + sotto);
        out.println("mcd = " + mcd);
        out.println("------------");

    }

}
