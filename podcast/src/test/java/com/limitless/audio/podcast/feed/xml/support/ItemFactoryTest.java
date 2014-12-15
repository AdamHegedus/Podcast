package com.limitless.audio.podcast.feed.xml.support;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class ItemFactoryTest {

    private ItemFactory underTest;

    @Mock
    private Mp3 mp3;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetItem() {
        // GIVEN

        final String baseUrl = "http://furfriction.com/podcast/";
        final String url = "http://furfriction.com/podcast/ALBUM%202%20ARTIST%20-%20TITLE.mp3";
        final String title = "TITLE";
        final String artist = "ARTIST";
        final String album = "album";
        final String track = "2";
        final String duration = "1:01:12";
        final long filesize = 123000L;
        final String imageLink = "http://furfriction.com/podcast/ALBUM%202.jpg";

        Mockito.when(mp3.getArtist()).thenReturn(artist);
        Mockito.when(mp3.getTitle()).thenReturn(title);
        Mockito.when(mp3.getAlbum()).thenReturn(album);
        Mockito.when(mp3.getTrack()).thenReturn(track);
        Mockito.when(mp3.getDurationFormatted()).thenReturn(duration);
        Mockito.when(mp3.getFilesize()).thenReturn(filesize);
        underTest = new ItemFactory(mp3, baseUrl);
        // WHEN
        final ItemType actual = underTest.getItem();
        // THEN
        Assert.assertEquals(artist, actual.getAuthor());
        Assert.assertEquals(artist, actual.getItunesAuthor());
        Assert.assertEquals(title, actual.getTitle());
        Assert.assertEquals(duration, actual.getItunesDuration());
        Assert.assertEquals(url, actual.getLink());
        Assert.assertEquals(url, actual.getGuid());
        Assert.assertEquals(url, actual.getEnclosure().getUrl());
        Assert.assertEquals(filesize, actual.getEnclosure().getLength());
        Assert.assertEquals("audio/mpeg", actual.getEnclosure().getType());
        Assert.assertEquals(imageLink, actual.getItunesImage().getHref());
        Mockito.verify(mp3).getArtist();
        Mockito.verify(mp3).getTitle();
        Mockito.verify(mp3).getTrack();
        Mockito.verify(mp3).getDurationFormatted();
        Mockito.verify(mp3).getFilesize();
        Mockito.verify(mp3).getAlbum();
    }

    @Test
    public void testUri() {
        // GIVEN
        final String expected = "http://furfriction.com/podcast/Aa%200/-_$()%5B%5D#1%C3%A1";
        underTest = new ItemFactory(mp3, "http://furfriction.com/podcast/");
        // WHEN
        final String actual = underTest.uri("Aa 0/-_$()[]#1á");
        // THEN
        Assert.assertEquals(expected, actual);
    }
}
