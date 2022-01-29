package org.computate.search.response.solr;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
