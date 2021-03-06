/*******************************************************************************
 * Copyright (c) 2011, 2017 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.datastore.internal.elasticsearch;

/**
 * Elasticsearch client unavailable exception
 * 
 * @since 1.0
 *
 */
public class EsClientUnavailableException extends EsDatastoreException
{

    private static final long serialVersionUID = 2211521053876589804L;

    /**
     * Construct the exception with the provided message
     * 
     * @param message
     */
    public EsClientUnavailableException(String message)
    {
        super(message);
    }

    /**
     * Construct the exception with the provided throwable
     * 
     * @param e
     */
    public EsClientUnavailableException(Throwable e)
    {
        super(e);
    }

    /**
     * Construct the exception with the provided reason and throwable
     * 
     * @param reason
     * @param e
     */
    public EsClientUnavailableException(String reason, Throwable e)
    {
        super(reason, e);
    }
}
