import java.io.*;

/*
Assignment 1
Members: 40210550 Nicholas Pop and 40210549 Alessio Ciriano-Kardous
This algorith will calculate the Oddonacci sequence in an exponential time complexity.
 */

class oddonacci
{
    //oddonaci exponential time complexity.
    static long oddonacci(long n) {
        //the first 3 values of oddonacci are = to 1
        if (n <= 3){
            return 1;
        }
        //an oddonacci number is equal to the sum of the previous 3 numbers
        return oddonacci(n-1) + oddonacci(n-2)+ oddonacci(n-3);
    }

    //throws ioexception for the file writer
    public static void main(String[] args) throws IOException {
        //file writers to write down the values of time and the oddonacci number
        FileWriter write1=new FileWriter("Oddoout.txt");
        FileWriter write2=new FileWriter("Oddotime.txt");

        //for loop for each oddonacci value
        for(long i=5; i<=40; i+=5) {
            //start time
            long timestart = System.currentTimeMillis(); //returns the time in milliseconds
            long odd=oddonacci(i); //calculate the oddonacci number

            //end time
            long timeend = System.currentTimeMillis();

            //writing to a document the time and oddonacci value
            write1.write("Oddonacci in " + i + " = " + odd + " \n");
            write2.write("Time in " + i + " = " + (timeend - timestart) + "ms \n");
        }
        //close the filewriter
        write1.close();
        write2.close();
    }
}