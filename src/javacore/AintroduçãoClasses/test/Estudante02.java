package javacore.AintroduçãoClasses.test;

import javacore.AintroduçãoClasses.dominio.Estudante;

public class Estudante02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "temaki";
        estudante.years = 23;
        estudante.sex  = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.name = "HotRolls";
        estudante2.years = 16;
        estudante2.sex  = 'F';

        Object[][] ArrayEstudante = {{estudante.name} , {estudante2.name} ,{estudante.years},{estudante2.years}, {estudante.sex, estudante2.sex}};

        for(Object[] element1: ArrayEstudante){
           for( Object element2: element1){
               System.out.print(" "+element2);
           }
        }




    }
}
