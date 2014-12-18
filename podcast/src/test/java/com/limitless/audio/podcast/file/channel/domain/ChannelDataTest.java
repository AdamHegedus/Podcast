package com.limitless.audio.podcast.file.channel.domain;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.file.channel.support.ChannelDataBuilder;

public class ChannelDataTest {

    private ChannelData underTest;
    @Mock
    private ChannelDataBuilder builder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testChannelData() {
        // GIVEN
        final String category = "Music";
        // WHEN
        underTest = new ChannelData(builder);
        // THEN
        Assert.assertEquals(category, underTest.getCategory());

    }

}
