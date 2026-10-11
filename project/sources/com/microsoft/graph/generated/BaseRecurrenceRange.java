package com.microsoft.graph.generated;

import ax.N9.X0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseRecurrenceRange implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("type")
    public X0 c;

    @InterfaceC3059a
    @InterfaceC3061c("startDate")
    public ax.R9.a d;

    @InterfaceC3059a
    @InterfaceC3061c("endDate")
    public ax.R9.a e;

    @InterfaceC3059a
    @InterfaceC3061c("recurrenceTimeZone")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("numberOfOccurrences")
    public Integer g;
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
