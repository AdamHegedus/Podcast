package com.limitless.audio.podcast.feed.xml.support;

import java.net.URI;
import java.util.Date;

import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.feed.xml.domain.AtomLinkType;
import com.limitless.audio.podcast.feed.xml.domain.ChannelType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;
import com.limitless.audio.podcast.feed.xml.transform.DateFormat;

public class ChannelTypeFactory {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String baseUrl;

    /**
     * Sets the baseUrl.
     * @param baseUrl the url which is used as base when creating url in the
     *            item
     */
    public ChannelTypeFactory(final String baseUrl) {
        super();
        this.baseUrl = baseUrl;
    }

    /**
     * Gets new ChannelType by building from the attributes.
     * @return ChannelType
     */
    public ChannelType getChannel() {
        final ChannelTypeBuilder builder = new ChannelTypeBuilder();

        final String atomLink = uri("podcast.xml");
        builder.setAtomLink(new AtomLinkType(atomLink));
        builder.setCategory("Music");
        builder.setCopyright("Copyright");
        builder.setItunesImage(new ItunesImageType(
                buildImageLink("Fur Friction")));
        final String date = new DateFormat().convertDate(new Date());
        builder.setLastBuildDate(date);
        logger.debug(this.getClass().getName() + " sets pubDate to " + date);

        return builder.build();
    }

    private String buildImageLink(final String text) {
        final StringBuilder imageLinkBuilder = new StringBuilder();
        imageLinkBuilder.append(text);
        imageLinkBuilder.append(".jpg");
        return uri(imageLinkBuilder.toString());
    }

    /**
     * Encodes the given text to URL format.
     * @param text the text to encode
     * @return encoded URL
     */
    public String uri(final String text) {
        final String result;
        final URI uri = UriBuilder.fromUri(baseUrl + text).build("");
        result = uri.toString();
        return result;
    }
}
