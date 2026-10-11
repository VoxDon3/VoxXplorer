/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Identity;

public class BaseSharingLink
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="application")
    public Identity c;
    @a
    @c(value="scope")
    public String d;
    @a
    @c(value="type")
    public String e;
    @a
    @c(value="webUrl")
    public String f;
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

