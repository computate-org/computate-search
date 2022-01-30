package org.computate.search.serialize;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Keyword: classSimpleNameLocalTimeSerializer
 */
public class ComputateLocalTimeSerializer extends JsonSerializer<LocalTime> {

	public static String LOCAL_TIME_FORMAT_DISPLAY_H_MM_A = "h:mm a";
	public static DateTimeFormatter LOCAL_TIME_FORMATTER_DISPLAY_H_MM_A = DateTimeFormatter.ofPattern(LOCAL_TIME_FORMAT_DISPLAY_H_MM_A, Locale.US);
	public static String LOCAL_TIME_FORMAT_HH_MM_SS_SSS = "HH:mm:ss.SSS";
	public static DateTimeFormatter LOCAL_TIME_FORMATTER_HH_MM_SS_SSS = DateTimeFormatter.ofPattern(LOCAL_TIME_FORMAT_HH_MM_SS_SSS, Locale.US);

	@Override()
	public void  serialize(LocalTime o, JsonGenerator generator, SerializerProvider provider) throws IOException, IOException {
		generator.writeString(LOCAL_TIME_FORMATTER_HH_MM_SS_SSS.format(o));
	}
}
