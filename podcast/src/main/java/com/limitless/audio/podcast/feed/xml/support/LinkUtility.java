package com.limitless.audio.podcast.feed.xml.support;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

public class LinkUtility {

    /**
     * Encodes the given text to URL format.
     * @param text the text to encode
     * @return encoded URL
     */
    public String encodeURI(final String text) {
        final String result;
        final URI uri = UriBuilder.fromUri(text).build("");
        result = uri.toString();
        return result;
    }

    /**
     * @param artist
     * @param title
     * @param album
     * @param track
     * @return
     */
    public String buildLink(final String artist, final String title,
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
        return encodeURI(linkBuilder.toString());
    }

    /**
     * Creates image link
     * @param album
     * @param track
     * @return
     */
    public String buildImageLink(final String album, final String track) {
        final StringBuilder imageLinkBuilder = new StringBuilder();
        imageLinkBuilder.append(album.toUpperCase());
        imageLinkBuilder.append(" ");
        imageLinkBuilder.append(track);
        imageLinkBuilder.append(".jpg");

        return encodeURI(imageLinkBuilder.toString());
    }

}
