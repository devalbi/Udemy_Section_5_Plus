package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {

    private String playlistName;
    private List<Album> songsInPlayList;
    private List<Song> songPlaylist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songPlaylist = new LinkedList<>();
    }

    public boolean addSongToPlaylist(Album album, Song song) {
        if(!isSongAndAlbumValid(album, song)) {
            return false;
        }

        System.out.println(song.getSongName() + " added to playlist " + playlistName);
        songPlaylist.add(song);
        return true;
    }

    boolean isSongAndAlbumValid(Album albumToCheck, Song songToCheck) {
        if(!isAlbumValid(albumToCheck)) {
            return false;
        }

        if(!albumToCheck.isSongInAlbum(songToCheck)) {
            return false;
        }

        return true;

    }

    boolean isAlbumValid(Album albumToCheck) {
        if(albumToCheck == null) {
            System.out.println("Album cannot be null");
            return false;
        }

        if(songsInPlayList.contains(albumToCheck)) {
            return false;
        }

        Iterator<Album> iterator = songsInPlayList.listIterator();
        while (iterator.hasNext()) {
            if(albumToCheck.getAlbumUID() == iterator.next().getAlbumUID()) {
                System.out.println("Album is already part of playlist");
                return false;
            }
        }

        return true;
    }

    void printSongsInPlaylist(){
        ListIterator<Song> iterator = songPlaylist.listIterator();
        System.out.println("\n Songs in Playlist: " + getPlaylistName());

        while (iterator.hasNext()) {
            System.out.println("Song: " + iterator.next().getSongName() +
                    ", Song UID: " + iterator.next().getSongName());
        }
    }


    public String getPlaylistName() {
        return playlistName;
    }

    public List<Album> getSongsInPlayList() {
        return songsInPlayList;
    }

    public List<Song> getSongPlaylist() {
        return songPlaylist;
    }
}
