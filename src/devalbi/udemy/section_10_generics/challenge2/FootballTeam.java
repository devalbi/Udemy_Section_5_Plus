package devalbi.udemy.section_10_generics.challenge2;

public class FootballTeam extends Team {


    public FootballTeam(String teamName, int teamPoints) {
        super(teamName, teamPoints);
    }

    @Override
    public String getTeamName() {
        return super.getTeamName();
    }

    @Override
    public int getTeamPoints() {
        return super.getTeamPoints();
    }

    @Override
    public void setTeamPoints(int teamPoints) {
        super.setTeamPoints(teamPoints);
    }
}
