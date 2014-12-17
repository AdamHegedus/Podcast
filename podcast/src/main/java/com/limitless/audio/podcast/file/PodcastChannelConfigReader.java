package com.limitless.audio.podcast.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads plain text file which contains the basic data of the podcast's channel.
 * @author Adam_Hegedus
 */
public class PodcastChannelConfigReader {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private File file;
    private final String regexp = "[=$]";

    public void openFile(final String filename) {
        file = new File(filename);
        logger.info(this.getClass().getName() + " opening file [" + filename
                + "]");
    }

    public void scanFile() {
        try (final Scanner scanner = new Scanner(file)) {

        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Trims leading-trailing whitespaces in each lines from the given text.
     * @param text the input text to process
     * @return trimmed text
     */
    public String trimWhitespaces(final String text) {
        final StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(text)) {
            scanner.useDelimiter("\\n");
            String line;
            while (scanner.hasNext()) {
                line = scanner.next().trim();
                result.append(line);
                if (line.length() > 1) {
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public String removeCommentLines(final String text) {
        final StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(text)) {
            scanner.useDelimiter("\\n");
            String line;
            while (scanner.hasNext()) {
                line = scanner.next();
                if (!line.startsWith("#")) {
                    result.append(line);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public Map<String, String> getConfiguration(final String text) {
        final Map<String, String> result = new HashMap<String, String>();
        try (Scanner scanner = new Scanner(text)) {
            scanner.useDelimiter(Pattern.compile("[=]|[\n]"));
            while (scanner.hasNextLine()) {
                final String token = scanner.next();
                final String value = scanner.next();
                result.put(token, value);
                logger.debug("[" + token + "] = [" + value + "]");
            }
        }
        return result;
    }
}
