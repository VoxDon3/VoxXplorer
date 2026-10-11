package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.SharepointIds;

/* loaded from: classes3.dex */
public class BaseItemReference implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b = new com.microsoft.graph.serializer.a(this);

    @InterfaceC3059a
    @InterfaceC3061c("driveId")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("driveType")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("id")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("path")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("shareId")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("sharepointIds")
    public SharepointIds i;
    private transient C3003l j;
    private transient e k;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
    }
}
