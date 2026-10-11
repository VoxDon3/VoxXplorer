package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookFilterCriteria;

/* loaded from: classes3.dex */
public class BaseWorkbookFilter extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("criteria")
    public WorkbookFilterCriteria f;
    private transient C3003l g;
    private transient e h;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.h = eVar;
        this.g = c3003l;
    }
}
