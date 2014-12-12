package com.limitless.audio.podcast.file.mp3.support;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class Mp3FactoryTest {
    private Mp3Factory underTest;

    @Mock
    private Mp3Adapter adapter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMp3() {
        // GIVEN
        underTest = new Mp3Factory(adapter);
        final String album = "ALBUM";
        final String artist = "ARTIST";
        final int bitrate = 320;
        final long duration = 3700L;
        final long filesize = 1000000L;
        final int samplerate = 44100;
        final String title = "TITLE";
        final String track = "12";

        Mockito.when(adapter.getAlbum()).thenReturn(album);
        Mockito.when(adapter.getArtist()).thenReturn(artist);
        Mockito.when(adapter.getBitrate()).thenReturn(bitrate);
        Mockito.when(adapter.getLengthInSeconds()).thenReturn(duration);
        Mockito.when(adapter.getFilesize()).thenReturn(filesize);
        Mockito.when(adapter.getSampleRate()).thenReturn(samplerate);
        Mockito.when(adapter.getTitle()).thenReturn(title);
        Mockito.when(adapter.getTrack()).thenReturn(track);

        // WHEN
        final Mp3 actual = underTest.getMp3();
        // THEN
        Assert.assertEquals(album, actual.getAlbum());
        Assert.assertEquals(artist, actual.getArtist());
        Assert.assertEquals(bitrate, actual.getBitrate());
        Assert.assertEquals(duration, actual.getDuration());
        Assert.assertEquals(filesize, actual.getFilesize());
        Assert.assertEquals(samplerate, actual.getSamplerate());
        Assert.assertEquals(title, actual.getTitle());
        Assert.assertEquals(track, actual.getTrack());

    }
}
