package com.limitless.audio.podcast.feed.xml.support;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;
import com.limitless.audio.podcast.file.mp3.support.Mp3Factory;

public class ItemFactoryTest {
    private ItemFactory underTest;

    @Mock
    private Mp3Factory factory;

    @Mock
    private Mp3 mp3;

    @Mock
    private Mp3Adapter mp3Adapter;

    @Mock
    private ItemTypeBuilder builder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDurationFormatted() {
        // GIVEN

        //        Mockito.when(factory.getMp3(Mockito.anyString())).thenReturn(mp3);
        //        Mockito.when(mp3.getFilesize()).thenReturn(100L);
        //        Mockito.when(id3.getArtist()).thenReturn("ARTIST");
        //        Mockito.when(id3Adapter.getArtist()).thenReturn("ARTIST");
        //        Mockito.when(mp3.getArtist()).thenReturn("ARTIST");

        // WHEN
        //        final ItemType actual = underTest.getItem("D:\\test\\FF001.mp3");
        // THEN
        //        Mockito.verify(factory).getMp3(Mockito.anyString());
        //        Mockito.verify(mp3).getFilesize();
        //        Mockito.verify(mp3).getArtist();
        //        Assert.assertEquals("ARTIST", actual.getAuthor());
        //        Assert.assertEquals("Furst Contact", actual.getTitle());

    }
}
