package devalbi.udemy.section_10_generics.challenge2;

public abstract class Team<T extends Team> implements Comparable<Team<T>>{

    String teamName;
    int teamPoints;

    public Team(String teamName, int teamPoints) {
        this.teamName = teamName;
        this.teamPoints = teamPoints;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamPoints() {
        return teamPoints;
    }

    public void setTeamPoints(int teamPoints) {
        if(teamPoints < 0)
        {
            return;
        }
        this.teamPoints = teamPoints;
    }

    @Override
    public int compareTo(Team<T> team) {

        if(this.teamPoints > team.teamPoints ) {
            return -1;
        } else if ( this.teamPoints < team.teamPoints) {
            return 1;
        } else {
            return 0;
        }
    }
}
