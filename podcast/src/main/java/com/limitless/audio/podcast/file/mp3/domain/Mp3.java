package com.limitless.audio.podcast.file.mp3.domain;

import com.limitless.audio.podcast.file.mp3.support.Mp3Builder;

public class Mp3 {

    private static final int TWO_CHARACTERS = 2;
    private static final int SECONDS_IN_HOUR = Integer.valueOf(3600);
    private static final int MINUTES_IN_HOUR = Integer.valueOf(60);

    private int bitrate;
    private int samplerate;
    private String artist;
    private String title;
    private String album;
    private String track;
    private long duration;
    private long filesize;

    /**
     * Sets attributes via builder.
     * @param builder Builder class for setting up parameters
     */
    public Mp3(final Mp3Builder builder) {
        this.bitrate = builder.getBitrate();
        this.samplerate = builder.getSamplerate();
        this.artist = builder.getArtist();
        this.title = builder.getTitle();
        this.album = builder.getAlbum();
        this.track = builder.getTrack();
        this.duration = builder.getDuration();
        this.filesize = builder.getFilesize();
    }

    /**
     * Gets the bitrate.
     * @return bitrate
     */
    public int getBitrate() {
        return bitrate;
    }

    /**
     * Sets the bitrate.
     * @param bitrate the bitrate of the mp3
     */
    public void setBitrate(final int bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Gets the samplerate.
     * @return samplerate
     */
    public int getSamplerate() {
        return samplerate;
    }

    /**
     * Sets the samplerate.
     * @param samplerate the samplerate of the mp3
     */
    public void setSamplerate(final int samplerate) {
        this.samplerate = samplerate;
    }

    /**
     * Gets the artist.
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist.
     * @param artist the artist field of the mp3
     */
    public void setArtist(final String artist) {
        this.artist = artist;
    }

    /**
     * Gets the title.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * @param title the title field of the mp3
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the album.
     * @return album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Sets the album.
     * @param album the album field of the mp3
     */
    public void setAlbum(final String album) {
        this.album = album;
    }

    /**
     * Gets the track number.
     * @return track number
     */
    public String getTrack() {
        return track;
    }

    /**
     * Sets the track number.
     * @param track the track number of the mp3
     */
    public void setTrack(final String track) {
        this.track = track;
    }

    /**
     * Gets the track's length in seconds.
     * @return duration
     */
    public long getDuration() {
        return duration;
    }

    /**
     * Sets the track's length in seconds.
     * @param duration the duration in seconds
     */
    public void setDuration(final long duration) {
        this.duration = duration;
    }

    /**
     * Gets the file size.
     * @return file size
     */
    public long getFilesize() {
        return filesize;
    }

    /**
     * Sets the file size.
     * @param filesize the filesize in Bytes
     */
    public void setFilesize(final long filesize) {
        this.filesize = filesize;
    }

    /**
     * Gets the duration of the track formatted as HH:mm:ss.
     * @return the formatted duration as {@link String}
     */
    public String getDurationFormatted() {

        final StringBuilder result = new StringBuilder();

        if (!isLessThanOneMinute()) {
            if (!isLessThanOneHour()) {
                result.append(getDurationHours());
                result.append(":");
                result.append(addLeadingZeroIfLessThanTen(Integer
                        .toString(getDurationMinutes())));
                result.append(":");
            } else {
                result.append(Integer.toString(getDurationMinutes()));
                result.append(":");
            }
            result.append(addLeadingZeroIfLessThanTen(Integer
                    .toString(getDurationSeconds())));
        } else {
            result.append(Integer.toString(getDurationSeconds()));
        }
        return result.toString();
    }

    private String addLeadingZeroIfLessThanTen(final String text) {
        return text.length() < TWO_CHARACTERS ? "0" + text : text;
    }

    private boolean isLessThanOneHour() {
        return duration < SECONDS_IN_HOUR;
    }

    private boolean isLessThanOneMinute() {
        return duration < MINUTES_IN_HOUR;
    }

    private int getDurationHours() {
        return (int) (duration / SECONDS_IN_HOUR);
    }

    private int getDurationMinutes() {
        return (int) (duration % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }

    private int getDurationSeconds() {
        return (int) (duration % MINUTES_IN_HOUR);
    }

}
