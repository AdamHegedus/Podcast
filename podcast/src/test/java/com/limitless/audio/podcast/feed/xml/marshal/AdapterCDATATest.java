package com.limitless.audio.podcast.feed.xml.marshal;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class AdapterCDATATest {
	private AdapterCDATA underTest;

	@Before
	public void setUp() {
		underTest = new AdapterCDATA();
	}

	@Test
	public void testMarshal() throws Exception {
		// GIVEN in setup
		final String expected = "<![CDATA[TEXT]]>";
		// WHEN
		final String actual = underTest.marshal("TEXT");
		// THEN
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testUnmarshal() throws Exception {
		// GIVEN in setup
		final String expected = "TEXT";
		// WHEN
		final String actual = underTest.unmarshal("TEXT");
		// THEN
		Assert.assertEquals(expected, actual);
	}
}
