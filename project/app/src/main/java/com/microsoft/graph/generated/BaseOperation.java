/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.U0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import java.util.Calendar;

public class BaseOperation
extends Entity
implements d {
    @a
    @c(value="status")
    public U0 f;
    @a
    @c(value="createdDateTime")
    public Calendar g;
    @a
    @c(value="lastActionDateTime")
    public Calendar h;
    private transient l i;
    private transient e j;

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

