/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.G1;
import ax.b6.Q1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.o4;
import ax.b6.p4;
import ax.b6.t4;
import java.util.List;

public final class F1
extends k4<F1, b>
implements W4 {
    private static final F1 zzc;
    private static volatile d5<F1> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private t4<String> zzi = k4.E();

    static {
        F1 f12;
        zzc = f12 = new F1();
        k4.w(F1.class, f12);
    }

    private F1() {
    }

    public static F1 K() {
        return zzc;
    }

    public final a I() {
        a a8;
        a a9 = a8 = a.d(this.zzf);
        if (a8 == null) {
            a9 = a.c0;
        }
        return a9;
    }

    public final String L() {
        return this.zzg;
    }

    public final List<String> M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 4) != 0;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzi.size();
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
                synchronized (F1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<F1>(zzc);
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
                a8 = a.h();
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u001a", new Object[]{"zze", "zzf", a8, "zzg", "zzh", "zzi"});
            }
            case 2: {
                return new b(null);
            }
            case 1: 
        }
        return new F1();
    }

    public static final class a
    extends Enum<a>
    implements p4 {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        private static final a[] j0;
        private final int q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            c0 = a14 = new a(0);
            d0 = a13 = new a(1);
            e0 = a12 = new a(2);
            f0 = a11 = new a(3);
            g0 = a10 = new a(4);
            h0 = a9 = new a(5);
            i0 = a8 = new a(6);
            j0 = new a[]{a14, a13, a12, a11, a10, a9, a8};
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a d(int n8) {
            switch (n8) {
                default: {
                    return null;
                }
                case 6: {
                    return i0;
                }
                case 5: {
                    return h0;
                }
                case 4: {
                    return g0;
                }
                case 3: {
                    return f0;
                }
                case 2: {
                    return e0;
                }
                case 1: {
                    return d0;
                }
                case 0: 
            }
            return c0;
        }

        public static o4 h() {
            return Q1.a;
        }

        public static a[] values() {
            return (a[])j0.clone();
        }

        @Override
        public final int a() {
            return this.q;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(a.class.getName());
            stringBuilder.append('@');
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" number=");
            stringBuilder.append(this.q);
            stringBuilder.append(" name=");
            stringBuilder.append(this.name());
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends k4.b<F1, b>
    implements W4 {
        private b() {
            super(zzc);
        }

        /* synthetic */ b(G1 g12) {
            this();
        }
    }
}

