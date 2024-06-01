import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2, 3, 4, 5, 6, 13, 21, 34};
        // bubbleSort(arr);
        String Result = bubbleSort(arr);
        System.out.println(Result);
    }


    static String bubbleSort(int[] arr){
        boolean swap=false;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
        
        return Arrays.toString(arr);
    }
}
