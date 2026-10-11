package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseImageInfo implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("iconUrl")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("alternativeText")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("alternateText")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("addImageQuery")
    public Boolean f;
    private transient C3003l g;
    private transient e h;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.h = eVar;
        this.g = c3003l;
    }
}
