/*
 * Copyright 2007 Marc Wick, geonames.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.geonames.wikipedia;

import junit.framework.TestCase;

/**
 * @author marc
 * 
 */
public class TextSummaryExtractorTest extends TestCase {

	public static void testSkipHTML() {
		String text = TextSummaryExtractor.extractSummary(
				"<!--schweizbezogen-->Anfang", 200);
		assertEquals(text, "Anfang");

		text = TextSummaryExtractor
				.extractSummary(
						"<div style=\"float:right;width:200px;padding-left:5px\"> <center> Germany. ",
						200);
		assertEquals(text, "Germany.");

	}

	public static void testTemplate() {
		String text = TextSummaryExtractor.extractSummary(
				"{{Dieser Artikel|erl{}äutert die kreisfrei}}Anfang", 200);
		assertEquals(text, "Anfang");
	}

	public static void testLinks() {

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
