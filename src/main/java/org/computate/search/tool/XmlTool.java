package org.computate.search.tool;

import java.util.Arrays;
import java.util.List;

public class XmlTool {

	public static List<String> HTML_ELEMENTS_CLOSED = Arrays.asList("area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr");
	public static List<String> HTML_ELEMENTS_NO_WRAP = Arrays.asList("script", "span", "a", "b", "i", "u", "title", "use", "h1", "h2", "h3", "h4", "h5", "h6", "p", "dt", "dd" );
	
	public static String escapeShQuotXml(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("\"", "\"'\"'\"").replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;");
		}
		
		return result;
	}
	
	public static String escapeShAposXml(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("'", "'\"'\"'").replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;");
		}
		
		return result;
	}
	
	public static String escapeShApos(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("'", "'\"'\"'");
		}
		
		return result;
	}
	
	public static String escape(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;");
		}
		
		return result;
	}
	
	public static String escapeInApostrophes(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("\n", " ").replace("\t", " ").replace("\r", "").replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;").replace("'", "&apos;");
		}
		
		return result;
	}
	
	public static String escapeInQuotes(String str) {
		String result = str;
		
		if(str != null) { 
			result = result.replace("\n", " ").replace("\t", " ").replace("\r", "").replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;").replace("\"", "&quot;");
		}
		
		return result;
	}
	
	public static String escapeAddQuotes(String str) {
		String result = str;
		
		if(str != null) { 
			result = "\"" + result.replace("\n", " ").replace("\t", " ").replace("\r", "").replace("&", "&amp;").replace("<", "&#60;").replace(">", "&#62;").replace("\"", "&quot;") + "\"";
		}
		
		return result;
	}
}
