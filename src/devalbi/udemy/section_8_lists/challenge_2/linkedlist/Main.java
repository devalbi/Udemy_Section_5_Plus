package devalbi.udemy.section_8_lists.challenge_2.linkedlist;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist("2021 Charts");

        Album album1 = new Album("Greatest Hits");
        Album album2 = new Album("Greatest Hits");

        Song song1 = album1.createSong("Oh Ye", 02.00);
        Song song2 = album1.createSong("Oh Ye", 02.00);
        Song song3 = album1.createSong("Hit em up", 3.50);
        Song song4 = album1.createSong("Crying", 5.45);
        Song song5 = album2.createSong("You and Me", 4.00);
        Song song6 = album2.createSong("Mission Impossible", 7.00);
        Song song7 = album2.createSong("Mission Impossible", 7.10);
        Song song8 = album2.createSong("Mission Impossible 2.0", 7.00);
        Song song9 = album2.createSong("", 00);

        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album1.addSongToAlbum(song3);
        album1.addSongToAlbum(song4);
        album2.addSongToAlbum(song5);
        album2.addSongToAlbum(song6);
        album2.addSongToAlbum(song7);
        album2.addSongToAlbum(song8);
        album2.addSongToAlbum(song9);
        album2.addSongToAlbum(song6);


        album1.printSongsInAlbum();
        album2.printSongsInAlbum();

        playlist.addSongToPlaylist(album1, song1);
        playlist.addSongToPlaylist(album1, song2);
        playlist.addSongToPlaylist(album1, song3);
        playlist.addSongToPlaylist(album1, song4);
        playlist.addSongToPlaylist(album1, song4);
        playlist.addSongToPlaylist(album1, song5);

        playlist.addSongToPlaylist(album2, song9);
        playlist.addSongToPlaylist(album2, song5);
        playlist.addSongToPlaylist(album2, song6);
        playlist.addSongToPlaylist(album2, song7);
        playlist.addSongToPlaylist(album2, song8);

        playlist.printSongsInPlaylist();


    }

}
