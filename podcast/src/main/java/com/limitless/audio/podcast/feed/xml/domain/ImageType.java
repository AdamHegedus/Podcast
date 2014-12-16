package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The &lt;image> tag points to the artwork of the podcast, via the URL
 * specified in the &lt;a href> attribute.
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageType", propOrder = {"url", "title", "link"})
public class ImageType {
    @XmlElement(required = true)
    private String url;
    /**
     * The title describes the image, it's used in the ALT attribute of the HTML
     * &lt;img> tag when the channel is rendered in HTML.
     */
    @XmlElement(required = true)
    private String title;
    /**
     * When the channel is rendered, the image is a link to the site. (In
     * practice the image &lt;title> and &lt;link> should have the same value as
     * the channel's &lt;title> and &lt;link>
     */
    @XmlElement(required = true)
    private String link;

    /**
     * Gets the URI of the image.
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URI of the image.
     * @param url the URI of the image
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Gets the title of the image.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the image.
     * @param title the title of the image
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the link of the image.
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the title of the image.
     * @param link the link of the image
     */
    public void setLink(final String link) {
        this.link = link;
    }
}
