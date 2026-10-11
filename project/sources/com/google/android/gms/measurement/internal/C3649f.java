package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ax.M5.C0821p;

/* renamed from: com.google.android.gms.measurement.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3649f extends ax.N5.a {
    public static final Parcelable.Creator<C3649f> CREATOR = new C3642e();
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

    C3649f(C3649f c3649f) {
        C0821p.l(c3649f);
        this.q = c3649f.q;
        this.c0 = c3649f.c0;
        this.d0 = c3649f.d0;
        this.e0 = c3649f.e0;
        this.f0 = c3649f.f0;
        this.g0 = c3649f.g0;
        this.h0 = c3649f.h0;
        this.i0 = c3649f.i0;
        this.j0 = c3649f.j0;
        this.k0 = c3649f.k0;
        this.l0 = c3649f.l0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 2, this.q, false);
        ax.N5.c.n(parcel, 3, this.c0, false);
        ax.N5.c.m(parcel, 4, this.d0, i, false);
        ax.N5.c.k(parcel, 5, this.e0);
        ax.N5.c.c(parcel, 6, this.f0);
        ax.N5.c.n(parcel, 7, this.g0, false);
        ax.N5.c.m(parcel, 8, this.h0, i, false);
        ax.N5.c.k(parcel, 9, this.i0);
        ax.N5.c.m(parcel, 10, this.j0, i, false);
        ax.N5.c.k(parcel, 11, this.k0);
        ax.N5.c.m(parcel, 12, this.l0, i, false);
        ax.N5.c.b(parcel, a);
    }

    C3649f(String str, String str2, A5 a5, long j, boolean z, String str3, D d, long j2, D d2, long j3, D d3) {
        this.q = str;
        this.c0 = str2;
        this.d0 = a5;
        this.e0 = j;
        this.f0 = z;
        this.g0 = str3;
        this.h0 = d;
        this.i0 = j2;
        this.j0 = d2;
        this.k0 = j3;
        this.l0 = d3;
    }
}
