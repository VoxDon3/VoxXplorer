/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.PublicationFacet;
import java.util.Calendar;

public class BaseBaseItemVersion
extends Entity
implements d {
    @a
    @c(value="lastModifiedBy")
    public IdentitySet f;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar g;
    @a
    @c(value="publication")
    public PublicationFacet h;
    private transient l i;
    private transient e j;

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

