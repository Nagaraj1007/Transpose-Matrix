import java.util.Arrays;

public class Main {

    public static int[][] transpose(int[][] array){
        int transposeArray[][] = new int[array[0].length][array.length];
        for (int i = 0 ; i < array[0].length ; i++){
            for (int j = 0 ; j < array.length ; j++){
                transposeArray[i][j] = array[j][i];
            }
        }
        return transposeArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}})));
    }
}