/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class W1
extends k4<W1, a>
implements W4 {
    private static final W1 zzc;
    private static volatile d5<W1> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        W1 w12;
        zzc = w12 = new W1();
        k4.w(W1.class, w12);
    }

    private W1() {
    }

    public static a I() {
        return (a)zzc.z();
    }

    private final void K(boolean bl) {
        this.zze |= 0x20;
        this.zzk = bl;
    }

    private final void N(boolean bl) {
        this.zze |= 0x10;
        this.zzj = bl;
    }

    public static W1 O() {
        return zzc;
    }

    private final void Q(boolean bl) {
        this.zze |= 1;
        this.zzf = bl;
    }

    private final void S(boolean bl) {
        this.zze |= 0x40;
        this.zzl = bl;
    }

    private final void V(boolean bl) {
        this.zze |= 2;
        this.zzg = bl;
    }

    private final void Z(boolean bl) {
        this.zze |= 4;
        this.zzh = bl;
    }

    private final void c0(boolean bl) {
        this.zze |= 8;
        this.zzi = bl;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final boolean X() {
        return this.zzj;
    }

    public final boolean a0() {
        return this.zzf;
    }

    public final boolean d0() {
        return this.zzl;
    }

    public final boolean e0() {
        return this.zzg;
    }

    public final boolean f0() {
        return this.zzh;
    }

    public final boolean g0() {
        return this.zzi;
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
                synchronized (W1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<W1>(zzc);
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
                return k4.u(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1007\u0005\u0007\u1007\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new W1();
    }

    public static final class a
    extends k4.b<W1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B(boolean bl) {
            this.s();
            ((W1)this.c0).V(bl);
            return this;
        }

        public final a C(boolean bl) {
            this.s();
            ((W1)this.c0).Z(bl);
            return this;
        }

        public final a D(boolean bl) {
            this.s();
            ((W1)this.c0).c0(bl);
            return this;
        }

        public final a w(boolean bl) {
            this.s();
            ((W1)this.c0).K(bl);
            return this;
        }

        public final a x(boolean bl) {
            this.s();
            ((W1)this.c0).N(bl);
            return this;
        }

        public final a y(boolean bl) {
            this.s();
            ((W1)this.c0).Q(bl);
            return this;
        }

        public final a z(boolean bl) {
            this.s();
            ((W1)this.c0).S(bl);
            return this;
        }
    }
}

