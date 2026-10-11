package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0821p;

/* loaded from: classes3.dex */
public final class A5 extends ax.N5.a {
    public static final Parcelable.Creator<A5> CREATOR = new z5();
    public final String c0;
    public final long d0;
    public final Long e0;
    public final String f0;
    public final String g0;
    public final Double h0;
    private final int q;

    A5(C5 c5) {
        this(c5.c, c5.d, c5.e, c5.b);
    }

    public final Object k() {
        Long l = this.e0;
        if (l != null) {
            return l;
        }
        Double d = this.h0;
        if (d != null) {
            return d;
        }
        String str = this.f0;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.i(parcel, 1, this.q);
        ax.N5.c.n(parcel, 2, this.c0, false);
        ax.N5.c.k(parcel, 3, this.d0);
        ax.N5.c.l(parcel, 4, this.e0, false);
        ax.N5.c.g(parcel, 5, null, false);
        ax.N5.c.n(parcel, 6, this.f0, false);
        ax.N5.c.n(parcel, 7, this.g0, false);
        ax.N5.c.f(parcel, 8, this.h0, false);
        ax.N5.c.b(parcel, a);
    }

    A5(String str, long j, Object obj, String str2) {
        C0821p.f(str);
        this.q = 2;
        this.c0 = str;
        this.d0 = j;
        this.g0 = str2;
        if (obj == null) {
            this.e0 = null;
            this.h0 = null;
            this.f0 = null;
            return;
        }
        if (obj instanceof Long) {
            this.e0 = (Long) obj;
            this.h0 = null;
            this.f0 = null;
        } else if (obj instanceof String) {
            this.e0 = null;
            this.h0 = null;
            this.f0 = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.e0 = null;
            this.h0 = (Double) obj;
            this.f0 = null;
        }
    }

    A5(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.q = i;
        this.c0 = str;
        this.d0 = j;
        this.e0 = l;
        if (i == 1) {
            this.h0 = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.h0 = d;
        }
        this.f0 = str2;
        this.g0 = str3;
    }
}
