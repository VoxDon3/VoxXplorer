/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.d;
import ax.H.e;
import ax.I.d;
import ax.I.f;
import ax.I.g;
import ax.I.m;

public abstract class p
implements d {
    public int a;
    e b;
    m c;
    protected e.b d;
    g e = new g(this);
    public int f = 0;
    boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    protected b j = ax.I.p$b.q;

    public p(e e8) {
        this.b = e8;
    }

    private void l(int n8, int n9) {
        block6: {
            block7: {
                block9: {
                    block8: {
                        p p8;
                        e e8;
                        block10: {
                            int n10 = this.a;
                            if (n10 == 0) break block6;
                            if (n10 == 1) break block7;
                            if (n10 == 2) break block8;
                            if (n10 != 3) break block9;
                            e8 = this.b;
                            p8 = e8.e;
                            Object object = p8.d;
                            e.b b8 = e.b.d0;
                            if (object != b8 || p8.a != 3) break block10;
                            object = e8.f;
                            if (((p)object).d == b8 && ((p)object).a == 3) break block9;
                        }
                        if (n8 == 0) {
                            p8 = e8.f;
                        }
                        if (p8.e.j) {
                            float f8 = e8.v();
                            n8 = n8 == 1 ? (int)((float)p8.e.g / f8 + 0.5f) : (int)(f8 * (float)p8.e.g + 0.5f);
                            this.e.d(n8);
                            return;
                        }
                        break block9;
                    }
                    Object object = this.b.K();
                    if (object != null) {
                        object = n8 == 0 ? ((e)object).e : ((e)object).f;
                        g g8 = ((p)object).e;
                        if (g8.j) {
                            object = this.b;
                            float f9 = n8 == 0 ? ((e)object).B : ((e)object).E;
                            n9 = (int)((float)g8.g * f9 + 0.5f);
                            this.e.d(this.g(n9, n8));
                        }
                    }
                }
                return;
            }
            n8 = this.g(this.e.m, n8);
            this.e.d(Math.min(n8, n9));
            return;
        }
        this.e.d(this.g(n9, n8));
    }

    @Override
    public void a(d d8) {
    }

    protected final void b(f f8, f f9, int n8) {
        f8.l.add(f9);
        f8.f = n8;
        f9.k.add(f8);
    }

    protected final void c(f f8, f f9, int n8, g g8) {
        f8.l.add(f9);
        f8.l.add(this.e);
        f8.h = n8;
        f8.i = g8;
        f9.k.add(f8);
        g8.k.add(f8);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int n8, int n9) {
        if (n9 == 0) {
            e e8 = this.b;
            int n10 = e8.A;
            n9 = Math.max(e8.z, n8);
            if (n10 > 0) {
                n9 = Math.min(n10, n8);
            }
            if (n9 != n8) {
                return n9;
            }
        } else {
            e e9 = this.b;
            int n11 = e9.D;
            n9 = Math.max(e9.C, n8);
            if (n11 > 0) {
                n9 = Math.min(n11, n8);
            }
            if (n9 != n8) {
                return n9;
            }
        }
        return n8;
    }

    protected final f h(ax.H.d object) {
        Object object2 = ((ax.H.d)object).f;
        if (object2 == null) {
            return null;
        }
        object = object2.d;
        object2 = object2.e;
        int n8 = ax.I.p$a.a[((Enum)object2).ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        if (n8 != 5) {
                            return null;
                        }
                        return ((e)object).f.i;
                    }
                    return ((e)object).f.k;
                }
                return ((e)object).f.h;
            }
            return ((e)object).e.i;
        }
        return ((e)object).e.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final f i(ax.H.d object, int n8) {
        ax.H.d d8 = ((ax.H.d)object).f;
        if (d8 == null) {
            return null;
        }
        object = d8.d;
        object = n8 == 0 ? ((e)object).e : ((e)object).f;
        d.b b8 = d8.e;
        n8 = ax.I.p$a.a[b8.ordinal()];
        if (n8 == 1) return ((p)object).h;
        if (n8 == 2) return ((p)object).i;
        if (n8 == 3) return ((p)object).h;
        if (n8 == 5) return ((p)object).i;
        return null;
    }

    public long j() {
        g g8 = this.e;
        if (g8.j) {
            return g8.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    abstract boolean m();

    protected void n(d d8, ax.H.d object, ax.H.d d9, int n8) {
        d8 = this.h((ax.H.d)object);
        f f8 = this.h(d9);
        if (((f)d8).j && f8.j) {
            int n9 = ((f)d8).g + ((ax.H.d)object).f();
            int n10 = f8.g - d9.f();
            int n11 = n10 - n9;
            if (!this.e.j && this.d == e.b.d0) {
                this.l(n8, n11);
            }
            object = this.e;
            if (((f)object).j) {
                if (((f)object).g == n11) {
                    this.h.d(n9);
                    this.i.d(n10);
                    return;
                }
                object = this.b;
                float f9 = n8 == 0 ? ((e)object).y() : ((e)object).R();
                n8 = n9;
                if (d8 == f8) {
                    n8 = ((f)d8).g;
                    n10 = f8.g;
                    f9 = 0.5f;
                }
                n9 = this.e.g;
                this.h.d((int)((float)n8 + 0.5f + (float)(n10 - n8 - n9) * f9));
                this.i.d(this.h.g + this.e.g);
            }
        }
    }

    protected void o(d d8) {
    }

    protected void p(d d8) {
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        private static final b[] f0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            q = b11 = new b();
            c0 = b10 = new b();
            d0 = b9 = new b();
            e0 = b8 = new b();
            f0 = new b[]{b11, b10, b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }
    }
}

