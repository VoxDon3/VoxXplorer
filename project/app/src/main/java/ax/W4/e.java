/*
 * Decompiled with CFR 0.152.
 */
package ax.W4;

import ax.T4.r;
import ax.W4.d;
import ax.b5.a;
import ax.b5.i;
import ax.b5.l;

public class e {
    protected final d a;
    @Deprecated
    protected final Object b;
    protected ax.T4.d c;
    protected final boolean d;
    protected final a e;
    protected final r f;
    protected byte[] g;
    protected byte[] h;
    protected char[] i;
    protected char[] j;
    protected char[] k;

    public e(r r8, a a8, d d8, boolean bl) {
        r r9 = r8;
        if (r8 == null) {
            r9 = r.a();
        }
        this.f = r9;
        this.e = a8;
        this.a = d8;
        this.b = d8.l();
        this.d = bl;
    }

    private IllegalArgumentException t() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object object) {
        if (object == null) {
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }

    protected final void b(byte[] byArray, byte[] byArray2) {
        if (byArray != byArray2 && byArray.length < byArray2.length) {
            throw this.t();
        }
    }

    protected final void c(char[] cArray, char[] cArray2) {
        if (cArray != cArray2 && cArray.length < cArray2.length) {
            throw this.t();
        }
    }

    public char[] d() {
        this.a(this.j);
        char[] cArray = this.e.c(1);
        this.j = cArray;
        return cArray;
    }

    public byte[] e() {
        this.a(this.g);
        byte[] byArray = this.e.a(0);
        this.g = byArray;
        return byArray;
    }

    public char[] f() {
        this.a(this.i);
        char[] cArray = this.e.c(0);
        this.i = cArray;
        return cArray;
    }

    public char[] g(int n8) {
        this.a(this.i);
        char[] cArray = this.e.d(0, n8);
        this.i = cArray;
        return cArray;
    }

    public byte[] h() {
        this.a(this.h);
        byte[] byArray = this.e.a(1);
        this.h = byArray;
        return byArray;
    }

    public l i() {
        return new i(this.f, this.e);
    }

    public d j() {
        return this.a;
    }

    public ax.T4.d k() {
        return this.c;
    }

    public boolean l() {
        return this.d;
    }

    public void m(char[] cArray) {
        if (cArray != null) {
            this.c(cArray, this.j);
            this.j = null;
            this.e.j(1, cArray);
        }
    }

    public void n(char[] cArray) {
        if (cArray != null) {
            this.c(cArray, this.k);
            this.k = null;
            this.e.j(3, cArray);
        }
    }

    public void o(byte[] byArray) {
        if (byArray != null) {
            this.b(byArray, this.g);
            this.g = null;
            this.e.i(0, byArray);
        }
    }

    public void p(char[] cArray) {
        if (cArray != null) {
            this.c(cArray, this.i);
            this.i = null;
            this.e.j(0, cArray);
        }
    }

    public void q(byte[] byArray) {
        if (byArray != null) {
            this.b(byArray, this.h);
            this.h = null;
            this.e.i(1, byArray);
        }
    }

    public void r(ax.T4.d d8) {
        this.c = d8;
    }

    public r s() {
        return this.f;
    }
}

