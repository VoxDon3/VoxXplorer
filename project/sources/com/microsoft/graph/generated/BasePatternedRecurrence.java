package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.RecurrencePattern;
import com.microsoft.graph.extensions.RecurrenceRange;

/* loaded from: classes3.dex */
public class BasePatternedRecurrence implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("pattern")
    public RecurrencePattern c;

    @InterfaceC3059a
    @InterfaceC3061c("range")
    public RecurrenceRange d;
    private transient C3003l e;
    private transient e f;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.f = eVar;
        this.e = c3003l;
    }
}
