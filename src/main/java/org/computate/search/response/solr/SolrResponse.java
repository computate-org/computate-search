package org.computate.search.response.solr;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolrResponse {

	public SolrResponse() {
	}

	private ResponseHeader responseHeader;

	private Response response;

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

	public class Doc {

		private Map<String, Object> fields = new HashMap<>();

		public Doc() {
		}

		public Map<String, Object> getFields() {
			return fields;
		}

		@JsonAnySetter
		public void setFields(String key, Object value) {
			this.fields = (Map<String, Object>) value;
		}

		public <T> T get(String field) {
			return (T)fields.get(field);
		}
	}

	public class Response {

		private Integer numFound;
		private Integer start;
		private Boolean numFoundExact;
		private List<Doc> docs;

		public Response() {
		}

		public Integer getNumFound() {
			return numFound;
		}

		public void setNumFound(Integer numFound) {
			this.numFound = numFound;
		}

		public Integer getStart() {
			return start;
		}

		public void setStart(Integer start) {
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

	public class FacetQueries {

		public FacetQueries() {
		}
	}

	public class FacetFields {

		public FacetFields() {
		}
	}

	public class FacetRange {

		public FacetRange() {
		}

		private List<Object> counts;
		private String gap;
		private ZonedDateTime start;
		private ZonedDateTime end;

		public List<Object> getCounts() {
			return counts;
		}

		public void setCounts(List<Object> counts) {
			this.counts = counts;
		}

		public String getGap() {
			return gap;
		}

		public void setGap(String gap) {
			this.gap = gap;
		}

		public ZonedDateTime getStart() {
			return start;
		}

		public void setStart(ZonedDateTime start) {
			this.start = start;
		}

		public ZonedDateTime getEnd() {
			return end;
		}

		public void setEnd(ZonedDateTime end) {
			this.end = end;
		}
	}

	public class FacetRanges {

		public FacetRanges() {
		}

		private Map<String, FacetRange> ranges = new HashMap<>();

		public Map<String, FacetRange> getRanges() {
			return ranges;
		}

		@JsonAnySetter
		public void setRanges(String key, Object value) {
			this.ranges = (Map<String, FacetRange>) value;
		}
	}

	public class Pivot {

		private String field;
		private String value;
		private Integer count;
		private Map<String, PivotRange> ranges = new HashMap<>();

		public Pivot() {
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

		@JsonAnySetter
		public void setRanges(String key, Object value) {
			this.ranges = (Map<String, PivotRange>) value;
		}

		public Map<String, PivotRange> getRanges() {
			return ranges;
		}
	}

	public class FacetPivot {

		private String field;
		private String value;
		private Integer count;
		@JsonProperty("ranges")
		private PivotRanges pivotRanges;

		public FacetPivot() {
		}

		private List<Pivot> pivot;

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

		public PivotRanges getPivotRanges() {
			return pivotRanges;
		}

		public void setPivotRanges(PivotRanges pivotRanges) {
			this.pivotRanges = pivotRanges;
		}

		public List<Pivot> getPivot() {
			return pivot;
		}

		public void setPivot(List<Pivot> pivot) {
			this.pivot = pivot;
		}
	}

	public class FacetPivots {

		private List<FacetPivot> pivots;
		private String[] pivotFields;

		public FacetPivots() {
		}

		public List<FacetPivot> getPivots() {
			return pivots;
		}

		@JsonAnySetter
		public void setPivots(String key, Object value) {
			setPivotFields(key.split(","));
			this.pivots = (List<FacetPivot>) value;
		}

		public String[] getPivotFields() {
			return pivotFields;
		}

		public void setPivotFields(String[] pivotFields) {
			this.pivotFields = pivotFields;
		}
	}

	public class FacetIntervals {

		public FacetIntervals() {
		}
	}

	public class FacetHeatMaps {

		public FacetHeatMaps() {
		}
	}

	public class FacetCounts {

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
		private FacetPivots facetPivots;

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

		public FacetPivots getFacetPivots() {
			return facetPivots;
		}

		public void setFacetPivots(FacetPivots facetPivots) {
			this.facetPivots = facetPivots;
		}
	}

	public class PivotRanges {

		private Map<String, PivotRange> ranges = new HashMap<>();

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

	public class PivotRange {

		private List<Object> counts;
		private String gap;
		private String start;
		private String end;

		public List<Object> getCounts() {
			return counts;
		}

		public void setCounts(List<Object> counts) {
			this.counts = counts;
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
	}

	public class Params {

		@JsonAlias("facet.range")
		private String facetRange;
		@JsonAlias("facet.range.gap")
		private String facetRangeGap;
		@JsonAlias("facet.pivot")
		private String facetPivot;
		private String start;
		private String fq;
		private String rows;
		@JsonAlias("facet.pivot.mincount")
		private String facetPivotMinCount;
		private String q;
		@JsonAlias("facet.mincount")
		private String facetMinCount;
		@JsonAlias("facet")
		private String facet;
		@JsonAlias("facet.sort")
		private String facetSort;
		@JsonAlias("facet.range.start")
		private String facetRangeStart;
		@JsonAlias("facet.range.end")
		private String facetRangeEnd;

		public Params() {
		}

		public String getFacetRange() {
			return facetRange;
		}

		public void setFacetRange(String facetRange) {
			this.facetRange = facetRange;
		}

		public String getFacetRangeGap() {
			return facetRangeGap;
		}

		public void setFacetRangeGap(String facetRangeGap) {
			this.facetRangeGap = facetRangeGap;
		}

		public String getFacetPivot() {
			return facetPivot;
		}

		public void setFacetPivot(String facetPivot) {
			this.facetPivot = facetPivot;
		}

		public String getRows() {
			return rows;
		}

		public void setRows(String rows) {
			this.rows = rows;
		}

		public String getFacetPivotMinCount() {
			return facetPivotMinCount;
		}

		public void setFacetPivotMinCount(String facetPivotMinCount) {
			this.facetPivotMinCount = facetPivotMinCount;
		}

		public String getQ() {
			return q;
		}

		public void setQ(String q) {
			this.q = q;
		}

		public String getFacetMinCount() {
			return facetMinCount;
		}

		public void setFacetMinCount(String facetMinCount) {
			this.facetMinCount = facetMinCount;
		}

		public String getFacet() {
			return facet;
		}

		public void setFacet(String facet) {
			this.facet = facet;
		}

		public String getFacetSort() {
			return facetSort;
		}

		public void setFacetSort(String facetSort) {
			this.facetSort = facetSort;
		}

		public String getFacetRangeStart() {
			return facetRangeStart;
		}

		public void setFacetRangeStart(String facetRangeStart) {
			this.facetRangeStart = facetRangeStart;
		}

		public String getFacetRangeEnd() {
			return facetRangeEnd;
		}

		public void setFacetRangeEnd(String facetRangeEnd) {
			this.facetRangeEnd = facetRangeEnd;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getFq() {
			return fq;
		}

		public void setFq(String fq) {
			this.fq = fq;
		}
	}

	public class ResponseHeader {

		public ResponseHeader() {
		}

		private Boolean zkConnected;
		private Integer status;
		@JsonAlias("QTime")
		private Integer qTime;
		private Params params;

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

		public Params getParams() {
			return params;
		}

		public void setParams(Params params) {
			this.params = params;
		}
	}
}
