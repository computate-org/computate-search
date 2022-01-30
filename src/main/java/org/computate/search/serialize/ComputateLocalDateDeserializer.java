package org.computate.search.serialize;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Keyword: classSimpleNameZonedDateTimeDeserializer
 */
public class ComputateLocalDateDeserializer extends JsonDeserializer<LocalDate> {

	@Override
	public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException {

		return LocalDate.parse(jsonParser.getText(), DateTimeFormatter.ofPattern(ComputateLocalDateSerializer.LOCAL_DATE_FORMAT_YYYY_MM_DD, deserializationContext.getLocale()).withZone(deserializationContext.getTimeZone().toZoneId()));
	}
}
