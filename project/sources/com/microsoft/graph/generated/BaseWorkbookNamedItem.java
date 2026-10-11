package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookWorksheet;

/* loaded from: classes3.dex */
public class BaseWorkbookNamedItem extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("comment")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("scope")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("type")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("value")
    public AbstractC3000i j;

    @InterfaceC3059a
    @InterfaceC3061c("visible")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("worksheet")
    public WorkbookWorksheet l;
    private transient C3003l m;
    private transient e n;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.n = eVar;
        this.m = c3003l;
    }
}
