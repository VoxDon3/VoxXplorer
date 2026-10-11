/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.BaseItemVersion;
import com.microsoft.graph.extensions.FieldValueSet;

public class BaseListItemVersion
extends BaseItemVersion
implements d {
    @a
    @c(value="fields")
    public FieldValueSet k;
    private transient l l;
    private transient e m;

    @Override
    public void d(e e8, l l8) {
        this.m = e8;
        this.l = l8;
    }
}

