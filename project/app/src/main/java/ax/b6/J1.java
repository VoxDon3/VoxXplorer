/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.N1;
import ax.b6.R1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.t4;

public final class J1
extends k4<J1, a>
implements W4 {
    private static final J1 zzc;
    private static volatile d5<J1> zzd;
    private int zze;
    private String zzf = "";
    private t4<N1> zzg = k4.E();
    private boolean zzh;

    static {
        J1 j12;
        zzc = j12 = new J1();
        k4.w(J1.class, j12);
    }

    private J1() {
    }

    public final String J() {
        return this.zzf;
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
                synchronized (J1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<J1>(zzc);
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
                return k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1007\u0001", new Object[]{"zze", "zzf", "zzg", N1.class, "zzh"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new J1();
    }

    public static final class a
    extends k4.b<J1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(R1 r12) {
            this();
        }
    }
}

