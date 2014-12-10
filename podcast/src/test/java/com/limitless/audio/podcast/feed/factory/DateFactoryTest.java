package com.limitless.audio.podcast.feed.factory;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DateFactoryTest {
    private DateFactory underTest;

    @Before
    public void setUp() {
        underTest = new DateFactory();
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastSunday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 28, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.SUNDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastMonday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 29, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.MONDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastTuesday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 30, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.TUESDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastWednesday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 31, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.WEDNESDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastThursday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 25, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.THURSDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastFriday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 26, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.FRIDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetLastWeekdayOfMonthShouldReturnLastSaturday() {
        // GIVEN
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2014, 11, 27, 20, 0, 0);
        final Date expected = calendar.getTime();
        // WHEN
        final Date actual = underTest.getLastWeekdayOfMonth(2014,
                Calendar.DECEMBER, Calendar.SATURDAY);
        // THEN
        Assert.assertEquals(expected, actual);
    }
}
