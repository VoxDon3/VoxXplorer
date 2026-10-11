/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.C1;
import ax.b6.G1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;

public final class E1
extends k4<E1, a>
implements W4 {
    private static final E1 zzc;
    private static volatile d5<E1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        E1 e12;
        zzc = e12 = new E1();
        k4.w(E1.class, e12);
    }

    private E1() {
    }

    private final void J(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzg = string;
    }

    public static a L() {
        return (a)zzc.z();
    }

    public final C1 K() {
        C1 c12;
        C1 c13 = c12 = this.zzh;
        if (c12 == null) {
            c13 = C1.L();
        }
        return c13;
    }

    public final String N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 0x20) != 0;
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
                synchronized (E1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<E1>(zzc);
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
                return k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new E1();
    }

    public static final class a
    extends k4.b<E1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(G1 g12) {
            this();
        }

        public final a w(String string) {
            this.s();
            ((E1)this.c0).J(string);
            return this;
        }
    }
}

