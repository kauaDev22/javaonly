package javacore.AintroduçãoClasses.test;

import javacore.AintroduçãoClasses.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Ferrari";
        carro.ano = 2022;
        carro.modelo = "F12";

        carro2.nome = "BMW";
        carro2.ano = 2022;
        carro2.modelo = "325M";

         carro = carro2;
        System.out.println(carro.nome +"|"+ carro.modelo +"|"+ carro.ano);
        System.out.println(carro2.nome +"|"+ carro2.modelo +"|"+ carro2.ano);

    }
}
