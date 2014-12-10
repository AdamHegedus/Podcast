package com.limitless.audio.podcast.file.mp3.domain;

import java.io.IOException;

import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class Mp3Factory {
    public Mp3File getFile(final String filename) {
        try {
            return new Mp3File(filename);
        } catch (final UnsupportedTagException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final InvalidDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public ID3v2 getId3(final String filename) {
        try {
            return new Mp3File(filename).getId3v2Tag();
        } catch (final UnsupportedTagException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final InvalidDataException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
