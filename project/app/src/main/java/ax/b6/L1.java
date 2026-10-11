/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A1;
import ax.b6.I1;
import ax.b6.J1;
import ax.b6.K1;
import ax.b6.M1;
import ax.b6.N1;
import ax.b6.O1;
import ax.b6.P1;
import ax.b6.R1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.q2;
import ax.b6.t4;
import java.util.List;

public final class L1
extends k4<L1, a>
implements W4 {
    private static final L1 zzc;
    private static volatile d5<L1> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private t4<O1> zzi = k4.E();
    private t4<K1> zzj = k4.E();
    private t4<A1> zzk = k4.E();
    private String zzl = "";
    private boolean zzm;
    private t4<q2> zzn = k4.E();
    private t4<J1> zzo = k4.E();
    private String zzp = "";
    private String zzq = "";
    private I1 zzr;
    private M1 zzs;
    private P1 zzt;
    private N1 zzu;

    static {
        L1 l12;
        zzc = l12 = new L1();
        k4.w(L1.class, l12);
    }

    private L1() {
    }

    private final void J(int n8, K1 k12) {
        k12.getClass();
        t4<K1> t42 = this.zzj;
        if (!t42.c()) {
            this.zzj = k4.s(t42);
        }
        this.zzj.set(n8, k12);
    }

    public static a P() {
        return (a)zzc.z();
    }

    public static L1 R() {
        return zzc;
    }

    private final void f0() {
        this.zzk = k4.E();
    }

    public final K1 I(int n8) {
        return (K1)this.zzj.get(n8);
    }

    public final int M() {
        return this.zzj.size();
    }

    public final long N() {
        return this.zzf;
    }

    public final I1 O() {
        I1 i12;
        I1 i13 = i12 = this.zzr;
        if (i12 == null) {
            i13 = I1.J();
        }
        return i13;
    }

    public final P1 S() {
        P1 p12;
        P1 p13 = p12 = this.zzt;
        if (p12 == null) {
            p13 = P1.J();
        }
        return p13;
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzp;
    }

    public final List<A1> V() {
        return this.zzk;
    }

    public final List<J1> X() {
        return this.zzo;
    }

    public final List<q2> Y() {
        return this.zzn;
    }

    public final List<O1> Z() {
        return this.zzi;
    }

    public final boolean a0() {
        return this.zzm;
    }

    public final boolean b0() {
        return (this.zze & 0x80) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    public final boolean d0() {
        return (this.zze & 0x200) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzn.size();
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
                synchronized (L1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<L1>(zzc);
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
                return k4.u(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\b\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005\u000e\u1008\u0006\u000f\u1009\u0007\u0010\u1009\b\u0011\u1009\t\u0012\u1009\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", K1.class, "zzk", A1.class, "zzl", "zzm", "zzn", q2.class, "zzo", J1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            }
            case 2: {
                return new a(null);
            }
            case 1: 
        }
        return new L1();
    }

    public static final class a
    extends k4.b<L1, a>
    implements W4 {
        private a() {
            super(zzc);
        }

        /* synthetic */ a(R1 r12) {
            this();
        }

        public final String B() {
            return ((L1)this.c0).U();
        }

        public final List<A1> C() {
            return java.util.DesugarCollections.unmodifiableList(((L1)this.c0).V());
        }

        public final List<J1> D() {
            return java.util.DesugarCollections.unmodifiableList(((L1)this.c0).X());
        }

        public final int w() {
            return ((L1)this.c0).M();
        }

        public final K1 x(int n8) {
            return ((L1)this.c0).I(n8);
        }

        public final a y(int n8, K1.a a8) {
            this.s();
            ((L1)this.c0).J(n8, (K1)((k4)a8.q()));
            return this;
        }

        public final a z() {
            this.s();
            ((L1)this.c0).f0();
            return this;
        }
    }
}

