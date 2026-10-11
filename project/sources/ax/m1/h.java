package ax.m1;

import ax.S0.C0968a;
import ax.S0.d0;
import ax.m1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements b {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private C2510a[] g;

    public h(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // ax.m1.b
    public synchronized void a(C2510a c2510a) {
        C2510a[] c2510aArr = this.g;
        int i = this.f;
        this.f = i + 1;
        c2510aArr[i] = c2510a;
        this.e--;
        notifyAll();
    }

    @Override // ax.m1.b
    public synchronized C2510a b() {
        C2510a c2510a;
        try {
            this.e++;
            int i = this.f;
            if (i > 0) {
                C2510a[] c2510aArr = this.g;
                int i2 = i - 1;
                this.f = i2;
                c2510a = (C2510a) C0968a.e(c2510aArr[i2]);
                this.g[this.f] = null;
            } else {
                c2510a = new C2510a(new byte[this.b], 0);
                int i3 = this.e;
                C2510a[] c2510aArr2 = this.g;
                if (i3 > c2510aArr2.length) {
                    this.g = (C2510a[]) Arrays.copyOf(c2510aArr2, c2510aArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2510a;
    }

    @Override // ax.m1.b
    public synchronized void c() {
        try {
            int i = 0;
            int max = Math.max(0, d0.k(this.d, this.b) - this.e);
            int i2 = this.f;
            if (max >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C2510a c2510a = (C2510a) C0968a.e(this.g[i]);
                    if (c2510a.a == this.c) {
                        i++;
                    } else {
                        C2510a c2510a2 = (C2510a) C0968a.e(this.g[i3]);
                        if (c2510a2.a != this.c) {
                            i3--;
                        } else {
                            C2510a[] c2510aArr = this.g;
                            c2510aArr[i] = c2510a2;
                            c2510aArr[i3] = c2510a;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, max, this.f, (Object) null);
            this.f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.m1.b
    public synchronized void d(b.a aVar) {
        while (aVar != null) {
            try {
                C2510a[] c2510aArr = this.g;
                int i = this.f;
                this.f = i + 1;
                c2510aArr[i] = aVar.a();
                this.e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // ax.m1.b
    public int e() {
        return this.b;
    }

    public synchronized int f() {
        return this.e * this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            c();
        }
    }

    public h(boolean z, int i, int i2) {
        C0968a.a(i > 0);
        C0968a.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.f = i2;
        this.g = new C2510a[i2 + 100];
        if (i2 <= 0) {
            this.c = null;
            return;
        }
        this.c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.g[i3] = new C2510a(this.c, i3 * i);
        }
    }
}
