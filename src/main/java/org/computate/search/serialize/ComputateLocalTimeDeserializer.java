package org.computate.search.serialize;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Keyword: classSimpleNameZonedDateTimeDeserializer
 */
public class ComputateLocalTimeDeserializer extends JsonDeserializer<LocalTime> {

	@Override
	public LocalTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException {

		return LocalTime.parse(jsonParser.getText(), DateTimeFormatter.ofPattern(ComputateLocalTimeSerializer.LOCAL_TIME_FORMAT_HH_MM_SS_SSS, deserializationContext.getLocale()).withZone(deserializationContext.getTimeZone().toZoneId()));
	}
}
