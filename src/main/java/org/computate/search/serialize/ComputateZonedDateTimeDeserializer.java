package org.computate.search.serialize;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Keyword: classSimpleNameZonedDateTimeDeserializer
 */
public class ComputateZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {

	@Override
	public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException {

		return ZonedDateTime.parse(jsonParser.getText(), DateTimeFormatter.ofPattern(ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMAT, deserializationContext.getLocale()).withZone(deserializationContext.getTimeZone().toZoneId()));
	}
}
