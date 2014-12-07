package com.limitless.audio.podcast.feed.xml.domain;

import junit.framework.Assert;

import org.junit.Test;

public class ItunesCategoryTypeTest {

	private ItunesCategoryType underTest;

	@Test
	public void testItunesCategoryType() {
		// GIVEN

		// WHEN
		underTest = new ItunesCategoryType("Music");
		// THEN
		Assert.assertEquals("Music", underTest.getText());
	}
}
