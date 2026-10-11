/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.SharepointIds;

public class BaseItemReference
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b = new com.microsoft.graph.serializer.a(this);
    @a
    @c(value="driveId")
    public String c;
    @a
    @c(value="driveType")
    public String d;
    @a
    @c(value="id")
    public String e;
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="path")
    public String g;
    @a
    @c(value="shareId")
    public String h;
    @a
    @c(value="sharepointIds")
    public SharepointIds i;
    private transient l j;
    private transient e k;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.k = e8;
        this.j = l8;
    }
}

