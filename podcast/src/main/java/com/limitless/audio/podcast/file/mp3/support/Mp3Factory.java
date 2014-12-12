package com.limitless.audio.podcast.file.mp3.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class Mp3Factory {

    private final Logger logger = LoggerFactory.getLogger(Mp3Factory.class);
    private final Mp3Adapter adapter;

    /**
     * @param adapter
     */
    public Mp3Factory(final Mp3Adapter adapter) {
        super();
        this.adapter = adapter;
    }

    /**
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
        return builder.build();
    }
}
