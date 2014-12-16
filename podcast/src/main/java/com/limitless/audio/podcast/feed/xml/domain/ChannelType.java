package com.limitless.audio.podcast.feed.xml.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.limitless.audio.podcast.feed.xml.support.ChannelTypeBuilder;

/**
 * Declares the Channel in the podcast.
 * @author Adam Hegedus
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ChannelType {
    /**
     * The &lt;atom:link> element defines a relationship between a web resource
     * (such as a page) and an RSS channel or item (optional).
     */
    @XmlElement(required = true, name = "link", namespace = "http://www.w3.org/2005/Atom")
    private AtomLinkType atomLink;
    @XmlElement(required = true)
    private String title;
    @XmlElement(required = true)
    private String description;
    @XmlElement(required = true)
    private String link;
    /**
     * The collection represents the episodes, the main contents.
     */
    @XmlElement(required = true)
    private List<ItemType> item;
    /**
     * The language the channel is written in. Only values from the ISO 639 list
     * (two-letter language codes, with some possible modifiers, such as
     * "en-us") are supported.
     */
    @XmlElement
    private String language;
    @XmlElement
    private String copyright;
    /**
     * The &lt;managindEditor> tag contains contact information for the editor
     * of the podcast intended to be used for communication about the podcast's
     * content.
     */
    @XmlElement
    private String managingEditor;
    /**
     * The &lt;webMaster> tag contains contact information for the technician
     * executive of the podcast intended to be used for administrative
     * communication about the podcast.
     */
    @XmlElement
    private String webMaster;
    /**
     * This tag specifies the podcast's last modification date and time. The
     * format for the content should be per RFC 2822, for example:
     *
     * <pre>
     * Wed, 15 Jun 2014 19:00:00 GMT
     * </pre>
     */
    @XmlElement
    private String lastBuildDate;
    @XmlElement
    private String category;
    @XmlElement
    private String docs;
    /**
     * It's a number of minutes that indicates how long a channel can be cached
     * before refreshing from the source.
     */
    @XmlElement
    private int ttl;
    @XmlElement
    private ImageType image;
    @XmlElement(required = true, name = "author", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesAuthor;
    @XmlElement(required = true, name = "subtitle", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesSubtitle;
    /**
     * This field can be up to 4000 characters. If a &lt;itunes:summary> tag is
     * not included, the contents of the &lt;description> tag are used.
     */
    @XmlElement(required = true, name = "summary", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesSummary;
    @XmlElement(required = true, name = "category", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private ItunesCategoryType itunesCategory;
    @XmlElement(required = true, name = "image", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private ItunesImageType itunesImage;
    /**
     * The &lt;itunes:explicit> tag indicates whether the podcast contains
     * explicit material. The two usable values for this tag are "yes" and
     * "clean". The value "yes" indicates the presence of explicit content,
     * therefore in iTunes an "explicit" parental advisory graphic will appear.
     * The value "clean" indicates that none of the podcast episodes contain
     * explicit language or adult content, in iTunes a "clean" parental advisory
     * graphic will appear. Any other value besides "yes" or "clean" results in
     * neither of the parental advisory graphics will appear and that space will
     * remain blank.
     */
    @XmlElement(required = true, name = "explicit", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private String itunesExplicit;
    /**
     * The &lt;itunes:owner> tag contains contact information for the editor of
     * the podcast intended to be used for communication about the podcast's
     * content.
     */
    @XmlElement(required = true, name = "owner", namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
    private ItunesOwnerType itunesOwner;

    /**
     * Used by JAXB marshaling operations.
     */
    public ChannelType() {
        super();
    }

    /**
     * Sets attributes via builder.
     * @param builder Builder class for setting up parameters
     */
    public ChannelType(final ChannelTypeBuilder builder) {
        this.docs = "http://cyber.law.harvard.edu/rss/rss.html";
        this.atomLink = builder.getAtomLink();
        this.category = builder.getCategory();
        this.copyright = builder.getCopyright();
        this.description = builder.getDescription();
        this.image = builder.getImage();
        this.itunesAuthor = builder.getItunesAuthor();
        this.itunesCategory = builder.getItunesCategory();
        this.itunesExplicit = builder.getItunesExplicit();
        this.itunesImage = builder.getItunesImage();
        this.itunesOwner = builder.getItunesOwner();
        this.itunesSubtitle = builder.getItunesSubtitle();
        this.itunesSummary = builder.getItunesSummary();
        this.language = builder.getLanguage();
        this.lastBuildDate = builder.getLastBuildDate();
        this.link = builder.getLink();
        this.managingEditor = builder.getManagingEditor();
        this.title = builder.getTitle();
        this.ttl = builder.getTtl();
        this.webMaster = builder.getWebMaster();

        this.item = builder.getItem();
    }

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
     */
    public void setAtomLink(final AtomLinkType atomLink) {
        this.atomLink = atomLink;
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
     */
    public void setTitle(final String title) {
        this.title = title;
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
     */
    public void setDescription(final String description) {
        this.description = description;
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
     */
    public void setLink(final String link) {
        this.link = link;
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
     */
    public void setLanguage(final String language) {
        this.language = language;
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
     */
    public void setCopyright(final String copyright) {
        this.copyright = copyright;
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
     */
    public void setManagingEditor(final String managingEditor) {
        this.managingEditor = managingEditor;
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
     */
    public void setWebMaster(final String webMaster) {
        this.webMaster = webMaster;
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
     */
    public void setLastBuildDate(final String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
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
     */
    public void setCategory(final String category) {
        this.category = category;
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
     */
    public void setTtl(final int ttl) {
        this.ttl = ttl;
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
     */
    public void setImage(final ImageType image) {
        this.image = image;
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
     */
    public void setItunesAuthor(final String itunesAuthor) {
        this.itunesAuthor = itunesAuthor;
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
     */
    public void setItunesSubtitle(final String itunesSubtitle) {
        this.itunesSubtitle = itunesSubtitle;
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
     */
    public void setItunesSummary(final String itunesSummary) {
        this.itunesSummary = itunesSummary;
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
     */
    public void setItunesCategory(final ItunesCategoryType itunesCategory) {
        this.itunesCategory = itunesCategory;
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
     */
    public void setItunesOwner(final ItunesOwnerType itunesOwner) {
        this.itunesOwner = itunesOwner;
    }

    /**
     * Gets the collection of the items.
     * @return the item
     */
    public List<ItemType> getItem() {
        return item;
    }

}
