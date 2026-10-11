/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.o2;
import ax.b6.r2;
import ax.b6.s2;
import ax.b6.t4;
import java.util.List;

public final class q2
extends k4<q2, a>
implements W4 {
    private static final q2 zzc;
    private static volatile d5<q2> zzd;
    private int zze;
    private t4<r2> zzf = k4.E();
    private o2 zzg;

    static {
        q2 q22;
        zzc = q22 = new q2();
        k4.w(q2.class, q22);
    }

    private q2() {
    }

    public final o2 I() {
        o2 o22;
        o2 o23 = o22 = this.zzg;
        if (o22 == null) {
            o23 = o2.J();
        }
        return o23;
    }

    public final List<r2> K() {
        return this.zzf;
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
                synchronized (q2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<q2>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[]{"zze", "zzf", r2.class, "zzg"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new q2();
    }

    public static final class a
    extends k4.b<q2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(s2 s22) {
            this();
        }
    }
}

