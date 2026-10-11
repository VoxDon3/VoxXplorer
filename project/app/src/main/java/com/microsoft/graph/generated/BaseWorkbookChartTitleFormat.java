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
import com.microsoft.graph.extensions.WorkbookChartFont;

public class BaseWorkbookChartTitleFormat
extends Entity
implements d {
    @a
    @c(value="fill")
    public WorkbookChartFill f;
    @a
    @c(value="font")
    public WorkbookChartFont g;
    private transient l h;
    private transient e i;

    @Override
    public void d(e e8, l l8) {
        this.i = e8;
        this.h = l8;
    }
}

