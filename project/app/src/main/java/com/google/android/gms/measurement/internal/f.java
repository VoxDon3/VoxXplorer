/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.p;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.e;

public final class f
extends a {
    public static final Parcelable.Creator<f> CREATOR = new e();
    public String c0;
    public A5 d0;
    public long e0;
    public boolean f0;
    public String g0;
    public D h0;
    public long i0;
    public D j0;
    public long k0;
    public D l0;
    public String q;

    f(f f8) {
        p.l(f8);
        this.q = f8.q;
        this.c0 = f8.c0;
        this.d0 = f8.d0;
        this.e0 = f8.e0;
        this.f0 = f8.f0;
        this.g0 = f8.g0;
        this.h0 = f8.h0;
        this.i0 = f8.i0;
        this.j0 = f8.j0;
        this.k0 = f8.k0;
        this.l0 = f8.l0;
    }

    f(String string, String string2, A5 a52, long l8, boolean bl, String string3, D d8, long l9, D d9, long l10, D d10) {
        this.q = string;
        this.c0 = string2;
        this.d0 = a52;
        this.e0 = l8;
        this.f0 = bl;
        this.g0 = string3;
        this.h0 = d8;
        this.i0 = l9;
        this.j0 = d9;
        this.k0 = l10;
        this.l0 = d10;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        int n9 = c.a(parcel);
        c.n(parcel, 2, this.q, false);
        c.n(parcel, 3, this.c0, false);
        c.m(parcel, 4, this.d0, n8, false);
        c.k(parcel, 5, this.e0);
        c.c(parcel, 6, this.f0);
        c.n(parcel, 7, this.g0, false);
        c.m(parcel, 8, this.h0, n8, false);
        c.k(parcel, 9, this.i0);
        c.m(parcel, 10, this.j0, n8, false);
        c.k(parcel, 11, this.k0);
        c.m(parcel, 12, this.l0, n8, false);
        c.b(parcel, n9);
    }
}

