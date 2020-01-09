package devalbi.udemy.section_8_lists.challenges.linkedlist;

import java.util.ArrayList;

public class Album {

    private ArrayList<Song> album = new ArrayList<Song>();
    private String name;

    public Album(ArrayList<Song> album, String name) {
        this.album = album;
        this.name = name;
    }

    public Album(String name) {
        this.name = name;
        this.album = new ArrayList<Song>();
    }

    public void addSongToAlbum(Song song){
        Song newSong = findSongByName(song.getName());
        if((newSong == null) && (song != null)){
            album.add(song);
        }
    }

    public Song findSongByName(String songName){
        for(Song song : album){
            if(song.getName().toLowerCase().equals(songName.toLowerCase())){
                return song;
            }
        }
        return null;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }
}
