package ax.W4;

import ax.T4.r;
import ax.b5.C1500a;

/* loaded from: classes.dex */
public class e {
    protected final d a;

    @Deprecated
    protected final Object b;
    protected ax.T4.d c;
    protected final boolean d;
    protected final C1500a e;
    protected final r f;
    protected byte[] g;
    protected byte[] h;
    protected char[] i;
    protected char[] j;
    protected char[] k;

    public e(r rVar, C1500a c1500a, d dVar, boolean z) {
        this.f = rVar == null ? r.a() : rVar;
        this.e = c1500a;
        this.a = dVar;
        this.b = dVar.l();
        this.d = z;
    }

    private IllegalArgumentException t() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw t();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw t();
        }
    }

    public char[] d() {
        a(this.j);
        char[] c = this.e.c(1);
        this.j = c;
        return c;
    }

    public byte[] e() {
        a(this.g);
        byte[] a = this.e.a(0);
        this.g = a;
        return a;
    }

    public char[] f() {
        a(this.i);
        char[] c = this.e.c(0);
        this.i = c;
        return c;
    }

    public char[] g(int i) {
        a(this.i);
        char[] d = this.e.d(0, i);
        this.i = d;
        return d;
    }

    public byte[] h() {
        a(this.h);
        byte[] a = this.e.a(1);
        this.h = a;
        return a;
    }

    public ax.b5.l i() {
        return new ax.b5.i(this.f, this.e);
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

    public void m(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.j);
            this.j = null;
            this.e.j(1, cArr);
        }
    }

    public void n(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.k);
            this.k = null;
            this.e.j(3, cArr);
        }
    }

    public void o(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.g);
            this.g = null;
            this.e.i(0, bArr);
        }
    }

    public void p(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.i);
            this.i = null;
            this.e.j(0, cArr);
        }
    }

    public void q(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.h);
            this.h = null;
            this.e.i(1, bArr);
        }
    }

    public void r(ax.T4.d dVar) {
        this.c = dVar;
    }

    public r s() {
        return this.f;
    }
}
