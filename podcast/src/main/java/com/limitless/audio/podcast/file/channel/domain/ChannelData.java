package com.limitless.audio.podcast.file.channel.domain;

import com.limitless.audio.podcast.file.channel.support.ChannelDataBuilder;

public class ChannelData {
    private final String domain;
    private String title = "Podcast";
    private final String description;
    private final String link;
    private String language = "en";
    private final String copyright;
    private final String managingEditor;
    private final String webMaster;
    private String category = "Music";
    private int ttl = 720;

    public ChannelData(final ChannelDataBuilder builder) {
        this.domain = builder.getDomain();
        this.title = builder.getTitle();
        this.description = builder.getDescription();
        this.link = builder.getLink();
        this.language = builder.getLanguage();
        this.copyright = builder.getCopyright();
        this.managingEditor = builder.getManagingEditor();
        this.webMaster = builder.getWebMaster();
        this.category = builder.getCategory();
        this.ttl = builder.getTtl();
    }

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

}
