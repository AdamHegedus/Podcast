package com.limitless.audio.podcast.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.file.channel.domain.ChannelData;

public class PodcastChannelConfigReaderTest {
    private PodcastChannelConfigReader underTest;

    @Mock
    private BufferedReader buffer;

    @Before
    public void setUp() {
        underTest = new PodcastChannelConfigReader();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTrimWhitespaces() {
        // GIVEN
        final String base = "  valami szoveg \n\n \n  megtorve  \n \n \n   \n  ";
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

    @Test
    public void testBuildFromConfiguration() {
        // GIVEN
        final Map<String, String> expected = createChannelDataMap();
        // WHEN
        final ChannelData actual = underTest.buildFromConfiguration(expected);
        // THEN
        Assert.assertEquals(expected.get("domain"), actual.getDomain());
        Assert.assertEquals(expected.get("title"), actual.getTitle());
        Assert.assertEquals(expected.get("link"), actual.getLink());
        Assert.assertEquals(expected.get("description"), actual.getDescription());
        Assert.assertEquals(expected.get("category"), actual.getCategory());
        Assert.assertEquals(expected.get("webMaster"), actual.getWebMaster());
        Assert.assertEquals(expected.get("managingEditor"), actual.getManagingEditor());
        Assert.assertEquals(expected.get("language"), actual.getLanguage());
    }

    private Map<String, String> createChannelDataMap() {
        final Map<String, String> result = new HashMap<String, String>();
        result.put("domain", "http://localhost");
        result.put("title", "Title");
        result.put("description", "Short description of the podcast channel.");
        result.put("language", "en");
        result.put("link", "http://localhost/podcast.xml");
        result.put("category", "Music");
        result.put("managingEditor", "editor");
        result.put("webMaster", "webmaster");
        result.put("dummy", "dummy");
        return result;
    }

    @Test
    public void testScanFile() throws IOException {
        // GIVEN
        Mockito.when(buffer.readLine()).thenReturn("#Config file", "domain  = http://furfriction.com ", "title= valami ", null);

        // WHEN
        final ChannelData actual = underTest.scanFile(buffer);
        // THEN
        Mockito.verify(buffer).close();
        Assert.assertEquals("http://furfriction.com", actual.getDomain());
        Assert.assertEquals("valami", actual.getTitle());

    }
}