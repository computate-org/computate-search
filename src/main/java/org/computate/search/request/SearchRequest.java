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
import java.net.URLEncoder;
import java.util.List;
import java.util.Optional;

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
	 */
	protected void _query(Wrap<String> w) {
	}
	public SearchRequest q(String s) {
		setQuery(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _filterQueries(List<String> w) {
	}
	public SearchRequest fq(String s) {
		addFilterQueries(s);
		return this;
	}

	/**
	 * {@inheritDoc}
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
		addFacetPivots(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetPivotMinCount(Wrap<Integer> w) {
	}
	public SearchRequest facetPivotMinCount(Integer s) {
		setFacetPivotMinCount(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetSort(Wrap<String> w) {
	}
	public SearchRequest facetSort(String s) {
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
		setFacetLimit(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetMinCount(Wrap<Integer> w) {
	}
	public SearchRequest facetMinCount(Integer s) {
		setFacetMinCount(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetOffset(Wrap<Integer> w) {
	}
	public SearchRequest facetOffset(Integer s) {
		setFacetOffset(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeStart(Wrap<String> w) {
	}
	public SearchRequest facetRangeStart(String s) {
		setFacetRangeStart(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeEnd(Wrap<String> w) {
	}
	public SearchRequest facetRangeEnd(String s) {
		setFacetRangeEnd(s);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _facetRangeGap(Wrap<String> w) {
	}
	public SearchRequest facetRangeGap(String s) {
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
	protected void _facetFields(List<String> w) {
	}
	public SearchRequest facetField(String s) {
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
			if(rows != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("rows=").append(rows);
			}
			if(start != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("start=").append(start);
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
