package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartAxisTitleFormat;

/* loaded from: classes3.dex */
public class BaseWorkbookChartAxisTitle extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("text")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("visible")
    public Boolean g;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartAxisTitleFormat h;
    private transient C3003l i;
    private transient e j;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.j = eVar;
        this.i = c3003l;
    }
}
