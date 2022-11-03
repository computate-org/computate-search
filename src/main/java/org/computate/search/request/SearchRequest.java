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
package org.computate.search.request;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;

/**
 * {@inheritDoc}
 */
public class SearchRequest extends SearchRequestGen<Object> {

	public static final String UTF_8 = "UTF-8";
	public static final String SORT_asc = "asc";
	public static final String SORT_desc = "desc";

	/**
	 * {@inheritDoc}
	 * Ignore: true
	 */
	protected void _siteRequest_(Wrap<ComputateSearchSiteRequest> w) {
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The main query parameter for full-text search. 
	 */
	protected void _query(Wrap<String> w) {
	}
	public SearchRequest q(String s) {
		setQuery(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The fq parameter defines a query that can be used to restrict the superset of documents that can be returned, without influencing score. 
	 * Description.enUS: It can be very useful for speeding up complex queries, since the queries specified with fq are cached independently of the main query. 
	 * Description.enUS: When a later query uses the same filter, there’s a cache hit, and filter results are returned quickly from the cache. 
	 */
	protected void _filterQueries(List<String> w) {
	}
	public SearchRequest fq(String s) {
		addFilterQueries(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The fl parameter limits the information included in a query response to a specified list of fields. The fields must be either stored="true" or docValues="true". 
	 * Description.enUS: The field list can be specified as a space-separated or comma-separated list of field names. 
	 * Description.enUS: The string "score" can be used to indicate that the score of each document for the particular query should be returned as a field. 
	 * Description.enUS: The wildcard character * selects all the fields in the document which are either stored="true" or docValues="true" and useDocValuesAsStored="true" (which is the default when docValues are enabled). 
	 * Description.enUS: You can also add pseudo-fields, functions and transformers to the field list request.
	 */
	protected void _fields(List<String> c) {
	}
	public SearchRequest fl(String var) {
		addFields(var);
		return this;
	}
	public SearchRequest fl(String...fields) {
		for(String field : fields) {
			addFields(field);
		}
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The sort parameter arranges search results in either ascending (asc) or descending (desc) order. 
	 * Description.enUS: The parameter can be used with either numerical or alphabetical content. 
	 * Description.enUS: The directions can be entered in either all lowercase or all uppercase letters (i.e., both asc and ASC are accepted). 
	 */
	protected void _sorts(List<String> w) {
	}
	public SearchRequest sortAsc(String field) {
		addSorts(String.format("%s asc", field));
		return this;
	}
	public SearchRequest sortDesc(String field) {
		addSorts(String.format("%s desc", field));
		return this;
	}
	public SearchRequest sort(String field, String direction) {
		if(!StringUtils.equalsAny(direction, SORT_asc, SORT_desc))
			throw new RuntimeException(String.format("Invalid sort direction, must be %s or %s: %s", SORT_asc, SORT_desc, direction));
		addSorts(String.format("%s %s", field, direction));
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetPivots(List<String> w) {
	}
	public SearchRequest facetPivot(String s) {
		setFacet(true);
		addFacetPivots(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetPivotMinCount(Wrap<Integer> w) {
	}
	public SearchRequest facetPivotMinCount(Integer s) {
		setFacet(true);
		setFacetPivotMinCount(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetSort(Wrap<String> w) {
	}
	public SearchRequest facetSort(String s) {
		setFacet(true);
		setFacetSort(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facet(Wrap<Boolean> w) {
		w.o(false);
	}
	public SearchRequest facet(Boolean facet) {
		setFacet(facet);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetLimit(Wrap<Integer> w) {
	}
	public SearchRequest facetLimit(Integer s) {
		setFacet(true);
		setFacetLimit(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetMinCount(Wrap<Integer> w) {
	}
	public SearchRequest facetMinCount(Integer s) {
		setFacet(true);
		setFacetMinCount(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetOffset(Wrap<Integer> w) {
	}
	public SearchRequest facetOffset(Integer s) {
		setFacet(true);
		setFacetOffset(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeStart(Wrap<String> w) {
	}
	public SearchRequest facetRangeStart(String s) {
		setFacet(true);
		setFacetRangeStart(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeEnd(Wrap<String> w) {
	}
	public SearchRequest facetRangeEnd(String s) {
		setFacet(true);
		setFacetRangeEnd(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeGap(Wrap<String> w) {
	}
	public SearchRequest facetRangeGap(String s) {
		setFacet(true);
		setFacetRangeGap(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _cursorMark(Wrap<String> w) {
	}
	public SearchRequest cursorMark(String s) {
		setCursorMark(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetQueries(List<String> w) {
	}
	public SearchRequest facetQuery(String s) {
		addFacetQueries(s);
		return this;
	}
	@Override
	public SearchRequest addFacetQueries(String o) {
		setFacet(true);
		return super.addFacetQueries(o);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _jsonFacets(List<String> w) {
	}
	public SearchRequest jsonFacet(String s) {
		addJsonFacets(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetFields(List<String> w) {
	}
	public SearchRequest facetField(String s) {
		setFacet(true);
		addFacetFields(s);
		return this;
	}
	@Override
	public SearchRequest addFacetFields(String o) {
		setFacet(true);
		return super.addFacetFields(o);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRanges(List<String> w) {
	}
	public SearchRequest facetRange(String s) {
		setFacet(true);
		addFacetRanges(s);
		return this;
	}
	@Override
	public SearchRequest addFacetRanges(String o) {
		setFacet(true);
		return super.addFacetRanges(o);
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _start(Wrap<Long> w) {
		w.o(0L);
	}
	public SearchRequest start(Long start) {
		setStart(start);
		return this;
	}
	public SearchRequest start(Integer start) {
		setStart(start.longValue());
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _rows(Wrap<Long> w) {
		w.o(10L);
	}
	public SearchRequest rows(Long rows) {
		setRows(rows);
		return this;
	}
	public SearchRequest rows(Integer rows) {
		setRows(rows.longValue());
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The radial distance, usually in kilometers. RPT & BBoxField can set other units via the setting distanceUnits. 
	 */
	protected void _distance(Wrap<BigDecimal> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: The radial distance, usually in kilometers. RPT & BBoxField can set other units via the setting distanceUnits. 
	 */
	public SearchRequest d(BigDecimal distance) {
		setDistance(distance);
		return this;
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: The radial distance, usually in kilometers. RPT & BBoxField can set other units via the setting distanceUnits. 
	 */
	public SearchRequest d(Double distance) {
		setDistance(new BigDecimal(distance));
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The center point using the format "lat,lon" if latitude & longitude. Otherwise, "x,y" for PointType or "x y" for RPT field types.
	 */
	protected void _point(Wrap<String> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: The center point using the format "lat,lon" if latitude & longitude. Otherwise, "x,y" for PointType or "x y" for RPT field types.
	 */
	public SearchRequest pt(String point) {
		setPoint(point);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: A spatial indexed field. 
	 */
	protected void _spatialField(Wrap<String> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: A spatial indexed field. 
	 */
	public SearchRequest sfield(String spacialField) {
		setSpatialField(spatialField);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: The Stats component returns simple statistics for numeric, string, and date fields within the document set. 
	 */
	protected void _stats(Wrap<Boolean> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: The Stats component returns simple statistics for numeric, string, and date fields within the document set. 
	 */
	public SearchRequest stats(Boolean stats) {
		setStats(stats);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _statsFields(List<String> w) {
	}
	public SearchRequest statsField(String s) {
		setStats(true);
		addStatsFields(s);
		return this;
	}
	@Override
	public SearchRequest addStatsFields(String o) {
		setStats(true);
		return super.addStatsFields(o);
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: (Advanced option; not supported by LatLonType (deprecated) or PointType) If the query is used in a scoring context (e.g., as the main query in q), this local parameter determines what scores will be produced. Valid values are: none, kilometers, miles, degrees, distance, recipDistance, overlapRatio, area, area2D
	 */
	protected void _score(Wrap<String> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: (Advanced option; not supported by LatLonType (deprecated) or PointType) If the query is used in a scoring context (e.g., as the main query in q), this local parameter determines what scores will be produced. Valid values are: none, kilometers, miles, degrees, distance, recipDistance, overlapRatio, area, area2D
	 */
	public SearchRequest score(String score) {
		setScore(score);
		return this;
	}

	/**
	 * {@inheritDoc}
	 * Description.enUS: This is used to specify the units for distance measurements used throughout the use of this field. This can be degrees, kilometers or miles. 
	 */
	protected void _distanceUnits(Wrap<String> w) {
	}
	/**
	 * {@inheritDoc}
	 * Description.enUS: This is used to specify the units for distance measurements used throughout the use of this field. This can be degrees, kilometers or miles. 
	 */
	public SearchRequest distanceUnits(String distanceUnits) {
		setDistanceUnits(distanceUnits);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _queryString(Wrap<String> w) {
		StringBuilder b = new StringBuilder();
		try {
			if(query != null) {
				b.append(b.length() == 0 ? "?" : "&").append("q=").append(URLEncoder.encode(query, UTF_8));
			}
			if(filterQueries.size() > 0) {
				for(int i = 0; i < filterQueries.size(); i++) {
					String fq = filterQueries.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("fq=").append(URLEncoder.encode(fq, UTF_8));
				}
			}
			if(fields.size() > 0) {
				b.append(b.length() == 0 ? "?" : "&").append("fl=");
				for(int i = 0; i < fields.size(); i++) {
					String field = fields.get(i);
					if(i > 0)
						b.append(",");
					b.append(URLEncoder.encode(field, UTF_8));
				}
			}
			if(sorts.size() > 0) {
				for(int i = 0; i < sorts.size(); i++) {
					String sort = sorts.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("sort=").append(URLEncoder.encode(sort, UTF_8));
				}
			}
			if(facetPivots.size() > 0) {
				for(int i = 0; i < facetPivots.size(); i++) {
					String facetPivot = facetPivots.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("facet.pivot=").append(URLEncoder.encode(facetPivot, UTF_8));
				}
			}
			if(facetPivotMinCount != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.pivot.mincount=").append(facetPivotMinCount);
			}
			if(facetSort != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.sort=").append(facetSort);
			}
			if(facet) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet=").append(facet);
			}
			if(facetLimit != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.limit=").append(facetLimit);
			}
			if(facetMinCount != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.mincount=").append(facetMinCount);
			}
			if(facetOffset != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.offset=").append(facetOffset);
			}
			if(facetRangeStart != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.range.start=").append(facetRangeStart);
			}
			if(facetRangeEnd != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.range.end=").append(facetRangeEnd);
			}
			if(facetRangeGap != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.range.gap=").append(URLEncoder.encode(facetRangeGap, UTF_8));
			}
			if(cursorMark != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("cursorMark=").append(cursorMark);
			}
			if(facetQueries.size() > 0) {
				for(int i = 0; i < facetQueries.size(); i++) {
					String facetQuery = facetQueries.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("facet.query=").append(URLEncoder.encode(facetQuery, UTF_8));
				}
			}
			if(facetFields.size() > 0) {
				for(int i = 0; i < facetFields.size(); i++) {
					String facetField = facetFields.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("facet.field=").append(URLEncoder.encode(facetField, UTF_8));
				}
			}
			if(facetRanges.size() > 0) {
				for(int i = 0; i < facetRanges.size(); i++) {
					String facetRange = facetRanges.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("facet.range=").append(URLEncoder.encode(facetRange, UTF_8));
				}
			}
			if(jsonFacets.size() > 0) {
				for(int i = 0; i < jsonFacets.size(); i++) {
					String facetField = jsonFacets.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("json.facet=").append(URLEncoder.encode(facetField, UTF_8));
				}
			}
			if(rows != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("rows=").append(rows);
			}
			if(start != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("start=").append(start);
			}
			if(distance != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("d=").append(distance);
			}
			if(point != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("pt=").append(point);
			}
			if(spatialField != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("sfield=").append(spatialField);
			}
			if(score != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("score=").append(score);
			}
			if(distanceUnits != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("distanceUnits=").append(distanceUnits);
			}
			if(stats != null && stats) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("stats=").append(stats);
			}
			if(statsFields.size() > 0) {
				for(int i = 0; i < statsFields.size(); i++) {
					String statsField = statsFields.get(i);
					b.append(b.length() == 0 ? "?" : "&");
					b.append("stats.field=").append(URLEncoder.encode(statsField, UTF_8));
				}
			}
			w.o(b.toString());
		} catch (UnsupportedEncodingException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}

	@Override
	public String toString() {
		return queryString;
	}
}
