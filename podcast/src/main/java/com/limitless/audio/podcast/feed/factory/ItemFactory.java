package com.limitless.audio.podcast.feed.factory;

import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.feed.xml.support.ItemTypeBuilder;
import com.limitless.audio.podcast.file.mp3.adapter.Id3Adapter;
import com.limitless.audio.podcast.file.mp3.adapter.Mp3Adapter;
import com.limitless.audio.podcast.file.mp3.support.Mp3Factory;

public class ItemFactory {

    public ItemType getItem(final String filename) {
        final Mp3Factory factory = new Mp3Factory();
        final Mp3Adapter mp3 = new Mp3Adapter(factory.getFile(filename));
        final Id3Adapter id3 = new Id3Adapter(factory.getId3(filename));
        final String author = id3.getArtist();
        return new ItemTypeBuilder().build();
    }

}
