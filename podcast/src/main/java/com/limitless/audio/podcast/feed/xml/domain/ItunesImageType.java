package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The &lt;itunes:image> tag points to the artwork of the podcast, via the URL
 * specified in the &lt;a href> attribute. Cover art must be in the JPEG or PNG
 * file formats and in the RGB color space with a minimum size of 1400 x 1400
 * pixels and a maximum size of 2048 x 2048 pixels. Note that these requirements
 * are different from the standard RSS image tag specification.
 *
 * <pre>
 * &lt;itunes:image href="website/image.jpg" />
 * </pre>
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itunesImageType", propOrder = {"href"})
public class ItunesImageType {
    @XmlAttribute(name = "href", required = true)
    private String href;

    /**
     * Used by JAXB marshaling operations.
     */
    public ItunesImageType() {
        super();
    }

    /**
     * Sets the URI of the image.
     * @param href
     */
    public ItunesImageType(final String href) {
        super();
        this.href = href;
    }

    /**
     * Gets the URI of the image.
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the URI of the image.
     * @param href the URI of the image
     */
    public void setHref(final String href) {
        this.href = href;
    }

}
