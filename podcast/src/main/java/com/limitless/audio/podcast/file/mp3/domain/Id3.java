package com.limitless.audio.podcast.file.mp3.domain;

import com.mpatric.mp3agic.ID3v2;

public class Id3 {
    private final ID3v2 id3;

    /**
     * Sets the ID3.
     * @param id3 the ID3 tag of the mp3
     */
    public Id3(final ID3v2 id3) {
        super();
        this.id3 = id3;
    }

    /**
     * Gets the album.
     * @return album
     */
    public String getAlbum() {
        return id3.getAlbum();
    }

    /**
     * Gets the artist.
     * @return artist
     */
    public String getArtist() {
        return id3.getArtist();
    }

    /**
     * Gets the title.
     * @return title
     */
    public String getTitle() {
        return id3.getTitle();
    }

    /**
     * Gets the track number.
     * @return track number
     */
    public String getTrack() {
        return id3.getTrack();
    }

}
