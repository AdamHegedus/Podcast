package com.limitless.audio.podcast.file.mp3.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class Mp3Factory {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Mp3Adapter adapter;

    /**
     * Sets the Mp3Adapter as an adapter to get mp3 data.
     * @param adapter the Mp3Adapter to get data from
     */
    public Mp3Factory(final Mp3Adapter adapter) {
        super();
        this.adapter = adapter;
    }

    /**
     * Builds Mp3 object and return an instance of it.
     * @return Mp3
     */
    public Mp3 getMp3() {
        final Mp3Builder builder = new Mp3Builder();
        builder.setArtist(adapter.getArtist());
        builder.setAlbum(adapter.getAlbum());
        builder.setTitle(adapter.getTitle());
        builder.setTrack(adapter.getTrack());
        builder.setBitrate(adapter.getBitrate());
        builder.setSamplerate(adapter.getSampleRate());
        builder.setDuration(adapter.getLengthInSeconds());
        builder.setFilesize(adapter.getFilesize());
        logger.debug(this.getClass().getName() + " mp3 data built.");
        return builder.build();
    }
}
