/**
 * The MIT License
 *
 * Copyright (C) 2020 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.template.enumtype;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * The enum class {@link ApplicationHeaderKeyName} holds constants for the header key names
 */
@RequiredArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ApplicationHeaderKeyName
{
	/**
	 * The header key name for the default token issuer
	 **/
	DEFAULT_TOKEN_ISSUER_VALUE(ApplicationHeaderKeyName.DEFAULT_TOKEN_ISSUER),

	/**
	 * The header key name for the user roles
	 **/
	HEADER_KEY_ROLES_VALUE(ApplicationHeaderKeyName.HEADER_KEY_ROLES),

	/**
	 * The header key name for the default audience
	 **/
	DEFAULT_TOKEN_AUDIENCE_VALUE(ApplicationHeaderKeyName.DEFAULT_TOKEN_AUDIENCE);

	/** The constant for the header key name for the default token issuer **/
	public static final String DEFAULT_TOKEN_ISSUER = "user-auth-api";

	/** The constant for the header key name for the default audience **/
	public static final String DEFAULT_TOKEN_AUDIENCE = "user-auth-app";

	/** The constant for the header key name for the user roles **/
	public static final String HEADER_KEY_ROLES = "u-roles";

	/** The value of the header key name **/
	private final String name;

}
