/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import ax.M5.p;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.f3;
import java.util.ArrayList;
import java.util.List;

final class Z1 {
    private Long A;
    private Long B;
    private long C;
    private String D;
    private int E;
    private int F;
    private long G;
    private String H;
    private byte[] I;
    private long J;
    private long K;
    private long L;
    private long M;
    private long N;
    private long O;
    private String P;
    private boolean Q;
    private long R;
    private long S;
    private final E2 a;
    private final String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private String q;
    private Boolean r;
    private long s;
    private List<String> t;
    private String u;
    private boolean v;
    private long w;
    private long x;
    private int y;
    private boolean z;

    Z1(E2 e22, String string) {
        ax.M5.p.l(e22);
        ax.M5.p.f(string);
        this.a = e22;
        this.b = string;
        ((f3)e22.l()).n();
    }

    public final boolean A() {
        ((f3)this.a.l()).n();
        return this.o;
    }

    public final void A0(long l8) {
        boolean bl = false;
        boolean bl2 = l8 >= 0L;
        ax.M5.p.a(bl2);
        ((f3)this.a.l()).n();
        bl2 = this.Q;
        if (this.g != l8) {
            bl = true;
        }
        this.Q = bl2 | bl;
        this.g = l8;
    }

    public final boolean B() {
        ((f3)this.a.l()).n();
        return this.Q;
    }

    public final long B0() {
        ((f3)this.a.l()).n();
        return this.G;
    }

    public final boolean C() {
        ((f3)this.a.l()).n();
        return this.v;
    }

    public final void C0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.h != l8;
        this.Q = bl | bl2;
        this.h = l8;
    }

    public final boolean D() {
        ((f3)this.a.l()).n();
        return this.z;
    }

    public final long D0() {
        ((f3)this.a.l()).n();
        return this.i;
    }

    public final byte[] E() {
        ((f3)this.a.l()).n();
        return this.I;
    }

    public final void E0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.x != l8;
        this.Q = bl | bl2;
        this.x = l8;
    }

    public final int F() {
        ((f3)this.a.l()).n();
        return this.F;
    }

    public final long F0() {
        ((f3)this.a.l()).n();
        return this.g;
    }

    public final void G(int n8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.F != n8;
        this.Q = bl | bl2;
        this.F = n8;
    }

    public final void G0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.w != l8;
        this.Q = bl | bl2;
        this.w = l8;
    }

    public final void H(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.k != l8;
        this.Q = bl | bl2;
        this.k = l8;
    }

    public final long H0() {
        ((f3)this.a.l()).n();
        return this.h;
    }

    public final void I(Long l8) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.B, (Object)l8) ^ true;
        this.B = l8;
    }

    public final long I0() {
        ((f3)this.a.l()).n();
        return this.x;
    }

    public final void J(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.c, (Object)string) ^ true;
        this.c = string;
    }

    public final long J0() {
        ((f3)this.a.l()).n();
        return this.w;
    }

    public final void K(boolean bl) {
        ((f3)this.a.l()).n();
        boolean bl2 = this.Q;
        boolean bl3 = this.o != bl;
        this.Q = bl2 | bl3;
        this.o = bl;
    }

    public final Boolean K0() {
        ((f3)this.a.l()).n();
        return this.r;
    }

    public final int L() {
        ((f3)this.a.l()).n();
        return this.E;
    }

    public final Long L0() {
        ((f3)this.a.l()).n();
        return this.A;
    }

    public final void M(int n8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.E != n8;
        this.Q = bl | bl2;
        this.E = n8;
    }

    public final Long M0() {
        ((f3)this.a.l()).n();
        return this.B;
    }

    public final void N(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.C != l8;
        this.Q = bl | bl2;
        this.C = l8;
    }

    public final void O(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.l, (Object)string) ^ true;
        this.l = string;
    }

    public final void P(boolean bl) {
        ((f3)this.a.l()).n();
        boolean bl2 = this.Q;
        boolean bl3 = this.v != bl;
        this.Q = bl2 | bl3;
        this.v = bl;
    }

    public final long Q() {
        ((f3)this.a.l()).n();
        return 0L;
    }

    public final void R(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.R != l8;
        this.Q = bl | bl2;
        this.R = l8;
    }

    public final void S(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.j, (Object)string) ^ true;
        this.j = string;
    }

    public final void T(boolean bl) {
        ((f3)this.a.l()).n();
        boolean bl2 = this.Q;
        boolean bl3 = this.z != bl;
        this.Q = bl2 | bl3;
        this.z = bl;
    }

    public final long U() {
        ((f3)this.a.l()).n();
        return this.k;
    }

    public final void V(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.M != l8;
        this.Q = bl | bl2;
        this.M = l8;
    }

    public final void W(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.f, (Object)string) ^ true;
        this.f = string;
    }

    public final long X() {
        ((f3)this.a.l()).n();
        return this.C;
    }

    public final void Y(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.N != l8;
        this.Q = bl | bl2;
        this.N = l8;
    }

    public final void Z(String string) {
        ((f3)this.a.l()).n();
        String string2 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string2 = null;
        }
        this.Q |= j.Objects.equals((Object)this.d, (Object)string2) ^ true;
        this.d = string2;
    }

    public final int a() {
        ((f3)this.a.l()).n();
        return this.y;
    }

    public final long a0() {
        ((f3)this.a.l()).n();
        return this.R;
    }

    public final void b(int n8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.y != n8;
        this.Q = bl | bl2;
        this.y = n8;
    }

    public final void b0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.L != l8;
        this.Q = bl | bl2;
        this.L = l8;
    }

    public final void c(long l8) {
        long l9;
        ((f3)this.a.l()).n();
        long l10 = l9 = this.g + l8;
        if (l9 > Integer.MAX_VALUE) {
            this.a.k().L().b("Bundle index overflow. appId", V1.v(this.b));
            l10 = l8 - 1L;
        }
        l8 = l9 = this.G + 1L;
        if (l9 > Integer.MAX_VALUE) {
            this.a.k().L().b("Delivery index overflow. appId", V1.v(this.b));
            l8 = 0L;
        }
        this.Q = true;
        this.g = l10;
        this.G = l8;
    }

    public final void c0(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.P, (Object)string) ^ true;
        this.P = string;
    }

    public final void d(Boolean bl) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.r, (Object)bl) ^ true;
        this.r = bl;
    }

    public final long d0() {
        ((f3)this.a.l()).n();
        return this.M;
    }

    public final void e(Long l8) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.A, (Object)l8) ^ true;
        this.A = l8;
    }

    public final void e0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.K != l8;
        this.Q = bl | bl2;
        this.K = l8;
    }

    public final void f(String string) {
        ((f3)this.a.l()).n();
        String string2 = string;
        if (TextUtils.isEmpty((CharSequence)string)) {
            string2 = null;
        }
        this.Q |= j.Objects.equals((Object)this.q, (Object)string2) ^ true;
        this.q = string2;
    }

    public final void f0(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.e, (Object)string) ^ true;
        this.e = string;
    }

    public final void g(List<String> list) {
        ((f3)this.a.l()).n();
        if (!j.Objects.equals(this.t, list)) {
            this.Q = true;
            list = list != null ? new ArrayList<String>(list) : null;
            this.t = list;
        }
    }

    public final long g0() {
        ((f3)this.a.l()).n();
        return this.N;
    }

    public final void h(boolean bl) {
        ((f3)this.a.l()).n();
        boolean bl2 = this.Q;
        boolean bl3 = this.p != bl;
        this.Q = bl2 | bl3;
        this.p = bl;
    }

    public final void h0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.O != l8;
        this.Q = bl | bl2;
        this.O = l8;
    }

    public final void i(byte[] byArray) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.I != byArray;
        this.Q = bl | bl2;
        this.I = byArray;
    }

    public final void i0(String string) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.H != string;
        this.Q = bl | bl2;
        this.H = string;
    }

    public final String j() {
        ((f3)this.a.l()).n();
        return this.q;
    }

    public final long j0() {
        ((f3)this.a.l()).n();
        return this.L;
    }

    public final String k() {
        ((f3)this.a.l()).n();
        String string = this.P;
        this.c0(null);
        return string;
    }

    public final void k0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.J != l8;
        this.Q = bl | bl2;
        this.J = l8;
    }

    public final String l() {
        ((f3)this.a.l()).n();
        return this.b;
    }

    public final void l0(String string) {
        ((f3)this.a.l()).n();
        this.Q |= j.Objects.equals((Object)this.u, (Object)string) ^ true;
        this.u = string;
    }

    public final String m() {
        ((f3)this.a.l()).n();
        return this.c;
    }

    public final long m0() {
        ((f3)this.a.l()).n();
        return this.K;
    }

    public final String n() {
        ((f3)this.a.l()).n();
        return this.l;
    }

    public final void n0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.n != l8;
        this.Q = bl | bl2;
        this.n = l8;
    }

    public final String o() {
        ((f3)this.a.l()).n();
        return this.j;
    }

    public final void o0(String string) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.D != string;
        this.Q = bl | bl2;
        this.D = string;
    }

    public final String p() {
        ((f3)this.a.l()).n();
        return this.f;
    }

    public final long p0() {
        ((f3)this.a.l()).n();
        return this.O;
    }

    public final String q() {
        ((f3)this.a.l()).n();
        return this.d;
    }

    public final void q0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.s != l8;
        this.Q = bl | bl2;
        this.s = l8;
    }

    public final String r() {
        ((f3)this.a.l()).n();
        return this.P;
    }

    public final long r0() {
        ((f3)this.a.l()).n();
        return this.J;
    }

    public final String s() {
        ((f3)this.a.l()).n();
        return this.e;
    }

    public final void s0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.S != l8;
        this.Q = bl | bl2;
        this.S = l8;
    }

    public final String t() {
        ((f3)this.a.l()).n();
        return this.H;
    }

    public final long t0() {
        ((f3)this.a.l()).n();
        return this.n;
    }

    public final String u() {
        ((f3)this.a.l()).n();
        return this.u;
    }

    public final void u0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.m != l8;
        this.Q = bl | bl2;
        this.m = l8;
    }

    public final String v() {
        ((f3)this.a.l()).n();
        return this.D;
    }

    public final long v0() {
        ((f3)this.a.l()).n();
        return this.s;
    }

    public final List<String> w() {
        ((f3)this.a.l()).n();
        return this.t;
    }

    public final void w0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.G != l8;
        this.Q = bl | bl2;
        this.G = l8;
    }

    public final void x() {
        ((f3)this.a.l()).n();
        this.Q = false;
    }

    public final long x0() {
        ((f3)this.a.l()).n();
        return this.S;
    }

    public final void y() {
        long l8;
        ((f3)this.a.l()).n();
        long l9 = l8 = this.g + 1L;
        if (l8 > Integer.MAX_VALUE) {
            this.a.k().L().b("Bundle index overflow. appId", V1.v(this.b));
            l9 = 0L;
        }
        this.Q = true;
        this.g = l9;
    }

    public final void y0(long l8) {
        ((f3)this.a.l()).n();
        boolean bl = this.Q;
        boolean bl2 = this.i != l8;
        this.Q = bl | bl2;
        this.i = l8;
    }

    public final boolean z() {
        ((f3)this.a.l()).n();
        return this.p;
    }

    public final long z0() {
        ((f3)this.a.l()).n();
        return this.m;
    }
}

