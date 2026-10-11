package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseOutlookGeoCoordinates implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("altitude")
    public Double c;

    @InterfaceC3059a
    @InterfaceC3061c("latitude")
    public Double d;

    @InterfaceC3059a
    @InterfaceC3061c("longitude")
    public Double e;

    @InterfaceC3059a
    @InterfaceC3061c("accuracy")
    public Double f;

    @InterfaceC3059a
    @InterfaceC3061c("altitudeAccuracy")
    public Double g;
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
