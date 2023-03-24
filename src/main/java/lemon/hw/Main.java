package lemon.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



    }



    // Дано натуральне число n. Вивести всі числа від 1 до n
    public  static int[] naturalNumberIterative (int n){
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i+1;

            System.out.println(Arrays.toString(result));



        }








        return result;
    }















//    public static int sum(int k) {
//        if (k > 0) {
//            return k + sum(k - 1);
//        } else {
//            return 0;
//        }
//    }


}