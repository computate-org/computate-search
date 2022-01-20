package org.computate.search.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.text.NumberFormat;
import org.computate.search.request.SiteRequest;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import java.math.RoundingMode;
import java.math.MathContext;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Objects;
import java.util.List;
import org.computate.search.wrap.Wrap;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br>
 **/
public abstract class SearchRequestGen<DEV> extends Object {

	//////////////////
	// siteRequest_ //
	//////////////////

	/**	 The entity siteRequest_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SiteRequest siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<SiteRequest> w);

	public SiteRequest getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(SiteRequest siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static SiteRequest staticSetSiteRequest_(SiteRequest siteRequest_, String o) {
		return null;
	}
	protected SearchRequest siteRequest_Init() {
		Wrap<SiteRequest> siteRequest_Wrap = new Wrap<SiteRequest>().var("siteRequest_");
		if(siteRequest_ == null) {
			_siteRequest_(siteRequest_Wrap);
			setSiteRequest_(siteRequest_Wrap.o);
		}
		return (SearchRequest)this;
	}

	///////////
	// query //
	///////////

	/**	 The entity query
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String query;

	/**	<br> The entity query
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:query">Find the entity query in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _query(Wrap<String> w);

	public String getQuery() {
		return query;
	}
	public void setQuery(String o) {
		this.query = SearchRequest.staticSetQuery(siteRequest_, o);
	}
	public static String staticSetQuery(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest queryInit() {
		Wrap<String> queryWrap = new Wrap<String>().var("query");
		if(query == null) {
			_query(queryWrap);
			setQuery(queryWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSolrQuery(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrQuery(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqQuery(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrQuery(siteRequest_, SearchRequest.staticSolrQuery(siteRequest_, SearchRequest.staticSetQuery(siteRequest_, o)));
	}

	///////////////////
	// filterQueries //
	///////////////////

	/**	 The entity filterQueries
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> filterQueries = new ArrayList<String>();

	/**	<br> The entity filterQueries
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:filterQueries">Find the entity filterQueries in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _filterQueries(List<String> w);

	public List<String> getFilterQueries() {
		return filterQueries;
	}

	public void setFilterQueries(List<String> filterQueries) {
		this.filterQueries = filterQueries;
	}
	public static String staticSetFilterQueries(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFilterQueries(String...objets) {
		for(String o : objets) {
			addFilterQueries(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFilterQueries(String o) {
		if(o != null)
			this.filterQueries.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest filterQueriesInit() {
		_filterQueries(filterQueries);
		return (SearchRequest)this;
	}

	public static String staticSolrFilterQueries(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFilterQueries(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFilterQueries(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFilterQueries(siteRequest_, SearchRequest.staticSolrFilterQueries(siteRequest_, SearchRequest.staticSetFilterQueries(siteRequest_, o)));
	}

	////////////
	// fields //
	////////////

	/**	 The entity fields
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> fields = new ArrayList<String>();

	/**	<br> The entity fields
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:fields">Find the entity fields in Solr</a>
	 * <br>
	 * @param c is the entity already constructed. 
	 **/
	protected abstract void _fields(List<String> c);

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	public static String staticSetFields(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFields(String...objets) {
		for(String o : objets) {
			addFields(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFields(String o) {
		if(o != null)
			this.fields.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest fieldsInit() {
		_fields(fields);
		return (SearchRequest)this;
	}

	public static String staticSolrFields(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFields(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFields(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFields(siteRequest_, SearchRequest.staticSolrFields(siteRequest_, SearchRequest.staticSetFields(siteRequest_, o)));
	}

	///////////
	// sorts //
	///////////

	/**	 The entity sorts
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> sorts = new ArrayList<String>();

	/**	<br> The entity sorts
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:sorts">Find the entity sorts in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _sorts(List<String> w);

	public List<String> getSorts() {
		return sorts;
	}

	public void setSorts(List<String> sorts) {
		this.sorts = sorts;
	}
	public static String staticSetSorts(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addSorts(String...objets) {
		for(String o : objets) {
			addSorts(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addSorts(String o) {
		if(o != null)
			this.sorts.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest sortsInit() {
		_sorts(sorts);
		return (SearchRequest)this;
	}

	public static String staticSolrSorts(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrSorts(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqSorts(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrSorts(siteRequest_, SearchRequest.staticSolrSorts(siteRequest_, SearchRequest.staticSetSorts(siteRequest_, o)));
	}

	/////////////////
	// facetPivots //
	/////////////////

	/**	 The entity facetPivots
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> facetPivots = new ArrayList<String>();

	/**	<br> The entity facetPivots
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetPivots">Find the entity facetPivots in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _facetPivots(List<String> w);

	public List<String> getFacetPivots() {
		return facetPivots;
	}

	public void setFacetPivots(List<String> facetPivots) {
		this.facetPivots = facetPivots;
	}
	public static String staticSetFacetPivots(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetPivots(String...objets) {
		for(String o : objets) {
			addFacetPivots(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFacetPivots(String o) {
		if(o != null)
			this.facetPivots.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest facetPivotsInit() {
		_facetPivots(facetPivots);
		return (SearchRequest)this;
	}

	public static String staticSolrFacetPivots(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetPivots(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetPivots(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetPivots(siteRequest_, SearchRequest.staticSolrFacetPivots(siteRequest_, SearchRequest.staticSetFacetPivots(siteRequest_, o)));
	}

	///////////
	// facet //
	///////////

	/**	 The entity facet
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean facet;

	/**	<br> The entity facet
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facet">Find the entity facet in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facet(Wrap<Boolean> w);

	public Boolean getFacet() {
		return facet;
	}

	public void setFacet(Boolean facet) {
		this.facet = facet;
	}
	@JsonIgnore
	public void setFacet(String o) {
		this.facet = SearchRequest.staticSetFacet(siteRequest_, o);
	}
	public static Boolean staticSetFacet(SiteRequest siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SearchRequest facetInit() {
		Wrap<Boolean> facetWrap = new Wrap<Boolean>().var("facet");
		if(facet == null) {
			_facet(facetWrap);
			setFacet(facetWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Boolean staticSolrFacet(SiteRequest siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSolrStrFacet(SiteRequest siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacet(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacet(siteRequest_, SearchRequest.staticSolrFacet(siteRequest_, SearchRequest.staticSetFacet(siteRequest_, o)));
	}

	/////////////////////
	// facetRangeStart //
	/////////////////////

	/**	 The entity facetRangeStart
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String facetRangeStart;

	/**	<br> The entity facetRangeStart
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetRangeStart">Find the entity facetRangeStart in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetRangeStart(Wrap<String> w);

	public String getFacetRangeStart() {
		return facetRangeStart;
	}
	public void setFacetRangeStart(String o) {
		this.facetRangeStart = SearchRequest.staticSetFacetRangeStart(siteRequest_, o);
	}
	public static String staticSetFacetRangeStart(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest facetRangeStartInit() {
		Wrap<String> facetRangeStartWrap = new Wrap<String>().var("facetRangeStart");
		if(facetRangeStart == null) {
			_facetRangeStart(facetRangeStartWrap);
			setFacetRangeStart(facetRangeStartWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSolrFacetRangeStart(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetRangeStart(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetRangeStart(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetRangeStart(siteRequest_, SearchRequest.staticSolrFacetRangeStart(siteRequest_, SearchRequest.staticSetFacetRangeStart(siteRequest_, o)));
	}

	///////////////////
	// facetRangeEnd //
	///////////////////

	/**	 The entity facetRangeEnd
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String facetRangeEnd;

	/**	<br> The entity facetRangeEnd
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetRangeEnd">Find the entity facetRangeEnd in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetRangeEnd(Wrap<String> w);

	public String getFacetRangeEnd() {
		return facetRangeEnd;
	}
	public void setFacetRangeEnd(String o) {
		this.facetRangeEnd = SearchRequest.staticSetFacetRangeEnd(siteRequest_, o);
	}
	public static String staticSetFacetRangeEnd(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest facetRangeEndInit() {
		Wrap<String> facetRangeEndWrap = new Wrap<String>().var("facetRangeEnd");
		if(facetRangeEnd == null) {
			_facetRangeEnd(facetRangeEndWrap);
			setFacetRangeEnd(facetRangeEndWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSolrFacetRangeEnd(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetRangeEnd(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetRangeEnd(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetRangeEnd(siteRequest_, SearchRequest.staticSolrFacetRangeEnd(siteRequest_, SearchRequest.staticSetFacetRangeEnd(siteRequest_, o)));
	}

	///////////////////
	// facetRangeGap //
	///////////////////

	/**	 The entity facetRangeGap
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String facetRangeGap;

	/**	<br> The entity facetRangeGap
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetRangeGap">Find the entity facetRangeGap in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetRangeGap(Wrap<String> w);

	public String getFacetRangeGap() {
		return facetRangeGap;
	}
	public void setFacetRangeGap(String o) {
		this.facetRangeGap = SearchRequest.staticSetFacetRangeGap(siteRequest_, o);
	}
	public static String staticSetFacetRangeGap(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest facetRangeGapInit() {
		Wrap<String> facetRangeGapWrap = new Wrap<String>().var("facetRangeGap");
		if(facetRangeGap == null) {
			_facetRangeGap(facetRangeGapWrap);
			setFacetRangeGap(facetRangeGapWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSolrFacetRangeGap(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetRangeGap(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetRangeGap(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetRangeGap(siteRequest_, SearchRequest.staticSolrFacetRangeGap(siteRequest_, SearchRequest.staticSetFacetRangeGap(siteRequest_, o)));
	}

	////////////////
	// cursorMark //
	////////////////

	/**	 The entity cursorMark
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String cursorMark;

	/**	<br> The entity cursorMark
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cursorMark">Find the entity cursorMark in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _cursorMark(Wrap<String> w);

	public String getCursorMark() {
		return cursorMark;
	}
	public void setCursorMark(String o) {
		this.cursorMark = SearchRequest.staticSetCursorMark(siteRequest_, o);
	}
	public static String staticSetCursorMark(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest cursorMarkInit() {
		Wrap<String> cursorMarkWrap = new Wrap<String>().var("cursorMark");
		if(cursorMark == null) {
			_cursorMark(cursorMarkWrap);
			setCursorMark(cursorMarkWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSolrCursorMark(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrCursorMark(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqCursorMark(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrCursorMark(siteRequest_, SearchRequest.staticSolrCursorMark(siteRequest_, SearchRequest.staticSetCursorMark(siteRequest_, o)));
	}

	/////////////////
	// facetFields //
	/////////////////

	/**	 The entity facetFields
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> facetFields = new ArrayList<String>();

	/**	<br> The entity facetFields
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetFields">Find the entity facetFields in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _facetFields(List<String> w);

	public List<String> getFacetFields() {
		return facetFields;
	}

	public void setFacetFields(List<String> facetFields) {
		this.facetFields = facetFields;
	}
	public static String staticSetFacetFields(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetFields(String...objets) {
		for(String o : objets) {
			addFacetFields(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFacetFields(String o) {
		if(o != null)
			this.facetFields.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest facetFieldsInit() {
		_facetFields(facetFields);
		return (SearchRequest)this;
	}

	public static String staticSolrFacetFields(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetFields(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetFields(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetFields(siteRequest_, SearchRequest.staticSolrFacetFields(siteRequest_, SearchRequest.staticSetFacetFields(siteRequest_, o)));
	}

	/////////////////
	// facetRanges //
	/////////////////

	/**	 The entity facetRanges
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> facetRanges = new ArrayList<String>();

	/**	<br> The entity facetRanges
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:facetRanges">Find the entity facetRanges in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _facetRanges(List<String> w);

	public List<String> getFacetRanges() {
		return facetRanges;
	}

	public void setFacetRanges(List<String> facetRanges) {
		this.facetRanges = facetRanges;
	}
	public static String staticSetFacetRanges(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetRanges(String...objets) {
		for(String o : objets) {
			addFacetRanges(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFacetRanges(String o) {
		if(o != null)
			this.facetRanges.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest facetRangesInit() {
		_facetRanges(facetRanges);
		return (SearchRequest)this;
	}

	public static String staticSolrFacetRanges(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrFacetRanges(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqFacetRanges(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrFacetRanges(siteRequest_, SearchRequest.staticSolrFacetRanges(siteRequest_, SearchRequest.staticSetFacetRanges(siteRequest_, o)));
	}

	///////////
	// start //
	///////////

	/**	 The entity start
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer start;

	/**	<br> The entity start
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:start">Find the entity start in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _start(Wrap<Integer> w);

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}
	@JsonIgnore
	public void setStart(String o) {
		this.start = SearchRequest.staticSetStart(siteRequest_, o);
	}
	public static Integer staticSetStart(SiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest startInit() {
		Wrap<Integer> startWrap = new Wrap<Integer>().var("start");
		if(start == null) {
			_start(startWrap);
			setStart(startWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSolrStart(SiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSolrStrStart(SiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqStart(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrStart(siteRequest_, SearchRequest.staticSolrStart(siteRequest_, SearchRequest.staticSetStart(siteRequest_, o)));
	}

	//////////
	// rows //
	//////////

	/**	 The entity rows
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer rows;

	/**	<br> The entity rows
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:rows">Find the entity rows in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _rows(Wrap<Integer> w);

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	@JsonIgnore
	public void setRows(String o) {
		this.rows = SearchRequest.staticSetRows(siteRequest_, o);
	}
	public static Integer staticSetRows(SiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest rowsInit() {
		Wrap<Integer> rowsWrap = new Wrap<Integer>().var("rows");
		if(rows == null) {
			_rows(rowsWrap);
			setRows(rowsWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSolrRows(SiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSolrStrRows(SiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqRows(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrRows(siteRequest_, SearchRequest.staticSolrRows(siteRequest_, SearchRequest.staticSetRows(siteRequest_, o)));
	}

	/////////////////
	// queryString //
	/////////////////

	/**	 The entity queryString
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> queryString = new ArrayList<String>();

	/**	<br> The entity queryString
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:queryString">Find the entity queryString in Solr</a>
	 * <br>
	 * @param c is the entity already constructed. 
	 **/
	protected abstract void _queryString(List<String> c);

	public List<String> getQueryString() {
		return queryString;
	}

	public void setQueryString(List<String> queryString) {
		this.queryString = queryString;
	}
	public static String staticSetQueryString(SiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addQueryString(String...objets) {
		for(String o : objets) {
			addQueryString(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addQueryString(String o) {
		if(o != null)
			this.queryString.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest queryStringInit() {
		_queryString(queryString);
		return (SearchRequest)this;
	}

	public static String staticSolrQueryString(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSolrStrQueryString(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSolrFqQueryString(SiteRequest siteRequest_, String o) {
		return SearchRequest.staticSolrStrQueryString(siteRequest_, SearchRequest.staticSolrQueryString(siteRequest_, SearchRequest.staticSetQueryString(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public SearchRequest initDeepSearchRequest(SiteRequest siteRequest_) {
		setSiteRequest_(siteRequest_);
		initDeepSearchRequest();
		return (SearchRequest)this;
	}

	public void initDeepSearchRequest() {
		initSearchRequest();
	}

	public void initSearchRequest() {
				siteRequest_Init();
				queryInit();
				filterQueriesInit();
				fieldsInit();
				sortsInit();
				facetPivotsInit();
				facetInit();
				facetRangeStartInit();
				facetRangeEndInit();
				facetRangeGapInit();
				cursorMarkInit();
				facetFieldsInit();
				facetRangesInit();
				startInit();
				rowsInit();
				queryStringInit();
	}

	public void initDeepForClass(SiteRequest siteRequest_) {
		initDeepSearchRequest(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSearchRequest(SiteRequest siteRequest_) {
	}

	public void siteRequestForClass(SiteRequest siteRequest_) {
		siteRequestSearchRequest(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSearchRequest(v);
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainSearchRequest(String var) {
		SearchRequest oSearchRequest = (SearchRequest)this;
		switch(var) {
			case "siteRequest_":
				return oSearchRequest.siteRequest_;
			case "query":
				return oSearchRequest.query;
			case "filterQueries":
				return oSearchRequest.filterQueries;
			case "fields":
				return oSearchRequest.fields;
			case "sorts":
				return oSearchRequest.sorts;
			case "facetPivots":
				return oSearchRequest.facetPivots;
			case "facet":
				return oSearchRequest.facet;
			case "facetRangeStart":
				return oSearchRequest.facetRangeStart;
			case "facetRangeEnd":
				return oSearchRequest.facetRangeEnd;
			case "facetRangeGap":
				return oSearchRequest.facetRangeGap;
			case "cursorMark":
				return oSearchRequest.cursorMark;
			case "facetFields":
				return oSearchRequest.facetFields;
			case "facetRanges":
				return oSearchRequest.facetRanges;
			case "start":
				return oSearchRequest.start;
			case "rows":
				return oSearchRequest.rows;
			case "queryString":
				return oSearchRequest.queryString;
			default:
				return null;
		}
	}

	///////////////
	// relate //
	///////////////

	public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateSearchRequest(v, val);
		}
		return o != null;
	}
	public Object relateSearchRequest(String var, Object val) {
		SearchRequest oSearchRequest = (SearchRequest)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSetSearchRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSearchRequest(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSetQuery(siteRequest_, o);
		case "filterQueries":
			return SearchRequest.staticSetFilterQueries(siteRequest_, o);
		case "fields":
			return SearchRequest.staticSetFields(siteRequest_, o);
		case "sorts":
			return SearchRequest.staticSetSorts(siteRequest_, o);
		case "facetPivots":
			return SearchRequest.staticSetFacetPivots(siteRequest_, o);
		case "facet":
			return SearchRequest.staticSetFacet(siteRequest_, o);
		case "facetRangeStart":
			return SearchRequest.staticSetFacetRangeStart(siteRequest_, o);
		case "facetRangeEnd":
			return SearchRequest.staticSetFacetRangeEnd(siteRequest_, o);
		case "facetRangeGap":
			return SearchRequest.staticSetFacetRangeGap(siteRequest_, o);
		case "cursorMark":
			return SearchRequest.staticSetCursorMark(siteRequest_, o);
		case "facetFields":
			return SearchRequest.staticSetFacetFields(siteRequest_, o);
		case "facetRanges":
			return SearchRequest.staticSetFacetRanges(siteRequest_, o);
		case "start":
			return SearchRequest.staticSetStart(siteRequest_, o);
		case "rows":
			return SearchRequest.staticSetRows(siteRequest_, o);
		case "queryString":
			return SearchRequest.staticSetQueryString(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSolrSearchRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSolrSearchRequest(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSolrQuery(siteRequest_, (String)o);
		case "filterQueries":
			return SearchRequest.staticSolrFilterQueries(siteRequest_, (String)o);
		case "fields":
			return SearchRequest.staticSolrFields(siteRequest_, (String)o);
		case "sorts":
			return SearchRequest.staticSolrSorts(siteRequest_, (String)o);
		case "facetPivots":
			return SearchRequest.staticSolrFacetPivots(siteRequest_, (String)o);
		case "facet":
			return SearchRequest.staticSolrFacet(siteRequest_, (Boolean)o);
		case "facetRangeStart":
			return SearchRequest.staticSolrFacetRangeStart(siteRequest_, (String)o);
		case "facetRangeEnd":
			return SearchRequest.staticSolrFacetRangeEnd(siteRequest_, (String)o);
		case "facetRangeGap":
			return SearchRequest.staticSolrFacetRangeGap(siteRequest_, (String)o);
		case "cursorMark":
			return SearchRequest.staticSolrCursorMark(siteRequest_, (String)o);
		case "facetFields":
			return SearchRequest.staticSolrFacetFields(siteRequest_, (String)o);
		case "facetRanges":
			return SearchRequest.staticSolrFacetRanges(siteRequest_, (String)o);
		case "start":
			return SearchRequest.staticSolrStart(siteRequest_, (Integer)o);
		case "rows":
			return SearchRequest.staticSolrRows(siteRequest_, (Integer)o);
		case "queryString":
			return SearchRequest.staticSolrQueryString(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSolrStrSearchRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSolrStrSearchRequest(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSolrStrQuery(siteRequest_, (String)o);
		case "filterQueries":
			return SearchRequest.staticSolrStrFilterQueries(siteRequest_, (String)o);
		case "fields":
			return SearchRequest.staticSolrStrFields(siteRequest_, (String)o);
		case "sorts":
			return SearchRequest.staticSolrStrSorts(siteRequest_, (String)o);
		case "facetPivots":
			return SearchRequest.staticSolrStrFacetPivots(siteRequest_, (String)o);
		case "facet":
			return SearchRequest.staticSolrStrFacet(siteRequest_, (Boolean)o);
		case "facetRangeStart":
			return SearchRequest.staticSolrStrFacetRangeStart(siteRequest_, (String)o);
		case "facetRangeEnd":
			return SearchRequest.staticSolrStrFacetRangeEnd(siteRequest_, (String)o);
		case "facetRangeGap":
			return SearchRequest.staticSolrStrFacetRangeGap(siteRequest_, (String)o);
		case "cursorMark":
			return SearchRequest.staticSolrStrCursorMark(siteRequest_, (String)o);
		case "facetFields":
			return SearchRequest.staticSolrStrFacetFields(siteRequest_, (String)o);
		case "facetRanges":
			return SearchRequest.staticSolrStrFacetRanges(siteRequest_, (String)o);
		case "start":
			return SearchRequest.staticSolrStrStart(siteRequest_, (Integer)o);
		case "rows":
			return SearchRequest.staticSolrStrRows(siteRequest_, (Integer)o);
		case "queryString":
			return SearchRequest.staticSolrStrQueryString(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSolrFqSearchRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSolrFqSearchRequest(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSolrFqQuery(siteRequest_, o);
		case "filterQueries":
			return SearchRequest.staticSolrFqFilterQueries(siteRequest_, o);
		case "fields":
			return SearchRequest.staticSolrFqFields(siteRequest_, o);
		case "sorts":
			return SearchRequest.staticSolrFqSorts(siteRequest_, o);
		case "facetPivots":
			return SearchRequest.staticSolrFqFacetPivots(siteRequest_, o);
		case "facet":
			return SearchRequest.staticSolrFqFacet(siteRequest_, o);
		case "facetRangeStart":
			return SearchRequest.staticSolrFqFacetRangeStart(siteRequest_, o);
		case "facetRangeEnd":
			return SearchRequest.staticSolrFqFacetRangeEnd(siteRequest_, o);
		case "facetRangeGap":
			return SearchRequest.staticSolrFqFacetRangeGap(siteRequest_, o);
		case "cursorMark":
			return SearchRequest.staticSolrFqCursorMark(siteRequest_, o);
		case "facetFields":
			return SearchRequest.staticSolrFqFacetFields(siteRequest_, o);
		case "facetRanges":
			return SearchRequest.staticSolrFqFacetRanges(siteRequest_, o);
		case "start":
			return SearchRequest.staticSolrFqStart(siteRequest_, o);
		case "rows":
			return SearchRequest.staticSolrFqRows(siteRequest_, o);
		case "queryString":
			return SearchRequest.staticSolrFqQueryString(siteRequest_, o);
			default:
				return null;
		}
	}

	/////////////
	// define //
	/////////////

	public boolean defineForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = defineSearchRequest(v, val);
			}
		}
		return o != null;
	}
	public Object defineSearchRequest(String var, Object val) {
		switch(var.toLowerCase()) {
			default:
				return null;
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_query = "query";
	public static final String VAR_filterQueries = "filterQueries";
	public static final String VAR_fields = "fields";
	public static final String VAR_sorts = "sorts";
	public static final String VAR_facetPivots = "facetPivots";
	public static final String VAR_facet = "facet";
	public static final String VAR_facetRangeStart = "facetRangeStart";
	public static final String VAR_facetRangeEnd = "facetRangeEnd";
	public static final String VAR_facetRangeGap = "facetRangeGap";
	public static final String VAR_cursorMark = "cursorMark";
	public static final String VAR_facetFields = "facetFields";
	public static final String VAR_facetRanges = "facetRanges";
	public static final String VAR_start = "start";
	public static final String VAR_rows = "rows";
	public static final String VAR_queryString = "queryString";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_query = "";
	public static final String DISPLAY_NAME_filterQueries = "";
	public static final String DISPLAY_NAME_fields = "";
	public static final String DISPLAY_NAME_sorts = "";
	public static final String DISPLAY_NAME_facetPivots = "";
	public static final String DISPLAY_NAME_facet = "";
	public static final String DISPLAY_NAME_facetRangeStart = "";
	public static final String DISPLAY_NAME_facetRangeEnd = "";
	public static final String DISPLAY_NAME_facetRangeGap = "";
	public static final String DISPLAY_NAME_cursorMark = "";
	public static final String DISPLAY_NAME_facetFields = "";
	public static final String DISPLAY_NAME_facetRanges = "";
	public static final String DISPLAY_NAME_start = "";
	public static final String DISPLAY_NAME_rows = "";
	public static final String DISPLAY_NAME_queryString = "";

	public static String displayNameForClass(String var) {
		return SearchRequest.displayNameSearchRequest(var);
	}
	public static String displayNameSearchRequest(String var) {
		switch(var) {
		case VAR_siteRequest_:
			return DISPLAY_NAME_siteRequest_;
		case VAR_query:
			return DISPLAY_NAME_query;
		case VAR_filterQueries:
			return DISPLAY_NAME_filterQueries;
		case VAR_fields:
			return DISPLAY_NAME_fields;
		case VAR_sorts:
			return DISPLAY_NAME_sorts;
		case VAR_facetPivots:
			return DISPLAY_NAME_facetPivots;
		case VAR_facet:
			return DISPLAY_NAME_facet;
		case VAR_facetRangeStart:
			return DISPLAY_NAME_facetRangeStart;
		case VAR_facetRangeEnd:
			return DISPLAY_NAME_facetRangeEnd;
		case VAR_facetRangeGap:
			return DISPLAY_NAME_facetRangeGap;
		case VAR_cursorMark:
			return DISPLAY_NAME_cursorMark;
		case VAR_facetFields:
			return DISPLAY_NAME_facetFields;
		case VAR_facetRanges:
			return DISPLAY_NAME_facetRanges;
		case VAR_start:
			return DISPLAY_NAME_start;
		case VAR_rows:
			return DISPLAY_NAME_rows;
		case VAR_queryString:
			return DISPLAY_NAME_queryString;
		default:
			return null;
		}
	}
}
