/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.M5.p;
import ax.N5.a;
import ax.N5.c;
import com.google.android.gms.measurement.internal.n5;
import java.util.List;

public final class E5
extends a {
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

    E5(String string, String string2, String string3, long l8, String string4, long l9, long l10, String string5, boolean bl, boolean bl2, String string6, long l11, long l12, int n8, boolean bl3, boolean bl4, String string7, Boolean bl5, long l13, List<String> list, String string8, String string9, String string10, String string11, boolean bl6, long l14, int n9, String string12, int n10, long l15, String string13, String string14) {
        p.f(string);
        this.q = string;
        string = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string = null;
        }
        this.c0 = string;
        this.d0 = string3;
        this.k0 = l8;
        this.e0 = string4;
        this.f0 = l9;
        this.g0 = l10;
        this.h0 = string5;
        this.i0 = bl;
        this.j0 = bl2;
        this.l0 = string6;
        this.m0 = l11;
        this.n0 = l12;
        this.o0 = n8;
        this.p0 = bl3;
        this.q0 = bl4;
        this.r0 = string7;
        this.s0 = bl5;
        this.t0 = l13;
        this.u0 = list;
        this.v0 = null;
        this.w0 = string9;
        this.x0 = string10;
        this.y0 = string11;
        this.z0 = bl6;
        this.A0 = l14;
        this.B0 = n9;
        this.C0 = string12;
        this.D0 = n10;
        this.E0 = l15;
        this.F0 = string13;
        this.G0 = string14;
    }

    E5(String string, String string2, String string3, String string4, long l8, long l9, String string5, boolean bl, boolean bl2, long l10, String string6, long l11, long l12, int n8, boolean bl3, boolean bl4, String string7, Boolean bl5, long l13, List<String> list, String string8, String string9, String string10, String string11, boolean bl6, long l14, int n9, String string12, int n10, long l15, String string13, String string14) {
        this.q = string;
        this.c0 = string2;
        this.d0 = string3;
        this.k0 = l10;
        this.e0 = string4;
        this.f0 = l8;
        this.g0 = l9;
        this.h0 = string5;
        this.i0 = bl;
        this.j0 = bl2;
        this.l0 = string6;
        this.m0 = l11;
        this.n0 = l12;
        this.o0 = n8;
        this.p0 = bl3;
        this.q0 = bl4;
        this.r0 = string7;
        this.s0 = bl5;
        this.t0 = l13;
        this.u0 = list;
        this.v0 = string8;
        this.w0 = string9;
        this.x0 = string10;
        this.y0 = string11;
        this.z0 = bl6;
        this.A0 = l14;
        this.B0 = n9;
        this.C0 = string12;
        this.D0 = n10;
        this.E0 = l15;
        this.F0 = string13;
        this.G0 = string14;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        n8 = c.a(parcel);
        c.n(parcel, 2, this.q, false);
        c.n(parcel, 3, this.c0, false);
        c.n(parcel, 4, this.d0, false);
        c.n(parcel, 5, this.e0, false);
        c.k(parcel, 6, this.f0);
        c.k(parcel, 7, this.g0);
        c.n(parcel, 8, this.h0, false);
        c.c(parcel, 9, this.i0);
        c.c(parcel, 10, this.j0);
        c.k(parcel, 11, this.k0);
        c.n(parcel, 12, this.l0, false);
        c.k(parcel, 13, this.m0);
        c.k(parcel, 14, this.n0);
        c.i(parcel, 15, this.o0);
        c.c(parcel, 16, this.p0);
        c.c(parcel, 18, this.q0);
        c.n(parcel, 19, this.r0, false);
        c.d(parcel, 21, this.s0, false);
        c.k(parcel, 22, this.t0);
        c.o(parcel, 23, this.u0, false);
        c.n(parcel, 24, this.v0, false);
        c.n(parcel, 25, this.w0, false);
        c.n(parcel, 26, this.x0, false);
        c.n(parcel, 27, this.y0, false);
        c.c(parcel, 28, this.z0);
        c.k(parcel, 29, this.A0);
        c.i(parcel, 30, this.B0);
        c.n(parcel, 31, this.C0, false);
        c.i(parcel, 32, this.D0);
        c.k(parcel, 34, this.E0);
        c.n(parcel, 35, this.F0, false);
        c.n(parcel, 36, this.G0, false);
        c.b(parcel, n8);
    }
}

