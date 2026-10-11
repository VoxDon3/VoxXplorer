/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class i2
extends k4<i2, a>
implements W4 {
    private static final i2 zzc;
    private static volatile d5<i2> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        i2 i22;
        zzc = i22 = new i2();
        k4.w(i2.class, i22);
    }

    private i2() {
    }

    private final void J(double d8) {
        this.zze |= 0x20;
        this.zzk = d8;
    }

    private final void K(long l8) {
        this.zze |= 8;
        this.zzi = l8;
    }

    private final void P(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzg = string;
    }

    private final void R(long l8) {
        this.zze |= 1;
        this.zzf = l8;
    }

    private final void V(String string) {
        string.getClass();
        this.zze |= 4;
        this.zzh = string;
    }

    public static a a0() {
        return (a)zzc.z();
    }

    private final void j0() {
        this.zze &= 0xFFFFFFDF;
        this.zzk = 0.0;
    }

    private final void k0() {
        this.zze &= 0xFFFFFFF7;
        this.zzi = 0L;
    }

    private final void l0() {
        this.zze &= 0xFFFFFFFB;
        this.zzh = i2.zzc.zzh;
    }

    public final double I() {
        return this.zzk;
    }

    public final float Q() {
        return this.zzj;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Z() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzg;
    }

    public final String d0() {
        return this.zzh;
    }

    public final boolean e0() {
        return (this.zze & 0x20) != 0;
    }

    public final boolean f0() {
        return (this.zze & 0x10) != 0;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 4) != 0;
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
                synchronized (i2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<i2>(zzc);
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
                return k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1001\u0004\u0006\u1000\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new i2();
    }

    public static final class a
    extends k4.b<i2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B() {
            this.s();
            ((i2)this.c0).k0();
            return this;
        }

        public final a C(long l8) {
            this.s();
            ((i2)this.c0).R(l8);
            return this;
        }

        public final a D(String string) {
            this.s();
            ((i2)this.c0).V(string);
            return this;
        }

        public final a E() {
            this.s();
            ((i2)this.c0).l0();
            return this;
        }

        public final a w() {
            this.s();
            ((i2)this.c0).j0();
            return this;
        }

        public final a x(double d8) {
            this.s();
            ((i2)this.c0).J(d8);
            return this;
        }

        public final a y(long l8) {
            this.s();
            ((i2)this.c0).K(l8);
            return this;
        }

        public final a z(String string) {
            this.s();
            ((i2)this.c0).P(string);
            return this;
        }
    }
}

