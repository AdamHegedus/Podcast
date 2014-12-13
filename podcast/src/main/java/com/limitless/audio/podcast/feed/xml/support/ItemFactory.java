package com.limitless.audio.podcast.feed.xml.support;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class ItemFactory {

    private final Mp3 mp3;
    private final String baseUrl;

    /**
     * Sets the mp3 and baseUrl.
     * @param mp3 the mp3 bean to get data from
     * @param baseUrl the url which is used as base when creating url in the
     *            item
     */
    public ItemFactory(final Mp3 mp3, final String baseUrl) {
        super();
        this.mp3 = mp3;
        this.baseUrl = baseUrl;
    }

    /**
     * Gets new ItemType by building from the attributes.
     * @return ItemType
     */
    public ItemType getItem() {
        final ItemTypeBuilder builder = new ItemTypeBuilder();
        builder.setAuthor(mp3.getArtist());
        builder.setItunesAuthor(mp3.getArtist());
        builder.setItunesDuration(mp3.getDurationFormatted());
        builder.setTitle(mp3.getTitle());
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mp3.getAlbum().toUpperCase());
        stringBuilder.append(" ");
        stringBuilder.append(mp3.getTrack());
        stringBuilder.append(" ");
        stringBuilder.append(mp3.getArtist());
        stringBuilder.append(" - ");
        stringBuilder.append(mp3.getTitle());
        stringBuilder.append(".mp3");
        final String link = uri(stringBuilder.toString());
        builder.setGuid(link);
        builder.setLink(link);

        return builder.build();
    }

    public String uri(final String text) {
        final String result;
        final URI uri = UriBuilder.fromUri(baseUrl + text).build("");
        result = uri.toString();
        return result;
    }

}
