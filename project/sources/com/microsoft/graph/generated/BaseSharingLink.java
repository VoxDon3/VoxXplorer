package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Identity;

/* loaded from: classes3.dex */
public class BaseSharingLink implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("application")
    public Identity c;

    @InterfaceC3059a
    @InterfaceC3061c("scope")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("type")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("webUrl")
    public String f;
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
