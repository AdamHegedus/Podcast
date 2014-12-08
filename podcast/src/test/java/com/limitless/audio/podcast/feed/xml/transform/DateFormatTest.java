package com.limitless.audio.podcast.feed.xml.transform;

import java.util.Calendar;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DateFormatTest {
    private DateFormat underTest;

    @Before
    public void setUp() {
        underTest = new DateFormat();
    }

    @Test
    public void testConvertDate() {
        // GIVEN
        final String expected = "Sun, 25 May 2014 20:00:00 +0200";
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 4, 25, 20, 0, 0);
        // WHEN
        final String actual = underTest.convertDate(calendar.getTime());
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConvertDateShouldReturnEmptyStringWhenGivenNull() {
        // GIVEN
        final String expected = "";
        // WHEN
        final String actual = underTest.convertDate(null);
        // THEN
        Assert.assertEquals(expected, actual);
    }
}
