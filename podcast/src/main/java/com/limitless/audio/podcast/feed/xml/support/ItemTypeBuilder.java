package com.limitless.audio.podcast.feed.xml.support;

import com.limitless.audio.podcast.feed.xml.domain.EnclosureType;
import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;

/**
 * Builder class used to create ItemType objects with various parameters.
 * @author Adam Hegedus
 */
public class ItemTypeBuilder {

    private String title;
    private String link;
    private String description;
    private String guid;
    private EnclosureType enclosure;
    private String pubDate;
    private String author;
    private String itunesAuthor;
    private String itunesSubtitle;
    private String itunesSummary;
    private String itunesDuration;
    private String itunesExplicit;
    private ItunesImageType itunesImage;

    /**
     * Gets the title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the link.
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Gets the description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the guid.
     * @return the guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Gets the enclosure.
     * @return the enclosure
     */
    public EnclosureType getEnclosure() {
        return enclosure;
    }

    /**
     * Gets the pubDate.
     * @return the pubDate
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * Gets the author.
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the author.
     * @return the itunesAuthor
     */
    public String getItunesAuthor() {
        return itunesAuthor;
    }

    /**
     * Gets the subtitle.
     * @return the itunesSubtitle
     */
    public String getItunesSubtitle() {
        return itunesSubtitle;
    }

    /**
     * Gets the summary.
     * @return the itunesSummary
     */
    public String getItunesSummary() {
        return itunesSummary;
    }

    /**
     * Gets the duration.
     * @return the itunesDuration
     */
    public String getItunesDuration() {
        return itunesDuration;
    }

    /**
     * Gets the explicit.
     * @return the itunesExplicit
     */
    public String getItunesExplicit() {
        return itunesExplicit;
    }

    /**
     * Gets the image.
     * @return the itunesImage
     */
    public ItunesImageType getItunesImage() {
        return itunesImage;
    }

    /**
     * Sets the title.
     * @param title the title to set
     * @return this
     */
    public ItemTypeBuilder setTitle(final String title) {
        this.title = title;
        return this;
    }

    /**
     * Sets the link.
     * @param link the link to set
     * @return this
     */
    public ItemTypeBuilder setLink(final String link) {
        this.link = link;
        return this;
    }

    /**
     * Sets the description.
     * @param description the description to set
     * @return this
     */
    public ItemTypeBuilder setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * Sets the guid.
     * @param guid the guid to set
     * @return this
     */
    public ItemTypeBuilder setGuid(final String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Sets the enclosure.
     * @param enclosure the enclosure to set
     * @return this
     */
    public ItemTypeBuilder setEnclosure(final EnclosureType enclosure) {
        this.enclosure = enclosure;
        return this;
    }

    /**
     * Sets the pubDate.
     * @param pubDate the pubDate to set
     * @return this
     */
    public ItemTypeBuilder setPubDate(final String pubDate) {
        this.pubDate = pubDate;
        return this;
    }

    /**
     * Sets the author.
     * @param author the author to set
     * @return this
     */
    public ItemTypeBuilder setAuthor(final String author) {
        this.author = author;
        return this;
    }

    /**
     * Sets the author.
     * @param itunesAuthor the itunesAuthor to set
     * @return this
     */
    public ItemTypeBuilder setItunesAuthor(final String itunesAuthor) {
        this.itunesAuthor = itunesAuthor;
        return this;
    }

    /**
     * Sets the subtitle.
     * @param itunesSubtitle the itunesSubtitle to set
     * @return this
     */
    public ItemTypeBuilder setItunesSubtitle(final String itunesSubtitle) {
        this.itunesSubtitle = itunesSubtitle;
        return this;
    }

    /**
     * Sets the summary.
     * @param itunesSummary the itunesSummary to set
     * @return this
     */
    public ItemTypeBuilder setItunesSummary(final String itunesSummary) {
        this.itunesSummary = itunesSummary;
        return this;
    }

    /**
     * Sets the duration.
     * @param itunesDuration the itunesDuration to set
     * @return this
     */
    public ItemTypeBuilder setItunesDuration(final String itunesDuration) {
        this.itunesDuration = itunesDuration;
        return this;
    }

    /**
     * Sets the explicit.
     * @param itunesExplicit the itunesExplicit to set
     * @return this
     */
    public ItemTypeBuilder setItunesExplicit(final String itunesExplicit) {
        this.itunesExplicit = itunesExplicit;
        return this;
    }

    /**
     * Sets the image.
     * @param itunesImage the itunesImage to set
     * @return this
     */
    public ItemTypeBuilder setItunesImage(final ItunesImageType itunesImage) {
        this.itunesImage = itunesImage;
        return this;
    }

    /**
     * Gets the built item.
     * @return a new ItemType instance
     */
    public ItemType build() {
        return new ItemType(this);
    }
}
