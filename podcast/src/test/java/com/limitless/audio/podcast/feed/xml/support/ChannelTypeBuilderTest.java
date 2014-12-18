package com.limitless.audio.podcast.feed.xml.support;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.feed.xml.domain.AtomLinkType;
import com.limitless.audio.podcast.feed.xml.domain.ChannelType;
import com.limitless.audio.podcast.feed.xml.domain.ImageType;
import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesCategoryType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesOwnerType;

public class ChannelTypeBuilderTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Mock
    private AtomLinkType atom;
    @Mock
    private ImageType image;
    @Mock
    private ItunesImageType itunesImage;
    @Mock
    private ItunesCategoryType itunesCategory;
    @Mock
    private ItunesOwnerType itunesOwner;
    @Mock
    private ItemType item;

    private final ChannelTypeBuilder underTest = new ChannelTypeBuilder();

    @Test
    public void testBuild() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        // GIVEN
        MockitoAnnotations.initMocks(this);

        final String title = "Title";
        final String description = "Description";
        final String link = "Link";
        final String language = "language";
        final String copyright = "copyright";
        final String managingEditor = "managing editor";
        final String webMaster = "webmaster";
        final String lastBuildDate = "date";
        final String category = "category";
        final String docsExpected = "http://cyber.law.harvard.edu/rss/rss.html";
        final int ttl = 720;
        final String itunesAuthor = "author";
        final String itunesSubtitle = "subtitle";
        final String itunesSummary = "summary";
        final String itunesExplicit = "Clean";

        final List<ItemType> items = new ArrayList<ItemType>();
        items.add(item);
        items.add(item);
        items.add(item);

        underTest.setTitle(title);
        underTest.setDescription(description);
        underTest.setLink(link);
        underTest.setLanguage(language);
        underTest.setCopyright(copyright);
        underTest.setManagingEditor(managingEditor);
        underTest.setWebMaster(webMaster);
        underTest.setLastBuildDate(lastBuildDate);
        underTest.setCategory(category);
        underTest.setTtl(720);
        underTest.setItunesAuthor(itunesAuthor);
        underTest.setItunesExplicit(itunesExplicit);
        underTest.setItunesSubtitle(itunesSubtitle);
        underTest.setItunesSummary(itunesSummary);

        underTest.setAtomLink(atom);
        underTest.setImage(image);
        underTest.setItunesImage(itunesImage);
        underTest.setItunesCategory(itunesCategory);
        underTest.setItunesOwner(itunesOwner);

        underTest.setItem(items);
        // WHEN
        final ChannelType result = underTest.build();
        // THEN
        Assert.assertEquals(title, result.getTitle());
        Assert.assertEquals(description, result.getDescription());
        Assert.assertEquals(link, result.getLink());
        Assert.assertEquals(language, result.getLanguage());
        Assert.assertEquals(copyright, result.getCopyright());
        Assert.assertEquals(managingEditor, result.getManagingEditor());
        Assert.assertEquals(webMaster, result.getWebMaster());
        Assert.assertEquals(lastBuildDate, result.getLastBuildDate());
        Assert.assertEquals(category, result.getCategory());
        Assert.assertEquals(ttl, result.getTtl());
        Assert.assertEquals(itunesAuthor, result.getItunesAuthor());
        Assert.assertEquals(itunesExplicit, result.getItunesExplicit());
        Assert.assertEquals(itunesSummary, result.getItunesSummary());
        Assert.assertEquals(itunesSubtitle, result.getItunesSubtitle());

        final Field docs = result.getClass().getDeclaredField("docs");
        docs.setAccessible(true);
        Assert.assertEquals(docsExpected, docs.get(result));

        Assert.assertEquals(atom, result.getAtomLink());
        Assert.assertEquals(image, result.getImage());
        Assert.assertEquals(itunesImage, result.getItunesImage());
        Assert.assertEquals(itunesCategory, result.getItunesCategory());
        Assert.assertEquals(itunesOwner, result.getItunesOwner());

        Assert.assertEquals(items, result.getItem());

    }
}
