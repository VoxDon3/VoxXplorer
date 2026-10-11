/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.p2;
import ax.b6.s2;
import ax.b6.t4;
import java.util.List;

public final class o2
extends k4<o2, a>
implements W4 {
    private static final o2 zzc;
    private static volatile d5<o2> zzd;
    private t4<p2> zze = k4.E();

    static {
        o2 o22;
        zzc = o22 = new o2();
        k4.w(o2.class, o22);
    }

    private o2() {
    }

    public static o2 J() {
        return zzc;
    }

    public final List<p2> K() {
        return this.zze;
    }

    public final int n() {
        return this.zze.size();
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
                synchronized (o2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<o2>(zzc);
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
                return k4.u(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", p2.class});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new o2();
    }

    public static final class a
    extends k4.b<o2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(s2 s22) {
            this();
        }
    }
}

