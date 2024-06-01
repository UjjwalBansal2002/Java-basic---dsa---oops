public class SwapFunc {
    public static void main(String[] args) {
        
        swap(10, 20);
        swap(123, 324);
    }

    static void swap(int a,int b){
        System.out.println("Before Swapping: " + a + " " + b);
        int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping: " + a + " "+ b);   
    }
}
