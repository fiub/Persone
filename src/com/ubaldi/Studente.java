package com.ubaldi;

class Studente extends Persone {

    public String matricola;

    @Override
    public void stampaSuConsole() {
        super.stampaSuConsole();//https://www.guru99.com/java-class-inheritance.html#5
        System.out.println(matricola);
    }
}