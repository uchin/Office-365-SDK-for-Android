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
package com.microsoft.onenote.api;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Notebook Links.
*/
public class NotebookLinks extends ODataBaseEntity {

    public NotebookLinks(){
        setODataType("#Microsoft.OneNote.Api.NotebookLinks");
    }

    private ExternalLink oneNoteClientUrl;

    /**
    * Gets the one Note Client Url.
    *
    * @return the ExternalLink
    */
    public ExternalLink getOneNoteClientUrl() {
        return this.oneNoteClientUrl; 
    }

    /**
    * Sets the one Note Client Url.
    *
    * @param value the ExternalLink
    */
    public void setOneNoteClientUrl(ExternalLink value) { 
        this.oneNoteClientUrl = value;
        valueChanged("oneNoteClientUrl", value);

    }

    private ExternalLink oneNoteWebUrl;

    /**
    * Gets the one Note Web Url.
    *
    * @return the ExternalLink
    */
    public ExternalLink getOneNoteWebUrl() {
        return this.oneNoteWebUrl; 
    }

    /**
    * Sets the one Note Web Url.
    *
    * @param value the ExternalLink
    */
    public void setOneNoteWebUrl(ExternalLink value) { 
        this.oneNoteWebUrl = value;
        valueChanged("oneNoteWebUrl", value);

    }
}
