/*******************************************************************************
 *  Copyright (c) 2012 VMware, Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *      VMware, Inc. - initial API and implementation
 *******************************************************************************/
package org.springsource.ide.eclipse.commons.core.process;

import java.io.File;
import java.io.IOException;

/**
 * @author Christian Dupuis
 * @author Steffen Pingel
 * @since 2.5.2
 */
public interface ProcessRunner {

	int run(File workingDir, String... command) throws IOException, InterruptedException;

}
