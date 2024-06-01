
import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 23, 3, 562, 32, 30, 6, 73, 733};
        int[][] arr2 = {
            {1, 42, 41},
            {3, 43, 2},
            {30, 7, 9}
        };

        System.out.println(linearSearch(arr, 3));
        System.out.println(Arrays.toString(linearSearch2D(arr2, 30)));
    }


    //! Function of lenear Search in 1D Arrays


    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }


    //! Function of lenear Search in 2D Arrays

    static int[] linearSearch2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {


                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};
    }

}
