package com.ubaldi;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Prima istanza della classe Persone
        Persone ciccio;//Declaration
        ciccio = new Persone();//Assignment
        ciccio.id=1;
        ciccio.firstname= "Ciccio";
        ciccio.lastname= "Cozza";
        ciccio.dateofbirth = LocalDate.of( 1980 , Month.JANUARY , 1 );


        //Seconda istanza della classe Persone
        Persone pippo = new Persone();//Joined declaration and assignment
        pippo.id=2;
        pippo.firstname= "Pippo";
        pippo.lastname= "Ubaldi";
        pippo.dateofbirth = LocalDate.of(1977 , Month.MARCH , 1);

        //Istanza della classe Studente
        Studente dany;
        dany = new Studente();
        dany.id=3;
        dany.firstname= "Daniela";
        dany.lastname= "Gaga";
        dany.dateofbirth = LocalDate.of(1984 , Month.JANUARY , 1);
        dany.matricola = "DG435678";

        //dico a Dany di comportarsi come una persona
        Persone dany_p = dany;


        //Mostriamo a video i dati delle persone
        ciccio.stampaSuConsole();
        dany.stampaSuConsole();
        dany_p.stampaSuConsole();
        pippo.stampaSuConsole();

        //Frazioni
        Frazione prima;
        prima = new Frazione();
        prima.num = 12;
        prima.den = 4;

        Frazione seconda = new Frazione();
        seconda.num = 13;
        seconda.den = 4;

        Frazione terza = new Frazione();
        terza.num = 9;
        terza.den = 15;

        Frazione quarta = new Frazione();
        quarta.num = 15;
        quarta.den = 9;

        //Stampo frazioni
        prima.stampaSuConsole();
        seconda.stampaSuConsole();
        terza.stampaSuConsole();
        quarta.stampaSuConsole();

    }
}
