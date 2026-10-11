/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.q3;
import ax.b6.q4;
import java.util.List;

public final class h2
extends k4<h2, a>
implements W4 {
    private static final h2 zzc;
    private static volatile d5<h2> zzd;
    private int zze;
    private int zzf;
    private q4 zzg = k4.D();

    static {
        h2 h22;
        zzc = h22 = new h2();
        k4.w(h2.class, h22);
    }

    private h2() {
    }

    private final void L(Iterable<? extends Long> iterable) {
        q4 q42 = this.zzg;
        if (!q42.c()) {
            this.zzg = k4.r(q42);
        }
        q3.g(iterable, this.zzg);
    }

    private final void N(int n8) {
        this.zze |= 1;
        this.zzf = n8;
    }

    public static a O() {
        return (a)zzc.z();
    }

    public final long I(int n8) {
        return this.zzg.m(n8);
    }

    public final int M() {
        return this.zzf;
    }

    public final List<Long> Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzg.size();
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
                synchronized (h2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<h2>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new h2();
    }

    public static final class a
    extends k4.b<h2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a w(int n8) {
            this.s();
            ((h2)this.c0).N(n8);
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            this.s();
            ((h2)this.c0).L(iterable);
            return this;
        }
    }
}

