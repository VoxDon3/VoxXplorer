/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.D1;
import ax.b6.F1;
import ax.b6.G1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;

public final class C1
extends k4<C1, a>
implements W4 {
    private static final C1 zzc;
    private static volatile d5<C1> zzd;
    private int zze;
    private F1 zzf;
    private D1 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C1 c12;
        zzc = c12 = new C1();
        k4.w(C1.class, c12);
    }

    private C1() {
    }

    private final void K(String string) {
        string.getClass();
        this.zze |= 8;
        this.zzi = string;
    }

    public static C1 L() {
        return zzc;
    }

    public final D1 M() {
        D1 d12;
        D1 d13 = d12 = this.zzg;
        if (d12 == null) {
            d13 = D1.K();
        }
        return d13;
    }

    public final F1 N() {
        F1 f12;
        F1 f13 = f12 = this.zzf;
        if (f12 == null) {
            f13 = F1.K();
        }
        return f13;
    }

    public final String O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final boolean S() {
        return (this.zze & 8) != 0;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
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
                synchronized (C1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<C1>(zzc);
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
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new C1();
    }

    public static final class a
    extends k4.b<C1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(G1 g12) {
            this();
        }

        public final a w(String string) {
            this.s();
            ((C1)this.c0).K(string);
            return this;
        }
    }
}

