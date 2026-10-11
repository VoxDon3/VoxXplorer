/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.d5;
import ax.b6.e2;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.m2;
import ax.b6.o4;
import ax.b6.p4;
import ax.b6.t4;
import java.util.List;

public final class d2
extends k4<d2, b>
implements W4 {
    private static final d2 zzc;
    private static volatile d5<d2> zzd;
    private int zze;
    private t4<e2> zzf = k4.E();
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        d2 d22;
        zzc = d22 = new d2();
        k4.w(d2.class, d22);
    }

    private d2() {
    }

    private final void L(e2 e22) {
        e22.getClass();
        t4<e2> t42 = this.zzf;
        if (!t42.c()) {
            this.zzf = k4.s(t42);
        }
        this.zzf.add(e22);
    }

    private final void M(String string) {
        string.getClass();
        this.zze |= 2;
        this.zzh = string;
    }

    public static b N() {
        return (b)zzc.z();
    }

    public final e2 I(int n8) {
        return (e2)this.zzf.get(0);
    }

    public final String P() {
        return this.zzh;
    }

    public final List<e2> Q() {
        return this.zzf;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzf.size();
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
                synchronized (d2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<d2>(zzc);
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
                return k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007\u1008\u0000\b\u1008\u0001\t\u180c\u0002", new Object[]{"zze", "zzf", e2.class, "zzg", "zzh", "zzi", a8});
            }
            case 2: {
                return new b(null);
            }
            case 1: 
        }
        return new d2();
    }

    public static final class a
    extends Enum<a>
    implements p4 {
        private static final /* enum */ a c0;
        private static final /* enum */ a d0;
        private static final a[] e0;
        private final int q;

        static {
            a a8;
            a a9;
            c0 = a9 = new a(0);
            d0 = a8 = new a(1);
            e0 = new a[]{a9, a8};
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a d(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    return null;
                }
                return d0;
            }
            return c0;
        }

        public static o4 h() {
            return m2.a;
        }

        public static a[] values() {
            return (a[])e0.clone();
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
    extends k4.b<d2, b>
    implements W4 {
        private b() {
            super(zzc);
        }

        /* synthetic */ b(k2 k22) {
            this();
        }

        public final int w() {
            return ((d2)this.c0).n();
        }

        public final b x(e2.a a8) {
            this.s();
            ((d2)this.c0).L((e2)((k4)a8.q()));
            return this;
        }

        public final b y(String string) {
            this.s();
            ((d2)this.c0).M(string);
            return this;
        }

        public final e2 z(int n8) {
            return ((d2)this.c0).I(0);
        }
    }
}

