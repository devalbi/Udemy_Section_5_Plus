package devalbi.udemy.Section_5.exercises;

public class LargestPrime_14 {
    public static void main(String[] args) {
/*        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));*/
        //System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(21));
       // System.out.println(isPrimeNum(7));

    }

/*    public static boolean isPrimeNum(int primeNum){
        if (primeNum < 2) {
            return false;
        }
        int counter = 0;
        for (int i = 2; i<primeNum; i++)
        {
            for (int x = 2; x < primeNum; x++) {
                if ((x % i) == primeNum) {
                    counter++;
                }
            }
        }
        if(counter==0){
            System.out.println(primeNum + " is a prime Number");
            return true;
        } else return false;
    }*/

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int counter = 0;
        int primeNum = 0;
        for (int i = 2; i <=number; i++)
        {
            int x=2;
            while(x<i){
                if ((i % x) == 0) {
                    counter++;
                    break;
                }
                x++;
            }
            if((counter == 0) && (number % i == 0)){
                primeNum = i;
            }
            counter = 0 ;
        }
        return primeNum;
    }

}
