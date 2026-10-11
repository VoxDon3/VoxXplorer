/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import java.util.Calendar;

public class BasePhoto
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="cameraMake")
    public String c;
    @a
    @c(value="cameraModel")
    public String d;
    @a
    @c(value="exposureDenominator")
    public Double e;
    @a
    @c(value="exposureNumerator")
    public Double f;
    @a
    @c(value="fNumber")
    public Double g;
    @a
    @c(value="focalLength")
    public Double h;
    @a
    @c(value="iso")
    public Integer i;
    @a
    @c(value="takenDateTime")
    public Calendar j;
    private transient l k;
    private transient e l;

    @Override
    public final com.microsoft.graph.serializer.a c() {
        return this.b;
    }

    @Override
    public void d(e e8, l l8) {
        this.l = e8;
        this.k = l8;
    }
}

