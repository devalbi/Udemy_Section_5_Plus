package devalbi.udemy.section_8_lists.challenges.linkedlist;

import devalbi.udemy.section_8_lists.work.array.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist{

    private ArrayList<Album> albums;
    private String name;
    private LinkedList<Song> playlist;

    public Playlist(String name) {
        this.albums = new ArrayList<Album>();
        this.name = name;
        this.playlist = new LinkedList<Song>();
    }


    public void addSongToPlaylist(String songName){
        for(Album album : albums){
            Song song = album.findSongByName(songName);
            if((song != null) && (!playlist.contains(song))){
                playlist.add(song);
                return;
            } else {
            System.out.println("Cannot add song " + songName);
            return;
        }
        }
    }

    public void addSongToPlaylist(String songName, String albumName){
        Album album = findAlbum(albumName);
        Song song = album.findSongByName(songName);
        if((song != null) && (!playlist.contains(song))){
            playlist.add(song);
        } else {
            System.out.println("Cannot add song " + songName);
        }
    }

    public void addAlbumToAlbumList(Album album){
        String albumName = album.getName();
        Album existingAlbum = findAlbum(albumName);
        if(existingAlbum == null){
           albums.add(album);
        } else {
            System.out.println("Album already in Album list.");
        }
    }

    private Album findAlbum(String albumName){
        for(Album album : albums){
            if(album.getName().toLowerCase().equals(albumName.toLowerCase())){
                return album;
            }
        }
        return null;
    }

    /*Not iterating as expected. Randomly picking songs, some that should not be added to playlist.
    * Need to investigate how iterator is iterating through LinkedList 'playlist'*/
    public void runPlaylist(){
        ListIterator<Song> iterator = playlist.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean goingForward = true;
        boolean quit = false;

        if(playlist.isEmpty()) { //Checking to see if playlist is empty before starting.
            System.out.printf("Playlist is empty, cannot start");
            return;
        }
        iterator.next();

        System.out.println(options());
        System.out.println();
        while (!quit){
            System.out.println("\nPick your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    System.out.println("Exiting playlist.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        goingForward= true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Playing next song: " + iterator.next().getName());
                    } else {
                        System.out.println("No more songs left in playlist.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        goingForward = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.printf("Rewinding to previous song: " + iterator.previous().getName());
                    } else{
                        System.out.println("At the start of the playlist.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(iterator.hasPrevious()) {
                            System.out.println("Replaying current song: " + iterator.previous());
                            goingForward = false;
                        } else {
                            System.out.println("Replaying current song: " + iterator.next());
                        }
                    } else {
                        if(iterator.hasNext()) {
                            System.out.println("Replaying current song: " + iterator.next());
                            goingForward = true;
                        } else {
                            System.out.println("Replaying current song: " + iterator.previous());
                        }
                    }
                    break;
                case 4:
                    if(playlist.size() > 0) {
                        if (goingForward) {
                            System.out.println("Removing song: " + iterator.previous());
                        } else {
                            System.out.println("Removing song: " + iterator.next());
                        }
                        iterator.remove();
                    }
                    break;
                case 5:
                    printSongsInPlaylist();
                    break;
                case 6:
                    System.out.println(options());
                    break;
            }

        }
    }

    private String options(){
        return "Press 0 - To Exit\n" +
                "Press 1 - Skip to Next Song\n" +
                "Press 2 - Skip Back to previous song\n" +
                "Press 3 - Replay Current Song\n" +
                "Press 4 - Remove Song from playlist\n" +
                "Press 5 - Print out Playlist.\n" +
                "Press 6 - Print out options";
    }

    public void printSongsInPlaylist(){
        ListIterator<Song> iterator = playlist.listIterator();
        if(playlist.isEmpty()){
            System.out.println("No songs in the playlist " + getName());
            return;
        }
        System.out.println("Playlist: \n");
        while(iterator.hasNext()){
            if(iterator.hasNext()) {
                System.out.println("Song name: " + iterator.next().getName());
            }
        }
        System.out.println("===========================================");
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }
}