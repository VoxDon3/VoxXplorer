package ax.G9;

import ax.J9.c;

/* loaded from: classes3.dex */
public class b extends a {
    private c e;

    public b(c cVar) {
        this.e = cVar;
    }

    @Override // ax.G9.a
    public void a(int i, int i2) {
        this.e.l(i, i2 * 0.007874015748031496d);
    }

    @Override // ax.G9.a
    public void c(int i, int i2, int i3) {
        double d = i3 * 0.007874015748031496d;
        if (i2 == 1) {
            this.e.n(i, d * 0.1d);
        } else if (i2 == 7) {
            this.e.o(i, d);
        } else if (i2 == 10) {
            this.e.j(i, (d * 2.0d) - 1.0d);
        } else {
            if (i2 != 74) {
                return;
            }
            this.e.m(i, d);
        }
    }

    @Override // ax.G9.a
    public void f(int i, int i2, int i3) {
        this.e.e(i, i2, i3);
    }

    @Override // ax.G9.a
    public void g(int i, int i2, int i3) {
        this.e.g(i, i2, i3);
    }

    @Override // ax.G9.a
    public void i(int i, int i2) {
        this.e.k(i, (i2 - 8192) * 1.220703125E-4d);
    }

    @Override // ax.G9.a
    public void k(int i, int i2) {
        this.e.h(i, i2);
    }

    @Override // ax.G9.a
    public void m(int i, int i2, int i3) {
        if (i2 != 0) {
            return;
        }
        this.e.i(i, (i3 >> 7) + ((i3 & 127) * 0.01d));
    }

    public void n(byte[] bArr, int i, int i2) {
        h(bArr, i, i2);
    }
}
