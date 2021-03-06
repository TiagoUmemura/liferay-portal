/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.blogs.uad.display;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.uad.constants.BlogsUADConstants;

import com.liferay.user.associated.data.display.BaseModelUADDisplay;

import java.util.Locale;

/**
 * Provides the base implementation for the BlogsEntry UAD display.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom methods should be put in
 * {@link BlogsEntryUADDisplay}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseBlogsEntryUADDisplay extends BaseModelUADDisplay<BlogsEntry> {
	public String getApplicationName() {
		return BlogsUADConstants.APPLICATION_NAME;
	}

	/**
	 * Returns an ordered string array of the fields' names to be displayed.
	 * Each field name corresponds to a table column based on the order they are
	 * specified.
	 *
	 * @return the array of field names to display
	 */
	public String[] getDisplayFieldNames() {
		return new String[] {
			"title", "subtitle", "urlTitle", "description", "content",
			"smallImage", "smallImageId"
		};
	}

	public String getKey() {
		return BlogsUADConstants.CLASS_NAME_BLOGS_ENTRY;
	}

	@Override
	public String getTypeName(Locale locale) {
		return "BlogsEntry";
	}
}