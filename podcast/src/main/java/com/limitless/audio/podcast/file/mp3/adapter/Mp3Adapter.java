package com.limitless.audio.podcast.file.mp3.adapter;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class Mp3Adapter {
    private final Logger logger = LoggerFactory.getLogger(Mp3Adapter.class);
    private Mp3File mp3;
    private ID3v2 id3;

    /**
     * Default constructor.
     */
    public Mp3Adapter() {
        super();
        logger.debug(this.getClass().getName() + " instantiated.");
    }

    /**
     * Sets the mp3 file.
     * @param mp3 the file
     */
    public Mp3Adapter(final Mp3File mp3) {
        super();
        this.mp3 = mp3;
        logger.debug(this.getClass().getName()
                + " constructor sets Mp3File as " + mp3.toString());
    }

    /**
     * Sets the mp3 file by its filename.
     * @param filename the filename of the mp3 file
     */
    public void setMp3(final String filename) {
        try {
            this.mp3 = new Mp3File(filename);
            this.id3 = mp3.getId3v2Tag();
        } catch (final UnsupportedTagException e) {
            logger.error(e.toString());
        } catch (final InvalidDataException e) {
            logger.error(e.toString());
        } catch (final IOException e) {
            logger.error(e.toString());
        }
    }

    /**
     * Sets the mp3 file by given file parameter.
     * @param file the mp3 file
     */
    public void setMp3ByFile(final File file) {
        try {
            this.mp3 = new Mp3File(file);
            this.id3 = mp3.getId3v2Tag();
        } catch (final UnsupportedTagException e) {
            logger.error(e.toString());
        } catch (final InvalidDataException e) {
            logger.error(e.toString());
        } catch (final IOException e) {
            logger.error(e.toString());
        }
    }

    /**
     * Gets the bitrate.
     * @return bitrate
     */
    public int getBitrate() {
        logger.debug(this.getClass().getName() + " gets bitrate as "
                + mp3.getBitrate());
        return mp3.getBitrate();
    }

    /**
     * Gets the sample rate.
     * @return sample rate
     */
    public int getSampleRate() {
        logger.debug(this.getClass().getName() + " gets samplerate as "
                + mp3.getSampleRate());
        return mp3.getSampleRate();
    }

    /**
     * Gets the file size.
     * @return file size
     */
    public long getFilesize() {
        logger.debug(this.getClass().getName() + " gets filesize as "
                + mp3.getLength());
        return mp3.getLength();
    }

    /**
     * Gets the track's length in seconds.
     * @return track's length
     */
    public long getLengthInSeconds() {
        logger.debug(this.getClass().getName() + " gets length in seconds as "
                + mp3.getLengthInSeconds());
        return mp3.getLengthInSeconds();
    }

    /**
     * Gets the album.
     * @return album
     */
    public String getAlbum() {
        logger.debug(this.getClass().getName() + " gets album field as "
                + id3.getAlbum());
        return id3.getAlbum();
    }

    /**
     * Gets the artist.
     * @return artist
     */
    public String getArtist() {
        logger.debug(this.getClass().getName() + " gets artist field as "
                + id3.getArtist());
        return id3.getArtist();
    }

    /**
     * Gets the title.
     * @return title
     */
    public String getTitle() {
        logger.debug(this.getClass().getName() + " gets title field as "
                + id3.getTitle());
        return id3.getTitle();
    }

    /**
     * Gets the track number.
     * @return track number
     */
    public String getTrack() {
        logger.debug(this.getClass().getName() + " gets track field as "
                + id3.getTrack());
        return id3.getTrack();
    }
}
