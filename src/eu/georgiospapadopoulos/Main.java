package eu.georgiospapadopoulos;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(152051205));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(101));

    }

    /**
     * Receives a number and adds it's first and last digits.
     * Returns -1 if number is negative.
     * @param number Number to add sum of.
     * @return least important digit + most important digit of original number.
     */
    
    private static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;
        int first = number % 10;
        while (number > 9)
            number /= 10;
        return first + number;
    }
}
