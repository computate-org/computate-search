/*
 * Copyright (c) 2018-2022 Computate Limited Liability Company in Utah, USA. 
 *
 * This program and the accompanying materials are made available under the
 * terms of the GNU GENERAL PUBLIC LICENSE Version 3 which is available at
 * 
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
package org.computate.search.response.solr;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;

import org.computate.search.request.SearchRequest;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SolrResponseTest {

	@Test
	public void test() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String json1 = new String(Files.readAllBytes(Paths.get("src", "test", "resources", "solr-response.json").toAbsolutePath()), SearchRequest.UTF_8);
		SolrResponse solrResponse = mapper.readValue(json1, SolrResponse.class);
		System.out.println(solrResponse);
		ZoneId.of("Asia/Kolkata");
	}

}
