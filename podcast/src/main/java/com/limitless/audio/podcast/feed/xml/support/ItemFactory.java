package com.limitless.audio.podcast.feed.xml.support;

import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;

public class ItemFactory {

    private final Mp3 mp3;

    /**
     * @param mp3
     */
    public ItemFactory(final Mp3 mp3) {
        super();
        this.mp3 = mp3;
    }

    /**
     * @return
     */
    public ItemType getItem() {
        final ItemTypeBuilder builder = new ItemTypeBuilder();
        builder.setAuthor(mp3.getArtist());
        builder.setItunesAuthor(mp3.getArtist());
        builder.setItunesDuration(mp3.getDurationFormatted());
        builder.setTitle(mp3.getTitle());
        return builder.build();
    }
}
