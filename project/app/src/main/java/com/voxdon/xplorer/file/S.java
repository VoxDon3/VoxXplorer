/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.L8.a;
import ax.N8.c;
import ax.N8.e;
import ax.N8.m;
import ax.c3.d0;
import ax.c3.v;
import ax.k9.d;
import ax.pb.a0;
import ax.pb.b0;
import com.voxdon.xplorer.file.N;
import com.voxdon.xplorer.file.Q;
import com.voxdon.xplorer.file.n;

public class S
extends n {
    private String k0;
    private String l0;
    private String m0;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private boolean r0;
    private boolean s0 = false;
    private long t0;
    private long u0;
    private b0 v0;
    private final boolean w0;

    public S(Q q8, b0 b02) throws a0 {
        super(q8);
        this.w0 = true;
        this.v0 = b02;
        this.l0 = N.g(q8, b02);
        this.m0 = b02.getURL().toString();
        this.q0 = b02.s();
        this.h0();
        if (this.q0) {
            this.n0 = b02.G();
            this.o0 = b02.b();
            this.p0 = b02.c();
            this.r0 = b02.H();
            this.t0 = b02.K();
            this.u0 = b02.L();
            return;
        }
        this.n0 = false;
        this.o0 = true;
        this.p0 = true;
        this.r0 = false;
        this.t0 = -1L;
        this.u0 = 0L;
    }

    public S(Q q8, String string, c c8) throws d {
        super(q8);
        this.w0 = false;
        e e8 = c8.a();
        this.l0 = string;
        this.m0 = q8.y0(string);
        this.q0 = true;
        this.o0 = true;
        this.i0(e8.c());
        if (e8.e() != null) {
            this.t0 = e8.e().g();
        }
        this.u0 = c8.b().a();
    }

    public S(Q q8, String string, m m8) {
        super(q8);
        this.w0 = false;
        this.l0 = string;
        this.m0 = q8.y0(string);
        this.q0 = true;
        this.o0 = true;
        this.i0(m8.d());
        if (m8.e() != null) {
            this.t0 = m8.e().g();
        }
        this.u0 = m8.c();
    }

    public S(Q q8, String string, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        super(q8);
        this.w0 = bl4;
        this.l0 = string;
        this.m0 = q8.y0(string);
        this.q0 = bl;
        this.n0 = bl2;
        this.o0 = true;
        this.p0 = true;
        this.r0 = bl3;
        this.t0 = -1L;
        this.u0 = 0L;
    }

    public static S f0(Q q8, String string, boolean bl) {
        return new S(q8, string, false, false, false, bl);
    }

    public static S g0(Q q8, String string) {
        return new S(q8, string, true, true, string.endsWith("$"), false);
    }

    private void h0() {
        this.k0 = v.e(this, "");
    }

    private void i0(long l8) {
        long l9 = a.e0.getValue();
        boolean bl = false;
        boolean bl2 = (l9 & l8) != 0L;
        this.n0 = bl2;
        bl2 = (a.k0.getValue() & l8) == 0L;
        this.p0 = bl2;
        bl2 = (a.g0.getValue() & l8) != 0L;
        this.r0 = bl2;
        bl2 = bl;
        if ((l8 & a.l0.getValue()) != 0L) {
            bl2 = true;
        }
        this.s0 = bl2;
    }

    @Override
    public String C() {
        return d0.h(this.l0);
    }

    @Override
    public String F() {
        return this.l0;
    }

    @Override
    public String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean b0() {
        if (!ax.X2.Q.t1()) {
            return false;
        }
        return this.w0 ^ true;
    }

    @Override
    public boolean d() {
        return this.o0;
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((S)n8).l0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    @Override
    public boolean h() {
        return this.r0;
    }

    @Override
    public boolean isDirectory() {
        return this.n0;
    }

    @Override
    public boolean j() {
        return this.p0;
    }

    public b0 j0() {
        return this.v0;
    }

    public void k0(b0 b02) {
        this.v0 = b02;
    }

    @Override
    public boolean l() {
        return this.s0;
    }

    @Override
    public boolean n() {
        return this.q0;
    }

    @Override
    public long p() {
        return this.u0;
    }

    @Override
    public long q() {
        return this.t0;
    }

    @Override
    public int r(boolean bl) {
        if (!this.isDirectory()) {
            return -2;
        }
        return this.X();
    }

    @Override
    public String s() {
        if (this.k0 == null) {
            this.h0();
        }
        return this.k0;
    }

    @Override
    public String t() {
        return this.m0;
    }
}

