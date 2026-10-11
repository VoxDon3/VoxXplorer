package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartAxisFormat;
import com.microsoft.graph.extensions.WorkbookChartAxisTitle;
import com.microsoft.graph.extensions.WorkbookChartGridlines;

/* loaded from: classes3.dex */
public class BaseWorkbookChartAxis extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("majorUnit")
    public AbstractC3000i f;

    @InterfaceC3059a
    @InterfaceC3061c("maximum")
    public AbstractC3000i g;

    @InterfaceC3059a
    @InterfaceC3061c("minimum")
    public AbstractC3000i h;

    @InterfaceC3059a
    @InterfaceC3061c("minorUnit")
    public AbstractC3000i i;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartAxisFormat j;

    @InterfaceC3059a
    @InterfaceC3061c("majorGridlines")
    public WorkbookChartGridlines k;

    @InterfaceC3059a
    @InterfaceC3061c("minorGridlines")
    public WorkbookChartGridlines l;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public WorkbookChartAxisTitle m;
    private transient C3003l n;
    private transient e o;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.o = eVar;
        this.n = c3003l;
    }
}
