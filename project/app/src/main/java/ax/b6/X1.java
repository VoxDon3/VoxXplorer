/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.g2;
import ax.b6.k2;
import ax.b6.k4;

public final class X1
extends k4<X1, a>
implements W4 {
    private static final X1 zzc;
    private static volatile d5<X1> zzd;
    private int zze;
    private int zzf;
    private g2 zzg;
    private g2 zzh;
    private boolean zzi;

    static {
        X1 x12;
        zzc = x12 = new X1();
        k4.w(X1.class, x12);
    }

    private X1() {
    }

    private final void I(int n8) {
        this.zze |= 1;
        this.zzf = n8;
    }

    private final void M(g2 g22) {
        g22.getClass();
        this.zzg = g22;
        this.zze |= 2;
    }

    private final void N(boolean bl) {
        this.zze |= 8;
        this.zzi = bl;
    }

    public static a O() {
        return (a)zzc.z();
    }

    private final void Q(g2 g22) {
        g22.getClass();
        this.zzh = g22;
        this.zze |= 4;
    }

    public final g2 S() {
        g2 g22;
        g2 g23 = g22 = this.zzg;
        if (g22 == null) {
            g23 = g2.a0();
        }
        return g23;
    }

    public final g2 T() {
        g2 g22;
        g2 g23 = g22 = this.zzh;
        if (g22 == null) {
            g23 = g2.a0();
        }
        return g23;
    }

    public final boolean U() {
        return this.zzi;
    }

    public final boolean V() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 4) != 0;
    }

    public final int n() {
        return this.zzf;
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
                synchronized (X1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<X1>(zzc);
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
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1007\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new X1();
    }

    public static final class a
    extends k4.b<X1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a w(int n8) {
            this.s();
            ((X1)this.c0).I(n8);
            return this;
        }

        public final a x(g2.a a8) {
            this.s();
            ((X1)this.c0).M((g2)((k4)a8.q()));
            return this;
        }

        public final a y(g2 g22) {
            this.s();
            ((X1)this.c0).Q(g22);
            return this;
        }

        public final a z(boolean bl) {
            this.s();
            ((X1)this.c0).N(bl);
            return this;
        }
    }
}

