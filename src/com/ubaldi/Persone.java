package com.ubaldi;

import java.time.LocalDate;

import static java.lang.System.*;

public class Persone {

    public int id;
    public String firstname;
    public String lastname;
    public LocalDate dateofbirth;

    /**
     * in questo caso sembra non essere necessario il this
     * ref per il this: https://www.guru99.com/java-this-keyword.html
     */
    public void stampaSuConsole() {

        out.println("------------");
        out.printf("id = %d%n", id); //Stampa id
        out.println(firstname); //Stampa firstname
        out.println(lastname); //Stampa lastname
        out.println(dateofbirth); //Stampa dateofbirth

    }
}
