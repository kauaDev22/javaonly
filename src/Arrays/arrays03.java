package Arrays;

public class arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] arrayCerto = {1,2,3,4,5,6};
        int[] arraySemiDiferente = new int[] {1,4,35,3,5};

//        for (int i = 0; i < arrayCerto.length; i++) {
//            System.out.println(arrayCerto[i]);
//        }
        for(int num: arrayCerto){
            System.out.println(num);
        }
    }
}
