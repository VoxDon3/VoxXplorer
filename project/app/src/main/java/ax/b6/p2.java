/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.r2;
import ax.b6.s2;
import ax.b6.t4;
import java.util.List;

public final class p2
extends k4<p2, a>
implements W4 {
    private static final p2 zzc;
    private static volatile d5<p2> zzd;
    private int zze;
    private String zzf = "";
    private t4<r2> zzg = k4.E();

    static {
        p2 p22;
        zzc = p22 = new p2();
        k4.w(p2.class, p22);
    }

    private p2() {
    }

    public final String J() {
        return this.zzf;
    }

    public final List<r2> K() {
        return this.zzg;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Object t(int n8, Object a8, Object d52) {
        switch (s2.a[n8 - 1]) {
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
                synchronized (p2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<p2>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", r2.class});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new p2();
    }

    public static final class a
    extends k4.b<p2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(s2 s22) {
            this();
        }
    }
}

