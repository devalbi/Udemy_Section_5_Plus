package devalbi.udemy.Section_5.challenges;

public class SumChallenge {
    public static void main(String[] args) {

        int x= 0;
        int counter = 0;
        for(int i = 1 ; i <=1000; i++ )
        {
            if((i % 3== 0) && (i % 5 == 0))
            {
                counter++;
                x += i;
                System.out.println( i +" is divisible by both 3 and 5");
            }
            if(counter == 5){
                break;
            }
        }
        System.out.println("Value of all numbers is: " + x);
    }
}
