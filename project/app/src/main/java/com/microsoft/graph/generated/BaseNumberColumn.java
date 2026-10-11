/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseNumberColumn
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="decimalPlaces")
    public String c;
    @a
    @c(value="displayAs")
    public String d;
    @a
    @c(value="maximum")
    public Double e;
    @a
    @c(value="minimum")
    public Double f;
    private transient l g;
    private transient e h;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.h = e8;
        this.g = l8;
    }
}

