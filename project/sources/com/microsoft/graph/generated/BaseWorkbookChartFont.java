package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;

/* loaded from: classes3.dex */
public class BaseWorkbookChartFont extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("bold")
    public Boolean f;

    @InterfaceC3059a
    @InterfaceC3061c("color")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("italic")
    public Boolean h;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("size")
    public Double j;

    @InterfaceC3059a
    @InterfaceC3061c("underline")
    public String k;
    private transient C3003l l;
    private transient e m;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.m = eVar;
        this.l = c3003l;
    }
}
