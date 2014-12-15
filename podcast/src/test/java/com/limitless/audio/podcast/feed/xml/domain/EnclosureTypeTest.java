package com.limitless.audio.podcast.feed.xml.domain;

import junit.framework.Assert;

import org.junit.Test;

public class EnclosureTypeTest {
    private EnclosureType underTest;

    @Test
    public void testEnclosureType() {
        // GIVEN

        // WHEN
        underTest = new EnclosureType("", 0L);
        // THEN
        Assert.assertEquals("audio/mpeg", underTest.getType());
    }
}
