package com.limitless.audio.podcast;

import com.limitless.audio.podcast.file.PodcastChannelConfigReader;

/**
 * Hello world!
 */
public class App {
    public static void main(final String[] args) {
        final PodcastChannelConfigReader reader = new PodcastChannelConfigReader();
        reader.openFile("d:/podcast.txt");
        reader.scanFile(reader.getBuffer());
    }
}
