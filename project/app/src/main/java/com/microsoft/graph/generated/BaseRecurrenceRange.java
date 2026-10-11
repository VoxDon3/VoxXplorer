/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.X0;
import ax.R9.a;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.c;

public class BaseRecurrenceRange
implements d {
    @ax.s8.a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @ax.s8.a
    @c(value="type")
    public X0 c;
    @ax.s8.a
    @c(value="startDate")
    public a d;
    @ax.s8.a
    @c(value="endDate")
    public a e;
    @ax.s8.a
    @c(value="recurrenceTimeZone")
    public String f;
    @ax.s8.a
    @c(value="numberOfOccurrences")
    public Integer g;
    private transient l h;
    private transient e i;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

