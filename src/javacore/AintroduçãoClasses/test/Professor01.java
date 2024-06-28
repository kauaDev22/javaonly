package javacore.AintroduçãoClasses.test;

import javacore.AintroduçãoClasses.dominio.Professor;

public class Professor01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Tiago",32,'M');
        System.out.println(professor01.nome);
    }
}
