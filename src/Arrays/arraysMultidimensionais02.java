package Arrays;

public class arraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][3];

        int[][] arrayDiretaoMulti = {{0,0},{1,2,3},{1,2,3,4}};

        for(int[] arr: arrayDiretaoMulti){
            for(int num: arr){
                System.out.println(num);
            }
        }
    }
}
