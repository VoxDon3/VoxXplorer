/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.p;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.z5;

public final class A5
extends a {
    public static final Parcelable.Creator<A5> CREATOR = new z5();
    public final String c0;
    public final long d0;
    public final Long e0;
    public final String f0;
    public final String g0;
    public final Double h0;
    private final int q;

    A5(int n8, String object, long l8, Long l9, Float f8, String string, String string2, Double d8) {
        this.q = n8;
        this.c0 = object;
        this.d0 = l8;
        this.e0 = l9;
        if (n8 == 1) {
            object = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
            this.h0 = object;
        } else {
            this.h0 = d8;
        }
        this.f0 = string;
        this.g0 = string2;
    }

    A5(C5 c52) {
        this(c52.c, c52.d, c52.e, c52.b);
    }

    A5(String string, long l8, Object object, String string2) {
        p.f(string);
        this.q = 2;
        this.c0 = string;
        this.d0 = l8;
        this.g0 = string2;
        if (object == null) {
            this.e0 = null;
            this.h0 = null;
            this.f0 = null;
            return;
        }
        if (object instanceof Long) {
            this.e0 = (Long)object;
            this.h0 = null;
            this.f0 = null;
            return;
        }
        if (object instanceof String) {
            this.e0 = null;
            this.h0 = null;
            this.f0 = (String)object;
            return;
        }
        if (object instanceof Double) {
            this.e0 = null;
            this.h0 = (Double)object;
            this.f0 = null;
            return;
        }
        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    public final Object k() {
        Object object = this.e0;
        if (object != null) {
            return object;
        }
        object = this.h0;
        if (object != null) {
            return object;
        }
        object = this.f0;
        if (object != null) {
            return object;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.i(parcel, 1, this.q);
        c.n(parcel, 2, this.c0, false);
        c.k(parcel, 3, this.d0);
        c.l(parcel, 4, this.e0, false);
        c.g(parcel, 5, null, false);
        c.n(parcel, 6, this.f0, false);
        c.n(parcel, 7, this.g0, false);
        c.f(parcel, 8, this.h0, false);
        c.b(parcel, n8);
    }
}

