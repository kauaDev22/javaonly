package javacore.BintroduçãoMetodos.test;

import javacore.BintroduçãoMetodos.dominio.Calculadora;

public class calculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
     calculadora.somaDoisNum(2, 4);
     calculadora.subtraiDoisNum(4, 4);
     double result = calculadora.divideNum(2,5);
        System.out.println(result);

    }


}
