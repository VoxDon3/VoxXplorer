/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.W4;
import ax.b6.a2;
import ax.b6.d5;
import ax.b6.k2;
import ax.b6.k4;
import ax.b6.n2;
import ax.b6.o4;
import ax.b6.p4;
import ax.b6.t4;

public final class f2
extends k4<f2, b>
implements W4 {
    private static final f2 zzc;
    private static volatile d5<f2> zzd;
    private int zze;
    private int zzf = 1;
    private t4<a2> zzg = k4.E();

    static {
        f2 f22;
        zzc = f22 = new f2();
        k4.w(f2.class, f22);
    }

    private f2() {
    }

    public static b I() {
        return (b)zzc.z();
    }

    private final void J(a2 a22) {
        a22.getClass();
        t4<a2> t42 = this.zzg;
        if (!t42.c()) {
            this.zzg = k4.s(t42);
        }
        this.zzg.add(a22);
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
                synchronized (f2.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<f2>(zzc);
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
                return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u180c\u0000\u0002\u001b", new Object[]{"zze", "zzf", a8, "zzg", a2.class});
            }
            case 2: {
                return new b(null);
            }
            case 1: 
        }
        return new f2();
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
            c0 = a9 = new a(1);
            d0 = a8 = new a(2);
            e0 = new a[]{a9, a8};
        }

        private a(int n9) {
            this.q = n9;
        }

        public static a d(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return null;
                }
                return d0;
            }
            return c0;
        }

        public static o4 h() {
            return n2.a;
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
    extends k4.b<f2, b>
    implements W4 {
        private b() {
            super(zzc);
        }

        /* synthetic */ b(k2 k22) {
            this();
        }

        public final b w(a2.a a8) {
            this.s();
            ((f2)this.c0).J((a2)((k4)a8.q()));
            return this;
        }
    }
}

