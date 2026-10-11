package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartDataLabelFormat;

/* loaded from: classes3.dex */
public class BaseWorkbookChartDataLabels extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("position")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("separator")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("showBubbleSize")
    public Boolean h;

    @InterfaceC3059a
    @InterfaceC3061c("showCategoryName")
    public Boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("showLegendKey")
    public Boolean j;

    @InterfaceC3059a
    @InterfaceC3061c("showPercentage")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("showSeriesName")
    public Boolean l;

    @InterfaceC3059a
    @InterfaceC3061c("showValue")
    public Boolean m;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartDataLabelFormat n;
    private transient C3003l o;
    private transient e p;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.p = eVar;
        this.o = c3003l;
    }
}
