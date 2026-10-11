/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.V1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class c2
extends k4<c2, a>
implements W4 {
    private static final c2 zzc;
    private static volatile d5<c2> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private V1 zzh;

    static {
        c2 c22;
        zzc = c22 = new c2();
        k4.w(c2.class, c22);
    }

    private c2() {
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
                synchronized (c2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<c2>(zzc);
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
                return k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new c2();
    }

    public static final class a
    extends k4.b<c2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }
    }
}

