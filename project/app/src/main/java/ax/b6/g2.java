/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.Y1;
import ax.b6.d5;
import ax.b6.h2;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.q3;
import ax.b6.q4;
import ax.b6.t4;
import java.util.List;

public final class g2
extends k4<g2, a>
implements W4 {
    private static final g2 zzc;
    private static volatile d5<g2> zzd;
    private q4 zze = k4.D();
    private q4 zzf = k4.D();
    private t4<Y1> zzg = k4.E();
    private t4<h2> zzh = k4.E();

    static {
        g2 g22;
        zzc = g22 = new g2();
        k4.w(g2.class, g22);
    }

    private g2() {
    }

    private final void K(Iterable<? extends Y1> iterable) {
        t4<Y1> t42 = this.zzg;
        if (!t42.c()) {
            this.zzg = k4.s(t42);
        }
        q3.g(iterable, this.zzg);
    }

    private final void O(Iterable<? extends Long> iterable) {
        q4 q42 = this.zzf;
        if (!q42.c()) {
            this.zzf = k4.r(q42);
        }
        q3.g(iterable, this.zzf);
    }

    private final void S(Iterable<? extends h2> iterable) {
        t4<h2> t42 = this.zzh;
        if (!t42.c()) {
            this.zzh = k4.s(t42);
        }
        q3.g(iterable, this.zzh);
    }

    private final void X(Iterable<? extends Long> iterable) {
        q4 q42 = this.zze;
        if (!q42.c()) {
            this.zze = k4.r(q42);
        }
        q3.g(iterable, this.zze);
    }

    public static a Y() {
        return (a)zzc.z();
    }

    public static g2 a0() {
        return zzc;
    }

    private final void f0() {
        this.zzg = k4.E();
    }

    private final void g0() {
        this.zzf = k4.D();
    }

    private final void h0() {
        this.zzh = k4.E();
    }

    private final void i0() {
        this.zze = k4.D();
    }

    public final int L() {
        return this.zzf.size();
    }

    public final int P() {
        return this.zzh.size();
    }

    public final int T() {
        return this.zze.size();
    }

    public final List<Y1> b0() {
        return this.zzg;
    }

    public final List<Long> c0() {
        return this.zzf;
    }

    public final List<h2> d0() {
        return this.zzh;
    }

    public final List<Long> e0() {
        return this.zze;
    }

    public final int n() {
        return this.zzg.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(int n8, Object a8, Object d52) {
        switch (k2.a[n8 - 1]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                return null;
            }
            case 6: {
                return (byte)1;
            }
            case 5: {
                a8 = zzd;
                if (a8 != null) {
                    return a8;
                }
                synchronized (g2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<g2>(zzc);
                            zzd = a8;
                        }
                        return a8;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return zzc;
            }
            case 3: {
                return k4.u(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", Y1.class, "zzh", h2.class});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new g2();
    }

    public static final class a
    extends k4.b<g2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B() {
            this.s();
            ((g2)this.c0).h0();
            return this;
        }

        public final a C(Iterable<? extends h2> iterable) {
            this.s();
            ((g2)this.c0).S(iterable);
            return this;
        }

        public final a D() {
            this.s();
            ((g2)this.c0).i0();
            return this;
        }

        public final a E(Iterable<? extends Long> iterable) {
            this.s();
            ((g2)this.c0).X(iterable);
            return this;
        }

        public final a w() {
            this.s();
            ((g2)this.c0).f0();
            return this;
        }

        public final a x(Iterable<? extends Y1> iterable) {
            this.s();
            ((g2)this.c0).K(iterable);
            return this;
        }

        public final a y() {
            this.s();
            ((g2)this.c0).g0();
            return this;
        }

        public final a z(Iterable<? extends Long> iterable) {
            this.s();
            ((g2)this.c0).O(iterable);
            return this;
        }
    }
}

