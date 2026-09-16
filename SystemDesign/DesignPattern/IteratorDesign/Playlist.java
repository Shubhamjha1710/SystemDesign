package DesignPattern.IteratorDesign;

import java.util.*;

public class Playlist implements Iterable<Song>{
    List<Song> songs;

    Playlist() {
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song newSong) {
        songs.add(newSong);
    }

    @Override
    public Iterator<Song> createIterator() {
        return new PlaylistIterator(songs);
    }
}
