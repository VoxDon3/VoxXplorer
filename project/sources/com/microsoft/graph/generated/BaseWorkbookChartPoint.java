package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartPointFormat;

/* loaded from: classes3.dex */
public class BaseWorkbookChartPoint extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("value")
    public AbstractC3000i f;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartPointFormat g;
    private transient C3003l h;
    private transient e i;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.i = eVar;
        this.h = c3003l;
    }
}
