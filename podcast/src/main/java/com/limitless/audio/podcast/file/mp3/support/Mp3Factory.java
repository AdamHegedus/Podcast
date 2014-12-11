package com.limitless.audio.podcast.file.mp3.support;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.file.mp3.adapter.Id3Adapter;
import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class Mp3Factory {

    private final Logger logger = LoggerFactory.getLogger(Mp3Factory.class);

    public Mp3File getFile(final String filename) {
        try {
            return new Mp3File(filename);
        } catch (final UnsupportedTagException e) {
            logger.error(e.toString());
        } catch (final InvalidDataException e) {
            logger.error(e.toString());
        } catch (final IOException e) {
            logger.error(e.toString());
        }
        return null;
    }

    public ID3v2 getId3(final String filename) {
        try {
            return new Mp3File(filename).getId3v2Tag();
        } catch (final UnsupportedTagException e) {
            logger.error(e.toString());
        } catch (final InvalidDataException e) {
            logger.error(e.toString());
        } catch (final IOException e) {
            logger.error(e.toString());
        }
        return null;
    }

    public Mp3 getMp3(final String filename) {
        final Mp3Builder builder = new Mp3Builder();
        final Mp3Adapter mp3 = new Mp3Adapter(this.getFile(filename));
        final Id3Adapter id3 = new Id3Adapter(this.getId3(filename));
        builder.setArtist(id3.getArtist());
        builder.setAlbum(id3.getAlbum());
        builder.setTitle(id3.getTitle());
        builder.setTrack(id3.getTrack());
        builder.setBitrate(mp3.getBitrate());
        builder.setSamplerate(mp3.getSampleRate());
        builder.setDuration(mp3.getLengthInSeconds());
        builder.setFilesize(mp3.getFilesize());
        return builder.build();
    }
}
