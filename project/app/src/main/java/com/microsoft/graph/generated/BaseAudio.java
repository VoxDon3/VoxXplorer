/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseAudio
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="album")
    public String c;
    @a
    @c(value="albumArtist")
    public String d;
    @a
    @c(value="artist")
    public String e;
    @a
    @c(value="bitrate")
    public Long f;
    @a
    @c(value="composers")
    public String g;
    @a
    @c(value="copyright")
    public String h;
    @a
    @c(value="disc")
    public Integer i;
    @a
    @c(value="discCount")
    public Integer j;
    @a
    @c(value="duration")
    public Long k;
    @a
    @c(value="genre")
    public String l;
    @a
    @c(value="hasDrm")
    public Boolean m;
    @a
    @c(value="isVariableBitrate")
    public Boolean n;
    @a
    @c(value="title")
    public String o;
    @a
    @c(value="track")
    public Integer p;
    @a
    @c(value="trackCount")
    public Integer q;
    @a
    @c(value="year")
    public Integer r;
    private transient l s;
    private transient e t;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.t = e8;
        this.s = l8;
    }
}

