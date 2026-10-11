/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;

public class BaseWorkbookTableRow
extends Entity
implements d {
    @a
    @c(value="index")
    public Integer f;
    @a
    @c(value="values")
    public i g;
    private transient l h;
    private transient e i;

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

