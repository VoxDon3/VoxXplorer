/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.Q0;
import ax.N9.R0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.OutlookGeoCoordinates;
import com.microsoft.graph.extensions.PhysicalAddress;

public class BaseLocation
implements d {
    @a
    @c(value="@odata.type")
    public String a;
    private transient com.microsoft.graph.serializer.a b;
    @a
    @c(value="displayName")
    public String c;
    @a
    @c(value="locationEmailAddress")
    public String d;
    @a
    @c(value="address")
    public PhysicalAddress e;
    @a
    @c(value="coordinates")
    public OutlookGeoCoordinates f;
    @a
    @c(value="locationUri")
    public String g;
    @a
    @c(value="locationType")
    public Q0 h;
    @a
    @c(value="uniqueId")
    public String i;
    @a
    @c(value="uniqueIdType")
    public R0 j;
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

