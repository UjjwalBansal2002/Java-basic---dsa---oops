
import java.util.Arrays;

public class variableArgs {
    public static void main(String[] args) {
        fun(1,2,3,4);
        
    }
    static void fun(int ...args){
        System.out.println(Arrays.toString(args));
    }
}
