/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.B1;
import ax.b6.E1;
import ax.b6.G1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.t4;
import java.util.List;

public final class A1
extends k4<A1, a>
implements W4 {
    private static final A1 zzc;
    private static volatile d5<A1> zzd;
    private int zze;
    private int zzf;
    private t4<E1> zzg = k4.E();
    private t4<B1> zzh = k4.E();
    private boolean zzi;
    private boolean zzj;

    static {
        A1 a12;
        zzc = a12 = new A1();
        k4.w(A1.class, a12);
    }

    private A1() {
    }

    private final void J(int n8, B1 b12) {
        b12.getClass();
        t4<B1> t42 = this.zzh;
        if (!t42.c()) {
            this.zzh = k4.s(t42);
        }
        this.zzh.set(n8, b12);
    }

    private final void K(int n8, E1 e12) {
        e12.getClass();
        t4<E1> t42 = this.zzg;
        if (!t42.c()) {
            this.zzg = k4.s(t42);
        }
        this.zzg.set(n8, e12);
    }

    public final B1 I(int n8) {
        return (B1)this.zzh.get(n8);
    }

    public final int N() {
        return this.zzh.size();
    }

    public final E1 O(int n8) {
        return (E1)this.zzg.get(n8);
    }

    public final int P() {
        return this.zzg.size();
    }

    public final List<B1> R() {
        return this.zzh;
    }

    public final List<E1> S() {
        return this.zzg;
    }

    public final boolean T() {
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
        switch (G1.a[n8 - 1]) {
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
                synchronized (A1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<A1>(zzc);
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
                return k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1007\u0001\u0005\u1007\u0002", new Object[]{"zze", "zzf", "zzg", E1.class, "zzh", B1.class, "zzi", "zzj"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new A1();
    }

    public static final class a
    extends k4.b<A1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(G1 g12) {
            this();
        }

        public final int B() {
            return ((A1)this.c0).P();
        }

        public final E1 C(int n8) {
            return ((A1)this.c0).O(n8);
        }

        public final int w() {
            return ((A1)this.c0).N();
        }

        public final a x(int n8, B1.a a8) {
            this.s();
            ((A1)this.c0).J(n8, (B1)((k4)a8.q()));
            return this;
        }

        public final a y(int n8, E1.a a8) {
            this.s();
            ((A1)this.c0).K(n8, (E1)((k4)a8.q()));
            return this;
        }

        public final B1 z(int n8) {
            return ((A1)this.c0).I(n8);
        }
    }
}

