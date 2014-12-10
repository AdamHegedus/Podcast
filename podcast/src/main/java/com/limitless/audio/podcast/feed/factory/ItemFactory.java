package com.limitless.audio.podcast.feed.factory;

import com.limitless.audio.podcast.feed.xml.domain.ItemType;
import com.limitless.audio.podcast.file.mp3.domain.Id3;
import com.limitless.audio.podcast.file.mp3.domain.Mp3;
import com.limitless.audio.podcast.file.mp3.domain.Mp3Factory;

public class ItemFactory {

    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int SECONDS_IN_HOUR = Integer.valueOf(3600);
    private static final int MINUTES_IN_HOUR = Integer.valueOf(60);

    private long duration;

    public ItemType getItem(final String filename) {
        final Mp3Factory factory = new Mp3Factory();
        final Mp3 mp3 = new Mp3(factory.getFile(filename));
        final Id3 id3 = new Id3(factory.getId3(filename));
        final String author = id3.getArtist();
        duration = mp3.getLengthInSeconds();
        final String duration = getDurationFormatted();
        return new ItemTypeBuilder().setAuthor(author).setItunesAuthor(author)
                .setItunesDuration(duration).build();
    }

    /**
     * Gets the duration of the track formatted as HH:mm:ss.
     * @return the formatted duration as {@link String}
     */
    public String getDurationFormatted() {

        String result = "";

        if (!isLessThanOneMinute()) {
            if (!isLessThanOneHour()) {
                result += getDurationHours() + ":";
            }
            result += addLeadingZeroIfLessThanTen(Integer
                    .toString(getDurationMinutes())) + ":";
        }
        result += addLeadingZeroIfLessThanTen(Integer
                .toString(getDurationSeconds()));
        return result;
    }

    private String addLeadingZeroIfLessThanTen(final String text) {
        return text.length() < TWO ? "0" + text : text;
    }

    private boolean isLessThanOneHour() {
        return duration < SECONDS_IN_HOUR;
    }

    private boolean isLessThanOneMinute() {
        return duration < MINUTES_IN_HOUR;
    }

    private int getDurationHours() {
        return (int) (duration / SECONDS_IN_HOUR);
    }

    private int getDurationMinutes() {
        return (int) (duration % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }

    private int getDurationSeconds() {
        return (int) (duration % MINUTES_IN_HOUR);
    }

}
