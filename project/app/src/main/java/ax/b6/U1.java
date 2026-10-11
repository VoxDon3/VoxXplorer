/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class U1
extends k4<U1, a>
implements W4 {
    private static final U1 zzc;
    private static volatile d5<U1> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private long zzm;

    static {
        U1 u12;
        zzc = u12 = new U1();
        k4.w(U1.class, u12);
    }

    private U1() {
    }

    private final void J(long l8) {
        this.zze |= 8;
        this.zzi = l8;
    }

    private final void N(String string) {
        string.getClass();
        this.zze |= 4;
        this.zzh = string;
    }

    private final void P(long l8) {
        this.zze |= 0x80;
        this.zzm = l8;
    }

    private final void T(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzg = string;
    }

    public static a U() {
        return (a)zzc.z();
    }

    private final void Y(String string) {
        string.getClass();
        this.zze |= 1;
        this.zzf = string;
    }

    private final void c0(String string) {
        string.getClass();
        this.zze |= 0x40;
        this.zzl = string;
    }

    public static U1 d0() {
        return zzc;
    }

    private final void g0(String string) {
        string.getClass();
        this.zze |= 0x20;
        this.zzk = string;
    }

    private final void k0(String string) {
        string.getClass();
        this.zze |= 0x10;
        this.zzj = string;
    }

    private final void q0() {
        this.zze &= 0xFFFFFFFB;
        this.zzh = U1.zzc.zzh;
    }

    private final void r0() {
        this.zze &= 0xFFFFFFFD;
        this.zzg = U1.zzc.zzg;
    }

    private final void s0() {
        this.zze &= 0xFFFFFFFE;
        this.zzf = U1.zzc.zzf;
    }

    private final void t0() {
        this.zze &= 0xFFFFFFBF;
        this.zzl = U1.zzc.zzl;
    }

    private final void u0() {
        this.zze &= 0xFFFFFFDF;
        this.zzk = U1.zzc.zzk;
    }

    private final void v0() {
        this.zze &= 0xFFFFFFEF;
        this.zzj = U1.zzc.zzj;
    }

    public final long I() {
        return this.zzi;
    }

    public final long O() {
        return this.zzm;
    }

    public final String h0() {
        return this.zzh;
    }

    public final String l0() {
        return this.zzg;
    }

    public final String m0() {
        return this.zzf;
    }

    public final String n0() {
        return this.zzl;
    }

    public final String o0() {
        return this.zzk;
    }

    public final String p0() {
        return this.zzj;
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
                synchronized (U1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<U1>(zzc);
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
                return k4.u(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1002\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new U1();
    }

    public static final class a
    extends k4.b<U1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B(long l8) {
            this.s();
            ((U1)this.c0).P(l8);
            return this;
        }

        public final a C(String string) {
            this.s();
            ((U1)this.c0).T(string);
            return this;
        }

        public final a D() {
            this.s();
            ((U1)this.c0).q0();
            return this;
        }

        public final a E(String string) {
            this.s();
            ((U1)this.c0).Y(string);
            return this;
        }

        public final a F() {
            this.s();
            ((U1)this.c0).r0();
            return this;
        }

        public final a G(String string) {
            this.s();
            ((U1)this.c0).c0(string);
            return this;
        }

        public final a H() {
            this.s();
            ((U1)this.c0).s0();
            return this;
        }

        public final a I(String string) {
            this.s();
            ((U1)this.c0).g0(string);
            return this;
        }

        public final a J() {
            this.s();
            ((U1)this.c0).t0();
            return this;
        }

        public final a K(String string) {
            this.s();
            ((U1)this.c0).k0(string);
            return this;
        }

        public final a L() {
            this.s();
            ((U1)this.c0).u0();
            return this;
        }

        public final a M() {
            this.s();
            ((U1)this.c0).v0();
            return this;
        }

        public final long w() {
            return ((U1)this.c0).I();
        }

        public final a x(long l8) {
            this.s();
            ((U1)this.c0).J(l8);
            return this;
        }

        public final a y(String string) {
            this.s();
            ((U1)this.c0).N(string);
            return this;
        }

        public final long z() {
            return ((U1)this.c0).O();
        }
    }
}

