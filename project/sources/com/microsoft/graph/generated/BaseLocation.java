package com.microsoft.graph.generated;

import ax.N9.Q0;
import ax.N9.R0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.OutlookGeoCoordinates;
import com.microsoft.graph.extensions.PhysicalAddress;

/* loaded from: classes3.dex */
public class BaseLocation implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("displayName")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("locationEmailAddress")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("address")
    public PhysicalAddress e;

    @InterfaceC3059a
    @InterfaceC3061c("coordinates")
    public OutlookGeoCoordinates f;

    @InterfaceC3059a
    @InterfaceC3061c("locationUri")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("locationType")
    public Q0 h;

    @InterfaceC3059a
    @InterfaceC3061c("uniqueId")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("uniqueIdType")
    public R0 j;
    private transient C3003l k;
    private transient e l;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.l = eVar;
        this.k = c3003l;
    }
}
