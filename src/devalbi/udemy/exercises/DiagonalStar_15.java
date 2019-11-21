package devalbi.udemy.exercises;

public class DiagonalStar_15 {
    public static void main(String[] args) {
        printSquareStar(5);
       // printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        String dot = "*";
        String space = " ";
        String row="";
        for(int i = 1; i <= number; i ++){
            for(int x=1; x <= number; x++) {
                if((i==1)||(i==number)){
                    row+= dot;
                } else if ((x==number)||(x==1)){
                    row+= dot;
                } else if(i == x){
                    row+= dot;
                } else if(number-i+1== x ){
                    row+=dot;
                } else {
                    row +=space;
                }
                }
            System.out.println(row);
            row="";
            }
        }
    }
