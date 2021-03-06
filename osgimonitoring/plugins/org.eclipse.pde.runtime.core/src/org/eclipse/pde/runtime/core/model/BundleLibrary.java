/*******************************************************************************
 *  Copyright (c) 2006, 2008 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *     Wojciech Galanciak <wojciech.galanciak@gmail.com> - bug 282804
 *******************************************************************************/
package org.eclipse.pde.runtime.core.model;

public class BundleLibrary extends ModelObject {

	private static final long serialVersionUID = 1L;
	private String library;

	public String getLibrary() {
		return library;
	}

	public void setLibrary(String name) {
		library = name;
	}
}
