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
import com.microsoft.graph.extensions.WorkbookChartDataLabelFormat;

public class BaseWorkbookChartDataLabels
extends Entity
implements d {
    @a
    @c(value="position")
    public String f;
    @a
    @c(value="separator")
    public String g;
    @a
    @c(value="showBubbleSize")
    public Boolean h;
    @a
    @c(value="showCategoryName")
    public Boolean i;
    @a
    @c(value="showLegendKey")
    public Boolean j;
    @a
    @c(value="showPercentage")
    public Boolean k;
    @a
    @c(value="showSeriesName")
    public Boolean l;
    @a
    @c(value="showValue")
    public Boolean m;
    @a
    @c(value="format")
    public WorkbookChartDataLabelFormat n;
    private transient l o;
    private transient e p;

    @Override
    public void d(e e8, l l8) {
        this.p = e8;
        this.o = l8;
    }
}

