/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.y;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.DateTimeTimeZone;

public class BaseFollowupFlag
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="completedDateTime")
    public DateTimeTimeZone c;
    @a
    @c(value="dueDateTime")
    public DateTimeTimeZone d;
    @a
    @c(value="startDateTime")
    public DateTimeTimeZone e;
    @a
    @c(value="flagStatus")
    public y f;
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

