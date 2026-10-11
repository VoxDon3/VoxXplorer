package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseVideo implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("audioBitsPerSample")
    public Integer c;

    @InterfaceC3059a
    @InterfaceC3061c("audioChannels")
    public Integer d;

    @InterfaceC3059a
    @InterfaceC3061c("audioFormat")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("audioSamplesPerSecond")
    public Integer f;

    @InterfaceC3059a
    @InterfaceC3061c("bitrate")
    public Integer g;

    @InterfaceC3059a
    @InterfaceC3061c("duration")
    public Long h;

    @InterfaceC3059a
    @InterfaceC3061c("fourCC")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("frameRate")
    public Double j;

    @InterfaceC3059a
    @InterfaceC3061c("height")
    public Integer k;

    @InterfaceC3059a
    @InterfaceC3061c("width")
    public Integer l;
    private transient C3003l m;
    private transient e n;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.n = eVar;
        this.m = c3003l;
    }
}
