/*
 * Copyright (C) 2010 White Source Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.whitesource.jenkins;

/**
 * Constants used by the plugin. 
 * 
 * @author Edo.Shor
 */
public final class Constants {
	
	/* --- Configuration--- */
	
	public static final String AGENT_TYPE = "jenkins";
	
	public static final String AGENT_VERSION = "1.0";
	
	/* --- Error messages --- */
	
	public static final String ERROR_SHA1 = "Error calculating SHA-1";

	/* --- Constructors --- */
	
	/**
	 * Private default constructor
	 */
	private Constants() {
		// avoid instantiation
	}

}