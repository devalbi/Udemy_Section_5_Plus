package devalbi.udemy.exercises;

public class Palindrome_4 {
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(706));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit = 0;
        int newNum = number;

        while(newNum != 0 ){
            lastDigit = newNum % 10;
            reverse *= 10;
            reverse += lastDigit;
            newNum /= 10;
            System.out.println("LastDigit is " + lastDigit + " and revered is " + reverse);
        }

        System.out.println("Number is " + number + " and revered is " + reverse);
        if(reverse == number){
            return true;
        } else return false;
    }


}
