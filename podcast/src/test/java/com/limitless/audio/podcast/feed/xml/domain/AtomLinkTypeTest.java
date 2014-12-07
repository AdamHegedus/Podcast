package com.limitless.audio.podcast.feed.xml.domain;

import junit.framework.Assert;

import org.junit.Test;

public class AtomLinkTypeTest {
	private AtomLinkType underTest;

	@Test
	public void testItunesCategoryType() {
		// GIVEN

		// WHEN
		underTest = new AtomLinkType("DUMMY");
		// THEN
		Assert.assertEquals("self", underTest.getRel());
		Assert.assertEquals("application/rss+xml", underTest.getType());
	}
}
