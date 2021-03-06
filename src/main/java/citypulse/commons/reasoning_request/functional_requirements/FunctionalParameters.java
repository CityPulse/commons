/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Stefano Germano - Insight Centre for Data Analytics NUIG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *******************************************************************************/
package citypulse.commons.reasoning_request.functional_requirements;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Stefano Germano
 *
 */
public class FunctionalParameters {

	/**
	 *
	 */
	private Set<FunctionalParameter> functionalParameters;

	/**
	 *
	 */
	public FunctionalParameters() {
		super();
		functionalParameters = new HashSet<FunctionalParameter>();
	}

	/**
	 * @param functionalParameter
	 */
	public void addFunctionalParameter(FunctionalParameter functionalParameter) {
		functionalParameters.add(functionalParameter);
	}

	/**
	 * @return
	 */
	public Set<FunctionalParameter> getFunctionalParameters() {
		return Collections.unmodifiableSet(functionalParameters);
	}

	/**
	 * @param functionalParameters
	 */
	public void setFunctionalParameters(
			Set<FunctionalParameter> functionalParameters) {
		this.functionalParameters = functionalParameters;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FunctionalParameters [functionalParameters="
				+ functionalParameters + "]";
	}

	/*
	 * @Thu-Le Pham This function return FunctionalParameterValue for a
	 * givenFunctionalParameterName
	 */
	public FunctionalParameterValue getFunctionalParameterValue(
			FunctionalParameterName name) {
		final FunctionalParameterValue value = null;
		for (final FunctionalParameter p : this.functionalParameters) {
			if (p.getName().equals(name)) {
				return p.getValue();
			}
		}
		return value;
	}

}
