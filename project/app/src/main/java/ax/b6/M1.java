/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;

public final class M1
extends k4<M1, a>
implements W4 {
    private static final M1 zzc;
    private static volatile d5<M1> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    static {
        M1 m12;
        zzc = m12 = new M1();
        k4.w(M1.class, m12);
    }

    private M1() {
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
                synchronized (M1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<M1>(zzc);
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
                return k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new M1();
    }

    public static final class a
    extends k4.b<M1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(R1 r12) {
            this();
        }
    }
}

