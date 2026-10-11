/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.o4;
import ax.b6.p4;
import ax.b6.s2;
import ax.b6.t4;
import ax.b6.u2;
import java.util.List;

public final class r2
extends k4<r2, b>
implements W4 {
    private static final r2 zzc;
    private static volatile d5<r2> zzd;
    private int zze;
    private int zzf;
    private t4<r2> zzg = k4.E();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        r2 r22;
        zzc = r22 = new r2();
        k4.w(r2.class, r22);
    }

    private r2() {
    }

    public final double I() {
        return this.zzk;
    }

    public final a J() {
        a a8;
        a a9 = a8 = a.d(this.zzf);
        if (a8 == null) {
            a9 = a.c0;
        }
        return a9;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zzi;
    }

    public final List<r2> N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 0x10) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
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
                synchronized (r2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<r2>(zzc);
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
                return k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1007\u0003\u0006\u1000\u0004", new Object[]{"zze", "zzf", a8, "zzg", r2.class, "zzh", "zzi", "zzj", "zzk"});
            }
            case 2: {
                return new b(null);
            }
            case 1: 
        }
        return new r2();
    }

    public static final class a
    extends Enum<a>
    implements p4 {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        private static final a[] h0;
        private final int q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            c0 = a12 = new a(0);
            d0 = a11 = new a(1);
            e0 = a10 = new a(2);
            f0 = a9 = new a(3);
            g0 = a8 = new a(4);
            h0 = new a[]{a12, a11, a10, a9, a8};
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a d(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                return null;
                            }
                            return g0;
                        }
                        return f0;
                    }
                    return e0;
                }
                return d0;
            }
            return c0;
        }

        public static o4 h() {
            return u2.a;
        }

        public static a[] values() {
            return (a[])h0.clone();
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
    extends k4.b<r2, b>
    implements W4 {
        private b() {
            super(zzc);
        }

        /* synthetic */ b(s2 s22) {
            this();
        }
    }
}

