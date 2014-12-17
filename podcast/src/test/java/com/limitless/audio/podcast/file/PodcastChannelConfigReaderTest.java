package com.limitless.audio.podcast.file;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class PodcastChannelConfigReaderTest {
    private PodcastChannelConfigReader underTest;

    @Before
    public void setUp() {
        underTest = new PodcastChannelConfigReader();
    }

    @Test
    public void testTrimWhitespaces() {
        // GIVEN
        final String base = "  valami szoveg \n\n \n  megtorve  \n \n \n   \n ";
        final String expected = "valami szoveg\nmegtorve\n";
        // WHEN
        final String actual = underTest.trimWhitespaces(base);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveCommentLines() {
        // GIVEN
        final String base = "valami szoveg\n#megtorve   ";
        final String expected = "valami szoveg\n";
        // WHEN
        final String actual = underTest.removeCommentLines(base);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetConfiguration() {
        // GIVEN
        final String base = "key=value\nkey 2=value 2\nkey 3=value 3";
        final Map<String, String> expected = createTestMap();
        // WHEN
        final Map<String, String> actual = underTest.getConfiguration(base);
        // THEN
        actual.entrySet().toString();
        Assert.assertEquals(expected, actual);
    }

    private Map<String, String> createTestMap() {
        final Map<String, String> result = new HashMap<String, String>();
        result.put("key", "value");
        result.put("key 2", "value 2");
        result.put("key 3", "value 3");
        return result;

    }
}
