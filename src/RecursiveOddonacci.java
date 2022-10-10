public class RecursiveOddonacci {
/*
Assignment 1
Members: 40210550 Nicholas Pop and 40210549 Alessio Ciriano-Kardous
This algorith will calculate the Oddonacci sequence using tail recursion.
 */

    //recursive oddonacci algorithm
    static long recursive(long n, long a, long b, long c){
        //setting up base cases
        if (n == 0){
            return b;
        }

        if (n == 1) {
            return b;
        }

        if (n == 2) {
            return b;
        }

        //recursive step using tail recursion
        return recursive(n-1, b, c, a + b + c);

    }

    public static void main(String[] args){
        //for loop to iterate through the different Oddonacci values.
        for (int i = 5; i <= 100; i += 5){
            System.out.println(recursive(i, 1, 1, 1));
        }
    }
}
