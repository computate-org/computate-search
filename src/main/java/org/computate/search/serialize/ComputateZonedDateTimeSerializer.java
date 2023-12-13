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
package org.computate.search.serialize;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Keyword: classSimpleNameZonedDateTimeSerializer
 */
public class ComputateZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {

	public static final String ZONED_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'['VV']'";
	public static final DateTimeFormatter ZONED_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(ZONED_DATE_TIME_FORMAT, Locale.US);
	public static final String UTC_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
	public static final DateTimeFormatter UTC_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(UTC_DATE_TIME_FORMAT, Locale.US);

	@Override()
	public void  serialize(ZonedDateTime o, JsonGenerator generator, SerializerProvider provider) throws IOException, IOException {
		generator.writeString(o.format(ZONED_DATE_TIME_FORMATTER));
	}
}
