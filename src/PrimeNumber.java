public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        System.out.print("Prime Numbers: ");

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;             //Prime numbers are divisible by only 1 and the number itself
                }
            }
            if (counter == 2) {
                System.out.print(i + " , ");
            }
        }
    }
}