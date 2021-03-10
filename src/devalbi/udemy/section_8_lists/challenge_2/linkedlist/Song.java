package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

public class Song {

    private String songName;
    private double songDuration;

    public Song(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        if(songName.isEmpty()) {
            System.out.println("Song name must not be empty");
            return;
        }

        this.songName = songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(double songDuration) {
        if(songDuration <=00.00d) {
            System.out.println("Song cannot be 0 seconds or less");
            return;
        }

        this.songDuration = songDuration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Name='" + songName + '\'' +
                ", Duration=" + songDuration +
                '}';
    }
}
