package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The enclosure contains media data within an item.
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enclosureType")
public class EnclosureType {
    @XmlAttribute(name = "url", required = true)
    private String url;
    /**
     * The length attribute is the file size in bytes.
     */
    @XmlAttribute(name = "length", required = true)
    private long length;
    /**
     * The type values for supported file formats are as follows.
     *
     * <pre>
     * File Type
     * MP3  audio/mpeg
     * M4A  audio/x-m4a
     * MP4  video/mp4
     * M4V  video/x-m4v
     * MOV  video/quicktime
     * PDF  application/pdf
     * EPUB document/x-epub
     * </pre>
     */
    @XmlAttribute(name = "type", required = true)
    private String type;

    /**
     * Used by JAXB marshaling operations.
     */
    public EnclosureType() {
        super();
    }

    /**
     * Sets the url and length by given parameters and sets the type to
     * "audio/mpeg" by default.
     * @param url the url of the file
     * @param length the length of the file
     */
    public EnclosureType(final String url, final long length) {
        super();
        this.url = url;
        this.length = length;
        this.type = "audio/mpeg";
    }

    /**
     * Gets the URI of the enclosure.
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the URI of the enclosure.
     * @param url the URI of the enclosure
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Gets the file size.
     * @return the length
     */
    public long getLength() {
        return length;
    }

    /**
     * Sets the file size.
     * @param length the size of the linked resource
     */
    public void setLength(final long length) {
        this.length = length;
    }

    /**
     * Gets the type of the linked resource.
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the linked resource.
     * @param type the type of the resource
     */
    public void setType(final String type) {
        this.type = type;
    }

}
