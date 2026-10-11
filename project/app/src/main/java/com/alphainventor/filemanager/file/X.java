/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import ax.Ia.c;
import ax.b3.j;
import ax.c3.d0;
import ax.c3.v;
import com.alphainventor.filemanager.file.W;
import com.alphainventor.filemanager.file.n;

public class X
extends n {
    c k0;
    String l0;
    String m0;

    public X(W w8, c c8) throws j {
        super(w8);
        this.k0 = c8;
        this.l0 = w8.q0(c8.k());
    }

    public X(W w8, String string) {
        super(w8);
        this.l0 = string;
    }

    private boolean f0() {
        c c8 = this.k0;
        if (c8 == null) {
            return true;
        }
        if (c8.q() == null) {
            return true;
        }
        return X.h0(this.k0.q());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean h0(String string) {
        block3: {
            try {
                int n8 = Integer.parseInt(string);
                if (n8 != 1) break block3;
                return true;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        return false;
    }

    @Override
    protected String C() {
        return d0.h(this.l0);
    }

    @Override
    protected String F() {
        return this.l0;
    }

    @Override
    protected String U() {
        return d0.r(this.l0);
    }

    @Override
    public boolean d() {
        return true;
    }

    public int e0(n n8) {
        try {
            int n9 = this.l0.compareTo(((X)n8).l0);
            return n9;
        }
        catch (ClassCastException classCastException) {
            return -1;
        }
    }

    public boolean g0() {
        c c8 = this.k0;
        if (c8 == null) {
            return false;
        }
        return c8.i();
    }

    @Override
    public boolean h() {
        if (this.B().startsWith(".")) {
            return true;
        }
        return this.f0() ^ true;
    }

    @Override
    public boolean isDirectory() {
        if ("/".equals(this.l0)) {
            return true;
        }
        c c8 = this.k0;
        return c8 != null && c8.s();
    }

    @Override
    public boolean j() {
        c c8 = this.k0;
        if (c8 == null) {
            return true;
        }
        if (c8.n() == null) {
            return true;
        }
        return Boolean.parseBoolean(this.k0.n()) ^ true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean n() {
        if ("/".equals(this.l0)) {
            return true;
        }
        return this.k0 != null;
    }

    @Override
    public long p() {
        c c8 = this.k0;
        if (c8 == null) {
            return 0L;
        }
        return c8.c();
    }

    @Override
    public long q() {
        c c8 = this.k0;
        if (c8 == null) {
            return -1L;
        }
        if (c8.l() == null) {
            return -1L;
        }
        return this.k0.l().getTime();
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
        if (this.m0 == null) {
            this.m0 = v.e(this, "application/octet-stream");
        }
        return this.m0;
    }

    @Override
    public String t() {
        return this.l0;
    }
}

