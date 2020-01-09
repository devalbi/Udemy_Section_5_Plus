package devalbi.udemy.section_8_lists.challenges.linkedlist;

import devalbi.udemy.section_7_oop_2.work.encapsulation.Player;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist("Arron's Playlist");

        Album am = new Album("AM");
        Album californication = new Album("Californication");

        playlist.addAlbumToAlbumList(am);
        playlist.addAlbumToAlbumList(californication);

        Song amSong1 = new Song("Dance Little Liar", 4.43d);
        Song amSong2 = new Song("Crying Lightning", 3.45d);
        Song amSong3 = new Song("Secret Door", 3.43d);
/*
        Song amSong4 = new Song("Pretty Visitors", 3.41d);

        Song calSong1 = new Song("Scar Tissue", 3.36d);
        Song calSong2 = new Song("Get On Top", 3.18d);
        Song calSong3 = new Song("Otherside", 4.15d);
        Song calSong4 = new Song("Porcelain", 2.44d);
*/

        Song indySong = new Song("Independent", 6.45d);

        am.addSongToAlbum(amSong1);
        am.addSongToAlbum(amSong2);
        am.addSongToAlbum(amSong3);
/*        californication.addSongToAlbum(calSong1);
        californication.addSongToAlbum(calSong2);
        californication.addSongToAlbum(calSong3);
        californication.addSongToAlbum(calSong4);*/

        playlist.addSongToPlaylist("dance little liar");
        playlist.addSongToPlaylist("crying Lightning");
        playlist.addSongToPlaylist("Secret Door", "am");
        playlist.addSongToPlaylist("prety visitors"); //Spelt incorrectly to ensure test if it is omitted as expected

/*        playlist.addSongToPlaylist("Scar Tissue", "californication");
        playlist.addSongToPlaylist("Get on Top", "Californication");
        playlist.addSongToPlaylist("Otherside");
        playlist.addSongToPlaylist("Porcelain", "AM");*/


        playlist.addSongToPlaylist("Independent");

        playlist.printSongsInPlaylist();
        //am.addSongToAlbum(amSong4);
        playlist.addSongToPlaylist("Porcelain", "Californication");
        playlist.printSongsInPlaylist();




    }
}
