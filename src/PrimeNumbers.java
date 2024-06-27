public class PrimeNumbers {
        // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int n = 50; // You can change this value to check up to a different number
            System.out.println("Prime numbers up to " + n + ":");
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }
