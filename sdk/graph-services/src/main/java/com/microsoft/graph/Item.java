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
 * The type Item.
*/
public class Item extends ODataBaseEntity {

    public Item(){
        setODataType("#Microsoft.Graph.Item");
    }
            
    private IdentitySet createdBy;
     
    /**
    * Gets the created By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getCreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the IdentitySet
    */
    public void setCreatedBy(IdentitySet value) { 
        this.createdBy = value; 
        valueChanged("createdBy", value);

    }
            
    private String eTag;
     
    /**
    * Gets the e Tag.
    *
    * @return the String
    */
    public String getETag() {
        return this.eTag; 
    }

    /**
    * Sets the e Tag.
    *
    * @param value the String
    */
    public void setETag(String value) { 
        this.eTag = value; 
        valueChanged("eTag", value);

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
            
    private IdentitySet lastModifiedBy;
     
    /**
    * Gets the last Modified By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getLastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the IdentitySet
    */
    public void setLastModifiedBy(IdentitySet value) { 
        this.lastModifiedBy = value; 
        valueChanged("lastModifiedBy", value);

    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getName() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.name = value; 
        valueChanged("name", value);

    }
            
    private ItemReference parentReference;
     
    /**
    * Gets the parent Reference.
    *
    * @return the ItemReference
    */
    public ItemReference getParentReference() {
        return this.parentReference; 
    }

    /**
    * Sets the parent Reference.
    *
    * @param value the ItemReference
    */
    public void setParentReference(ItemReference value) { 
        this.parentReference = value; 
        valueChanged("parentReference", value);

    }
            
    private Long size;
     
    /**
    * Gets the size.
    *
    * @return the Long
    */
    public Long getSize() {
        return this.size; 
    }

    /**
    * Sets the size.
    *
    * @param value the Long
    */
    public void setSize(Long value) { 
        this.size = value; 
        valueChanged("size", value);

    }
            
    private java.util.Calendar dateTimeCreated;
     
    /**
    * Gets the date Time Created.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getDateTimeCreated() {
        return this.dateTimeCreated; 
    }

    /**
    * Sets the date Time Created.
    *
    * @param value the java.util.Calendar
    */
    public void setDateTimeCreated(java.util.Calendar value) { 
        this.dateTimeCreated = value; 
        valueChanged("dateTimeCreated", value);

    }
            
    private java.util.Calendar dateTimeLastModified;
     
    /**
    * Gets the date Time Last Modified.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getDateTimeLastModified() {
        return this.dateTimeLastModified; 
    }

    /**
    * Sets the date Time Last Modified.
    *
    * @param value the java.util.Calendar
    */
    public void setDateTimeLastModified(java.util.Calendar value) { 
        this.dateTimeLastModified = value; 
        valueChanged("dateTimeLastModified", value);

    }
            
    private String type;
     
    /**
    * Gets the type.
    *
    * @return the String
    */
    public String getType() {
        return this.type; 
    }

    /**
    * Sets the type.
    *
    * @param value the String
    */
    public void setType(String value) { 
        this.type = value; 
        valueChanged("type", value);

    }
            
    private String webUrl;
     
    /**
    * Gets the web Url.
    *
    * @return the String
    */
    public String getWebUrl() {
        return this.webUrl; 
    }

    /**
    * Sets the web Url.
    *
    * @param value the String
    */
    public void setWebUrl(String value) { 
        this.webUrl = value; 
        valueChanged("webUrl", value);

    }
            
    private User createdByUser;
     
    /**
    * Gets the created By User.
    *
    * @return the User
    */
    public User getCreatedByUser() {
        return this.createdByUser; 
    }

    /**
    * Sets the created By User.
    *
    * @param value the User
    */
    public void setCreatedByUser(User value) { 
        this.createdByUser = value; 
        valueChanged("createdByUser", value);

    }
            
    private User lastModifiedByUser;
     
    /**
    * Gets the last Modified By User.
    *
    * @return the User
    */
    public User getLastModifiedByUser() {
        return this.lastModifiedByUser; 
    }

    /**
    * Sets the last Modified By User.
    *
    * @param value the User
    */
    public void setLastModifiedByUser(User value) { 
        this.lastModifiedByUser = value; 
        valueChanged("lastModifiedByUser", value);

    }
    
        
    private java.util.List<Item> children = null;
    
    
     
    /**
    * Gets the children.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getChildren() {
        return this.children; 
    }

    /**
    * Sets the children.
    *
    * @param value the java.util.List<Item>
    */
    public void setChildren(java.util.List<Item> value) { 
        this.children = value; 
        valueChanged("children", value);

    }
}

