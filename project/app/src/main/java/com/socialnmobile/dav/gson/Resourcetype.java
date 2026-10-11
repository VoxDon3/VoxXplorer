/*
 * Decompiled with CFR 0.152.
 */
package com.socialnmobile.dav.gson;

import androidx.annotation.Keep;

@Keep
public class Resourcetype {
    private Object collection;
    private Object principal;

    public Object getCollection() {
        return this.collection;
    }

    public Object getPrincipal() {
        return this.principal;
    }

    public void setCollection(Object object) {
        this.collection = object;
    }

    public void setPrincipal(Object object) {
        this.principal = object;
    }
}

