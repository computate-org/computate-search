/*
 * Copyright Computate Limited Liability Company in Utah, USA. 
 * SPDX-License-Identifier: AGPL-3.0
 * This program and the accompanying materials are made available under the
 * terms of the GNU AFFERO GENERAL PUBLIC LICENSE which is available at
 * 
 * https://www.gnu.org/licenses/agpl-3.0.html
 * 
 * You may not propagate or modify a covered work except as expressly provided 
 * under this License. Any attempt otherwise to propagate or modify it is void, 
 * and will automatically terminate your rights under this License (including 
 * any patent licenses granted under the third paragraph of section 11).
 */
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
