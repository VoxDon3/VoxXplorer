/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartFill;

public class BaseWorkbookChartPointFormat
extends Entity
implements d {
    @a
    @c(value="fill")
    public WorkbookChartFill f;
    private transient l g;
    private transient e h;

    @Override
    public void d(e e8, l l8) {
        this.h = e8;
        this.g = l8;
    }
}

