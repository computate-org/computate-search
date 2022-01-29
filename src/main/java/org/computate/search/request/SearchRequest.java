package org.computate.search.request;

import java.io.UnsupportedEncodingException;
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
	protected void _siteRequest_(Wrap<SiteRequest> w) {
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
					b.append("sort=").append(URLEncoder.encode(facetPivot, UTF_8));
				}
			}
			if(facet) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet=").append(facet);
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
				b.append("facet.range.gap=").append(facetRangeGap);
			}
			if(cursorMark != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("cursorMark=").append(cursorMark);
			}
			if(facetRangeStart != null) {
				b.append(b.length() == 0 ? "?" : "&");
				b.append("facet.range.start=").append(facetRangeStart);
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
			w.o(b.toString());
		} catch (UnsupportedEncodingException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}
}
