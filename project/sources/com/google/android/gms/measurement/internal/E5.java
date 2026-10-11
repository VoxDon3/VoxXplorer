package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.C0821p;
import java.util.List;

/* loaded from: classes3.dex */
public final class E5 extends ax.N5.a {
    public static final Parcelable.Creator<E5> CREATOR = new n5();
    public final long A0;
    public final int B0;
    public final String C0;
    public final int D0;
    public final long E0;
    public final String F0;
    public final String G0;
    public final String c0;
    public final String d0;
    public final String e0;
    public final long f0;
    public final long g0;
    public final String h0;
    public final boolean i0;
    public final boolean j0;
    public final long k0;
    public final String l0;

    @Deprecated
    private final long m0;
    public final long n0;
    public final int o0;
    public final boolean p0;
    public final String q;
    public final boolean q0;
    public final String r0;
    public final Boolean s0;
    public final long t0;
    public final List<String> u0;
    private final String v0;
    public final String w0;
    public final String x0;
    public final String y0;
    public final boolean z0;

    E5(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13, String str14) {
        C0821p.f(str);
        this.q = str;
        this.c0 = TextUtils.isEmpty(str2) ? null : str2;
        this.d0 = str3;
        this.k0 = j;
        this.e0 = str4;
        this.f0 = j2;
        this.g0 = j3;
        this.h0 = str5;
        this.i0 = z;
        this.j0 = z2;
        this.l0 = str6;
        this.m0 = j4;
        this.n0 = j5;
        this.o0 = i;
        this.p0 = z3;
        this.q0 = z4;
        this.r0 = str7;
        this.s0 = bool;
        this.t0 = j6;
        this.u0 = list;
        this.v0 = null;
        this.w0 = str9;
        this.x0 = str10;
        this.y0 = str11;
        this.z0 = z5;
        this.A0 = j7;
        this.B0 = i2;
        this.C0 = str12;
        this.D0 = i3;
        this.E0 = j8;
        this.F0 = str13;
        this.G0 = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = ax.N5.c.a(parcel);
        ax.N5.c.n(parcel, 2, this.q, false);
        ax.N5.c.n(parcel, 3, this.c0, false);
        ax.N5.c.n(parcel, 4, this.d0, false);
        ax.N5.c.n(parcel, 5, this.e0, false);
        ax.N5.c.k(parcel, 6, this.f0);
        ax.N5.c.k(parcel, 7, this.g0);
        ax.N5.c.n(parcel, 8, this.h0, false);
        ax.N5.c.c(parcel, 9, this.i0);
        ax.N5.c.c(parcel, 10, this.j0);
        ax.N5.c.k(parcel, 11, this.k0);
        ax.N5.c.n(parcel, 12, this.l0, false);
        ax.N5.c.k(parcel, 13, this.m0);
        ax.N5.c.k(parcel, 14, this.n0);
        ax.N5.c.i(parcel, 15, this.o0);
        ax.N5.c.c(parcel, 16, this.p0);
        ax.N5.c.c(parcel, 18, this.q0);
        ax.N5.c.n(parcel, 19, this.r0, false);
        ax.N5.c.d(parcel, 21, this.s0, false);
        ax.N5.c.k(parcel, 22, this.t0);
        ax.N5.c.o(parcel, 23, this.u0, false);
        ax.N5.c.n(parcel, 24, this.v0, false);
        ax.N5.c.n(parcel, 25, this.w0, false);
        ax.N5.c.n(parcel, 26, this.x0, false);
        ax.N5.c.n(parcel, 27, this.y0, false);
        ax.N5.c.c(parcel, 28, this.z0);
        ax.N5.c.k(parcel, 29, this.A0);
        ax.N5.c.i(parcel, 30, this.B0);
        ax.N5.c.n(parcel, 31, this.C0, false);
        ax.N5.c.i(parcel, 32, this.D0);
        ax.N5.c.k(parcel, 34, this.E0);
        ax.N5.c.n(parcel, 35, this.F0, false);
        ax.N5.c.n(parcel, 36, this.G0, false);
        ax.N5.c.b(parcel, a);
    }

    E5(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List<String> list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, String str13, String str14) {
        this.q = str;
        this.c0 = str2;
        this.d0 = str3;
        this.k0 = j3;
        this.e0 = str4;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = str5;
        this.i0 = z;
        this.j0 = z2;
        this.l0 = str6;
        this.m0 = j4;
        this.n0 = j5;
        this.o0 = i;
        this.p0 = z3;
        this.q0 = z4;
        this.r0 = str7;
        this.s0 = bool;
        this.t0 = j6;
        this.u0 = list;
        this.v0 = str8;
        this.w0 = str9;
        this.x0 = str10;
        this.y0 = str11;
        this.z0 = z5;
        this.A0 = j7;
        this.B0 = i2;
        this.C0 = str12;
        this.D0 = i3;
        this.E0 = j8;
        this.F0 = str13;
        this.G0 = str14;
    }
}
