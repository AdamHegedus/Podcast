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
        Mockito.when(mp3.getArtist()).thenReturn("ARTIST");
        Mockito.when(mp3.getTitle()).thenReturn("TITLE");
        Mockito.when(mp3.getAlbum()).thenReturn("album");
        Mockito.when(mp3.getTrack()).thenReturn("2");
        Mockito.when(mp3.getDurationFormatted()).thenReturn("1:01:12");
        underTest = new ItemFactory(mp3, "http://furfriction.com/podcast/");
        // WHEN
        final ItemType actual = underTest.getItem();
        // THEN
        Assert.assertEquals("ARTIST", actual.getAuthor());
        Assert.assertEquals("ARTIST", actual.getItunesAuthor());
        Assert.assertEquals("TITLE", actual.getTitle());
        Assert.assertEquals("1:01:12", actual.getItunesDuration());
        Assert.assertEquals(
                "http://furfriction.com/podcast/ALBUM%202%20ARTIST%20-%20TITLE.mp3",
                actual.getLink());
        Mockito.verify(mp3, Mockito.times(3)).getArtist();
        Mockito.verify(mp3, Mockito.times(2)).getTitle();
        Mockito.verify(mp3).getTrack();
        Mockito.verify(mp3).getDurationFormatted();
    }

    @Test
    public void testUri() {
        // GIVEN
        underTest = new ItemFactory(mp3, "http://furfriction.com/podcast/");
        // WHEN
        final String actual = underTest.uri("Aa 0/-_$()[]#1á");
        // THEN
        Assert.assertEquals(
                "http://furfriction.com/podcast/Aa%200/-_$()%5B%5D#1%C3%A1",
                actual);
    }
}
