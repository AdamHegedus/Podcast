package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The &lt;itunes:category> tag points to the category of the podcast, via the
 * URL specified in the text attribute.
 *
 * <pre>
 * &lt;itunes:category text=&quot;Music&quot; /&gt;
 * </pre>
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itunesCategoryType", propOrder = {"text"})
public class ItunesCategoryType {
    @XmlAttribute(name = "text", required = true)
    private String text;

    /**
     * Used by JAXB marshaling operations.
     */
    public ItunesCategoryType() {
        super();
    }

    /**
     * Sets the category of the item.
     * @param category the category to set
     */
    public ItunesCategoryType(final String category) {
        super();
        this.text = category;
    }

    /**
     * Gets the category of the item.
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the category of the item.
     * @param text the category to set
     */
    public void setText(final String text) {
        this.text = text;
    }

}