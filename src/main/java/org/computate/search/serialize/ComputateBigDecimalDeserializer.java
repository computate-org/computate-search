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
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;

/**
 * Keyword: classSimpleNameBigDecimalDeserializer
 */
public class ComputateBigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> implements ContextualDeserializer {

  String roundingMode;
  Integer precision;
  Integer scale;

  public ComputateBigDecimalDeserializer() {
    this("HALF_UP", 0, 2);
  }

  protected ComputateBigDecimalDeserializer(String roundingMode, Integer precision, Integer scale) {
    super(BigDecimal.class);
    this.roundingMode = roundingMode;
    this.precision = precision;
    this.scale = scale;
  }

  @Override
  public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException {
    findFormatOverrides(deserializationContext, null, _valueClass);

    return new BigDecimal(jsonParser.getText()
        , new MathContext(precision, RoundingMode.valueOf(roundingMode))).setScale(scale, RoundingMode.valueOf(roundingMode)
        );
  }

  @Override
  public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property)
      throws JsonMappingException {
    JsonFormat.Value format = findFormatOverrides(ctxt, property, handledType());
    if (format != null && format.getPattern() != null) {
      String pattern = format.getPattern();
      String[] patternParts = pattern.split(",");
      String roundingMode = patternParts[0];
      Integer precision = Integer.parseInt(patternParts[1]);
      Integer scale = Integer.parseInt(patternParts[2]);
      return new ComputateBigDecimalDeserializer(roundingMode, precision, scale);
    }
    return this;
  }
}
