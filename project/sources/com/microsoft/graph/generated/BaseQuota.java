package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseQuota implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("deleted")
    public Long c;

    @InterfaceC3059a
    @InterfaceC3061c("remaining")
    public Long d;

    @InterfaceC3059a
    @InterfaceC3061c("state")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("total")
    public Long f;

    @InterfaceC3059a
    @InterfaceC3061c("used")
    public Long g;
    private transient C3003l h;
    private transient e i;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.i = eVar;
        this.h = c3003l;
    }
}
