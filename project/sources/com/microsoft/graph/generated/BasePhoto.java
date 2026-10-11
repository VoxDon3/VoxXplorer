package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BasePhoto implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("cameraMake")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("cameraModel")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("exposureDenominator")
    public Double e;

    @InterfaceC3059a
    @InterfaceC3061c("exposureNumerator")
    public Double f;

    @InterfaceC3059a
    @InterfaceC3061c("fNumber")
    public Double g;

    @InterfaceC3059a
    @InterfaceC3061c("focalLength")
    public Double h;

    @InterfaceC3059a
    @InterfaceC3061c("iso")
    public Integer i;

    @InterfaceC3059a
    @InterfaceC3061c("takenDateTime")
    public Calendar j;
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
