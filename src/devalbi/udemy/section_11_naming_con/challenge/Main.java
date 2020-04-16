package devalbi.udemy.section_11_naming_con.challenge;

import com.company.Series;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.nSum(i));
        }
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        for(int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }

}
