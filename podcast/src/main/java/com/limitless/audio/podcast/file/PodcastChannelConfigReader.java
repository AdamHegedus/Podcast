package com.limitless.audio.podcast.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.limitless.audio.podcast.file.channel.domain.ChannelData;
import com.limitless.audio.podcast.file.channel.support.ChannelDataBuilder;

/**
 * Reads plain text file which contains the basic data of the podcast's channel.
 * @author Adam_Hegedus
 */
public class PodcastChannelConfigReader {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private File file;

    public void openFile(final String filename) {
        file = new File(filename);
        logger.info(this.getClass().getName() + " opening file [" + filename + "]");
    }

    public BufferedReader getBuffer() {
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new FileReader(file));
            logger.info(buffer.getClass().getName() + " created.");
        } catch (final FileNotFoundException e) {
            logger.error(e.toString());
        }

        return buffer;
    }

    public ChannelData scanFile(final BufferedReader buffer) {
        ChannelData result = null;

        final StringBuilder builder = new StringBuilder();
        String line;
        try {
            line = buffer.readLine();
            logger.debug(line);
            while (line != null) {
                builder.append(line);
                builder.append("\n");
                line = buffer.readLine();
            }
            buffer.close();
        } catch (final IOException e) {
            logger.error(e.toString());
        }
        String data = builder.toString();
        logger.debug(data);
        data = trimWhitespaces(data);
        logger.debug(data);
        data = removeCommentLines(data);
        logger.debug(data);
        result = buildFromConfiguration(getConfiguration(data));

        return result;
    }

    /**
     * Trims leading-trailing whitespaces in each lines from the given text.
     * @param text the input text to process
     * @return trimmed text
     */
    public String trimWhitespaces(final String text) {
        final StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(text)) {
            scanner.useDelimiter("\n");
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
            while (scanner.hasNext()) {
                final String token = scanner.next().trim();
                final String value = scanner.next().trim();
                result.put(token, value);
                logger.debug("[" + token + "] = [" + value + "] ");
            }
        }
        logger.debug("parsing config finished");
        return result;
    }

    public ChannelData buildFromConfiguration(final Map<String, String> data) {
        final ChannelDataBuilder builder = new ChannelDataBuilder();
        for (final Map.Entry<String, String> entry : data.entrySet()) {
            switch (entry.getKey()) {
            case "domain":
                builder.setDomain(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "link":
                builder.setLink(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "title":
                builder.setTitle(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "managingEditor":
                builder.setManagingEditor(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "webMaster":
                builder.setWebMaster(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "language":
                builder.setLanguage(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "category":
                builder.setCategory(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;
            case "description":
                builder.setDescription(entry.getValue());
                logger.debug(entry.getKey() + " : " + entry.getValue() + " set.");
                break;

            default:
                logger.debug(entry.getKey() + " : " + entry.getValue() + " skipped.");
                break;
            }
        }

        return builder.build();
    }
}
