// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

        for(int N=2; N< primes.length; N++) {
            primes[N] = true;
            System.out.print(primes[N]);
        }




            //Step 2 : Removing multiples of primes
            // Hint: Nested Loop
        for(int k =2; k< primes.length; k*=2){
           primes[k] = false;

        }

        }







    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();

        for (int N = 2; N < primes.length; N++) {
            //check if prime is true


                System.out.print(N + " ");


            }


        }
    }




