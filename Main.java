package org.example.fibonacci;



public class Main {
    public static void main(String[] args) {

        int result = fib(10);
        System.out.println("The 10th term of the fibonacci sequence is: " + result);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int solution = fib(n - 1) + fib(n - 2);
            return solution;
        }
    }
}