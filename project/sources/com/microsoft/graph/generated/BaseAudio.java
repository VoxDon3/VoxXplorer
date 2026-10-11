package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class BaseAudio implements d {

    @InterfaceC3059a
    @InterfaceC3061c("@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;

    @InterfaceC3059a
    @InterfaceC3061c("album")
    public String c;

    @InterfaceC3059a
    @InterfaceC3061c("albumArtist")
    public String d;

    @InterfaceC3059a
    @InterfaceC3061c("artist")
    public String e;

    @InterfaceC3059a
    @InterfaceC3061c("bitrate")
    public Long f;

    @InterfaceC3059a
    @InterfaceC3061c("composers")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("copyright")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("disc")
    public Integer i;

    @InterfaceC3059a
    @InterfaceC3061c("discCount")
    public Integer j;

    @InterfaceC3059a
    @InterfaceC3061c("duration")
    public Long k;

    @InterfaceC3059a
    @InterfaceC3061c("genre")
    public String l;

    @InterfaceC3059a
    @InterfaceC3061c("hasDrm")
    public Boolean m;

    @InterfaceC3059a
    @InterfaceC3061c("isVariableBitrate")
    public Boolean n;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public String o;

    @InterfaceC3059a
    @InterfaceC3061c("track")
    public Integer p;

    @InterfaceC3059a
    @InterfaceC3061c("trackCount")
    public Integer q;

    @InterfaceC3059a
    @InterfaceC3061c("year")
    public Integer r;
    private transient C3003l s;
    private transient e t;

    @Override // ax.T9.d
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override // ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.t = eVar;
        this.s = c3003l;
    }
}
