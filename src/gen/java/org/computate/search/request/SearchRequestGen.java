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

import org.computate.search.request.ComputateSearchSiteRequest;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.math.RoundingMode;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import java.math.BigDecimal;
import org.computate.search.wrap.Wrap;

/**	
 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest">Find the class SearchRequest in Solr. </a>
 * <br><br>Delete the class SearchRequest in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the package org.computate.search.request in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.search.request&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
 * <br>Delete  the project computate-search in Solr. 
 * <br><pre>curl 'http://localhost:8983/solr/computate/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:computate\-search&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'</pre>
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
	protected ComputateSearchSiteRequest siteRequest_;

	/**	<br> The entity siteRequest_
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:siteRequest_">Find the entity siteRequest_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _siteRequest_(Wrap<ComputateSearchSiteRequest> w);

	public ComputateSearchSiteRequest getSiteRequest_() {
		return siteRequest_;
	}

	public void setSiteRequest_(ComputateSearchSiteRequest siteRequest_) {
		this.siteRequest_ = siteRequest_;
	}
	public static ComputateSearchSiteRequest staticSetSiteRequest_(ComputateSearchSiteRequest siteRequest_, String o) {
		return null;
	}
	protected SearchRequest siteRequest_Init() {
		Wrap<ComputateSearchSiteRequest> siteRequest_Wrap = new Wrap<ComputateSearchSiteRequest>().var("siteRequest_");
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:query">Find the entity query in Solr</a>
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
	public static String staticSetQuery(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static String staticSearchQuery(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrQuery(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqQuery(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrQuery(siteRequest_, SearchRequest.staticSearchQuery(siteRequest_, SearchRequest.staticSetQuery(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:filterQueries">Find the entity filterQueries in Solr</a>
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
	public static String staticSetFilterQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFilterQueries(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchFilterQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFilterQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFilterQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFilterQueries(siteRequest_, SearchRequest.staticSearchFilterQueries(siteRequest_, SearchRequest.staticSetFilterQueries(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:fields">Find the entity fields in Solr</a>
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
	public static String staticSetFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFields(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFields(siteRequest_, SearchRequest.staticSearchFields(siteRequest_, SearchRequest.staticSetFields(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:sorts">Find the entity sorts in Solr</a>
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
	public static String staticSetSorts(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addSorts(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchSorts(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSorts(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSorts(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrSorts(siteRequest_, SearchRequest.staticSearchSorts(siteRequest_, SearchRequest.staticSetSorts(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetPivots">Find the entity facetPivots in Solr</a>
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
	public static String staticSetFacetPivots(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetPivots(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchFacetPivots(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetPivots(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetPivots(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetPivots(siteRequest_, SearchRequest.staticSearchFacetPivots(siteRequest_, SearchRequest.staticSetFacetPivots(siteRequest_, o)));
	}

	////////////////////////
	// facetPivotMinCount //
	////////////////////////

	/**	 The entity facetPivotMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer facetPivotMinCount;

	/**	<br> The entity facetPivotMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetPivotMinCount">Find the entity facetPivotMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetPivotMinCount(Wrap<Integer> w);

	public Integer getFacetPivotMinCount() {
		return facetPivotMinCount;
	}

	public void setFacetPivotMinCount(Integer facetPivotMinCount) {
		this.facetPivotMinCount = facetPivotMinCount;
	}
	@JsonIgnore
	public void setFacetPivotMinCount(String o) {
		this.facetPivotMinCount = SearchRequest.staticSetFacetPivotMinCount(siteRequest_, o);
	}
	public static Integer staticSetFacetPivotMinCount(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest facetPivotMinCountInit() {
		Wrap<Integer> facetPivotMinCountWrap = new Wrap<Integer>().var("facetPivotMinCount");
		if(facetPivotMinCount == null) {
			_facetPivotMinCount(facetPivotMinCountWrap);
			setFacetPivotMinCount(facetPivotMinCountWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSearchFacetPivotMinCount(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrFacetPivotMinCount(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetPivotMinCount(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetPivotMinCount(siteRequest_, SearchRequest.staticSearchFacetPivotMinCount(siteRequest_, SearchRequest.staticSetFacetPivotMinCount(siteRequest_, o)));
	}

	///////////////
	// facetSort //
	///////////////

	/**	 The entity facetSort
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String facetSort;

	/**	<br> The entity facetSort
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetSort">Find the entity facetSort in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetSort(Wrap<String> w);

	public String getFacetSort() {
		return facetSort;
	}
	public void setFacetSort(String o) {
		this.facetSort = SearchRequest.staticSetFacetSort(siteRequest_, o);
	}
	public static String staticSetFacetSort(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest facetSortInit() {
		Wrap<String> facetSortWrap = new Wrap<String>().var("facetSort");
		if(facetSort == null) {
			_facetSort(facetSortWrap);
			setFacetSort(facetSortWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchFacetSort(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetSort(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetSort(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetSort(siteRequest_, SearchRequest.staticSearchFacetSort(siteRequest_, SearchRequest.staticSetFacetSort(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facet">Find the entity facet in Solr</a>
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
	public static Boolean staticSetFacet(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static Boolean staticSearchFacet(ComputateSearchSiteRequest siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrFacet(ComputateSearchSiteRequest siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacet(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacet(siteRequest_, SearchRequest.staticSearchFacet(siteRequest_, SearchRequest.staticSetFacet(siteRequest_, o)));
	}

	////////////////
	// facetLimit //
	////////////////

	/**	 The entity facetLimit
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer facetLimit;

	/**	<br> The entity facetLimit
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetLimit">Find the entity facetLimit in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetLimit(Wrap<Integer> w);

	public Integer getFacetLimit() {
		return facetLimit;
	}

	public void setFacetLimit(Integer facetLimit) {
		this.facetLimit = facetLimit;
	}
	@JsonIgnore
	public void setFacetLimit(String o) {
		this.facetLimit = SearchRequest.staticSetFacetLimit(siteRequest_, o);
	}
	public static Integer staticSetFacetLimit(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest facetLimitInit() {
		Wrap<Integer> facetLimitWrap = new Wrap<Integer>().var("facetLimit");
		if(facetLimit == null) {
			_facetLimit(facetLimitWrap);
			setFacetLimit(facetLimitWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSearchFacetLimit(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrFacetLimit(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetLimit(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetLimit(siteRequest_, SearchRequest.staticSearchFacetLimit(siteRequest_, SearchRequest.staticSetFacetLimit(siteRequest_, o)));
	}

	///////////////////
	// facetMinCount //
	///////////////////

	/**	 The entity facetMinCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer facetMinCount;

	/**	<br> The entity facetMinCount
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetMinCount">Find the entity facetMinCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetMinCount(Wrap<Integer> w);

	public Integer getFacetMinCount() {
		return facetMinCount;
	}

	public void setFacetMinCount(Integer facetMinCount) {
		this.facetMinCount = facetMinCount;
	}
	@JsonIgnore
	public void setFacetMinCount(String o) {
		this.facetMinCount = SearchRequest.staticSetFacetMinCount(siteRequest_, o);
	}
	public static Integer staticSetFacetMinCount(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest facetMinCountInit() {
		Wrap<Integer> facetMinCountWrap = new Wrap<Integer>().var("facetMinCount");
		if(facetMinCount == null) {
			_facetMinCount(facetMinCountWrap);
			setFacetMinCount(facetMinCountWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSearchFacetMinCount(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrFacetMinCount(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetMinCount(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetMinCount(siteRequest_, SearchRequest.staticSearchFacetMinCount(siteRequest_, SearchRequest.staticSetFacetMinCount(siteRequest_, o)));
	}

	/////////////////
	// facetOffset //
	/////////////////

	/**	 The entity facetOffset
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer facetOffset;

	/**	<br> The entity facetOffset
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetOffset">Find the entity facetOffset in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _facetOffset(Wrap<Integer> w);

	public Integer getFacetOffset() {
		return facetOffset;
	}

	public void setFacetOffset(Integer facetOffset) {
		this.facetOffset = facetOffset;
	}
	@JsonIgnore
	public void setFacetOffset(String o) {
		this.facetOffset = SearchRequest.staticSetFacetOffset(siteRequest_, o);
	}
	public static Integer staticSetFacetOffset(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected SearchRequest facetOffsetInit() {
		Wrap<Integer> facetOffsetWrap = new Wrap<Integer>().var("facetOffset");
		if(facetOffset == null) {
			_facetOffset(facetOffsetWrap);
			setFacetOffset(facetOffsetWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Integer staticSearchFacetOffset(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrFacetOffset(ComputateSearchSiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetOffset(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetOffset(siteRequest_, SearchRequest.staticSearchFacetOffset(siteRequest_, SearchRequest.staticSetFacetOffset(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetRangeStart">Find the entity facetRangeStart in Solr</a>
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
	public static String staticSetFacetRangeStart(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static String staticSearchFacetRangeStart(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetRangeStart(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetRangeStart(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetRangeStart(siteRequest_, SearchRequest.staticSearchFacetRangeStart(siteRequest_, SearchRequest.staticSetFacetRangeStart(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetRangeEnd">Find the entity facetRangeEnd in Solr</a>
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
	public static String staticSetFacetRangeEnd(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static String staticSearchFacetRangeEnd(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetRangeEnd(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetRangeEnd(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetRangeEnd(siteRequest_, SearchRequest.staticSearchFacetRangeEnd(siteRequest_, SearchRequest.staticSetFacetRangeEnd(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetRangeGap">Find the entity facetRangeGap in Solr</a>
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
	public static String staticSetFacetRangeGap(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static String staticSearchFacetRangeGap(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetRangeGap(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetRangeGap(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetRangeGap(siteRequest_, SearchRequest.staticSearchFacetRangeGap(siteRequest_, SearchRequest.staticSetFacetRangeGap(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:cursorMark">Find the entity cursorMark in Solr</a>
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
	public static String staticSetCursorMark(ComputateSearchSiteRequest siteRequest_, String o) {
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

	public static String staticSearchCursorMark(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrCursorMark(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqCursorMark(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrCursorMark(siteRequest_, SearchRequest.staticSearchCursorMark(siteRequest_, SearchRequest.staticSetCursorMark(siteRequest_, o)));
	}

	//////////////////
	// facetQueries //
	//////////////////

	/**	 The entity facetQueries
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> facetQueries = new ArrayList<String>();

	/**	<br> The entity facetQueries
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetQueries">Find the entity facetQueries in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _facetQueries(List<String> w);

	public List<String> getFacetQueries() {
		return facetQueries;
	}

	public void setFacetQueries(List<String> facetQueries) {
		this.facetQueries = facetQueries;
	}
	public static String staticSetFacetQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetQueries(String...objects) {
		for(String o : objects) {
			addFacetQueries(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addFacetQueries(String o) {
		if(o != null)
			this.facetQueries.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest facetQueriesInit() {
		_facetQueries(facetQueries);
		return (SearchRequest)this;
	}

	public static String staticSearchFacetQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetQueries(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetQueries(siteRequest_, SearchRequest.staticSearchFacetQueries(siteRequest_, SearchRequest.staticSetFacetQueries(siteRequest_, o)));
	}

	////////////////
	// jsonFacets //
	////////////////

	/**	 The entity jsonFacets
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> jsonFacets = new ArrayList<String>();

	/**	<br> The entity jsonFacets
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:jsonFacets">Find the entity jsonFacets in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _jsonFacets(List<String> w);

	public List<String> getJsonFacets() {
		return jsonFacets;
	}

	public void setJsonFacets(List<String> jsonFacets) {
		this.jsonFacets = jsonFacets;
	}
	public static String staticSetJsonFacets(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addJsonFacets(String...objects) {
		for(String o : objects) {
			addJsonFacets(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addJsonFacets(String o) {
		if(o != null)
			this.jsonFacets.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest jsonFacetsInit() {
		_jsonFacets(jsonFacets);
		return (SearchRequest)this;
	}

	public static String staticSearchJsonFacets(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrJsonFacets(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqJsonFacets(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrJsonFacets(siteRequest_, SearchRequest.staticSearchJsonFacets(siteRequest_, SearchRequest.staticSetJsonFacets(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetFields">Find the entity facetFields in Solr</a>
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
	public static String staticSetFacetFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetFields(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchFacetFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetFields(siteRequest_, SearchRequest.staticSearchFacetFields(siteRequest_, SearchRequest.staticSetFacetFields(siteRequest_, o)));
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
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:facetRanges">Find the entity facetRanges in Solr</a>
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
	public static String staticSetFacetRanges(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addFacetRanges(String...objects) {
		for(String o : objects) {
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

	public static String staticSearchFacetRanges(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrFacetRanges(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqFacetRanges(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrFacetRanges(siteRequest_, SearchRequest.staticSearchFacetRanges(siteRequest_, SearchRequest.staticSetFacetRanges(siteRequest_, o)));
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
	protected Long start;

	/**	<br> The entity start
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:start">Find the entity start in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _start(Wrap<Long> w);

	public Long getStart() {
		return start;
	}

	public void setStart(Long start) {
		this.start = start;
	}
	@JsonIgnore
	public void setStart(String o) {
		this.start = SearchRequest.staticSetStart(siteRequest_, o);
	}
	public static Long staticSetStart(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SearchRequest startInit() {
		Wrap<Long> startWrap = new Wrap<Long>().var("start");
		if(start == null) {
			_start(startWrap);
			setStart(startWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Long staticSearchStart(ComputateSearchSiteRequest siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrStart(ComputateSearchSiteRequest siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStart(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrStart(siteRequest_, SearchRequest.staticSearchStart(siteRequest_, SearchRequest.staticSetStart(siteRequest_, o)));
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
	protected Long rows;

	/**	<br> The entity rows
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:rows">Find the entity rows in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _rows(Wrap<Long> w);

	public Long getRows() {
		return rows;
	}

	public void setRows(Long rows) {
		this.rows = rows;
	}
	@JsonIgnore
	public void setRows(String o) {
		this.rows = SearchRequest.staticSetRows(siteRequest_, o);
	}
	public static Long staticSetRows(ComputateSearchSiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Long.parseLong(o);
		return null;
	}
	protected SearchRequest rowsInit() {
		Wrap<Long> rowsWrap = new Wrap<Long>().var("rows");
		if(rows == null) {
			_rows(rowsWrap);
			setRows(rowsWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Long staticSearchRows(ComputateSearchSiteRequest siteRequest_, Long o) {
		return o;
	}

	public static String staticSearchStrRows(ComputateSearchSiteRequest siteRequest_, Long o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqRows(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrRows(siteRequest_, SearchRequest.staticSearchRows(siteRequest_, SearchRequest.staticSetRows(siteRequest_, o)));
	}

	//////////////
	// distance //
	//////////////

	/**	 The entity distance
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal distance;

	/**	<br> The entity distance
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:distance">Find the entity distance in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _distance(Wrap<BigDecimal> w);

	public BigDecimal getDistance() {
		return distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}
	@JsonIgnore
	public void setDistance(String o) {
		this.distance = SearchRequest.staticSetDistance(siteRequest_, o);
	}
	public static BigDecimal staticSetDistance(ComputateSearchSiteRequest siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setDistance(Double o) {
			this.distance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	@JsonIgnore
	public void setDistance(Integer o) {
			this.distance = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
	}
	protected SearchRequest distanceInit() {
		Wrap<BigDecimal> distanceWrap = new Wrap<BigDecimal>().var("distance");
		if(distance == null) {
			_distance(distanceWrap);
			setDistance(distanceWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Double staticSearchDistance(ComputateSearchSiteRequest siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrDistance(ComputateSearchSiteRequest siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDistance(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrDistance(siteRequest_, SearchRequest.staticSearchDistance(siteRequest_, SearchRequest.staticSetDistance(siteRequest_, o)));
	}

	///////////
	// point //
	///////////

	/**	 The entity point
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String point;

	/**	<br> The entity point
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:point">Find the entity point in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _point(Wrap<String> w);

	public String getPoint() {
		return point;
	}
	public void setPoint(String o) {
		this.point = SearchRequest.staticSetPoint(siteRequest_, o);
	}
	public static String staticSetPoint(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest pointInit() {
		Wrap<String> pointWrap = new Wrap<String>().var("point");
		if(point == null) {
			_point(pointWrap);
			setPoint(pointWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchPoint(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPoint(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPoint(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrPoint(siteRequest_, SearchRequest.staticSearchPoint(siteRequest_, SearchRequest.staticSetPoint(siteRequest_, o)));
	}

	//////////////////
	// spatialField //
	//////////////////

	/**	 The entity spatialField
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String spatialField;

	/**	<br> The entity spatialField
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:spatialField">Find the entity spatialField in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _spatialField(Wrap<String> w);

	public String getSpatialField() {
		return spatialField;
	}
	public void setSpatialField(String o) {
		this.spatialField = SearchRequest.staticSetSpatialField(siteRequest_, o);
	}
	public static String staticSetSpatialField(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest spatialFieldInit() {
		Wrap<String> spatialFieldWrap = new Wrap<String>().var("spatialField");
		if(spatialField == null) {
			_spatialField(spatialFieldWrap);
			setSpatialField(spatialFieldWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchSpatialField(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrSpatialField(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqSpatialField(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrSpatialField(siteRequest_, SearchRequest.staticSearchSpatialField(siteRequest_, SearchRequest.staticSetSpatialField(siteRequest_, o)));
	}

	///////////
	// stats //
	///////////

	/**	 The entity stats
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Boolean stats;

	/**	<br> The entity stats
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:stats">Find the entity stats in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _stats(Wrap<Boolean> w);

	public Boolean getStats() {
		return stats;
	}

	public void setStats(Boolean stats) {
		this.stats = stats;
	}
	@JsonIgnore
	public void setStats(String o) {
		this.stats = SearchRequest.staticSetStats(siteRequest_, o);
	}
	public static Boolean staticSetStats(ComputateSearchSiteRequest siteRequest_, String o) {
		return Boolean.parseBoolean(o);
	}
	protected SearchRequest statsInit() {
		Wrap<Boolean> statsWrap = new Wrap<Boolean>().var("stats");
		if(stats == null) {
			_stats(statsWrap);
			setStats(statsWrap.o);
		}
		return (SearchRequest)this;
	}

	public static Boolean staticSearchStats(ComputateSearchSiteRequest siteRequest_, Boolean o) {
		return o;
	}

	public static String staticSearchStrStats(ComputateSearchSiteRequest siteRequest_, Boolean o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStats(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrStats(siteRequest_, SearchRequest.staticSearchStats(siteRequest_, SearchRequest.staticSetStats(siteRequest_, o)));
	}

	/////////////////
	// statsFields //
	/////////////////

	/**	 The entity statsFields
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonFormat(shape = JsonFormat.Shape.ARRAY)
	@JsonInclude(Include.NON_NULL)
	protected List<String> statsFields = new ArrayList<String>();

	/**	<br> The entity statsFields
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:statsFields">Find the entity statsFields in Solr</a>
	 * <br>
	 * @param w is the entity already constructed. 
	 **/
	protected abstract void _statsFields(List<String> w);

	public List<String> getStatsFields() {
		return statsFields;
	}

	public void setStatsFields(List<String> statsFields) {
		this.statsFields = statsFields;
	}
	public static String staticSetStatsFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	public SearchRequest addStatsFields(String...objects) {
		for(String o : objects) {
			addStatsFields(o);
		}
		return (SearchRequest)this;
	}
	public SearchRequest addStatsFields(String o) {
		if(o != null)
			this.statsFields.add(o);
		return (SearchRequest)this;
	}
	protected SearchRequest statsFieldsInit() {
		_statsFields(statsFields);
		return (SearchRequest)this;
	}

	public static String staticSearchStatsFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStatsFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStatsFields(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrStatsFields(siteRequest_, SearchRequest.staticSearchStatsFields(siteRequest_, SearchRequest.staticSetStatsFields(siteRequest_, o)));
	}

	///////////
	// score //
	///////////

	/**	 The entity score
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String score;

	/**	<br> The entity score
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:score">Find the entity score in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _score(Wrap<String> w);

	public String getScore() {
		return score;
	}
	public void setScore(String o) {
		this.score = SearchRequest.staticSetScore(siteRequest_, o);
	}
	public static String staticSetScore(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest scoreInit() {
		Wrap<String> scoreWrap = new Wrap<String>().var("score");
		if(score == null) {
			_score(scoreWrap);
			setScore(scoreWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchScore(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrScore(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqScore(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrScore(siteRequest_, SearchRequest.staticSearchScore(siteRequest_, SearchRequest.staticSetScore(siteRequest_, o)));
	}

	///////////////////
	// distanceUnits //
	///////////////////

	/**	 The entity distanceUnits
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String distanceUnits;

	/**	<br> The entity distanceUnits
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:distanceUnits">Find the entity distanceUnits in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _distanceUnits(Wrap<String> w);

	public String getDistanceUnits() {
		return distanceUnits;
	}
	public void setDistanceUnits(String o) {
		this.distanceUnits = SearchRequest.staticSetDistanceUnits(siteRequest_, o);
	}
	public static String staticSetDistanceUnits(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest distanceUnitsInit() {
		Wrap<String> distanceUnitsWrap = new Wrap<String>().var("distanceUnits");
		if(distanceUnits == null) {
			_distanceUnits(distanceUnitsWrap);
			setDistanceUnits(distanceUnitsWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchDistanceUnits(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDistanceUnits(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDistanceUnits(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrDistanceUnits(siteRequest_, SearchRequest.staticSearchDistanceUnits(siteRequest_, SearchRequest.staticSetDistanceUnits(siteRequest_, o)));
	}

	/////////////////
	// queryString //
	/////////////////

	/**	 The entity queryString
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String queryString;

	/**	<br> The entity queryString
	 *  is defined as null before being initialized. 
	 * <br><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SearchRequest&fq=entiteVar_enUS_indexed_string:queryString">Find the entity queryString in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _queryString(Wrap<String> w);

	public String getQueryString() {
		return queryString;
	}
	public void setQueryString(String o) {
		this.queryString = SearchRequest.staticSetQueryString(siteRequest_, o);
	}
	public static String staticSetQueryString(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}
	protected SearchRequest queryStringInit() {
		Wrap<String> queryStringWrap = new Wrap<String>().var("queryString");
		if(queryString == null) {
			_queryString(queryStringWrap);
			setQueryString(queryStringWrap.o);
		}
		return (SearchRequest)this;
	}

	public static String staticSearchQueryString(ComputateSearchSiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrQueryString(ComputateSearchSiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqQueryString(ComputateSearchSiteRequest siteRequest_, String o) {
		return SearchRequest.staticSearchStrQueryString(siteRequest_, SearchRequest.staticSearchQueryString(siteRequest_, SearchRequest.staticSetQueryString(siteRequest_, o)));
	}

	//////////////
	// initDeep //
	//////////////

	public SearchRequest initDeepSearchRequest(ComputateSearchSiteRequest siteRequest_) {
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
				facetPivotMinCountInit();
				facetSortInit();
				facetInit();
				facetLimitInit();
				facetMinCountInit();
				facetOffsetInit();
				facetRangeStartInit();
				facetRangeEndInit();
				facetRangeGapInit();
				cursorMarkInit();
				facetQueriesInit();
				jsonFacetsInit();
				facetFieldsInit();
				facetRangesInit();
				startInit();
				rowsInit();
				distanceInit();
				pointInit();
				spatialFieldInit();
				statsInit();
				statsFieldsInit();
				scoreInit();
				distanceUnitsInit();
				queryStringInit();
	}

	public void initDeepForClass(ComputateSearchSiteRequest siteRequest_) {
		initDeepSearchRequest(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestSearchRequest(ComputateSearchSiteRequest siteRequest_) {
	}

	public void siteRequestForClass(ComputateSearchSiteRequest siteRequest_) {
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
			case "facetPivotMinCount":
				return oSearchRequest.facetPivotMinCount;
			case "facetSort":
				return oSearchRequest.facetSort;
			case "facet":
				return oSearchRequest.facet;
			case "facetLimit":
				return oSearchRequest.facetLimit;
			case "facetMinCount":
				return oSearchRequest.facetMinCount;
			case "facetOffset":
				return oSearchRequest.facetOffset;
			case "facetRangeStart":
				return oSearchRequest.facetRangeStart;
			case "facetRangeEnd":
				return oSearchRequest.facetRangeEnd;
			case "facetRangeGap":
				return oSearchRequest.facetRangeGap;
			case "cursorMark":
				return oSearchRequest.cursorMark;
			case "facetQueries":
				return oSearchRequest.facetQueries;
			case "jsonFacets":
				return oSearchRequest.jsonFacets;
			case "facetFields":
				return oSearchRequest.facetFields;
			case "facetRanges":
				return oSearchRequest.facetRanges;
			case "start":
				return oSearchRequest.start;
			case "rows":
				return oSearchRequest.rows;
			case "distance":
				return oSearchRequest.distance;
			case "point":
				return oSearchRequest.point;
			case "spatialField":
				return oSearchRequest.spatialField;
			case "stats":
				return oSearchRequest.stats;
			case "statsFields":
				return oSearchRequest.statsFields;
			case "score":
				return oSearchRequest.score;
			case "distanceUnits":
				return oSearchRequest.distanceUnits;
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

	public static Object staticSetForClass(String entityVar, ComputateSearchSiteRequest siteRequest_, String o) {
		return staticSetSearchRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSearchRequest(String entityVar, ComputateSearchSiteRequest siteRequest_, String o) {
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
		case "facetPivotMinCount":
			return SearchRequest.staticSetFacetPivotMinCount(siteRequest_, o);
		case "facetSort":
			return SearchRequest.staticSetFacetSort(siteRequest_, o);
		case "facet":
			return SearchRequest.staticSetFacet(siteRequest_, o);
		case "facetLimit":
			return SearchRequest.staticSetFacetLimit(siteRequest_, o);
		case "facetMinCount":
			return SearchRequest.staticSetFacetMinCount(siteRequest_, o);
		case "facetOffset":
			return SearchRequest.staticSetFacetOffset(siteRequest_, o);
		case "facetRangeStart":
			return SearchRequest.staticSetFacetRangeStart(siteRequest_, o);
		case "facetRangeEnd":
			return SearchRequest.staticSetFacetRangeEnd(siteRequest_, o);
		case "facetRangeGap":
			return SearchRequest.staticSetFacetRangeGap(siteRequest_, o);
		case "cursorMark":
			return SearchRequest.staticSetCursorMark(siteRequest_, o);
		case "facetQueries":
			return SearchRequest.staticSetFacetQueries(siteRequest_, o);
		case "jsonFacets":
			return SearchRequest.staticSetJsonFacets(siteRequest_, o);
		case "facetFields":
			return SearchRequest.staticSetFacetFields(siteRequest_, o);
		case "facetRanges":
			return SearchRequest.staticSetFacetRanges(siteRequest_, o);
		case "start":
			return SearchRequest.staticSetStart(siteRequest_, o);
		case "rows":
			return SearchRequest.staticSetRows(siteRequest_, o);
		case "distance":
			return SearchRequest.staticSetDistance(siteRequest_, o);
		case "point":
			return SearchRequest.staticSetPoint(siteRequest_, o);
		case "spatialField":
			return SearchRequest.staticSetSpatialField(siteRequest_, o);
		case "stats":
			return SearchRequest.staticSetStats(siteRequest_, o);
		case "statsFields":
			return SearchRequest.staticSetStatsFields(siteRequest_, o);
		case "score":
			return SearchRequest.staticSetScore(siteRequest_, o);
		case "distanceUnits":
			return SearchRequest.staticSetDistanceUnits(siteRequest_, o);
		case "queryString":
			return SearchRequest.staticSetQueryString(siteRequest_, o);
			default:
				return null;
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, ComputateSearchSiteRequest siteRequest_, Object o) {
		return staticSearchSearchRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchSearchRequest(String entityVar, ComputateSearchSiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSearchQuery(siteRequest_, (String)o);
		case "filterQueries":
			return SearchRequest.staticSearchFilterQueries(siteRequest_, (String)o);
		case "fields":
			return SearchRequest.staticSearchFields(siteRequest_, (String)o);
		case "sorts":
			return SearchRequest.staticSearchSorts(siteRequest_, (String)o);
		case "facetPivots":
			return SearchRequest.staticSearchFacetPivots(siteRequest_, (String)o);
		case "facetPivotMinCount":
			return SearchRequest.staticSearchFacetPivotMinCount(siteRequest_, (Integer)o);
		case "facetSort":
			return SearchRequest.staticSearchFacetSort(siteRequest_, (String)o);
		case "facet":
			return SearchRequest.staticSearchFacet(siteRequest_, (Boolean)o);
		case "facetLimit":
			return SearchRequest.staticSearchFacetLimit(siteRequest_, (Integer)o);
		case "facetMinCount":
			return SearchRequest.staticSearchFacetMinCount(siteRequest_, (Integer)o);
		case "facetOffset":
			return SearchRequest.staticSearchFacetOffset(siteRequest_, (Integer)o);
		case "facetRangeStart":
			return SearchRequest.staticSearchFacetRangeStart(siteRequest_, (String)o);
		case "facetRangeEnd":
			return SearchRequest.staticSearchFacetRangeEnd(siteRequest_, (String)o);
		case "facetRangeGap":
			return SearchRequest.staticSearchFacetRangeGap(siteRequest_, (String)o);
		case "cursorMark":
			return SearchRequest.staticSearchCursorMark(siteRequest_, (String)o);
		case "facetQueries":
			return SearchRequest.staticSearchFacetQueries(siteRequest_, (String)o);
		case "jsonFacets":
			return SearchRequest.staticSearchJsonFacets(siteRequest_, (String)o);
		case "facetFields":
			return SearchRequest.staticSearchFacetFields(siteRequest_, (String)o);
		case "facetRanges":
			return SearchRequest.staticSearchFacetRanges(siteRequest_, (String)o);
		case "start":
			return SearchRequest.staticSearchStart(siteRequest_, (Long)o);
		case "rows":
			return SearchRequest.staticSearchRows(siteRequest_, (Long)o);
		case "distance":
			return SearchRequest.staticSearchDistance(siteRequest_, (BigDecimal)o);
		case "point":
			return SearchRequest.staticSearchPoint(siteRequest_, (String)o);
		case "spatialField":
			return SearchRequest.staticSearchSpatialField(siteRequest_, (String)o);
		case "stats":
			return SearchRequest.staticSearchStats(siteRequest_, (Boolean)o);
		case "statsFields":
			return SearchRequest.staticSearchStatsFields(siteRequest_, (String)o);
		case "score":
			return SearchRequest.staticSearchScore(siteRequest_, (String)o);
		case "distanceUnits":
			return SearchRequest.staticSearchDistanceUnits(siteRequest_, (String)o);
		case "queryString":
			return SearchRequest.staticSearchQueryString(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, ComputateSearchSiteRequest siteRequest_, Object o) {
		return staticSearchStrSearchRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrSearchRequest(String entityVar, ComputateSearchSiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSearchStrQuery(siteRequest_, (String)o);
		case "filterQueries":
			return SearchRequest.staticSearchStrFilterQueries(siteRequest_, (String)o);
		case "fields":
			return SearchRequest.staticSearchStrFields(siteRequest_, (String)o);
		case "sorts":
			return SearchRequest.staticSearchStrSorts(siteRequest_, (String)o);
		case "facetPivots":
			return SearchRequest.staticSearchStrFacetPivots(siteRequest_, (String)o);
		case "facetPivotMinCount":
			return SearchRequest.staticSearchStrFacetPivotMinCount(siteRequest_, (Integer)o);
		case "facetSort":
			return SearchRequest.staticSearchStrFacetSort(siteRequest_, (String)o);
		case "facet":
			return SearchRequest.staticSearchStrFacet(siteRequest_, (Boolean)o);
		case "facetLimit":
			return SearchRequest.staticSearchStrFacetLimit(siteRequest_, (Integer)o);
		case "facetMinCount":
			return SearchRequest.staticSearchStrFacetMinCount(siteRequest_, (Integer)o);
		case "facetOffset":
			return SearchRequest.staticSearchStrFacetOffset(siteRequest_, (Integer)o);
		case "facetRangeStart":
			return SearchRequest.staticSearchStrFacetRangeStart(siteRequest_, (String)o);
		case "facetRangeEnd":
			return SearchRequest.staticSearchStrFacetRangeEnd(siteRequest_, (String)o);
		case "facetRangeGap":
			return SearchRequest.staticSearchStrFacetRangeGap(siteRequest_, (String)o);
		case "cursorMark":
			return SearchRequest.staticSearchStrCursorMark(siteRequest_, (String)o);
		case "facetQueries":
			return SearchRequest.staticSearchStrFacetQueries(siteRequest_, (String)o);
		case "jsonFacets":
			return SearchRequest.staticSearchStrJsonFacets(siteRequest_, (String)o);
		case "facetFields":
			return SearchRequest.staticSearchStrFacetFields(siteRequest_, (String)o);
		case "facetRanges":
			return SearchRequest.staticSearchStrFacetRanges(siteRequest_, (String)o);
		case "start":
			return SearchRequest.staticSearchStrStart(siteRequest_, (Long)o);
		case "rows":
			return SearchRequest.staticSearchStrRows(siteRequest_, (Long)o);
		case "distance":
			return SearchRequest.staticSearchStrDistance(siteRequest_, (Double)o);
		case "point":
			return SearchRequest.staticSearchStrPoint(siteRequest_, (String)o);
		case "spatialField":
			return SearchRequest.staticSearchStrSpatialField(siteRequest_, (String)o);
		case "stats":
			return SearchRequest.staticSearchStrStats(siteRequest_, (Boolean)o);
		case "statsFields":
			return SearchRequest.staticSearchStrStatsFields(siteRequest_, (String)o);
		case "score":
			return SearchRequest.staticSearchStrScore(siteRequest_, (String)o);
		case "distanceUnits":
			return SearchRequest.staticSearchStrDistanceUnits(siteRequest_, (String)o);
		case "queryString":
			return SearchRequest.staticSearchStrQueryString(siteRequest_, (String)o);
			default:
				return null;
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, ComputateSearchSiteRequest siteRequest_, String o) {
		return staticSearchFqSearchRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqSearchRequest(String entityVar, ComputateSearchSiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "query":
			return SearchRequest.staticSearchFqQuery(siteRequest_, o);
		case "filterQueries":
			return SearchRequest.staticSearchFqFilterQueries(siteRequest_, o);
		case "fields":
			return SearchRequest.staticSearchFqFields(siteRequest_, o);
		case "sorts":
			return SearchRequest.staticSearchFqSorts(siteRequest_, o);
		case "facetPivots":
			return SearchRequest.staticSearchFqFacetPivots(siteRequest_, o);
		case "facetPivotMinCount":
			return SearchRequest.staticSearchFqFacetPivotMinCount(siteRequest_, o);
		case "facetSort":
			return SearchRequest.staticSearchFqFacetSort(siteRequest_, o);
		case "facet":
			return SearchRequest.staticSearchFqFacet(siteRequest_, o);
		case "facetLimit":
			return SearchRequest.staticSearchFqFacetLimit(siteRequest_, o);
		case "facetMinCount":
			return SearchRequest.staticSearchFqFacetMinCount(siteRequest_, o);
		case "facetOffset":
			return SearchRequest.staticSearchFqFacetOffset(siteRequest_, o);
		case "facetRangeStart":
			return SearchRequest.staticSearchFqFacetRangeStart(siteRequest_, o);
		case "facetRangeEnd":
			return SearchRequest.staticSearchFqFacetRangeEnd(siteRequest_, o);
		case "facetRangeGap":
			return SearchRequest.staticSearchFqFacetRangeGap(siteRequest_, o);
		case "cursorMark":
			return SearchRequest.staticSearchFqCursorMark(siteRequest_, o);
		case "facetQueries":
			return SearchRequest.staticSearchFqFacetQueries(siteRequest_, o);
		case "jsonFacets":
			return SearchRequest.staticSearchFqJsonFacets(siteRequest_, o);
		case "facetFields":
			return SearchRequest.staticSearchFqFacetFields(siteRequest_, o);
		case "facetRanges":
			return SearchRequest.staticSearchFqFacetRanges(siteRequest_, o);
		case "start":
			return SearchRequest.staticSearchFqStart(siteRequest_, o);
		case "rows":
			return SearchRequest.staticSearchFqRows(siteRequest_, o);
		case "distance":
			return SearchRequest.staticSearchFqDistance(siteRequest_, o);
		case "point":
			return SearchRequest.staticSearchFqPoint(siteRequest_, o);
		case "spatialField":
			return SearchRequest.staticSearchFqSpatialField(siteRequest_, o);
		case "stats":
			return SearchRequest.staticSearchFqStats(siteRequest_, o);
		case "statsFields":
			return SearchRequest.staticSearchFqStatsFields(siteRequest_, o);
		case "score":
			return SearchRequest.staticSearchFqScore(siteRequest_, o);
		case "distanceUnits":
			return SearchRequest.staticSearchFqDistanceUnits(siteRequest_, o);
		case "queryString":
			return SearchRequest.staticSearchFqQueryString(siteRequest_, o);
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

	public static final String CLASS_SIMPLE_NAME = "SearchRequest";
	public static final String VAR_siteRequest_ = "siteRequest_";
	public static final String VAR_query = "query";
	public static final String VAR_filterQueries = "filterQueries";
	public static final String VAR_fields = "fields";
	public static final String VAR_sorts = "sorts";
	public static final String VAR_facetPivots = "facetPivots";
	public static final String VAR_facetPivotMinCount = "facetPivotMinCount";
	public static final String VAR_facetSort = "facetSort";
	public static final String VAR_facet = "facet";
	public static final String VAR_facetLimit = "facetLimit";
	public static final String VAR_facetMinCount = "facetMinCount";
	public static final String VAR_facetOffset = "facetOffset";
	public static final String VAR_facetRangeStart = "facetRangeStart";
	public static final String VAR_facetRangeEnd = "facetRangeEnd";
	public static final String VAR_facetRangeGap = "facetRangeGap";
	public static final String VAR_cursorMark = "cursorMark";
	public static final String VAR_facetQueries = "facetQueries";
	public static final String VAR_jsonFacets = "jsonFacets";
	public static final String VAR_facetFields = "facetFields";
	public static final String VAR_facetRanges = "facetRanges";
	public static final String VAR_start = "start";
	public static final String VAR_rows = "rows";
	public static final String VAR_distance = "distance";
	public static final String VAR_point = "point";
	public static final String VAR_spatialField = "spatialField";
	public static final String VAR_stats = "stats";
	public static final String VAR_statsFields = "statsFields";
	public static final String VAR_score = "score";
	public static final String VAR_distanceUnits = "distanceUnits";
	public static final String VAR_queryString = "queryString";

	public static final String DISPLAY_NAME_siteRequest_ = "";
	public static final String DISPLAY_NAME_query = "";
	public static final String DISPLAY_NAME_filterQueries = "";
	public static final String DISPLAY_NAME_fields = "";
	public static final String DISPLAY_NAME_sorts = "";
	public static final String DISPLAY_NAME_facetPivots = "";
	public static final String DISPLAY_NAME_facetPivotMinCount = "";
	public static final String DISPLAY_NAME_facetSort = "";
	public static final String DISPLAY_NAME_facet = "";
	public static final String DISPLAY_NAME_facetLimit = "";
	public static final String DISPLAY_NAME_facetMinCount = "";
	public static final String DISPLAY_NAME_facetOffset = "";
	public static final String DISPLAY_NAME_facetRangeStart = "";
	public static final String DISPLAY_NAME_facetRangeEnd = "";
	public static final String DISPLAY_NAME_facetRangeGap = "";
	public static final String DISPLAY_NAME_cursorMark = "";
	public static final String DISPLAY_NAME_facetQueries = "";
	public static final String DISPLAY_NAME_jsonFacets = "";
	public static final String DISPLAY_NAME_facetFields = "";
	public static final String DISPLAY_NAME_facetRanges = "";
	public static final String DISPLAY_NAME_start = "";
	public static final String DISPLAY_NAME_rows = "";
	public static final String DISPLAY_NAME_distance = "";
	public static final String DISPLAY_NAME_point = "";
	public static final String DISPLAY_NAME_spatialField = "";
	public static final String DISPLAY_NAME_stats = "";
	public static final String DISPLAY_NAME_statsFields = "";
	public static final String DISPLAY_NAME_score = "";
	public static final String DISPLAY_NAME_distanceUnits = "";
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
		case VAR_facetPivotMinCount:
			return DISPLAY_NAME_facetPivotMinCount;
		case VAR_facetSort:
			return DISPLAY_NAME_facetSort;
		case VAR_facet:
			return DISPLAY_NAME_facet;
		case VAR_facetLimit:
			return DISPLAY_NAME_facetLimit;
		case VAR_facetMinCount:
			return DISPLAY_NAME_facetMinCount;
		case VAR_facetOffset:
			return DISPLAY_NAME_facetOffset;
		case VAR_facetRangeStart:
			return DISPLAY_NAME_facetRangeStart;
		case VAR_facetRangeEnd:
			return DISPLAY_NAME_facetRangeEnd;
		case VAR_facetRangeGap:
			return DISPLAY_NAME_facetRangeGap;
		case VAR_cursorMark:
			return DISPLAY_NAME_cursorMark;
		case VAR_facetQueries:
			return DISPLAY_NAME_facetQueries;
		case VAR_jsonFacets:
			return DISPLAY_NAME_jsonFacets;
		case VAR_facetFields:
			return DISPLAY_NAME_facetFields;
		case VAR_facetRanges:
			return DISPLAY_NAME_facetRanges;
		case VAR_start:
			return DISPLAY_NAME_start;
		case VAR_rows:
			return DISPLAY_NAME_rows;
		case VAR_distance:
			return DISPLAY_NAME_distance;
		case VAR_point:
			return DISPLAY_NAME_point;
		case VAR_spatialField:
			return DISPLAY_NAME_spatialField;
		case VAR_stats:
			return DISPLAY_NAME_stats;
		case VAR_statsFields:
			return DISPLAY_NAME_statsFields;
		case VAR_score:
			return DISPLAY_NAME_score;
		case VAR_distanceUnits:
			return DISPLAY_NAME_distanceUnits;
		case VAR_queryString:
			return DISPLAY_NAME_queryString;
		default:
			return null;
		}
	}
}
