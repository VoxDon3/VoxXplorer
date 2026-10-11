/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;

public final class K1
extends k4<K1, a>
implements W4 {
    private static final K1 zzc;
    private static volatile d5<K1> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        K1 k12;
        zzc = k12 = new K1();
        k4.w(K1.class, k12);
    }

    private K1() {
    }

    private final void J(String string) {
        string.getClass();
        this.zze |= 1;
        this.zzf = string;
    }

    public final String L() {
        return this.zzf;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final int n() {
        return this.zzi;
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
                synchronized (K1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<K1>(zzc);
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
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new K1();
    }

    public static final class a
    extends k4.b<K1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(R1 r12) {
            this();
        }

        public final boolean B() {
            return ((K1)this.c0).N();
        }

        public final boolean C() {
            return ((K1)this.c0).O();
        }

        public final boolean D() {
            return ((K1)this.c0).P();
        }

        public final boolean E() {
            return ((K1)this.c0).Q();
        }

        public final int w() {
            return ((K1)this.c0).n();
        }

        public final a x(String string) {
            this.s();
            ((K1)this.c0).J(string);
            return this;
        }

        public final String y() {
            return ((K1)this.c0).L();
        }

        public final boolean z() {
            return ((K1)this.c0).M();
        }
    }
}

