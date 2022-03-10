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

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SolrResponse {

	public SolrResponse() {
	}

	private ResponseHeader responseHeader;

	private Response response;

	private Error error;

	private String nextCursorMark;

	@JsonAlias("facet_counts")
	private FacetCounts facetCounts;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public FacetCounts getFacetCounts() {
		return facetCounts;
	}

	public void setFacetCounts(FacetCounts facetCounts) {
		this.facetCounts = facetCounts;
	}

	public static class Doc {

		private Map<String, Object> fields = new LinkedHashMap<>();

		public Doc() {
		}

		public Map<String, Object> getFields() {
			return fields;
		}

		@JsonAnySetter
		public void setFields(String key, Object value) {
			fields.put(key, value);
		}

		public <T> T get(String field) {
			return (T)fields.get(field);
		}
	}

	public static class Response {

		private Long numFound;
		private Long start;
		private Boolean numFoundExact;
		private List<Doc> docs;

		public Response() {
		}

		public Long getNumFound() {
			return numFound;
		}

		public void setNumFound(Long numFound) {
			this.numFound = numFound;
		}

		public Long getStart() {
			return start;
		}

		public void setStart(Long start) {
			this.start = start;
		}

		public Boolean getNumFoundExact() {
			return numFoundExact;
		}

		public void setNumFoundExact(Boolean numFoundExact) {
			this.numFoundExact = numFoundExact;
		}

		public List<Doc> getDocs() {
			return docs;
		}

		public void setDocs(List<Doc> docs) {
			this.docs = docs;
		}
	}

	public static class FacetQueries {

		public FacetQueries() {
		}

		private Map<String, Long> facets;

		public Map<String, Long> getFacets() {
			return facets;
		}

		@JsonAnySetter
		public void setFacets(String key, Long value) {
			facets = new LinkedHashMap<>();
			facets.put(key, value);
		}
	}

	public static class FacetFields {

		public FacetFields() {
		}

		private Map<String, FacetField> facets;

		public Map<String, FacetField> getFacets() {
			return facets;
		}

		@JsonAnySetter
		public void setFacets(String key, Object value) {
			facets = new LinkedHashMap<>();
			FacetField facetField = new FacetField();
			facetField.setName(key);
			List<Object> list = (List<Object>)value;
			Map<String, Integer> fields = new LinkedHashMap<>();
			facetField.setCounts(fields);
			facets.put(key, facetField);
			for(int i=0; i < list.size(); i+=2) {
				String k = (String)list.get(i);
				Integer v = (Integer)list.get(i + 1);
				fields.put(k, v);
			}
		}
	}

	public static class FacetField {

		public FacetField() {
			setCounts(new HashMap<>());
		}

		public FacetField(String name) {
			setName(name);
			setCounts(new HashMap<>());
		}

		private String name;

		private Map<String, Integer> counts;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Map<String, Integer> getCounts() {
			return counts;
		}

		public void setCounts(Map<String, Integer> fields) {
			this.counts = fields;
		}

		public int getValueCount() {
			return Optional.ofNullable(counts).map(c -> c.size()).orElse(0);
		}
	}

	public static class FacetRange {

		public FacetRange() {
		}

		private String name;
		private Map<String, RangeCount> counts;
		private String gap;
		private String start;
		private String end;

		public Map<String, RangeCount> getCounts() {
			return counts;
		}

		@JsonSetter
		public void setCounts(List<Object> list) {
			counts = new LinkedHashMap<>();
			for(int i=0; i < list.size(); i+=2) {
				String k = (String)list.get(i);
				Long v = ((Integer)list.get(i + 1)).longValue();
				RangeCount rangeCount = new RangeCount();
				rangeCount.setName(k);
				rangeCount.setCount(v);
				counts.put(k, rangeCount);
			}
		}

		public String getGap() {
			return gap;
		}

		public void setGap(String gap) {
			this.gap = gap;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class RangeCount {

		private String name;
		private Long count;
		private Map<String, Object> vars = new HashMap<>();

		public RangeCount() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getCount() {
			return count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Map<String, Object> getVars() {
			return vars;
		}

		public void setVars(Map<String, Object> vars) {
			this.vars = vars;
		}
	}

	public static class FacetRanges {

		public FacetRanges() {
		}

		private Map<String, FacetRange> ranges = new LinkedHashMap<>();

		public Map<String, FacetRange> getRanges() {
			return ranges;
		}

		@JsonAnySetter
		public void setRanges(String key, FacetRange value) {
			ranges.put(key, value);
			ranges.forEach((name, range) -> {
				range.setName(name);
			});
		}
	}

	public static class Pivot {

		private String name;
		private List<String> fields;
		private String field;
		private String value;
		private Integer count;
		private Map<String, PivotRange> ranges = new LinkedHashMap<>();
		@JsonAlias("pivot")
		private List<Pivot> internalPivot;
		private Map<String, Pivot> pivot = new LinkedHashMap<>();

		public Pivot() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getField() {
			return field;
		}

		public void setField(String field) {
			this.field = field;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public void setRanges(Map<String, PivotRange> ranges) {
			this.ranges = ranges;
		}

		public void setRanges(String key, PivotRange value) {
			ranges.put(key, value);
			ranges.forEach((name, range) -> {
				range.setName(name);
			});
		}

		public Map<String, PivotRange> getRanges() {
			return ranges;
		}

		public List<Pivot> getInternalPivot() {
			return internalPivot;
		}

		public void setInternalPivot(List<Pivot> internalPivot) {
			this.internalPivot = internalPivot;
			for(Pivot value : internalPivot) {
				value.setFields(Arrays.asList(value.getField()));
				pivot.put(value.getValue(), value);
				value.setName(value.getField());
			}
		}

		@JsonIgnore
		public Map<String, Pivot> getPivot() {
			return pivot;
		}

		@JsonIgnore
		public void setPivot(Map<String, Pivot> pivot) {
			this.pivot = pivot;
		}

		public List<String> getFields() {
			return fields;
		}

		public void setFields(List<String> fields) {
			this.fields = fields;
		}
	}

	public static class FacetPivot {

		private Map<String, Pivot> pivot = new LinkedHashMap<>();

		public FacetPivot() {
		}

		public Map<String, Pivot> getPivot() {
			return pivot;
		}

		@JsonAnySetter
		public void setPivots(String key, List<Pivot> list) {
			Pivot fieldPivot = new Pivot();
			fieldPivot.setName(key);
			pivot.put(key, fieldPivot);
			for(Pivot valuePivot : list) {
				valuePivot.setFields(Arrays.asList(key.split(",")));
				fieldPivot.getPivot().put(valuePivot.getValue(), valuePivot);
			}
		}
	}

	public static class FacetIntervals {

		public FacetIntervals() {
		}
	}

	public static class FacetHeatMaps {

		public FacetHeatMaps() {
		}
	}

	public static class FacetCounts {

		public FacetCounts() {
		}

		@JsonAlias("facet_queries")
		private FacetQueries facetQueries;

		@JsonAlias("facet_fields")
		private FacetFields facetFields;

		@JsonAlias("facet_ranges")
		private FacetRanges facetRanges;

		@JsonAlias("facet_intervals")
		private FacetIntervals facetIntervals;

		@JsonAlias("facet_heatmaps")
		private FacetHeatMaps facetHeatMaps;

		@JsonAlias("facet_pivot")
		private FacetPivot facetPivot;

		public FacetQueries getFacetQueries() {
			return facetQueries;
		}

		public void setFacetQueries(FacetQueries facetQueries) {
			this.facetQueries = facetQueries;
		}

		public FacetFields getFacetFields() {
			return facetFields;
		}

		public void setFacetFields(FacetFields facetFields) {
			this.facetFields = facetFields;
		}

		public FacetRanges getFacetRanges() {
			return facetRanges;
		}

		public void setFacetRanges(FacetRanges facetRanges) {
			this.facetRanges = facetRanges;
		}

		public FacetIntervals getFacetIntervals() {
			return facetIntervals;
		}

		public void setFacetIntervals(FacetIntervals facetIntervals) {
			this.facetIntervals = facetIntervals;
		}

		public FacetHeatMaps getFacetHeatMaps() {
			return facetHeatMaps;
		}

		public void setFacetHeatMaps(FacetHeatMaps facetHeatMaps) {
			this.facetHeatMaps = facetHeatMaps;
		}

		public FacetPivot getFacetPivot() {
			return facetPivot;
		}

		public void setFacetPivots(FacetPivot facetPivot) {
			this.facetPivot = facetPivot;
		}
	}

	public static class PivotRanges {

		private Map<String, PivotRange> ranges = new LinkedHashMap<>();

		public PivotRanges() {
		}

		public Map<String, PivotRange> getRanges() {
			return ranges;
		}

		public void setRanges(Map<String, PivotRange> ranges) {
			this.ranges = ranges;
		}

		@JsonAnySetter
		public void setRanges(String key, Object value) {
			this.ranges = (Map<String, PivotRange>) value;
		}
	}

	public static class PivotRange {

		private Map<String, Integer> counts;
		private String gap;
		private String start;
		private String end;
		private String name;

		public PivotRange() {
		}

		public Map<String, Integer> getCounts() {
			return counts;
		}

		@JsonSetter
		public void setCounts(List<Object> list) {
			counts = new LinkedHashMap<>();
			for(int i=0; i < list.size(); i+=2) {
				String k = (String)list.get(i);
				Integer v = (Integer)list.get(i + 1);
				counts.put(k, v);
			}
		}

		public String getGap() {
			return gap;
		}

		public void setGap(String gap) {
			this.gap = gap;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static class ResponseHeader {

		public ResponseHeader() {
		}

		private Boolean zkConnected;
		private Integer status;
		@JsonAlias("QTime")
		private Integer qTime;
		private Map<String, Object> params;
		private List<String> warnings;

		public Boolean getZkConnected() {
			return zkConnected;
		}

		public void setZkConnected(Boolean zkConnected) {
			this.zkConnected = zkConnected;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getqTime() {
			return qTime;
		}

		public void setqTime(Integer qTime) {
			this.qTime = qTime;
		}

		public Map<String, Object> getParams() {
			return params;
		}

		@JsonAnySetter
		public void setParams(String key, Object value) {
			this.params = (Map<String, Object>) value;
		}

		public List<String> getWarnings() {
			return warnings;
		}

		public void setWarnings(List<String> warnings) {
			this.warnings = warnings;
		}
	}

	public static class Error {

		public Error() {
		}

		private String msg;
		private Integer code;
		private Map<String, String> metadata;

		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public Integer getCode() {
			return code;
		}
		public void setCode(Integer code) {
			this.code = code;
		}
		public Map<String, String> getMetadata() {
			return metadata;
		}
		@JsonSetter
		public void setMetadata(Object value) {
			List<String> list = (List<String>)value;
			metadata = new LinkedHashMap<>();
			for(int i=0; i < list.size(); i+=2) {
				String k = list.get(i);
				String v = list.get(i + 1);
				metadata.put(k, v);
			}
		}
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public String getNextCursorMark() {
		return nextCursorMark;
	}

	public void setNextCursorMark(String nextCursorMark) {
		this.nextCursorMark = nextCursorMark;
	}

	public FacetField getFacetField(String var) {
		return Optional.ofNullable(facetCounts).map(fc -> fc.getFacetFields()).map(ff -> ff.getFacets()).map(r ->  r.get(var)).orElse(null);
	}
}
