package com.limitless.audio.podcast.feed.xml.domain;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Test;

public class RssTypeTest {
	private RssType underTest;

	@Test
	public void testRssType() {
		// GIVEN
		final ChannelType channel = EasyMock.createMock(ChannelType.class);
		EasyMock.replay(channel);
		// WHEN
		underTest = new RssType(channel);
		// THEN
		EasyMock.verify(channel);
		Assert.assertEquals("2.0", underTest.getVersion());
	}
}
