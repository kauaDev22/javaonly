package javacore.BintroduçãoMetodos.dominio;

import java.security.PublicKey;

public class Calculadora {

   public  void somaDoisNum(int a, int b) {
       System.out.println( a+ b);
   }
    public  void subtraiDoisNum(int a, int b){
        System.out.println(a - b);
    }
    public double divideNum(double a, double b){
       return a / b;
    }
}
