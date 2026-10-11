/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseListInfo
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="contentTypesEnabled")
    public Boolean c;
    @a
    @c(value="hidden")
    public Boolean d;
    @a
    @c(value="template")
    public String e;
    private transient l f;
    private transient e g;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.g = e8;
        this.f = l8;
    }
}

