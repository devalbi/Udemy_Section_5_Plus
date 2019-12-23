package devalbi.udemy.section_7_oop_2.work.polymorphism;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 6; i++ )
        {
            Movie movie = randomMovie();
            System.out.println("Movie #: "  + i + "\n" +
                                "Movie name: " + movie.getName() + "\n" +
                                "Movie plot: " + movie.plot() + "\n");
                                //If plot method is not in child class, then checks parent class where
                                //Movie movie = new Forgettable() = checks forgettable first, then checks Movie class as class is a reference Movie class (LHS of "=")
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number generator was: " + randomNumber );

        switch (randomNumber) {
            case 1:
                return new StarWars();
            case 2:
                return new LOTR();
            case 3:
                return new Forgettable();
            default:
                return null;
        }

    }
}
