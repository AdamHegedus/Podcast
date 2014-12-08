package com.limitless.audio.podcast.feed.xml.transform;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {

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
        } else {
            result = new SimpleDateFormat(RFC2822_DATEFORMAT, Locale.US)
                    .format(date);
        }
        return result;
    }
}
