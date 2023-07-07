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
package org.computate.search.wrap;

import java.io.Serializable;

/**
 * Keyword: classSimpleNameWrap
 **/
public class Wrap<DEV> implements Serializable {

	private String var;
	
	public String getVar() {
		return var;
	}

	public Wrap<DEV> var(String o) {
		var = o;
		return this;
	}

	private DEV o;
	
	public DEV getO() {
		return o;
	}

	public Wrap<DEV> o(DEV o) {
		this.o = o;
		return this;
	}
}
