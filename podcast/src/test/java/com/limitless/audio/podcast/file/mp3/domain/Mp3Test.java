package com.limitless.audio.podcast.file.mp3.domain;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.file.mp3.support.Mp3Builder;

public class Mp3Test {

    private Mp3 underTest;

    @Mock
    private Mp3Builder builder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(builder.getAlbum()).thenReturn("ALBUM");
        Mockito.when(builder.getArtist()).thenReturn("ARTIST");
        Mockito.when(builder.getBitrate()).thenReturn(320);
        Mockito.when(builder.getFilesize()).thenReturn(123123123L);
        Mockito.when(builder.getSamplerate()).thenReturn(44100);
        Mockito.when(builder.getTitle()).thenReturn("TITLE");
        Mockito.when(builder.getTrack()).thenReturn("2");

    }

    @Test
    public void testGetDurationFormattedWhenLessThanOneMinute() {
        // GIVEN
        final String expected = "9";
        Mockito.when(builder.getDuration()).thenReturn(9L);
        underTest = new Mp3(builder);
        // WHEN
        final String actual = underTest.getDurationFormatted();
        // THEN
        Assert.assertEquals(expected, actual);
        Mockito.verify(builder).getAlbum();
        Mockito.verify(builder).getArtist();
        Mockito.verify(builder).getBitrate();
        Mockito.verify(builder).getDuration();
        Mockito.verify(builder).getFilesize();
        Mockito.verify(builder).getSamplerate();
        Mockito.verify(builder).getTitle();
        Mockito.verify(builder).getTrack();
    }

    @Test
    public void testGetDurationFormattedWhenLessThanOneHour() {
        // GIVEN
        final String expected = "1:12";
        Mockito.when(builder.getDuration()).thenReturn(72L);
        underTest = new Mp3(builder);
        // WHEN
        final String actual = underTest.getDurationFormatted();
        // THEN
        Assert.assertEquals(expected, actual);
        Mockito.verify(builder).getAlbum();
        Mockito.verify(builder).getArtist();
        Mockito.verify(builder).getBitrate();
        Mockito.verify(builder).getDuration();
        Mockito.verify(builder).getFilesize();
        Mockito.verify(builder).getSamplerate();
        Mockito.verify(builder).getTitle();
        Mockito.verify(builder).getTrack();
    }

    @Test
    public void testGetDurationFormattedWhenMoreThanOneHour() {
        // GIVEN
        final String expected = "1:01:12";
        Mockito.when(builder.getDuration()).thenReturn(3672L);
        underTest = new Mp3(builder);
        // WHEN
        final String actual = underTest.getDurationFormatted();
        // THEN
        Assert.assertEquals(expected, actual);
        Mockito.verify(builder).getAlbum();
        Mockito.verify(builder).getArtist();
        Mockito.verify(builder).getBitrate();
        Mockito.verify(builder).getDuration();
        Mockito.verify(builder).getFilesize();
        Mockito.verify(builder).getSamplerate();
        Mockito.verify(builder).getTitle();
        Mockito.verify(builder).getTrack();
    }

}
