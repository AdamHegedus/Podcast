package com.limitless.audio.podcast.file.mp3.support;

import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class Mp3Builder {
    private int bitrate;
    private int samplerate;
    private String artist;
    private String title;
    private String album;
    private String track;
    private long duration;
    private long filesize;

    /**
     * Gets the bitrate.
     * @return the bitrate
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * Sets the bitrate.
     * @param bitrate the bitrate of the mp3
     * @return this
     */
    public Mp3Builder setBitrate(final int bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Gets the samplerate.
     * @return the samplerate
     */
    public int getSamplerate() {
        return samplerate;
    }

    /**
     * Sets the samplerate.
     * @param samplerate the samplerate of the mp3
     * @return this
     */
    public Mp3Builder setSamplerate(final int samplerate) {
        this.samplerate = samplerate;
        return this;
    }

    /**
     * Gets the artist.
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist.
     * @param artist the artist field of the mp3
     * @return this
     */
    public Mp3Builder setArtist(final String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * Gets the title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * @param title the title field of the mp3
     * @return this
     */
    public Mp3Builder setTitle(final String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets the album.
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Sets the album.
     * @param album the album field of the mp3
     * @return this
     */
    public Mp3Builder setAlbum(final String album) {
        this.album = album;
        return this;
    }

    /**
     * Gets the track number.
     * @return the track
     */
    public String getTrack() {
        return track;
    }

    /**
     * Sets the track number.
     * @param track the track number of the mp3
     * @return this
     */
    public Mp3Builder setTrack(final String track) {
        this.track = track;
        return this;
    }

    /**
     * Gets the track's length in seconds.
     * @return the duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the track's length in seconds.
     * @param duration the duration in seconds
     * @return this
     */
    public Mp3Builder setDuration(final long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Gets the file size.
     * @return the filesize
     */
    public long getFilesize() {
        return filesize;
    }

    /**
     * Sets the file size.
     * @param filesize the filesize in Bytes
     * @return this
     */
    public Mp3Builder setFilesize(final long filesize) {
        this.filesize = filesize;
        return this;
    }

    /**
     * Gets the built item.
     * @return a new Mp3 instance
     */
    public Mp3 build() {
        return new Mp3(this);
    }
}
