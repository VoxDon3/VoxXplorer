package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseFileSystemInfo implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b = new com.microsoft.graph.serializer.a(this);

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar c;

    @InterfaceC3059a
    @InterfaceC3061c("lastAccessedDateTime")
    public Calendar d;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar e;
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
