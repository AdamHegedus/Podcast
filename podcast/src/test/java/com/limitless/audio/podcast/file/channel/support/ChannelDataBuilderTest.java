package com.limitless.audio.podcast.file.channel.support;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.limitless.audio.podcast.file.channel.domain.ChannelData;

public class ChannelDataBuilderTest {

    private ChannelDataBuilder underTest;

    @Before
    public void setUp() {
        underTest = new ChannelDataBuilder();
    }

    @Test
    public void testBuildDefaultValues() {
        // GIVEN

        // WHEN
        final ChannelData actual = underTest.build();
        // THEN
        Assert.assertEquals("Music", actual.getCategory());
        Assert.assertEquals("Podcast", actual.getTitle());
        Assert.assertEquals("en", actual.getLanguage());
        Assert.assertEquals((int) Integer.valueOf(720), actual.getTtl());
    }

    @Test
    public void testBuild() {
        // GIVEN
        final String domain = "domain";
        final String link = "link";
        final String category = "Category";
        final String title = "Title";
        final String copyright = "Copyright";
        final String language = "language";
        final String description = "Description of the podcast";
        final String managingEditor = "editor";
        final String webMaster = "webmaster";
        final int ttl = 720;

        underTest.setDomain(domain);
        underTest.setLink(link);
        underTest.setCategory(category);
        underTest.setTitle(title);
        underTest.setCopyright(copyright);
        underTest.setLanguage(language);
        underTest.setDescription(description);
        underTest.setManagingEditor(managingEditor);
        underTest.setWebMaster(webMaster);
        underTest.setTtl(ttl);
        // WHEN
        final ChannelData actual = underTest.build();
        // THEN
        Assert.assertEquals(domain, actual.getDomain());
        Assert.assertEquals(link, actual.getLink());
        Assert.assertEquals(category, actual.getCategory());
        Assert.assertEquals(title, actual.getTitle());
        Assert.assertEquals(copyright, actual.getCopyright());
        Assert.assertEquals(language, actual.getLanguage());
        Assert.assertEquals(description, actual.getDescription());
        Assert.assertEquals(managingEditor, actual.getManagingEditor());
        Assert.assertEquals(webMaster, actual.getWebMaster());
        Assert.assertEquals(ttl, actual.getTtl());
    }
}
