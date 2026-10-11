/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.q3;
import ax.b6.t4;
import java.util.List;

public final class b2
extends k4<b2, a>
implements W4 {
    private static final b2 zzc;
    private static volatile d5<b2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private t4<b2> zzk = k4.E();

    static {
        b2 b22;
        zzc = b22 = new b2();
        k4.w(b2.class, b22);
    }

    private b2() {
    }

    private final void J(double d8) {
        this.zze |= 0x10;
        this.zzj = d8;
    }

    private final void K(long l8) {
        this.zze |= 4;
        this.zzh = l8;
    }

    private final void R(Iterable<? extends b2> iterable) {
        this.r0();
        q3.g(iterable, this.zzk);
    }

    private final void S(String string) {
        string.getClass();
        this.zze |= 1;
        this.zzf = string;
    }

    private final void X(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzg = string;
    }

    public static a c0() {
        return (a)zzc.z();
    }

    private final void d0(b2 b22) {
        b22.getClass();
        this.r0();
        this.zzk.add(b22);
    }

    private final void n0() {
        this.zze &= 0xFFFFFFEF;
        this.zzj = 0.0;
    }

    private final void o0() {
        this.zze &= 0xFFFFFFFB;
        this.zzh = 0L;
    }

    private final void p0() {
        this.zzk = k4.E();
    }

    private final void q0() {
        this.zze &= 0xFFFFFFFD;
        this.zzg = b2.zzc.zzg;
    }

    private final void r0() {
        t4<b2> t42 = this.zzk;
        if (!t42.c()) {
            this.zzk = k4.s(t42);
        }
    }

    public final double I() {
        return this.zzj;
    }

    public final float T() {
        return this.zzi;
    }

    public final int Y() {
        return this.zzk.size();
    }

    public final long a0() {
        return this.zzh;
    }

    public final String f0() {
        return this.zzf;
    }

    public final String g0() {
        return this.zzg;
    }

    public final List<b2> h0() {
        return this.zzk;
    }

    public final boolean i0() {
        return (this.zze & 0x10) != 0;
    }

    public final boolean j0() {
        return (this.zze & 8) != 0;
    }

    public final boolean k0() {
        return (this.zze & 4) != 0;
    }

    public final boolean l0() {
        return (this.zze & 1) != 0;
    }

    public final boolean m0() {
        return (this.zze & 2) != 0;
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
                synchronized (b2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<b2>(zzc);
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
                return k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", b2.class});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new b2();
    }

    public static final class a
    extends k4.b<b2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B(Iterable<? extends b2> iterable) {
            this.s();
            ((b2)this.c0).R(iterable);
            return this;
        }

        public final a C(String string) {
            this.s();
            ((b2)this.c0).S(string);
            return this;
        }

        public final a D() {
            this.s();
            ((b2)this.c0).n0();
            return this;
        }

        public final a E(String string) {
            this.s();
            ((b2)this.c0).X(string);
            return this;
        }

        public final a F() {
            this.s();
            ((b2)this.c0).o0();
            return this;
        }

        public final a G() {
            this.s();
            ((b2)this.c0).p0();
            return this;
        }

        public final a H() {
            this.s();
            ((b2)this.c0).q0();
            return this;
        }

        public final String I() {
            return ((b2)this.c0).f0();
        }

        public final String J() {
            return ((b2)this.c0).g0();
        }

        public final int w() {
            return ((b2)this.c0).Y();
        }

        public final a x(double d8) {
            this.s();
            ((b2)this.c0).J(d8);
            return this;
        }

        public final a y(long l8) {
            this.s();
            ((b2)this.c0).K(l8);
            return this;
        }

        public final a z(a a8) {
            this.s();
            ((b2)this.c0).d0((b2)((k4)a8.q()));
            return this;
        }
    }
}

