/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;

public class BaseVideo
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="audioBitsPerSample")
    public Integer c;
    @a
    @c(value="audioChannels")
    public Integer d;
    @a
    @c(value="audioFormat")
    public String e;
    @a
    @c(value="audioSamplesPerSecond")
    public Integer f;
    @a
    @c(value="bitrate")
    public Integer g;
    @a
    @c(value="duration")
    public Long h;
    @a
    @c(value="fourCC")
    public String i;
    @a
    @c(value="frameRate")
    public Double j;
    @a
    @c(value="height")
    public Integer k;
    @a
    @c(value="width")
    public Integer l;
    private transient l m;
    private transient e n;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.n = e8;
        this.m = l8;
    }
}

