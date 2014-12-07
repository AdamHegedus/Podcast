package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The RSS is based on iTunes specification and represents the podcast data.
 *
 * @author Adam Hegedus
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "channel" })
@XmlRootElement(name = "rss")
public class RssType {
	@XmlElement(required = true)
	private ChannelType channel;
	@XmlAttribute(name = "version", required = true)
	private String version;

	/**
	 * Used by JAXB marshaling operations.
	 */
	public RssType() {
		super();
	}

	/**
	 * Sets the version to "2.0" by default.
	 *
	 * @param channel
	 *            the channel of the podcast
	 */
	public RssType(final ChannelType channel) {
		super();
		this.channel = channel;
		this.version = "2.0";
	}

	/**
	 * Gets the RSS version.
	 * 
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Gets the channel.
	 *
	 * @return the channel
	 */
	public ChannelType getChannel() {
		return channel;
	}

	/**
	 * Sets the channel.
	 *
	 * @param channel
	 *            the channel of the podcast
	 */
	public void setChannel(final ChannelType channel) {
		this.channel = channel;
	}

}
