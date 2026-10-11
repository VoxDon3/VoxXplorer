/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.OnenoteEntitySchemaObjectModel;
import java.util.Calendar;

public class BaseOnenoteEntityHierarchyModel
extends OnenoteEntitySchemaObjectModel
implements d {
    @a
    @c(value="displayName")
    public String l;
    @a
    @c(value="createdBy")
    public IdentitySet m;
    @a
    @c(value="lastModifiedBy")
    public IdentitySet n;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar o;
    private transient l p;
    private transient e q;

    @Override
    public void d(e e8, l l8) {
        this.q = e8;
        this.p = l8;
    }
}

