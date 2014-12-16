package com.limitless.audio.podcast.feed.xml.marshal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author Adam_Hegedus
 */
public class AdapterCDATA extends XmlAdapter<String, String> {

    @Override
    public String marshal(final String text) throws Exception {
        return "<![CDATA[" + text + "]]>";
    }

    @Override
    public String unmarshal(final String text) throws Exception {
        return text;
    }

}
