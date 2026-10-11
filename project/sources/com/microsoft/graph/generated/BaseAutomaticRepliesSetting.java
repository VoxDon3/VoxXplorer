package com.microsoft.graph.generated;

import ax.N9.EnumC0833a;
import ax.N9.EnumC0878x;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.DateTimeTimeZone;

/* loaded from: classes3.dex */
public class BaseAutomaticRepliesSetting implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("status")
    public EnumC0833a c;

    @InterfaceC3059a
    @InterfaceC3061c("externalAudience")
    public EnumC0878x d;

    @InterfaceC3059a
    @InterfaceC3061c("scheduledStartDateTime")
    public DateTimeTimeZone e;

    @InterfaceC3059a
    @InterfaceC3061c("scheduledEndDateTime")
    public DateTimeTimeZone f;

    @InterfaceC3059a
    @InterfaceC3061c("internalReplyMessage")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("externalReplyMessage")
    public String h;
    private transient C3003l i;
    private transient e j;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.j = eVar;
        this.i = c3003l;
    }
}
