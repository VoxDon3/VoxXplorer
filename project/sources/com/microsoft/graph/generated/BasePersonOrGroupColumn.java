package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BasePersonOrGroupColumn implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("allowMultipleSelection")
    public Boolean c;

    @InterfaceC3059a
    @InterfaceC3061c("chooseFromType")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("displayAs")
    public String e;
    private transient C3003l f;
    private transient e g;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.g = eVar;
        this.f = c3003l;
    }
}
