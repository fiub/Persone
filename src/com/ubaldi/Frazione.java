package com.ubaldi;

import static java.lang.System.arraycopy;
import static java.lang.System.out;

public class Frazione {
    public int num;
    public int den;
    public int mcd;

    public int getCalcolaMCD(int a, int b) {
        int r;
        while(b != 0) //termina quando b = 0
        {
            r = a % b;
            a = b;
            b = r;
        }
        return a; //... e quando il resto n-esimo è 0, l'mcd è il resto n-1esimo
    }

    public void stampaSuConsole() {

        mcd = getCalcolaMCD(num,den);
        out.println("------------");
        out.println(num + "/" + den + " si riduce a: " + num/mcd + "/" + den/mcd);
        out.println("mcd = " + mcd);
        out.println("------------");

    }

}
