package DesignPattern.IteratorDesign;

import java.util.List;

public class PlaylistIterator implements Iterator<Song> {
    int idx = 0;
    List<Song> songs;

    PlaylistIterator(List<Song> songs) {
        this.songs = songs;
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < songs.size();
    }

    @Override
    public Song getNext() {
        return songs.get(idx++);
    }
}
