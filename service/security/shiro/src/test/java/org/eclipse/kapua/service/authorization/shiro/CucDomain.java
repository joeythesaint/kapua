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
 *
 *******************************************************************************/
package org.eclipse.kapua.service.authorization.shiro;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.kapua.service.authorization.permission.Actions;

public class CucDomain {

    private String name = null;
    private String serviceName = null;
    private String actions = null;
    private Set<Actions> actionSet = null;

    public void doParse() {
        if (this.actions != null) {
            String[] tmpList = this.actions.split(",");
            this.actionSet = new HashSet<>();

            for (String tmpS : tmpList) {
                switch (tmpS.trim().toLowerCase()) {
                case "read":
                    this.actionSet.add(Actions.read);
                    break;
                case "write":
                    this.actionSet.add(Actions.write);
                    break;
                case "delete":
                    this.actionSet.add(Actions.delete);
                    break;
                case "connect":
                    this.actionSet.add(Actions.connect);
                    break;
                case "execute":
                    this.actionSet.add(Actions.execute);
                    break;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getActions() {
        return this.actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public Set<Actions> getActionSet() {
        return actionSet;
    }
}
