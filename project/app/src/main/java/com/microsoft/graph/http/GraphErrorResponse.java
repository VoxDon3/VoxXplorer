/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.http;

import ax.P9.g;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class GraphErrorResponse
implements d {
    private transient com.microsoft.graph.serializer.a a = new com.microsoft.graph.serializer.a(this);
    @c(value="error")
    public g b;
    @a(deserialize=false, serialize=false)
    public l c;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.a;
    }

    @Override
    public void d(e e8, l l8) {
        this.c = l8;
    }
}

