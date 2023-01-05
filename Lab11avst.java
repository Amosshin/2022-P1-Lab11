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
        System.out.print("Enter the primes upper bounds---->");
        int l = input.nextInt();
        final int MAX = l ;

        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]){
        System.out.println("\nCOMPUTING PRIME NUMBERS");


        for(int N=2; N< primes.length; N++) {
            primes[N] = true;
            for(int a = 2; a< primes.length; a++) {
                for (int k = a * 2; k < primes.length; k += a) {
                    primes[k]=false;
                }
            }

        }
        }
    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();

        for (int N = 2; N < primes.length; N++) {
            //check if prime is true
            if (primes[N]==true){
                System.out.print(N + " ");
            }


            }


        }
    }




