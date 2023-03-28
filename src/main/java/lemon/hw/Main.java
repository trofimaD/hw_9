package lemon.hw;

import org.apache.commons.lang3.StringUtils;


public class Main {
    public static void main(String[] args) {
        //naturalNumbers();     //1 задание

        //  funcStringI(5);    //7 здание
        //  funcStringR(5);
//        System.out.println(multiplyI(81, 312));
//        System.out.println(multiplyR(81, 312));

      //  System.out.println(sequenceFibonacciI(4));
        //System.out.println(sequenceFibonacciR(4));

        naturalNumbers();

    }


    // 1
    public static void naturalNumbers() {
        long time = System.nanoTime();
        naturalNumberIterative(10);
        System.out.println(System.nanoTime() - time + " iterative");
        time = System.nanoTime();
        naturalNumberRecursion(10);
        System.out.println();
        System.out.println(System.nanoTime() - time + " recursion");
    }

    // 1.Дано натуральне число n. Вивести всі числа від 1 до n
    public static void naturalNumberIterative(int n) {
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void naturalNumberRecursion(int n) {
        if (n > 0) {
            naturalNumberRecursion(n - 1);
            System.out.print(n + " ");
        }

    }


    //2. Дан числовий масив. Обчислити суму всіх його елементів.

    public static void sumArrayElement() {

        long time = System.nanoTime();
        System.out.println(sumArrayElementRecursion(new int[]{1, 2, 3, 6}, 0));
        System.out.println(System.nanoTime() - time + " recursion");
        time = System.nanoTime();
        System.out.println(sumArrayElementIterative(new int[]{1, 2, 3, 6}));
        System.out.println(System.nanoTime() - time + " iterative");
    }

    public static int sumArrayElementIterative(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }


        return sum;
    }


    public static int sumArrayElementRecursion(int array[], int index) {
        if (index == array.length) {
            return 0;
        }
        return array[index] + sumArrayElementRecursion(array, index + 1);


    }





//    5. Обчислити n-й член послідовності чисел Фібоначі

    public  static  int sequenceFibonacciI(int n) {
        int temp;
        int a = 0;
        int b = 1;
        for (int i = 1; i < n ; i++) {
            temp =a;
            a = b;
            b = temp +b;
        }

        return a;
    }

    public  static  int sequenceFibonacciR(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return sequenceFibonacciR(n-1) + sequenceFibonacciR(n-2);
        }

    }



//    6. Рекурсивне множення. Дано вираз n * m. Обчислити добуток за допомогою складання. (7 * 4 = 7 + 7 + 7 + 7 або, навпаки: 4 * 4 * 4 * 4 * 4 * 4 * 4)
    public static int multiplyI(int a, int b) {
        int result = a;
        if (a == 0 || b == 0) {
            return 0;
        }
        for (int i = 1; i < b; i++) {
            result += a;
        }

        return result;
    }

    public static int multiplyR(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return a + multiplyR(a, b - 1);
        }
    }


//    7. Написати функцію, яка буде виводити знаки * за даним числом n.

    public static void funcStringI(int n) {
        String str = "";
        for (int i = 1; i <= n; i++) {
            str = str + "*";
            System.out.println(str);
        }

    }


    public static void funcStringR(int n) {
        if (n > 0) {
            funcStringR(n - 1);
        }
        char ch = '*';
        System.out.println(StringUtils.repeat(ch, n));
    }


}





