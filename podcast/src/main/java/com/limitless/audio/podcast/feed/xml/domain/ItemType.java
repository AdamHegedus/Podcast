package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.limitless.audio.podcast.feed.xml.marshal.AdapterCDATA;
import com.limitless.audio.podcast.feed.xml.support.ItemTypeBuilder;

/**
 * The item property is the main content of the podcast. The feed can has
 * multiple items.
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemType", propOrder = {"title", "link", "description",
    "guid", "enclosure", "pubDate", "author", "itunesAuthor", "itunesSubtitle",
    "itunesSummary", "itunesDuration", "itunesImage", "itunesExplicit"})
public class ItemType {
    @XmlElement(required = true)
    private String title;
    @XmlElement(required = true)
    private String link;
    @XmlElement(required = true)
    private String description;
    /**
     * Every &lt;item> (episode) should have a permanent, case-sensitive GUID
     * (Globally Unique Identifier). When adding episodes to the RSS podcast
     * feed, GUIDs are compared in case-sensitive fashion to determine which
     * episodes are new. If GUID is not present, the episode URL will be used
     * instead. The GUID should be assigned to an episode only once and should
     * never change. Assigning new GUIDs to existing episodes may cause issues
     * with the podcast’s listing and chart placement in the iTunes Store.
     */
    @XmlElement(required = true)
    private String guid;
    /**
     * The enclosure contains media data within an item.
     */
    @XmlElement(required = true)
    private EnclosureType enclosure;
    /**
     * This tag specifies the date and time when an episode was released. The
     * format for the content should be per RFC 2822, for example:
     *
     * <pre>
     * Wed, 15 Jun 2014 19:00:00 GMT
     * </pre>
     */
    @XmlElement(required = true)
    private String pubDate;
    @XmlElement
    private String author;
    /**
     * If the &lt;itunes:author> tag is not present, iTunes uses the contents of
     * the &lt;author> tag.
     */
    @XmlElement(required = true, name = "author", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesAuthor;
    /**
     * The contents of the &lt;itunes:subtitle> tag are displayed in the
     * Description column in iTunes.
     */
    @XmlElement(required = true, name = "subtitle", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesSubtitle;
    /**
     * This field can be up to 4000 characters. If a &lt;itunes:summary> tag is
     * not included, the contents of the &lt;description> tag are used.
     */
    @XmlElement(required = true, name = "summary", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    @XmlJavaTypeAdapter(AdapterCDATA.class)
    private String itunesSummary;

    /**
     * The content of the &lt;itunes:duration> tag is shown in the Time column
     * in the List View on iTunes. The value provided for this tag can be
     * formatted as HH:MM:SS, H:MM:SS, MM:SS, or M:SS, where H = hours, M =
     * minutes, S = seconds. If a single number is provided as a value (no
     * colons are used), the value is assumed to be in seconds. If one colon is
     * present, the number to the left is assumed to be minutes, and the number
     * to the right is assumed to be seconds. If more than two colons are
     * present, the numbers farthest to the right are ignored.
     */
    @XmlElement(name = "duration", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesDuration;
    @XmlElement(required = true, name = "image", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private ItunesImageType itunesImage;
    /**
     * The &lt;itunes:explicit> tag indicates whether the podcast episode
     * contains explicit material. The two usable values for this tag are "yes"
     * and "clean".
     */
    @XmlElement(required = true, name = "explicit", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesExplicit;

    /**
     * Used by JAXB marshaling operations.
     */
    public ItemType() {
        super();
    }

    /**
     * Sets attributes via builder.
     * @param builder Builder class for setting up parameters
     */
    public ItemType(final ItemTypeBuilder builder) {
        this.author = builder.getAuthor();
        this.title = builder.getTitle();
        this.description = builder.getDescription();
        this.enclosure = builder.getEnclosure();
        this.guid = builder.getGuid();
        this.link = builder.getLink();
        this.pubDate = builder.getPubDate();
        this.itunesAuthor = builder.getItunesAuthor();
        this.itunesDuration = builder.getItunesDuration();
        this.itunesExplicit = builder.getItunesExplicit();
        this.itunesSubtitle = builder.getItunesSubtitle();
        this.itunesSummary = builder.getItunesSummary();
        this.itunesImage = builder.getItunesImage();
    }

    /**
     * Gets the title of the item.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the item.
     * @param title the title of the item
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Gets the URI of the item.
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the URI of the item.
     * @param link the URI of the item
     */
    public void setLink(final String link) {
        this.link = link;
    }

    /**
     * Gets the item synopsis.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the item synopsis.
     * @param description the item synopsis
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the GUID of the item.
     * @return the guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the GUID of the item.
     * @param guid the GUID of the item
     */
    public void setGuid(final String guid) {
        this.guid = guid;
    }

    /**
     * Gets the enclosure.
     * @return the enclosure
     */
    public EnclosureType getEnclosure() {
        return enclosure;
    }

    /**
     * Sets the enclosure.
     * @param enclosure the enclosure of the item
     */
    public void setEnclosure(final EnclosureType enclosure) {
        this.enclosure = enclosure;
    }

    /**
     * Gets the publication date of the item.
     * @return the pubDate
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Sets the publication date of the item.
     * @param pubDate the publication date of the item
     */
    public void setPubDate(final String pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * Gets the author.
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * @param author the author of the item
     */
    public void setAuthor(final String author) {
        this.author = author;
    }

    /**
     * Gets the author.
     * @return the itunesAuthor
     */
    public String getItunesAuthor() {
        return itunesAuthor;
    }

    /**
     * Sets the author.
     * @param itunesAuthor the author of the item
     */
    public void setItunesAuthor(final String itunesAuthor) {
        this.itunesAuthor = itunesAuthor;
    }

    /**
     * Gets the short subtitle of the item.
     * @return the itunesSubtitle
     */
    public String getItunesSubtitle() {
        return itunesSubtitle;
    }

    /**
     * Sets the short subtitle of the item.
     * @param itunesSubtitle the subtitle of the item
     */
    public void setItunesSubtitle(final String itunesSubtitle) {
        this.itunesSubtitle = itunesSubtitle;
    }

    /**
     * Gets the summary of the item.
     * @return the itunesSummary
     */
    public String getItunesSummary() {
        return itunesSummary;
    }

    /**
     * Sets the summary of the item.
     * @param itunesSummary the summary of the item
     */
    public void setItunesSummary(final String itunesSummary) {
        this.itunesSummary = itunesSummary;
    }

    /**
     * Gets the duration of the item.
     * @return the itunesDuration
     */
    public String getItunesDuration() {
        return itunesDuration;
    }

    /**
     * Sets the duration of the item.
     * @param itunesDuration the duration of the item
     */
    public void setItunesDuration(final String itunesDuration) {
        this.itunesDuration = itunesDuration;
    }

    /**
     * Gets the image cover art of the item.
     * @return the itunesImage
     */
    public ItunesImageType getItunesImage() {
        return itunesImage;
    }

    /**
     * Sets the image cover art of the item.
     * @param itunesImage the image of the item
     */
    public void setItunesImage(final ItunesImageType itunesImage) {
        this.itunesImage = itunesImage;
    }

    /**
     * Gets the explicit tag's value.
     * @return the itunesExplicit
     */
    public String getItunesExplicit() {
        return itunesExplicit;
    }

    /**
     * Sets the explicit tag's value.
     * @param itunesExplicit the value should be "clean" or "yes"
     */
    public void setItunesExplicit(final String itunesExplicit) {
        this.itunesExplicit = itunesExplicit;
    }

}
