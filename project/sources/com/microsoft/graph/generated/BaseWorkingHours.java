package com.microsoft.graph.generated;

import ax.N9.EnumC0843f;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.TimeZoneBase;
import java.util.List;

/* loaded from: classes3.dex */
public class BaseWorkingHours implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("daysOfWeek")
    public List<EnumC0843f> c;

    @InterfaceC3059a
    @InterfaceC3061c("startTime")
    public ax.R9.b d;

    @InterfaceC3059a
    @InterfaceC3061c("endTime")
    public ax.R9.b e;

    @InterfaceC3059a
    @InterfaceC3061c("timeZone")
    public TimeZoneBase f;
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
