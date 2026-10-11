/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.b2;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.q3;
import ax.b6.t4;
import java.util.List;

public final class Z1
extends k4<Z1, a>
implements W4 {
    private static final Z1 zzc;
    private static volatile d5<Z1> zzd;
    private int zze;
    private t4<b2> zzf = k4.E();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        Z1 z12;
        zzc = z12 = new Z1();
        k4.w(Z1.class, z12);
    }

    private Z1() {
    }

    private final void J(int n8, b2 b22) {
        b22.getClass();
        this.k0();
        this.zzf.set(n8, b22);
    }

    private final void K(long l8) {
        this.zze |= 4;
        this.zzi = l8;
    }

    private final void S(b2 b22) {
        b22.getClass();
        this.k0();
        this.zzf.add(b22);
    }

    private final void T(Iterable<? extends b2> iterable) {
        this.k0();
        q3.g(iterable, this.zzf);
    }

    private final void U(String string) {
        string.getClass();
        this.zze |= 1;
        this.zzg = string;
    }

    private final void X(int n8) {
        this.k0();
        this.zzf.remove(n8);
    }

    private final void Y(long l8) {
        this.zze |= 2;
        this.zzh = l8;
    }

    public static a c0() {
        return (a)zzc.z();
    }

    private final void j0() {
        this.zzf = k4.E();
    }

    private final void k0() {
        t4<b2> t42 = this.zzf;
        if (!t42.c()) {
            this.zzf = k4.s(t42);
        }
    }

    public final b2 I(int n8) {
        return (b2)this.zzf.get(n8);
    }

    public final int V() {
        return this.zzf.size();
    }

    public final long a0() {
        return this.zzi;
    }

    public final long b0() {
        return this.zzh;
    }

    public final String e0() {
        return this.zzg;
    }

    public final List<b2> f0() {
        return this.zzf;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 4) != 0;
    }

    public final boolean i0() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzj;
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
                synchronized (Z1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<Z1>(zzc);
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
                return k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0003\u1002\u0001\u0004\u1002\u0002\u0005\u1004\u0003", new Object[]{"zze", "zzf", b2.class, "zzg", "zzh", "zzi", "zzj"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new Z1();
    }

    public static final class a
    extends k4.b<Z1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(k2 k22) {
            this();
        }

        public final a B(long l8) {
            this.s();
            ((Z1)this.c0).K(l8);
            return this;
        }

        public final a C(b2.a a8) {
            this.s();
            ((Z1)this.c0).S((b2)((k4)a8.q()));
            return this;
        }

        public final a D(b2 b22) {
            this.s();
            ((Z1)this.c0).S(b22);
            return this;
        }

        public final a E(Iterable<? extends b2> iterable) {
            this.s();
            ((Z1)this.c0).T(iterable);
            return this;
        }

        public final a F(String string) {
            this.s();
            ((Z1)this.c0).U(string);
            return this;
        }

        public final long G() {
            return ((Z1)this.c0).a0();
        }

        public final a H(long l8) {
            this.s();
            ((Z1)this.c0).Y(l8);
            return this;
        }

        public final b2 I(int n8) {
            return ((Z1)this.c0).I(n8);
        }

        public final long J() {
            return ((Z1)this.c0).b0();
        }

        public final a K() {
            this.s();
            ((Z1)this.c0).j0();
            return this;
        }

        public final String L() {
            return ((Z1)this.c0).e0();
        }

        public final List<b2> M() {
            return java.util.DesugarCollections.unmodifiableList(((Z1)this.c0).f0());
        }

        public final boolean N() {
            return ((Z1)this.c0).i0();
        }

        public final int w() {
            return ((Z1)this.c0).V();
        }

        public final a x(int n8) {
            this.s();
            ((Z1)this.c0).X(n8);
            return this;
        }

        public final a y(int n8, b2.a a8) {
            this.s();
            ((Z1)this.c0).J(n8, (b2)((k4)a8.q()));
            return this;
        }

        public final a z(int n8, b2 b22) {
            this.s();
            ((Z1)this.c0).J(n8, b22);
            return this;
        }
    }
}

