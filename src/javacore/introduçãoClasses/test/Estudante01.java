package javacore.introduçãoClasses.test;

import javacore.introduçãoClasses.dominio.Estudante;

public class Estudante01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.name = "Toninho";
        estudante1.years =  18;
        estudante1.sex = 'M';

        System.out.println(estudante1);
    }
}
