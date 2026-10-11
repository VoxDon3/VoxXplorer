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
import com.microsoft.graph.extensions.WorkbookChartAxis;

public class BaseWorkbookChartAxes
extends Entity
implements d {
    @a
    @c(value="categoryAxis")
    public WorkbookChartAxis f;
    @a
    @c(value="seriesAxis")
    public WorkbookChartAxis g;
    @a
    @c(value="valueAxis")
    public WorkbookChartAxis h;
    private transient l i;
    private transient e j;

    @Override
    public void d(e e8, l l8) {
        this.j = e8;
        this.i = l8;
    }
}

