/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.W0;
import ax.N9.d1;
import ax.N9.f;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import java.util.List;

public class BaseRecurrencePattern
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="type")
    public W0 c;
    @a
    @c(value="interval")
    public Integer d;
    @a
    @c(value="month")
    public Integer e;
    @a
    @c(value="dayOfMonth")
    public Integer f;
    @a
    @c(value="daysOfWeek")
    public List<f> g;
    @a
    @c(value="firstDayOfWeek")
    public f h;
    @a
    @c(value="index")
    public d1 i;
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

