package devalbi.udemy.section_9_abstraction.challenge_2.inner;

public class Song {

    private String name;
    private double duration;
    private int trackNumber;

    public Song(String name, double duration, int trackNumber) {

        this.name = name;
        this.duration = duration;
        this.trackNumber = trackNumber;
    }

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", trackNumber=" + trackNumber +
                '}';
    }
}
