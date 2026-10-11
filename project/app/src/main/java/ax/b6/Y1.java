/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class Y1
extends k4<Y1, a>
implements W4 {
    private static final Y1 zzc;
    private static volatile d5<Y1> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        Y1 y12;
        zzc = y12 = new Y1();
        k4.w(Y1.class, y12);
    }

    private Y1() {
    }

    private final void I(int n8) {
        this.zze |= 1;
        this.zzf = n8;
    }

    private final void J(long l8) {
        this.zze |= 2;
        this.zzg = l8;
    }

    public static a N() {
        return (a)zzc.z();
    }

    public final long M() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
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
                synchronized (Y1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<Y1>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1002\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new Y1();
    }

    public static final class a
    extends k4.b<Y1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a w(int n8) {
            this.s();
            ((Y1)this.c0).I(n8);
            return this;
        }

        public final a x(long l8) {
            this.s();
            ((Y1)this.c0).J(l8);
            return this;
        }
    }
}

