package lemon.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(naturalNumberIterative(7)));
        naturalNumberIterative(10);
        naturalNumberRecursion(10);

    }


//    // Дано натуральне число n. Вивести всі числа від 1 до n  ИТЕРАТИВНО, массив
//    public  static int[] naturalNumberIterativeA (int n){
//        int result[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            result[i] = i+1;
//        }
//        return result;
//    }

    // 1.Дано натуральне число n. Вивести всі числа від 1 до n  ИТЕРАТИВНО
    public static void naturalNumberIterative(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // 1.Дано натуральне число n. Вивести всі числа від 1 до n  Рекурсия
    public static void naturalNumberRecursion(int n) {
        if (n > 0) {
            naturalNumberRecursion(n - 1);
            System.out.print(n + " ");
        }

    }





}