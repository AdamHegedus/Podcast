package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The &lt;itunes:owner> tag contains contact information for the owner of the
 * podcast intended to be used for administrative communication.
 *
 * @author Adam Hegedus
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itunesOwnerType", propOrder = { "name", "email" })
public class ItunesOwnerType {
	@XmlElement(required = true, namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String name;
	@XmlElement(required = true, namespace = "http://www.itunes.com/dtds/podcast-1.0.dtd")
	private String email;

	/**
	 * Gets the name of the owner.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the owner.
	 *
	 * @param name
	 *            the name of the owner
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the email of the owner.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of the owner.
	 *
	 * @param email
	 *            the email of the owner
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

}