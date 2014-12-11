package com.limitless.audio.podcast.feed.xml.marshal;

import java.io.IOException;
import java.io.Writer;

/**
 * Used for marshaling &lt;![CDATA[text]]&gt;.
 * @author Adam_Hegedus
 */
public class EscapeHandler implements
    com.sun.xml.internal.bind.marshaller.CharacterEscapeHandler {

    @Override
    public void escape(final char[] characters, final int start,
            final int length, final boolean isAttVal, final Writer writer)
        throws IOException {
        writer.write(characters, start, length);
    }
}