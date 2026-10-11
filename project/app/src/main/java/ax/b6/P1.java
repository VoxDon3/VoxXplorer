/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;

public final class P1
extends k4<P1, a>
implements W4 {
    private static final P1 zzc;
    private static volatile d5<P1> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        P1 p12;
        zzc = p12 = new P1();
        k4.w(P1.class, p12);
    }

    private P1() {
    }

    public static P1 J() {
        return zzc;
    }

    public final String K() {
        return this.zzg;
    }

    public final String L() {
        return this.zzf;
    }

    public final int n() {
        return this.zzi;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(int n8, Object a8, Object d52) {
        switch (R1.a[n8 - 1]) {
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
                synchronized (P1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<P1>(zzc);
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
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new P1();
    }

    public static final class a
    extends k4.b<P1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(R1 r12) {
            this();
        }
    }
}

