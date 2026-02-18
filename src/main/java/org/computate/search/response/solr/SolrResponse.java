/*
 * Copyright Computate Limited Liability Company in Utah, USA. 
 * SPDX-License-Identifier: AGPL-3.0
 * This program and the accompanying materials are made available under the
 * terms of the GNU AFFERO GENERAL PUBLIC LICENSE which is available at
 * 
 * https://www.gnu.org/licenses/agpl-3.0.html
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SolrResponse {

	public SolrResponse() {
	}

	private ResponseHeader responseHeader;

	private Response response;

	private Error error;

	private Stats stats;

	private String nextCursorMark;

	private Map<String, Double> facets;

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
		private Double maxScore;
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

		public Double getMaxScore() {
			return maxScore;
		}

		public void setMaxScore(Double maxScore) {
			this.maxScore = maxScore;
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

		private Map<String, FacetField> facets = new LinkedHashMap<>();

		public Map<String, FacetField> getFacets() {
			return facets;
		}

		@JsonAnySetter
		public void setFacets(String key, Object value) {
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
		private List<Pivot> pivotList;
		private Map<String, Pivot> pivotMap = new LinkedHashMap<>();
		private Stats stats;

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
			ranges.forEach((name, range) -> {
				range.setName(name);
			});
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

		public List<Pivot> getPivotList() {
			return pivotList;
		}

		public void setPivotList(List<Pivot> pivotList) {
			this.pivotList = pivotList;
			for(Pivot value : pivotList) {
				value.setFields(Arrays.asList(value.getField()));
				pivotMap.put(value.getValue(), value);
				value.setName(value.getField());
			}
		}

		public Map<String, Pivot> getPivotMap() {
			return pivotMap;
		}

		public void setPivotMap(Map<String, Pivot> pivotMap) {
			this.pivotMap = pivotMap;
			pivotMap.forEach((name, pivot) -> {
				pivot.setName(name);
				pivot.setField(name);
			});
		}

		public List<String> getFields() {
			return fields;
		}

		public void setFields(List<String> fields) {
			this.fields = fields;
		}

		public Stats getStats() {
			return stats;
		}

		public void setStats(Stats stats) {
			this.stats = stats;
		}
	}

	public static class FacetPivot {

		private Map<String, Pivot> pivotMap = new LinkedHashMap<>();

		public FacetPivot() {
		}

		public Map<String, Pivot> getPivotMap() {
			return pivotMap;
		}

		@JsonAnySetter
		public void setPivotMap(String key, List<Pivot> list) {
			Pivot fieldPivot = new Pivot();
			fieldPivot.setName(key);
			fieldPivot.setField(key);
			pivotMap.put(key, fieldPivot);
			for(Pivot valuePivot : list) {
				valuePivot.setFields(Arrays.asList(key.split(",")));
				fieldPivot.getPivotMap().put(valuePivot.getValue(), valuePivot);
			}
		}
	}

	public static class FacetIntervals {

		public FacetIntervals() {
		}

		private Map<String, FacetField> facets = new LinkedHashMap<>();

		public Map<String, FacetField> getFacets() {
			return facets;
		}

		@JsonAnySetter
		public void setFacets(String key, Object value) {
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

	public static class FacetHeatMaps {

		public FacetHeatMaps() {
		}

		private Map<String, FacetField> facets = new LinkedHashMap<>();

		public Map<String, FacetField> getFacets() {
			return facets;
		}

		@JsonAnySetter
		public void setFacets(String key, Object value) {
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

		public Map<String, Integer> getCounts() {
			return counts;
		}

		public void setCounts(Map<String, Integer> counts) {
			this.counts = counts;
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

	public static class Stats {

		@JsonAlias("stats_fields")
		private StatsFields statsFields;

		public Stats() {
		}

		public StatsFields getStatsFields() {
			return statsFields;
		}

		public void setStatsFields(StatsFields statsFields) {
			this.statsFields = statsFields;
		}

		public StatsField get(String field) {
			if(statsFields == null)
				return null;
			else
				return statsFields.get(field);
		}
	}

	public static class StatsFields {

		private Map<String, StatsField> fields = new LinkedHashMap<>();

		public Map<String, StatsField> getFields() {
			return fields;
		}

		@JsonAnySetter
		public void setFields(String key, StatsField value) {
			fields.put(key, value);
			fields.forEach((name, field) -> {
				field.setName(name);
			});
		}

		public StatsField get(String field) {
			return fields.get(field);
		}
	}

	public static class StatsField {

		@JsonInclude(Include.NON_NULL)
		private String name;
		@JsonInclude(Include.NON_NULL)
		private Object min;
		@JsonInclude(Include.NON_NULL)
		private Object max;
		@JsonInclude(Include.NON_NULL)
		private Long count;
		@JsonInclude(Include.NON_NULL)
		private Long missing;
		@JsonInclude(Include.NON_NULL)
		private Object sum;
		@JsonInclude(Include.NON_NULL)
		private Object sumOfSquares;
		@JsonInclude(Include.NON_NULL)
		private Object mean;
		@JsonInclude(Include.NON_NULL)
		private Object stddev;

		public StatsField() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Object getMin() {
			return min;
		}

		public void setMin(Object min) {
			this.min = min;
		}

		public Object getMax() {
			return max;
		}

		public void setMax(Object max) {
			this.max = max;
		}

		public Long getCount() {
			return count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getMissing() {
			return missing;
		}

		public void setMissing(Long missing) {
			this.missing = missing;
		}

		public Object getSum() {
			return sum;
		}

		public void setSum(Object sum) {
			this.sum = sum;
		}

		public Object getSumOfSquares() {
			return sumOfSquares;
		}

		public void setSumOfSquares(Object sumOfSquares) {
			this.sumOfSquares = sumOfSquares;
		}

		public Object getMean() {
			return mean;
		}

		public void setMean(Object mean) {
			this.mean = mean;
		}

		public Object getStddev() {
			return stddev;
		}

		public void setStddev(Object stddev) {
			this.stddev = stddev;
		}
	}
//
//	public static class StatsDouble {
//
//		private Double min;
//		private Double max;
//		private Long count;
//		private Long missing;
//		private Double sum;
//		private Double sumOfSquares;
//		private Double mean;
//		private Double stddev;
//
//		public StatsDouble() {
//		}
//
//		public Double getMin() {
//			return min;
//		}
//
//		public void setMin(Double min) {
//			this.min = min;
//		}
//
//		public Double getMax() {
//			return max;
//		}
//
//		public void setMax(Double max) {
//			this.max = max;
//		}
//
//		public Long getCount() {
//			return count;
//		}
//
//		public void setCount(Long count) {
//			this.count = count;
//		}
//
//		public Long getMissing() {
//			return missing;
//		}
//
//		public void setMissing(Long missing) {
//			this.missing = missing;
//		}
//
//		public Double getSum() {
//			return sum;
//		}
//
//		public void setSum(Double sum) {
//			this.sum = sum;
//		}
//
//		public Double getSumOfSquares() {
//			return sumOfSquares;
//		}
//
//		public void setSumOfSquares(Double sumOfSquares) {
//			this.sumOfSquares = sumOfSquares;
//		}
//
//		public Double getMean() {
//			return mean;
//		}
//
//		public void setMean(Double mean) {
//			this.mean = mean;
//		}
//
//		public Double getStddev() {
//			return stddev;
//		}
//
//		public void setStddev(Double stddev) {
//			this.stddev = stddev;
//		}
//	}
//
//	public static class StatsInteger {
//
//		private Integer min;
//		private Integer max;
//		private Long count;
//		private Long missing;
//		private Integer sum;
//		private Double sumOfSquares;
//		private Double mean;
//		private Double stddev;
//
//		public StatsInteger() {
//		}
//
//		public Integer getMin() {
//			return min;
//		}
//
//		public void setMin(Integer min) {
//			this.min = min;
//		}
//
//		public Integer getMax() {
//			return max;
//		}
//
//		public void setMax(Integer max) {
//			this.max = max;
//		}
//
//		public Long getCount() {
//			return count;
//		}
//
//		public void setCount(Long count) {
//			this.count = count;
//		}
//
//		public Long getMissing() {
//			return missing;
//		}
//
//		public void setMissing(Long missing) {
//			this.missing = missing;
//		}
//
//		public Integer getSum() {
//			return sum;
//		}
//
//		public void setSum(Integer sum) {
//			this.sum = sum;
//		}
//
//		public Double getSumOfSquares() {
//			return sumOfSquares;
//		}
//
//		public void setSumOfSquares(Double sumOfSquares) {
//			this.sumOfSquares = sumOfSquares;
//		}
//
//		public Double getMean() {
//			return mean;
//		}
//
//		public void setMean(Double mean) {
//			this.mean = mean;
//		}
//
//		public Double getStddev() {
//			return stddev;
//		}
//
//		public void setStddev(Double stddev) {
//			this.stddev = stddev;
//		}
//	}
//
//	public static class StatsLong {
//
//		private Long min;
//		private Long max;
//		private Long count;
//		private Long missing;
//		private Long sum;
//		private Double sumOfSquares;
//		private Double mean;
//		private Double stddev;
//
//		public StatsLong() {
//		}
//
//		public Long getMin() {
//			return min;
//		}
//
//		public void setMin(Long min) {
//			this.min = min;
//		}
//
//		public Long getMax() {
//			return max;
//		}
//
//		public void setMax(Long max) {
//			this.max = max;
//		}
//
//		public Long getCount() {
//			return count;
//		}
//
//		public void setCount(Long count) {
//			this.count = count;
//		}
//
//		public Long getMissing() {
//			return missing;
//		}
//
//		public void setMissing(Long missing) {
//			this.missing = missing;
//		}
//
//		public Long getSum() {
//			return sum;
//		}
//
//		public void setSum(Long sum) {
//			this.sum = sum;
//		}
//
//		public Double getSumOfSquares() {
//			return sumOfSquares;
//		}
//
//		public void setSumOfSquares(Double sumOfSquares) {
//			this.sumOfSquares = sumOfSquares;
//		}
//
//		public Double getMean() {
//			return mean;
//		}
//
//		public void setMean(Double mean) {
//			this.mean = mean;
//		}
//
//		public Double getStddev() {
//			return stddev;
//		}
//
//		public void setStddev(Double stddev) {
//			this.stddev = stddev;
//		}
//	}
//
//	public static class StatsString {
//
//		private String min;
//		private String max;
//		private Long count;
//		private Long missing;
//
//		public StatsString() {
//		}
//
//		public String getMin() {
//			return min;
//		}
//
//		public void setMin(String min) {
//			this.min = min;
//		}
//
//		public String getMax() {
//			return max;
//		}
//
//		public void setMax(String max) {
//			this.max = max;
//		}
//
//		public Long getCount() {
//			return count;
//		}
//
//		public void setCount(Long count) {
//			this.count = count;
//		}
//
//		public Long getMissing() {
//			return missing;
//		}
//
//		public void setMissing(Long missing) {
//			this.missing = missing;
//		}
//	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
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

	public Map<String, Double> getFacets() {
		return facets;
	}

	public void setFacets(Map<String, Double> facets) {
		this.facets = facets;
	}
}
