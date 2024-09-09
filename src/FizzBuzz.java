/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
//XD
    public static void main(String[] args) {
/*
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
  */
        doFizzBuzz();
    }

    private static void doFizzBuzz() {
        int x = 1;
        while(x < 100){
            // Find out which numbers divide i.
            boolean divisibleBy3 = x % 3 == 0;
            boolean divisibleBy5 = x % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(x);

            }
            x++;
        }
    }
}
