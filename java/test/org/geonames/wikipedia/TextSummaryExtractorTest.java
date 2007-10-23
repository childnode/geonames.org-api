package org.geonames.wikipedia;

import junit.framework.TestCase;

public class TextSummaryExtractorTest extends TestCase {

	public static void testExtraction() {
		String text = TextSummaryExtractor.extractSummary(
				"{{Dieser Artikel|erl{}äutert die kreisfrei}}Anfang", 200);
		assertEquals(text, "Anfang");

		text = TextSummaryExtractor.extractSummary(
				"<!--schweizbezogen-->Anfang", 200);
		assertEquals(text, "Anfang");

		text = TextSummaryExtractor
				.extractSummary(
						"<div style=\"float:right;width:200px;padding-left:5px\"> <center> Germany. ",
						200);
		System.out.println(text);
		assertEquals(text, "Germany.");

		String link = TextSummaryExtractor.extractSummary("[[anchor]]", 200);
		assertEquals(link, "anchor");

		link = TextSummaryExtractor.extractSummary("[[anchor]]s", 200);
		assertEquals(link, "anchors");

		link = TextSummaryExtractor.extractSummary("[[url|anchor]]", 200);
		assertEquals(link, "anchor");

		link = TextSummaryExtractor.extractSummary("[[Bild:url|anchor]]Text",
				200);
		assertEquals(link, "Text");

		link = TextSummaryExtractor
				.extractSummary(
						"[[Image:Satellite image of Ameland, Netherlands (5.78E 53.43N).png|thumb|right|290px|Satellite image]]Text",
						200);
		assertEquals(link, "Text");

		link = TextSummaryExtractor
				.extractSummary(
						"[[Image:neva spit.jpg|thumb|300px|The [[Neva]] river has been called the main street of St Petersburg.]]Text",
						200);
		assertEquals(link, "Text");

		link = TextSummaryExtractor.extractSummary("[[de:url]]Text", 200);
		assertEquals(link, "Text");

	}

}
