/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;

public final class a2
extends k4<a2, a>
implements W4 {
    private static final a2 zzc;
    private static volatile d5<a2> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        a2 a22;
        zzc = a22 = new a2();
        k4.w(a2.class, a22);
    }

    private a2() {
    }

    public static a I() {
        return (a)zzc.z();
    }

    private final void J(long l8) {
        this.zze |= 2;
        this.zzg = l8;
    }

    private final void M(String string) {
        string.getClass();
        this.zze |= 1;
        this.zzf = string;
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
                synchronized (a2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<a2>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new a2();
    }

    public static final class a
    extends k4.b<a2, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a w(long l8) {
            this.s();
            ((a2)this.c0).J(l8);
            return this;
        }

        public final a x(String string) {
            this.s();
            ((a2)this.c0).M(string);
            return this;
        }
    }
}

