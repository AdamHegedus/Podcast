package com.limitless.audio.podcast.feed.xml.support;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.limitless.audio.podcast.feed.xml.domain.EnclosureType;
import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;

public class ItemTypeBuilderTest {

    @Mock
    private EnclosureType enclosure;
    @Mock
    private ItunesImageType itunesImage;

    private final ItemTypeBuilder underTest = new ItemTypeBuilder();

    @Test
    public void testBuild() {
        // GIVEN
        MockitoAnnotations.initMocks(this);
        final String AUTHOR = "testAuthor";
        final String DESCRIPTION = "testDescription";
        final String GUID = "testGUID";
        final String DURATION = "testDuration";
        final String EXPLICIT = "testExplicit";
        final String SUMMARY = "testSummary";
        final String SUBTITLE = "testSubtitle";
        final String LINK = "testLink";
        final String DATE = "testDate";
        final String TITLE = "testTitle";

        underTest.setAuthor(AUTHOR);
        underTest.setDescription(DESCRIPTION);
        underTest.setEnclosure(enclosure);
        underTest.setGuid(GUID);
        underTest.setItunesAuthor(AUTHOR);
        underTest.setItunesDuration(DURATION);
        underTest.setItunesExplicit(EXPLICIT);
        underTest.setItunesSubtitle(SUBTITLE);
        underTest.setItunesSummary(SUMMARY);
        underTest.setLink(LINK);
        underTest.setPubDate(DATE);
        underTest.setTitle(TITLE);
        underTest.setItunesImage(itunesImage);
        // WHEN
        final ItemType result = underTest.build();
        // THEN
        Assert.assertEquals(AUTHOR, result.getAuthor());
        Assert.assertEquals(DESCRIPTION, result.getDescription());
        Assert.assertEquals(enclosure, result.getEnclosure());
        Assert.assertEquals(GUID, result.getGuid());
        Assert.assertEquals(AUTHOR, result.getItunesAuthor());
        Assert.assertEquals(DURATION, result.getItunesDuration());
        Assert.assertEquals(EXPLICIT, result.getItunesExplicit());
        Assert.assertEquals(SUBTITLE, result.getItunesSubtitle());
        Assert.assertEquals(SUMMARY, result.getItunesSummary());
        Assert.assertEquals(itunesImage, result.getItunesImage());
        Assert.assertEquals(LINK, result.getLink());
        Assert.assertEquals(DATE, result.getPubDate());
        Assert.assertEquals(TITLE, result.getTitle());
    }
}
