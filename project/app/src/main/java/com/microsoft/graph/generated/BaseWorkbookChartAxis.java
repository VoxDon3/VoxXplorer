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
import com.microsoft.graph.extensions.WorkbookChartAxisFormat;
import com.microsoft.graph.extensions.WorkbookChartAxisTitle;
import com.microsoft.graph.extensions.WorkbookChartGridlines;

public class BaseWorkbookChartAxis
extends Entity
implements d {
    @a
    @c(value="majorUnit")
    public i f;
    @a
    @c(value="maximum")
    public i g;
    @a
    @c(value="minimum")
    public i h;
    @a
    @c(value="minorUnit")
    public i i;
    @a
    @c(value="format")
    public WorkbookChartAxisFormat j;
    @a
    @c(value="majorGridlines")
    public WorkbookChartGridlines k;
    @a
    @c(value="minorGridlines")
    public WorkbookChartGridlines l;
    @a
    @c(value="title")
    public WorkbookChartAxisTitle m;
    private transient l n;
    private transient e o;

    @Override
    public void d(e e8, l l8) {
        this.o = e8;
        this.n = l8;
    }
}

