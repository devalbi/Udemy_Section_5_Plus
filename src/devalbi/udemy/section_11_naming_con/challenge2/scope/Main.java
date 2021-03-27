package devalbi.udemy.section_11_naming_con.challenge2.scope;

import com.company.Series;

public class Main {

    public static void main(String[] args) {
        System.out.println(Series.nSum(10));
        Series.factorial(10);
        Series.fibonacci(10);


        X x = new X();
    }
}
