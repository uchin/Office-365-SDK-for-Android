/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Identity.
*/
public class Identity extends ODataBaseEntity {

    public Identity(){
        setODataType("#Microsoft.Graph.Identity");
    }

    private String id;

    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getId() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.id = value;
        valueChanged("id", value);

    }

    private String displayName;

    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value;
        valueChanged("displayName", value);

    }
}
