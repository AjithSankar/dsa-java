package recursion;

public class Fibo {

    public static void main(String[] args) {
        //System.out.println(fibo(6));
        fibonacciWithoutRecursion(10);
        fibonacciWithRecursion(10);
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static void fibonacciWithoutRecursion(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        System.out.print(n1 + " " + n2 );

        for (int i = 2; i <= n ; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    static void fibonacciWithRecursion(int n) {
        for (int i = 0; i <= n ; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
    }
}
