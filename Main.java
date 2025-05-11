public class Main {
    public static void main(String[] args) {

        int result = fib(10);
        System.out.println("The 10th term of the fibonacci sequence is: " + result);
    }

    public static int fib(int n) {
        /**
         *This is a recursive function that finds the value in the nth position of the fibonacci sequence.
         *It does so by attempting to find the sum of (n-1) + (n-2) assuming n is not 1 or zero. The function
         * calls itself over and over until it reaches the bas case and answers itself all the way back up. It returns
         * the solution to the original function call and prints it as specified above.
         */
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