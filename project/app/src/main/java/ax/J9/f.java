/*
 * Decompiled with CFR 0.152.
 */
package ax.J9;

import ax.A9.b;
import ax.I9.y;
import ax.J9.e;
import ax.J9.h;
import ax.Qa.a;

public class f {
    private int a;
    private c[] b;
    private long c;
    private b d;
    private int e = -1;

    public f(y[] yArray) {
        int n8;
        this.a = n8 = yArray.length;
        this.b = new c[n8];
        for (n8 = 0; n8 < this.a; ++n8) {
            this.b[n8] = new c(this, null);
            this.b[n8].a = yArray[n8];
        }
    }

    static /* synthetic */ long a(f f8) {
        long l8 = f8.c;
        f8.c = 1L + l8;
        return l8;
    }

    private c d(int n8) {
        c c8;
        c c9 = c8 = this.e(n8);
        if (c8 == null) {
            c9 = this.j();
        }
        c9.b = n8;
        long l8 = this.c;
        this.c = 1L + l8;
        c9.d = l8;
        c9.e = true;
        return c9;
    }

    private c e(int n8) {
        for (c c8 : this.b) {
            if (c8.b != n8) continue;
            return c8;
        }
        return null;
    }

    private c j() {
        c[] cArray = this.b;
        int n8 = cArray.length;
        c c8 = null;
        c c9 = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            c c10;
            c c11;
            block6: {
                c c12;
                block7: {
                    block8: {
                        block5: {
                            c12 = cArray[i8];
                            if (c12.a == null) {
                                return c12;
                            }
                            if (c8 == null) break block5;
                            c11 = c8;
                            c10 = c9;
                            if (c12.e) break block6;
                            c11 = c8;
                            c10 = c9;
                            if (c12.d >= c8.d) break block6;
                            break block7;
                        }
                        if (!c12.e) break block7;
                        if (c9 == null) break block8;
                        c11 = c8;
                        c10 = c9;
                        if (c12.d >= c9.d) break block6;
                    }
                    c10 = c12;
                    c11 = c8;
                    break block6;
                }
                c11 = c12;
                c10 = c9;
            }
            c8 = c11;
            c9 = c10;
        }
        if (c8 != null) {
            return c8;
        }
        return c9;
    }

    public b f() {
        if (this.d == null) {
            this.d = this.b[0].a.d().q();
        }
        return this.d;
    }

    public void g(int n8, ax.Qa.c c8) {
        this.f().c(c8, new a(this, n8){
            final f c0;
            final int q;
            {
                this.c0 = f8;
                this.q = n8;
            }

            @Override
            public void run() {
                c c8 = this.c0.e(this.q);
                if (c8 != null) {
                    c8.a.e(this.c0.f().d());
                    this.c0.i(this.q);
                }
            }
        });
    }

    public void h(int n8, double d8, double d9, h h8, ax.Qa.c c8) {
        this.f().c(c8, new a(this, n8, h8, d8, d9){
            final h c0;
            final double d0;
            final double e0;
            final f f0;
            final int q;
            {
                this.f0 = f8;
                this.q = n8;
                this.c0 = h8;
                this.d0 = d8;
                this.e0 = d9;
            }

            @Override
            public void run() {
                c c8 = this.f0.d(this.q);
                this.c0.a(c8.a);
                c8.a.a(this.d0, this.e0, this.f0.f().d());
            }
        });
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected y i(int n8) {
        synchronized (this) {
            try {
                c c8 = this.e(n8);
                if (c8 == null) return null;
                c8.a();
                return c8.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private class c {
        y a;
        int b;
        int c;
        long d;
        boolean e;
        final f f;

        private c(f f8) {
            this.f = f8;
            this.b = -1;
            this.c = -1;
        }

        /* synthetic */ c(f f8, e e8) {
            this(f8);
        }

        public void a() {
            this.e = false;
            this.d = ax.J9.f.a(this.f);
        }
    }
}

