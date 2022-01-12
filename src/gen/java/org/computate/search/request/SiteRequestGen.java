package org.computate.search.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import org.computate.search.request.SiteRequest;
import java.util.ArrayList;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.math.RoundingMode;
import org.slf4j.Logger;
import java.math.MathContext;
import io.vertx.core.Promise;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.vertx.core.Future;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.search.wrap.Wrap;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.lang.Object;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.search.request.SiteRequest&fq=classeEtendGen_indexed_boolean:true">Find the class  in Solr. </a>
 * <br/>
 **/
public abstract class SiteRequestGen<DEV> extends Object {
	protected static final Logger LOG = LoggerFactory.getLogger(SiteRequest.class);

	//////////////
	// initDeep //
	//////////////

	public SiteRequest initDeepSiteRequest(SiteRequest siteRequest_) {
		initDeepSiteRequest();
		return (SiteRequest)this;
	}

	public void initDeepSiteRequest() {
		initSiteRequest();
	}

	public void initSiteRequest() {
	}

	public void initDeepForClass(SiteRequest siteRequest_) {
		initDeepSiteRequest(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainSiteRequest(v);
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainSiteRequest(String var) {
		SiteRequest oSiteRequest = (SiteRequest)this;
		switch(var) {
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
				o = relateSiteRequest(v, val);
		}
		return o != null;
	}
	public Object relateSiteRequest(String var, Object val) {
		SiteRequest oSiteRequest = (SiteRequest)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSetSiteRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSetSiteRequest(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	////////////////
	// staticSolr //
	////////////////

	public static Object staticSolrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSolrSiteRequest(entityVar,  siteRequest_, o);
	}
	public static Object staticSolrSiteRequest(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	///////////////////
	// staticSolrStr //
	///////////////////

	public static String staticSolrStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSolrStrSiteRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSolrStrSiteRequest(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
			default:
				return null;
		}
	}

	//////////////////
	// staticSolrFq //
	//////////////////

	public static String staticSolrFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSolrFqSiteRequest(entityVar,  siteRequest_, o);
	}
	public static String staticSolrFqSiteRequest(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
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
					o = defineSiteRequest(v, val);
			}
		}
		return o != null;
	}
	public Object defineSiteRequest(String var, Object val) {
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



	public static String displayNameForClass(String var) {
		return SiteRequest.displayNameSiteRequest(var);
	}
	public static String displayNameSiteRequest(String var) {
		switch(var) {
		default:
			return null;
		}
	}
}
