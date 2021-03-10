package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Album {

    private String albumName;
    private List<Song> albumList;

    public Album(String albumName) {
        this.albumName = albumName;
        albumList = new LinkedList<>();
    }

    public Song createSong(String songName, double songDuration) {

        Song newSong = new Song(songName, songDuration);
        return newSong;
    }

    public boolean addSongToAlbum(Song newSong) {

        if (isSongInAlbum(newSong)) {
            System.out.println("Song already exists");
            return false;
        }

        albumList.add(newSong);
        System.out.println("New Song added to Album: " +newSong.toString());
        return true;
    }

    public boolean isSongInAlbum(Song song) {
        if(song == null) {
            System.out.println("Song must not be null");
            return false;
        }

        ListIterator<Song> iterator = albumList.listIterator();
        while(iterator.hasNext()) {
            Song nextSong = iterator.next();

            if(nextSong.getSongName().equals(song.getSongName())) {
                if(nextSong.getSongDuration() == song.getSongDuration()) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isSongInAlbum(String newSongName, double newSongDuration) {
        if((newSongName.isEmpty()) || (newSongDuration <= 0)) {
            System.out.println("Song must contain mandatory information: Song Name and Duration");
            return false;
        }

        for (Song song : albumList) {
            if ((song.getSongName().equals(newSongName)) && (song.getSongDuration() == newSongDuration)) {
                System.out.println("Song is already in album");
                return true;
            }
        }
        return false;
    }

    void printSongsInAlbum() {
        if(albumList.isEmpty()) {
            System.out.println("No songs present in the album " + getAlbumName());
            return;
        }

        System.out.println("\nPrinting Songs in Album: \n" + getAlbumName());
        ListIterator<Song> iterator = albumList.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<Song> getAlbumList() {
        return albumList;
    }
}
