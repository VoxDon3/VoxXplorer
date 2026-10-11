/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.C1;
import ax.b6.D1;
import ax.b6.G1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.t4;
import java.util.List;

public final class B1
extends k4<B1, a>
implements W4 {
    private static final B1 zzc;
    private static volatile d5<B1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private t4<C1> zzh = k4.E();
    private boolean zzi;
    private D1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        B1 b12;
        zzc = b12 = new B1();
        k4.w(B1.class, b12);
    }

    private B1() {
    }

    private final void J(int n8, C1 c12) {
        c12.getClass();
        t4<C1> t42 = this.zzh;
        if (!t42.c()) {
            this.zzh = k4.s(t42);
        }
        this.zzh.set(n8, c12);
    }

    private final void M(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzg = string;
    }

    public static a O() {
        return (a)zzc.z();
    }

    public final C1 I(int n8) {
        return (C1)this.zzh.get(n8);
    }

    public final int N() {
        return this.zzf;
    }

    public final D1 Q() {
        D1 d12;
        D1 d13 = d12 = this.zzj;
        if (d12 == null) {
            d13 = D1.K();
        }
        return d13;
    }

    public final String R() {
        return this.zzg;
    }

    public final List<C1> S() {
        return this.zzh;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final boolean U() {
        return this.zzl;
    }

    public final boolean V() {
        return this.zzm;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final boolean Z() {
        return (this.zze & 0x40) != 0;
    }

    public final int n() {
        return this.zzh.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(int n8, Object a8, Object d52) {
        switch (G1.a[n8 - 1]) {
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
                synchronized (B1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<B1>(zzc);
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
                return k4.u(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u001b\u0004\u1007\u0002\u0005\u1009\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new B1();
    }

    public static final class a
    extends k4.b<B1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(G1 g12) {
            this();
        }

        public final String B() {
            return ((B1)this.c0).R();
        }

        public final int w() {
            return ((B1)this.c0).n();
        }

        public final a x(int n8, C1 c12) {
            this.s();
            ((B1)this.c0).J(n8, c12);
            return this;
        }

        public final a y(String string) {
            this.s();
            ((B1)this.c0).M(string);
            return this;
        }

        public final C1 z(int n8) {
            return ((B1)this.c0).I(n8);
        }
    }
}

