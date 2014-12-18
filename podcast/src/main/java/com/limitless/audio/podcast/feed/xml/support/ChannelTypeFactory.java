package com.limitless.audio.podcast.feed.xml.support;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.feed.xml.domain.AtomLinkType;
import com.limitless.audio.podcast.feed.xml.domain.ChannelType;
import com.limitless.audio.podcast.feed.xml.transform.DateFormat;
import com.limitless.audio.podcast.file.channel.domain.ChannelData;

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
    public ChannelType getChannel(final ChannelData data) {
        final ChannelTypeBuilder builder = new ChannelTypeBuilder();
        final LinkUtility linkUtility = new LinkUtility();

        final String atomLink = linkUtility.encodeURI(data.getDomain()
                + "podcast.xml");
        builder.setAtomLink(new AtomLinkType(atomLink));
        builder.setLink(data.getLink());
        builder.setCategory(data.getCategory());
        builder.setCopyright(data.getCopyright());
        builder.setWebMaster(data.getWebMaster());
        builder.setManagingEditor(data.getManagingEditor());
        builder.setTtl(data.getTtl());

        final String date = new DateFormat().convertDate(new Date());
        builder.setLastBuildDate(date);
        logger.debug(this.getClass().getName() + " sets pubDate to " + date);

        return builder.build();
    }

    private String buildImageLink(final String text) {
        final LinkUtility linkUtility = new LinkUtility();
        final StringBuilder imageLinkBuilder = new StringBuilder();
        imageLinkBuilder.append(text);
        imageLinkBuilder.append(".jpg");
        return linkUtility.encodeURI(imageLinkBuilder.toString());
    }

}
