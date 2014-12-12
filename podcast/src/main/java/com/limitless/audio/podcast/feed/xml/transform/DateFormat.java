package com.limitless.audio.podcast.feed.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateFormat {

    private final Logger logger = LoggerFactory.getLogger(DateFormat.class);

    private final String RFC2822_DATEFORMAT = "EEE, dd MMM yyyy HH:mm:ss Z";

    /**
     * Converts the input date to String in RFC-2822 specification.
     * @param date the date to be formatted
     * @return formatted date
     */
    public String convertDate(final Date date) {
        final String result;
        if (date == null) {
            result = "";
            logger.info("The Date to be converted is NULL, returning empty String.");
        } else {
            result = new SimpleDateFormat(RFC2822_DATEFORMAT, Locale.US)
                    .format(date);
            logger.info("The Date [" + date.toString() + "] is formatted as ["
                    + result + "]");
        }
        return result;
    }
}
