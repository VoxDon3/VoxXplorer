/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.x;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.DateTimeTimeZone;

public class BaseAutomaticRepliesSetting
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="status")
    public ax.N9.a c;
    @a
    @c(value="externalAudience")
    public x d;
    @a
    @c(value="scheduledStartDateTime")
    public DateTimeTimeZone e;
    @a
    @c(value="scheduledEndDateTime")
    public DateTimeTimeZone f;
    @a
    @c(value="internalReplyMessage")
    public String g;
    @a
    @c(value="externalReplyMessage")
    public String h;
    private transient l i;
    private transient e j;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

