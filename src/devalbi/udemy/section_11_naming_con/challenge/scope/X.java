package devalbi.udemy.section_11_naming_con.challenge.scope;

import java.util.Scanner;

public class X {

    private Scanner scanner = new Scanner(System.in);
    private int x;


    public X() {

    }

    public void X(){
        System.out.println("Enter a integer to get the times table");
        scanner.nextInt();
        scanner.nextLine();
        if(scanner.hasNextInt()){
            this.x = scanner.nextInt();
        }
    }

    public void X(){
        if (this.x == 0){
            System.out.println("input should not be '0'");
            return;
        }

        System.out.println("============================");
        System.out.println("Times tables for x: " + this.x );

        for(int x = 0; x <=12; x++){
            System.out.println((this.x * x));
        }
        return;

    }
}
