package org.computate.search.serialize;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Keyword: classSimpleNameLocalDateSerializer
 */
public class ComputateLocalDateSerializer extends JsonSerializer<LocalDate> {

	public static String LOCAL_DATE_FORMAT_DISPLAY_LONG_EEEE_MMMM_D_YYYY = "EEEE MMMM d yyyy";
	public static DateTimeFormatter LOCAL_DATE_FORMATTER_DISPLAY_LONG_EEEE_MMMM_D_YYYY = DateTimeFormatter.ofPattern(LOCAL_DATE_FORMAT_DISPLAY_LONG_EEEE_MMMM_D_YYYY, Locale.US);
	public static String LOCAL_DATE_FORMAT_DISPLAY_SHORT_MM_DD_YYYY = "MMM dd, yyyy";
	public static DateTimeFormatter LOCAL_DATE_FORMATTER_DISPLAY_SHORT_MM_DD_YYYY = DateTimeFormatter.ofPattern(LOCAL_DATE_FORMAT_DISPLAY_SHORT_MM_DD_YYYY, Locale.US);
	public static String LOCAL_DATE_FORMAT_YYYY_MM_DD = "yyyy-MM-dd";
	public static DateTimeFormatter LOCAL_DATE_FORMATTER_YYYY_MM_DD = DateTimeFormatter.ofPattern(LOCAL_DATE_FORMAT_YYYY_MM_DD, Locale.US);

	@Override()
	public void  serialize(LocalDate o, JsonGenerator generator, SerializerProvider provider) throws IOException, IOException {
		generator.writeString(LOCAL_DATE_FORMATTER_YYYY_MM_DD.format(o));
	}
}
