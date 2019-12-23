package devalbi.udemy.section_7_oop_2.work.polymorphism;

public class Movie {
    private String name;
    public Movie(String name){
        this.name = name;
    }
    public String plot() {
        return "No plot for movie";
    }

    public String getName() {
        return name;
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Fight back against the Empire.";
    }
}

class LOTR extends Movie{
    public LOTR() {
        super("Lord Of the Rings");
    }
    @Override
    public String plot() {
        return "Destroy the one ring.";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
    //No plot method.
}
