package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseLookupColumn implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("allowMultipleValues")
    public Boolean c;

    @InterfaceC3059a
    @InterfaceC3061c("allowUnlimitedLength")
    public Boolean d;

    @InterfaceC3059a
    @InterfaceC3061c("columnName")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("listId")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("primaryLookupColumnId")
    public String g;
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
