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
