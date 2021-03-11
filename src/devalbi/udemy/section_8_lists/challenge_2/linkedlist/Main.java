package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

public class Main {

    public static void main(String[] args) {

        Album album = new Album("Greatest Hits");

        Song song1 = album.createSong("Oh Ye", 02.00);
        Song song2 = album.createSong("Oh Ye", 02.00);
        Song song3 = album.createSong("Hit em up", 3.50);
        Song song4 = album.createSong("Crying", 5.45);
        Song song5 = album.createSong("You and Me", 4.00);
        Song song6 = album.createSong("Mission Impossible", 7.00);
        Song song7 = album.createSong("Mission Impossible", 7.10);
        Song song8 = album.createSong("Mission Impossible 2.0", 7.00);
        Song song9 = album.createSong("", 00);

        album.addSongToAlbum(song1);
        album.addSongToAlbum(song2);
        album.addSongToAlbum(song3);
        album.addSongToAlbum(song4);
        album.addSongToAlbum(song5);
        album.addSongToAlbum(song6);
        album.addSongToAlbum(song7);
        album.addSongToAlbum(song8);
        album.addSongToAlbum(song9);


        album.printSongsInAlbum();

    }

}
