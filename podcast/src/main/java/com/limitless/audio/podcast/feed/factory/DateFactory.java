package com.limitless.audio.podcast.feed.factory;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateFactory {
    private static final int RELEASE_SECOND = 0;
    private static final int RELEASE_MINUTE = 0;
    private static final int RELEASE_HOUR = 20;
    private static final int DAYS_IN_WEEK = 7;

    private final Logger logger = LoggerFactory.getLogger(DateFactory.class);

    /**
     * Gets the month's last kind of weekday which specified in the parameters.
     * @param year the year
     * @param month the month, counts from 0
     * @param weekday the number of the day of the week (Calendar.WEEKDAY)
     * @return
     */
    public Date getLastWeekdayOfMonth(final int year, final int month,
            final int weekday) {
        final Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month + 1, 1, RELEASE_HOUR, RELEASE_MINUTE,
                RELEASE_SECOND);
        calendar.add(Calendar.DAY_OF_MONTH, calculateOffset(calendar, weekday));
        logger.info("Last "
                + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
                        Locale.US) + " in " + year + "/" + (month + 1) + " is "
                + calendar.getTime());
        return calendar.getTime();
    }

    private int calculateOffset(final Calendar calendar, final int weekday) {
        int offset = getLastDayOffset(calendar, weekday);
        offset = correctOffset(offset);
        return offset;
    }

    private int correctOffset(int dayOffset) {
        if (dayOffset >= 0) {
            dayOffset += -DAYS_IN_WEEK;
        }
        return dayOffset;
    }

    private int getLastDayOffset(final Calendar calendar, final int weekday) {
        return -(calendar.get(Calendar.DAY_OF_WEEK) % DAYS_IN_WEEK - weekday);
    }
}
