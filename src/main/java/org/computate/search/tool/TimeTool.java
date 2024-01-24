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
package org.computate.search.tool;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;

public class TimeTool {

	public static final DateTimeFormatter ZONED_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm VV");

	/**
	 * Parse a zoned time (HH:mm VV, example: 18:12 UTC, 13:12 America/New_York, 12:12 America/Chicago). 
	 */
	public static ZonedDateTime parseNextZonedTime(String zonedTimeStr) {
		return parseNextZonedTime(zonedTimeStr, null);
	}

	/**
	 * Parse a zoned time (HH:mm VV, example: 18:12 UTC, 13:12 America/New_York, 12:12 America/Chicago). 
	 */
	public static ZonedDateTime parseNextZonedTime(String zonedTimeStr, ZonedDateTime dateTimeNow) {
		LocalDate dateNow = LocalDate.now();
		String zonedDateTimeStr = String.format("%s %s", dateNow.format(DateTimeFormatter.ISO_DATE), zonedTimeStr);
		ZonedDateTime nextZonedDateTime = ZonedDateTime.parse(zonedDateTimeStr, ZONED_DATE_TIME_FORMATTER);

		if(dateTimeNow == null)
			dateTimeNow = ZonedDateTime.now(nextZonedDateTime.getZone());

		if(nextZonedDateTime.compareTo(dateTimeNow) < 0)
			nextZonedDateTime = nextZonedDateTime.plusDays(1);

		return nextZonedDateTime;
	}

	/**
	 * Parse a duration case-insensitive and add the duration to the given startDateTime. Examples:
	 * 1 YEAR, 2 Years, 3 years
	 * 1 MONTH, 2 Months, 3 months
	 * 1 WEEK, 2 Weeks, 3 weeks
	 * 1 DAY, 2 Days, 3 days
	 * 1 HOUR, 2 Hours, 3 hours
	 * 1 MINUTE, 2 Minutes, 3 minutes
	 * 1 SECONDS, 2 Seconds, 3 seconds
	 * 1 MILLISECOND, 1 milli, 2 Milliseconds, 3 millis
	 * 1 NANOSECOND, 1 nano, 2 Nanoseconds, 3 nanos
	 */
	public static Duration parseNextDuration(String periodStr) {
		String[] periodParts = periodStr.split("\\s+");
		BigDecimal periodNumber = new BigDecimal(periodParts[0]);
		String periodUnitStr = Optional.of(periodParts[1])
				.map(s -> s.toUpperCase())
				.map(s -> s.endsWith("S") ? s : (s + "S"))
				.map(s -> s.equals("MILLISECONDS") ? "MILLIS" : s)
				.map(s -> s.equals("NANOSECONDS") ? "NANOS" : s)
				.get();
		ChronoUnit periodUnit = ChronoUnit.valueOf(periodUnitStr);
		Duration duration = Duration.of(periodNumber.longValue(), periodUnit);
		return duration;
	}

	public static ZonedDateTime parseZonedDateTime(ZoneId timeZone, String o) {
		if(StringUtils.endsWith(o, "]"))
			return o == null ? null : ZonedDateTime.parse(o, ComputateZonedDateTimeSerializer.ZONED_DATE_TIME_FORMATTER);
		if(StringUtils.endsWith(o, "Z"))
			return o == null ? null : Instant.parse(o).atZone(timeZone).truncatedTo(ChronoUnit.MILLIS);
		else
			return o == null ? null : ZonedDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
	}
}
