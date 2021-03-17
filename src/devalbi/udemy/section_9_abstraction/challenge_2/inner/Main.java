package devalbi.udemy.section_9_abstraction.challenge_2.inner;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSongToAlbum("Stormbringer", 4.6);
        album.addSongToAlbum("Hold on", 5.6);
        album.addSongToAlbum("Lady double dealer", 3.21);
        album.addSongToAlbum("You can't do it right", 6.23);
        album.addSongToAlbum("High ball shooter", 4.27);
        album.addSongToAlbum("The gypsy", 4.2);
        album.addSongToAlbum("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSongToAlbum("For those about to rock", 5.44);
        album.addSongToAlbum("I put the finger on you", 3.25);
        album.addSongToAlbum("Lets go", 3.45);
        album.addSongToAlbum("Inject the venom", 3.33);
        album.addSongToAlbum("Snowballed", 4.51);
        album.addSongToAlbum("Evil walks", 3.45);
        album.addSongToAlbum("C.O.D.", 5.25);
        album.addSongToAlbum("Breaking the rules", 5.32);
        album.addSongToAlbum("Night of the long knives", 5.12);
        albums.add(album);

        Album.SongList songList = album.new SongList();

        album.printSongList();

    }
}
