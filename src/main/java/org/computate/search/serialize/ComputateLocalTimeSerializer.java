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
