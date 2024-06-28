package Arrays;

public class arraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 66;
        dias[0][1] = 67;
        dias[0][2] = 68;


//        for(int i = 0; i < dias.length; i++){
//            for (int j = 0; j < dias[0].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }

        for(int[] arr:dias){
            for(int num:arr){
                System.out.println(num) ;
            }

        }
    }
}
