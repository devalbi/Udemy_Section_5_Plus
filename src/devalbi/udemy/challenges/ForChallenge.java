package devalbi.udemy.challenges;

public class ForChallenge {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        primeRange(10, 50);
    }

    public static void primeRange(int a, int b)
    {
        String primeNumbers = "Prime Numbers are: ";
        int counter = 0;
        for(int i =a; i < b; i++ ){
            if(isPrime(i)){
                counter++;
                primeNumbers += i + ", ";
                System.out.println(i + " is a prime number");
                if(counter == 3){
                    System.out.println(primeNumbers);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1 ){
            return false;
        }for(int i =2; i<= (long) Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}


