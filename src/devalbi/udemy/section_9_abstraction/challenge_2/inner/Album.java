package devalbi.udemy.section_9_abstraction.challenge_2.inner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Album {

    private SongList songList;
    private String name;
    private String artist;
    private int albumTrackNumber = 1;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSongToAlbum(Song song){
        if((song != null)) {
            songList.add(song);
        }
    }

    public boolean addSongToAlbum(String songName, double songDuration){
        if((songName.isEmpty()) || (songDuration <=0.0d)) {
            return false;
        }

        Song newSong = new Song(songName, songDuration, albumTrackNumber);
        songList.add(newSong);
        albumTrackNumber++;

        return true;
    }

    public String getName() {
        return name;
    }

    void printSongList() {
        for (Song song: songList.getListOfSongs()) {
            System.out.println(song.toString());
        }
    }

    class SongList {

        private List<Song> listOfSongs;

        public SongList() {
            listOfSongs = new ArrayList<>();
        }

        boolean add(Song songToAdd) {
            if (songToAdd == null) {
                return false;
            }

            if (listOfSongs.contains(songToAdd)) {
                return false;
            } else if (findSong(songToAdd.getName()) != null) {
                return false;
            }

            listOfSongs.add(songToAdd);
            System.out.println(songToAdd.getName() +
                    "added to the song list");
            return true;
        }


        Song findSong(String songNameToFind) {
            if (songNameToFind.isEmpty()) {
                return null;
            }

            ListIterator<Song> iterator = listOfSongs.listIterator();

            while ((iterator.hasNext())) {
                Song currentSong = iterator.next();
                if (currentSong.getName().equals(songNameToFind)) {
                    System.out.println("Song found: " + songNameToFind);
                    return currentSong;
                }
            }
            return null;
        }

        Song findSong(int trackNumberToFind) {
            if (trackNumberToFind <= 0) {
                return null;
            }
            ListIterator<Song> iterator = listOfSongs.listIterator();

            while ((iterator.hasNext())) {
                Song currentSong = iterator.next();
                if (currentSong.getTrackNumber() == trackNumberToFind) {
                    System.out.println("Song found: " + currentSong.getName());
                    return currentSong;
                }
            }
            return null;
        }

        public List<Song> getListOfSongs() {
            return listOfSongs;
        }
    }
}

