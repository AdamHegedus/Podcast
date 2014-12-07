package com.limitless.audio.podcast.feed.xml.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * The atom:link element defines a relationship between a web resource and an
 * RSS channel or item (optional). The most common use is to identify an HTML
 * representation of an entry in an RSS or Atom feed.
 *
 * <pre>
 * &lt;atom:link href="website/rss.xml" rel="self" type="application/rss+xml" />
 * </pre>
 *
 * @author Adam Hegedus
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomLinkType")
public class AtomLinkType {
	@XmlAttribute(name = "href", required = true)
	private String href;
	@XmlAttribute(name = "rel", required = true)
	private String rel;
	@XmlAttribute(name = "type", required = true)
	private String type;

	/**
	 * Used by JAXB marshaling operations.
	 */
	public AtomLinkType() {
		super();
	}

	/**
	 * Sets attributes to "self" and "application/rss+xml" by default.
	 *
	 * @param href
	 *            is {@link String}, the xml file's URI
	 */
	public AtomLinkType(final String href) {
		this.href = href;
		this.rel = "self";
		this.type = "application/rss+xml";
	}

	/**
	 * Gets the URI of the links.
	 *
	 * @return the href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * Sets the URI of the links.
	 *
	 * @param href
	 *            the URI of the links
	 */
	public void setHref(final String href) {
		this.href = href;
	}

	/**
	 * Gets the relationship between the linked resource and the element.
	 *
	 * @return the relationship
	 */
	public String getRel() {
		return rel;
	}

	/**
	 * Sets the relationship between the linked resource and the element.
	 *
	 * @param rel
	 *            the relationship
	 */
	public void setRel(final String rel) {
		this.rel = rel;
	}

	/**
	 * Gets the the resource's MIME media type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the the resource's MIME media type.
	 *
	 * @param type
	 *            the MIME type
	 */
	public void setType(final String type) {
		this.type = type;
	}
}