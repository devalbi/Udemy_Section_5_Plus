package devalbi.udemy.challenges;

public class WhileChallenge {

    public static void main(String[] args){
        int num = 4;
        int endNum = 20;
        int total = 0;
        while(num <= endNum) {
            num++;
            if(!isEvenNumber(num)){
                //The continue statement skips the rest of the instructions
                // in a for or while loop and begins the next iteration
                continue; }
            System.out.println("Even Number: " + num);
            total++;
            if(total >= 5){
                break;
            }
        }
        System.out.println("Total number of even numbers is " + total);
    }

    public static boolean isEvenNumber(int i){
            if((i % 2) == 0){
                return true;
            } else {
                return false;
            }
    }
}
