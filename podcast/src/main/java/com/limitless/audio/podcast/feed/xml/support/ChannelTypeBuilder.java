package com.limitless.audio.podcast.feed.xml.support;

import java.util.List;

import com.limitless.audio.podcast.feed.xml.domain.AtomLinkType;
import com.limitless.audio.podcast.feed.xml.domain.ChannelType;
import com.limitless.audio.podcast.feed.xml.domain.ImageType;
import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesCategoryType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesOwnerType;

public class ChannelTypeBuilder {
    private AtomLinkType atomLink;
    private String title;
    private String description;
    private String link;
    private List<ItemType> item;
    private String language;
    private String copyright;
    private String managingEditor;
    private String webMaster;
    private String lastBuildDate;
    private String category;
    private String docs;
    private int ttl;
    private ImageType image;
    private String itunesAuthor;
    private String itunesSubtitle;
    private String itunesSummary;
    private ItunesCategoryType itunesCategory;
    private ItunesImageType itunesImage;
    private String itunesExplicit;
    private ItunesOwnerType itunesOwner;

    /**
     * Gets the atom:link property.
     * @return the atomLink
     */
    public AtomLinkType getAtomLink() {
        return atomLink;
    }

    /**
     * Sets the atom:link property.
     * @param atomLink the {@link AtomLinkType}
     * @return this
     */
    public ChannelTypeBuilder setAtomLink(final AtomLinkType atomLink) {
        this.atomLink = atomLink;
        return this;
    }

    /**
     * Gets the title of the channel.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the channel.
     * @param title the title of the channel
     * @return this
     */
    public ChannelTypeBuilder setTitle(final String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets the description of the channel.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the channel.
     * @param description the description of the channel
     * @return this
     */
    public ChannelTypeBuilder setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets the URL of the website the channel is associated with.
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the URL to the website the channel is associated with.
     * @param link the URL to the website
     * @return this
     */
    public ChannelTypeBuilder setLink(final String link) {
        this.link = link;
        return this;
    }

    /**
     * Gets the collection of the items.
     * @return the item
     */
    public List<ItemType> getItem() {
        return item;
    }

    /**
     * Sets the collection of the items.
     * @param item the collection of the items
     * @return this
     */
    public ChannelTypeBuilder setItem(final List<ItemType> item) {
        this.item = item;
        return this;
    }

    /**
     * Gets the language of the podcast.
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language of the podcast.
     * @param language the language the channel is written in
     * @return this
     */
    public ChannelTypeBuilder setLanguage(final String language) {
        this.language = language;
        return this;
    }

    /**
     * Gets the copyright data.
     * @return the copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the copyright data.
     * @param copyright the copyright notice
     * @return this
     */
    public ChannelTypeBuilder setCopyright(final String copyright) {
        this.copyright = copyright;
        return this;
    }

    /**
     * Gets the podcast editor's contact.
     * @return the managingEditor
     */
    public String getManagingEditor() {
        return managingEditor;
    }

    /**
     * Sets the podcast editor's contact.
     * @param managingEditor the podcast editor's contact
     * @return this
     */
    public ChannelTypeBuilder setManagingEditor(final String managingEditor) {
        this.managingEditor = managingEditor;
        return this;
    }

    /**
     * Gets the podcast technical executive's contact.
     * @return the webMaster
     */
    public String getWebMaster() {
        return webMaster;
    }

    /**
     * Sets the podcast technical executive's contact.
     * @param webMaster the webmaster's contact
     * @return this
     */
    public ChannelTypeBuilder setWebMaster(final String webMaster) {
        this.webMaster = webMaster;
        return this;
    }

    /**
     * Gets the last build date of the podcast.
     * @return the lastBuildDate
     */
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * Sets the last build date of the podcast.
     * @param lastBuildDate the podcast's last modification date and time
     * @return this
     */
    public ChannelTypeBuilder setLastBuildDate(final String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
        return this;
    }

    /**
     * Gets the category of the channel.
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the channel.
     * @param category the category of the channel
     * @return this
     */
    public ChannelTypeBuilder setCategory(final String category) {
        this.category = category;
        return this;
    }

    /**
     * Gets the TTL value.
     * @return the ttl
     */
    public int getTtl() {
        return ttl;
    }

    /**
     * Sets the TTL value.
     * @param ttl the minutes of how long the channel should be cached before
     *            updating
     * @return this
     */
    public ChannelTypeBuilder setTtl(final int ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * Gets the image cover art of the podcast.
     * @return the image
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the image cover art of the podcast.
     * @param image the image of the podcast
     * @return this
     */
    public ChannelTypeBuilder setImage(final ImageType image) {
        this.image = image;
        return this;
    }

    /**
     * Gets the editor of the channel.
     * @return the itunesAuthor
     */
    public String getItunesAuthor() {
        return itunesAuthor;
    }

    /**
     * Sets the editor of the channel.
     * @param itunesAuthor the editor of the channel
     * @return this
     */
    public ChannelTypeBuilder setItunesAuthor(final String itunesAuthor) {
        this.itunesAuthor = itunesAuthor;
        return this;
    }

    /**
     * Gets the short subtitle of the channel.
     * @return the itunesSubtitle
     */
    public String getItunesSubtitle() {
        return itunesSubtitle;
    }

    /**
     * Sets the short subtitle of the channel.
     * @param itunesSubtitle the subtitle of the channel
     * @return this
     */
    public ChannelTypeBuilder setItunesSubtitle(final String itunesSubtitle) {
        this.itunesSubtitle = itunesSubtitle;
        return this;
    }

    /**
     * Gets the summary of the channel.
     * @return the itunesSummary
     */
    public String getItunesSummary() {
        return itunesSummary;
    }

    /**
     * Sets the summary of the channel.
     * @param itunesSummary the summary of the channel
     * @return this
     */
    public ChannelTypeBuilder setItunesSummary(final String itunesSummary) {
        this.itunesSummary = itunesSummary;
        return this;
    }

    /**
     * Gets the category of the podcast.
     * @return the itunesCategory
     */
    public ItunesCategoryType getItunesCategory() {
        return itunesCategory;
    }

    /**
     * Sets the category of the podcast.
     * @param itunesCategory the category of the podcast
     * @return this
     */
    public ChannelTypeBuilder setItunesCategory(
            final ItunesCategoryType itunesCategory) {
        this.itunesCategory = itunesCategory;
        return this;
    }

    /**
     * Gets the image cover art of the podcast.
     * @return the itunesImage
     */
    public ItunesImageType getItunesImage() {
        return itunesImage;
    }

    /**
     * Sets the image cover art of the podcast.
     * @param itunesImage the image of the podcast
     * @return this
     */
    public ChannelTypeBuilder setItunesImage(final ItunesImageType itunesImage) {
        this.itunesImage = itunesImage;
        return this;
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
     * @return this
     */
    public ChannelTypeBuilder setItunesExplicit(final String itunesExplicit) {
        this.itunesExplicit = itunesExplicit;
        return this;
    }

    /**
     * Gets the owner of the podcast.
     * @return the itunesOwner
     */
    public ItunesOwnerType getItunesOwner() {
        return itunesOwner;
    }

    /**
     * Sets the owner of the podcast.
     * @param itunesOwner the owner of the podcast
     * @return this
     */
    public ChannelTypeBuilder setItunesOwner(final ItunesOwnerType itunesOwner) {
        this.itunesOwner = itunesOwner;
        return this;
    }

    /**
     * Gets the built item.
     * @return a new ChannelType instance
     */
    public ChannelType build() {
        return new ChannelType(this);
    }

}
