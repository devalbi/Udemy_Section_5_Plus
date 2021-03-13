package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String playlistName;
    private List<Song> songPlaylist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songPlaylist = new LinkedList<>();
    }

    boolean addSongToPlaylist(Album album, Song song) {
        if(!isSongAndAlbumValidForPlaylist(album, song)) {
            return false;
        }

        System.out.println(song.getSongName() + " added to playlist " + playlistName);
        songPlaylist.add(song);
        return true;
    }


    boolean isSongAndAlbumValidForPlaylist(Album albumToCheck, Song songToCheck) {
        if(albumToCheck == null) {
            return false;
        }

        if(!albumToCheck.isSongValid(songToCheck)) {
            return false;
        }

        if(isSongInPlayListCheckByUID(songToCheck)) {
            return false;
        }

        if(!isSongInAlbumByUID(albumToCheck, songToCheck)) {
            return false;
        }

        return true;

    }

    boolean isSongInAlbumByUID(Album album, Song song) {

        ListIterator<Song> iterator = album.getAlbumList().listIterator();
        while(iterator.hasNext()) {
            Song nextSong = iterator.next();

            if(song.getSongUID() == nextSong.getSongUID()) {
                return true;
            }
        }
        return false;
    }

    boolean isSongInPlayListCheckByUID(Song song) {

        ListIterator<Song> iterator = songPlaylist.listIterator();
        while(iterator.hasNext()) {
            Song nextSong = iterator.next();

            if(song.getSongUID() == nextSong.getSongUID()) {
                return true;
            }
        }
        return false;
    }

    void printSongsInPlaylist(){
        ListIterator<Song> iterator = songPlaylist.listIterator();
        System.out.println("\nSongs in Playlist: " + getPlaylistName());

        while (iterator.hasNext()) {
            Song nextSong = iterator.next();
            System.out.println("Song: " + nextSong.getSongName() +
                    ", Song UID: " + nextSong.getSongUID());
        }
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public List<Song> getSongPlaylist() {
        return songPlaylist;
    }

    void startMenu() {
        Scanner scanner = new Scanner(System.in);
        printPlaylistOptions();

        ListIterator<Song> iterator = songPlaylist.listIterator();
        boolean continuePlaylistLoop = true;
        boolean goingForward = true;

        if(songPlaylist.isEmpty()) {
            System.out.println("There are no cities in th playlist");
        } else {
            System.out.println("Select Your Option");
        }

        while (continuePlaylistLoop) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    if(!goingForward)
                    {
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        goingForward = true;
                    }

                    System.out.println("Skip Forward");
                    if(!iterator.hasNext())
                    {
                        System.out.println("End of the playlist");
                        System.out.println(iterator.previous().toString());

                    } else {
                        System.out.println(iterator.next().toString());
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        goingForward = false;
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println("Skip Backwards");
                        System.out.println(iterator.previous().toString());
                    } else {

                        System.out.println("At the start of the playlist.");
                        System.out.println(iterator.next().toString());
                        goingForward = true;
                    }
                    break;
                case 3:
                    System.out.println("Replay Current Song");
                    if (goingForward) {
                        if(iterator.hasPrevious()) {
                            System.out.println(iterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println(iterator.next().toString());
                        }
                    } else {
                        if(iterator.hasNext()) {
                            System.out.println(iterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println(iterator.previous().toString());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Removing Current Song");
                    if(goingForward) {
                        if(!iterator.hasNext()) {
                            System.out.println("Removing song" + iterator.previous().toString());
                            iterator.remove();
                            break;
                        } else if (!iterator.hasPrevious()) {
                            System.out.println("Removing song" + iterator.next().toString());
                            iterator.remove();
                            break;
                        }
                        iterator.previous();
                        System.out.println("Removing song" + iterator.next().toString());
                    } else {
                        iterator.next();
                        System.out.println("Removing song" + iterator.previous().toString());
                    }
                    iterator.remove();
                    break;
                case 5:
                    System.out.println("Print Playlist");
                    printSongsInPlaylist();
                    break;
                case 6:
                    System.out.println("Print Options");
                    printPlaylistOptions();
                    break;
                case 0:
                    System.out.println("Exiting");
                    continuePlaylistLoop = false;
                    break;
                default:
                    break;

            }
        }
    }

    void printPlaylistOptions() {
        System.out.println("Playlist Options: \n" +
                "1. Skip Forward \n" +
                "2. Skip Backwards \n" +
                "3. Replay Current Song \n" +
                "4. Remove Current Song \n" +
                "5. Print Playlist \n \n" +
                "6. Print Options" +
                "0. Exit");
    }
}
