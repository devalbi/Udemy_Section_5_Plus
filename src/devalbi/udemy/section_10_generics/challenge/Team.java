package devalbi.udemy.section_10_generics.challenge;

public abstract class Team<T extends Team> implements Comparable<Team<T>> {

    private int won, lost, tied = 0;
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRanking(){
        return (won * 3) + lost;
    }

    public void addWon() {
        this.won++;
    }

    public void addLost() {
        this.lost++;
    }

    public void addTied() {
        this.tied++;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getRanking() > team.getRanking()){
            return -1;
        } else if(this.getRanking() < team.getRanking()){
            return 1;
        } else {
            return 0;
        }
    }
}
