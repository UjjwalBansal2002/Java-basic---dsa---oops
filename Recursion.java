public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        System.out.println(searchBinary(arr,target,0,arr.length-1));
    }

    static int searchBinary(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return searchBinary(arr, target, s, m-1);
        }
        
        return searchBinary(arr, target, m+1, e);
    }
}
