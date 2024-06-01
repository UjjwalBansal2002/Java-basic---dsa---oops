
import java.util.Arrays;


public class Array {

    public static void main(String[] args) {
        int[] arr = {1, 43, 98, 54, 5, 6, 7, 8};
        // System.out.println(Arrays.toString(arr));
        // swap(arr, 1, 7);
        // System.out.println(Arrays.toString(arr));
        System.out.println("Max Element in arr: " + max(arr));
        System.out.println("Array before reversing: " + reverse(arr));
        System.out.println("Array after reversing: " + reverse(arr));

    }


    //! Function to swap elements in Array

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }



    //! Function to find Max Value in Array

    static int max(int[] arr){
        int max=arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return  max;
    }


    //! Function to reverse an Array

    static String reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return Arrays.toString(arr);
    }


}
