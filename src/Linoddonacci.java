import java.io.*;

/*
Assignment 1
Members: 40210550 Nicholas Pop and 40210549 Alessio Ciriano-Kardous
This algorith will calculate the Oddonacci sequence in a linear time complexity.
 */

class oddonaccilinear {

    //linear oddonacci
    static long[] oddonaccilinear(long k) {
        long[] A = new long[3];
        long i = 0, j = 0, b = 0;

        //setting up base case values
        if (k == 0) {
            i = 1;
            j = 0;
            b = 0;

            A[0] = i; A[1] = j; A[2] = b;

            return (A);
        } else if (k ==1 ) {
            i = 1;
            j = 1;
            b = 0;

            A[0] = i; A[1] = j; A[2] = b;

            return (A);
        } else if (k == 2) {
            i = 1;
            j = 1;
            b = 1;

            A[0] = i; A[1] = j; A[2] = b;

            return (A);
            //recursion step
        } else {
            A = oddonaccilinear(k - 1);
            i = A[0];
            j = A[1];
            b = A[2];

            A[0] = i + j + b; A[1] = i; A[2] = j;

            return (A);
        }
    }

    public static void main(String[] args) throws IOException {
        //creating the filewriter objects
        FileWriter write1=new FileWriter("Oddooutlinear.txt");
        FileWriter write2=new FileWriter("Oddotimelinear.txt");

        //for loop to iterate through each oddonacci number
        for(int i=5;i<=20000;i+=5) {
            //start time
            long timestart = System.currentTimeMillis();
            long[] odd = oddonaccilinear(i); //running the algorithm and storing the values in an array

            //end time
            long timeend = System.currentTimeMillis();

            //writing to a document the time and oddonacci value
            write1.write("Oddonacci in " + i + " = " + odd[1] + "\n ");
            write2.write("Time in " + i + " = " + (timeend - timestart) + "ms\n");
        }
        write1.close();
        write2.close();

    }
}