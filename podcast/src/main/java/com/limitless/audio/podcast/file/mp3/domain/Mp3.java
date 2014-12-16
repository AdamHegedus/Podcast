package com.limitless.audio.podcast.file.mp3.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.file.mp3.support.Mp3Builder;

public class Mp3 {

    private final Logger logger = LoggerFactory.getLogger(Mp3.class);

    private final static int TWO_CHARACTERS = 2;
    private final static int SECONDS_IN_HOUR = Integer.valueOf(3600);
    private final static int MINUTES_IN_HOUR = Integer.valueOf(60);

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
        logger.debug(this.getClass().getName()
                + " constructor sets parameter bitrate as " + this.bitrate);
        this.samplerate = builder.getSamplerate();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter samplerate as "
                + this.samplerate);
        this.artist = builder.getArtist();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter artist as " + this.artist);
        this.title = builder.getTitle();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter title as " + this.title);
        this.album = builder.getAlbum();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter album as " + this.album);
        this.track = builder.getTrack();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter track as " + this.track);
        this.duration = builder.getDuration();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter duration as " + this.duration);
        this.filesize = builder.getFilesize();
        logger.debug(this.getClass().getName()
                + " constructor sets parameter filesize as " + this.filesize);
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
                processWhenDurationIsMoreThanOneHour(result);
            } else {
                processWhenDurationIsBetweenOneHourAndOneMinute(result);
            }
        } else {
            processWhenDurationIsLessThanOneMinute(result);
        }

        logger.debug(this.getClass().getName() + " gets duration of "
                + this.duration + " formatted to " + result.toString());
        return result.toString();
    }

    private void processWhenDurationIsBetweenOneHourAndOneMinute(
            final StringBuilder result) {
        result.append(Integer.toString(getDurationMinutes()));
        result.append(":");
        result.append(addLeadingZeroIfLessThanTen(Integer
                .toString(getDurationSeconds())));
    }

    private void processWhenDurationIsMoreThanOneHour(final StringBuilder result) {
        result.append(getDurationHours());
        result.append(":");
        result.append(addLeadingZeroIfLessThanTen(Integer
                .toString(getDurationMinutes())));
        result.append(":");
        result.append(addLeadingZeroIfLessThanTen(Integer
                .toString(getDurationSeconds())));
    }

    private void processWhenDurationIsLessThanOneMinute(
            final StringBuilder result) {
        result.append(Integer.toString(getDurationSeconds()));
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
