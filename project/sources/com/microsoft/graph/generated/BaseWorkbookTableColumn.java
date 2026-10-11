package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookFilter;

/* loaded from: classes3.dex */
public class BaseWorkbookTableColumn extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("index")
    public Integer f;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("values")
    public AbstractC3000i h;

    @InterfaceC3059a
    @InterfaceC3061c("filter")
    public WorkbookFilter i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
