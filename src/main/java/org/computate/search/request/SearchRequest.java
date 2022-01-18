package org.computate.search.request;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;

/**
 * {@inheritDoc}
 */
public class SearchRequest extends SearchRequestGen<Object> {

	public static final String UTF_8 = "UTF-8";

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

	/**
	 * {@inheritDoc}
	 */
	protected void _start(Wrap<Integer> w) {
	}
	public SearchRequest start(Integer start) {
		setStart(start);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _rows(Wrap<Integer> w) {
	}
	public SearchRequest rows(Integer rows) {
		setRows(rows);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	protected void _queryString(List<String> c) {
		StringBuilder b = new StringBuilder();
		try {
			if(query != null) {
				b.append(b.length() == 0 ? "?" : "&").append(URLEncoder.encode(query, UTF_8));
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
		} catch (UnsupportedEncodingException ex) {
			ExceptionUtils.rethrow(ex);
		}
	}
}
