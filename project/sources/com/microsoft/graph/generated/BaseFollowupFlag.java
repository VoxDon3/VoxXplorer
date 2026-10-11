package com.microsoft.graph.generated;

import ax.N9.EnumC0880y;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.DateTimeTimeZone;

/* loaded from: classes3.dex */
public class BaseFollowupFlag implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("completedDateTime")
    public DateTimeTimeZone c;

    @InterfaceC3059a
    @InterfaceC3061c("dueDateTime")
    public DateTimeTimeZone d;

    @InterfaceC3059a
    @InterfaceC3061c("startDateTime")
    public DateTimeTimeZone e;

    @InterfaceC3059a
    @InterfaceC3061c("flagStatus")
    public EnumC0880y f;
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
