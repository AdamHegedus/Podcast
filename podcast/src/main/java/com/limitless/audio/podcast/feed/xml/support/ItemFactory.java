package com.limitless.audio.podcast.feed.xml.support;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import com.limitless.audio.podcast.feed.xml.domain.EnclosureType;
import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.domain.ItunesImageType;
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
        final String artist = mp3.getArtist();
        final String duration = mp3.getDurationFormatted();
        final String title = mp3.getTitle();
        final String album = mp3.getAlbum();
        final String track = mp3.getTrack();
        final long filesize = mp3.getFilesize();
        final String link = buildLink(artist, title, album, track);
        final String imageLink = buildImageLink(album, track);

        builder.setAuthor(artist);
        builder.setItunesAuthor(artist);
        builder.setItunesDuration(duration);
        builder.setTitle(title);
        builder.setGuid(link);
        builder.setLink(link);
        builder.setEnclosure(new EnclosureType(link, filesize));
        builder.setItunesImage(new ItunesImageType(imageLink));

        return builder.build();
    }

    private String buildLink(final String artist, final String title,
            final String album, final String track) {
        final StringBuilder linkBuilder = new StringBuilder();
        linkBuilder.append(album.toUpperCase());
        linkBuilder.append(" ");
        linkBuilder.append(track);
        linkBuilder.append(" ");
        linkBuilder.append(artist);
        linkBuilder.append(" - ");
        linkBuilder.append(title);
        linkBuilder.append(".mp3");
        return uri(linkBuilder.toString());
    }

    private String buildImageLink(final String album, final String track) {
        final StringBuilder imageLinkBuilder = new StringBuilder();
        imageLinkBuilder.append(album.toUpperCase());
        imageLinkBuilder.append(" ");
        imageLinkBuilder.append(track);
        imageLinkBuilder.append(".jpg");

        return uri(imageLinkBuilder.toString());
    }

    /**
     * Encodes the given text to URL format.
     * @param text the text to encode
     * @return encoded URL
     */
    public String uri(final String text) {
        final String result;
        final URI uri = UriBuilder.fromUri(baseUrl + text).build("");
        result = uri.toString();
        return result;
    }

}
