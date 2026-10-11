package com.microsoft.graph.generated;

import ax.N9.EnumC0843f;
import ax.N9.W0;
import ax.N9.d1;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseRecurrencePattern implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("type")
    public W0 c;

    @InterfaceC3059a
    @InterfaceC3061c("interval")
    public Integer d;

    @InterfaceC3059a
    @InterfaceC3061c("month")
    public Integer e;

    @InterfaceC3059a
    @InterfaceC3061c("dayOfMonth")
    public Integer f;

    @InterfaceC3059a
    @InterfaceC3061c("daysOfWeek")
    public List<EnumC0843f> g;

    @InterfaceC3059a
    @InterfaceC3061c("firstDayOfWeek")
    public EnumC0843f h;

    @InterfaceC3059a
    @InterfaceC3061c("index")
    public d1 i;
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
