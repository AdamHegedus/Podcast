package com.limitless.audio.podcast.file.channel.support;

import com.limitless.audio.podcast.file.channel.domain.ChannelData;

public class ChannelDataBuilder {
    private String domain;
    private String title;
    private String description;
    private String link;
    private String language;
    private String copyright;
    private String managingEditor;
    private String webMaster;
    private String category = "Music";
    private int ttl;

    public String getDomain() {
        return domain;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getLanguage() {
        return language;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getManagingEditor() {
        return managingEditor;
    }

    public String getWebMaster() {
        return webMaster;
    }

    public String getCategory() {
        return category;
    }

    public int getTtl() {
        return ttl;
    }

    public ChannelDataBuilder setDomain(final String domain) {
        this.domain = domain;
        return this;
    }

    public ChannelDataBuilder setTitle(final String title) {
        this.title = title;
        return this;
    }

    public ChannelDataBuilder setDescription(final String description) {
        this.description = description;
        return this;
    }

    public ChannelDataBuilder setLink(final String link) {
        this.link = link;
        return this;
    }

    public ChannelDataBuilder setLanguage(final String language) {
        this.language = language;
        return this;
    }

    public ChannelDataBuilder setCopyright(final String copyright) {
        this.copyright = copyright;
        return this;
    }

    public ChannelDataBuilder setManagingEditor(final String managingEditor) {
        this.managingEditor = managingEditor;
        return this;
    }

    public ChannelDataBuilder setWebMaster(final String webMaster) {
        this.webMaster = webMaster;
        return this;
    }

    public ChannelDataBuilder setCategory(final String category) {
        this.category = category;
        return this;
    }

    public ChannelDataBuilder setTtl(final int ttl) {
        this.ttl = ttl;
        return this;
    }

    public ChannelData build() {
        return new ChannelData(this);
    }

}
