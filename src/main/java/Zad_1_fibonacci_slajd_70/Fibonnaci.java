package Zad_1_fibonacci_slajd_70;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fib(0));;
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(10));
    } // main()

    public static int fib(int n){
        if (n==0) return 0;
        if (n==1) return 1;
        return (fib(n-1)+fib(n-2));
    }; // fib(n)
} // class Fibonnaci
