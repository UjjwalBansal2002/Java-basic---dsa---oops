// time complexity worst case O(log n)
public class BinaraySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int ans = binaraySearch(arr, 3);
        System.out.println(ans);
    }

    static int binaraySearch(int[] arr,int  target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
