package com.limitless.audio.podcast.file.mp3.domain;

import com.mpatric.mp3agic.Mp3File;

public class Mp3 {

    private final Mp3File mp3;

    /**
     * Sets the mp3 file.
     * @param mp3 the file
     */
    public Mp3(final Mp3File mp3) {
        super();
        this.mp3 = mp3;
    }

    /**
     * Gets the bitrate.
     * @return bitrate
     */
    public int getBitrate() {
        return mp3.getBitrate();
    }

    /**
     * Gets the sample rate
     * @return sample rate
     */
    public int getSampleRate() {
        return mp3.getSampleRate();
    }

    /**
     * Gets the file size.
     * @return file size
     */
    public long getLength() {
        return mp3.getLength();
    }

    /**
     * Gets the track's length in seconds.
     * @return track's length
     */
    public long getLengthInSeconds() {
        return mp3.getLengthInSeconds();
    }
}
