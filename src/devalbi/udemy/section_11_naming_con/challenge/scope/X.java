package devalbi.udemy.section_11_naming_con.challenge.scope;

import java.util.Scanner;

public class X {

    private int x = 0;


    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a integer to get the times table");

        if (x.hasNextInt()) {
            this.x = x.nextInt();
            x.nextLine();
            x();
        } else {
              System.out.println("Input was not an integer");
          }
    }

    public void x(){

        if (this.x == 0){
            System.out.println("input should not be '0'");
            return;
        }

        for(int x = 0; x <=12; x++){
            System.out.println(this.x + " * " + x + " = " + (this.x * x));;
        }
    }

}
