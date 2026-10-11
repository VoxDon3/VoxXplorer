/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R1;
import ax.b6.S1;
import ax.b6.T1;
import ax.b6.W4;
import ax.b6.d5;
import ax.b6.k4;
import ax.b6.o4;
import ax.b6.p4;
import ax.b6.t4;
import java.util.List;

public final class I1
extends k4<I1, b>
implements W4 {
    private static final I1 zzc;
    private static volatile d5<I1> zzd;
    private int zze;
    private t4<a> zzf = k4.E();
    private t4<c> zzg = k4.E();
    private t4<f> zzh = k4.E();
    private boolean zzi;
    private t4<a> zzj = k4.E();

    static {
        I1 i12;
        zzc = i12 = new I1();
        k4.w(I1.class, i12);
    }

    private I1() {
    }

    public static I1 J() {
        return zzc;
    }

    public final List<f> K() {
        return this.zzh;
    }

    public final List<a> L() {
        return this.zzf;
    }

    public final List<c> M() {
        return this.zzg;
    }

    public final List<a> N() {
        return this.zzj;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
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
                synchronized (I1.class) {
                    try {
                        d52 = zzd;
                        a8 = d52;
                        if (d52 == null) {
                            a8 = new k4.a<I1>(zzc);
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
                return k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u1007\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            }
            case 2: {
                return new b(null);
            }
            case 1: 
        }
        return new I1();
    }

    public static final class ax.b6.I1$a
    extends k4<ax.b6.I1$a, a>
    implements W4 {
        private static final ax.b6.I1$a zzc;
        private static volatile d5<ax.b6.I1$a> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        static {
            ax.b6.I1$a a8;
            zzc = a8 = new ax.b6.I1$a();
            k4.w(ax.b6.I1$a.class, a8);
        }

        private ax.b6.I1$a() {
        }

        public final d J() {
            d d8;
            d d9 = d8 = d.d(this.zzg);
            if (d8 == null) {
                d9 = d.c0;
            }
            return d9;
        }

        public final e K() {
            e e8;
            e e9 = e8 = e.d(this.zzf);
            if (e8 == null) {
                e9 = e.c0;
            }
            return e9;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected final Object t(int n8, Object a8, Object a9) {
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
                    synchronized (ax.b6.I1$a.class) {
                        try {
                            a8 = a9 = zzd;
                            if (a9 == null) {
                                a8 = new k4.a<ax.b6.I1$a>(zzc);
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
                    a9 = e.h();
                    a8 = d.h();
                    return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[]{"zze", "zzf", a9, "zzg", a8});
                }
                case 2: {
                    return new a(null);
                }
                case 1: 
            }
            return new ax.b6.I1$a();
        }

        public static final class a
        extends k4.b<ax.b6.I1$a, a>
        implements W4 {
            private a() {
                super(zzc);
            }

            /* synthetic */ a(R1 r12) {
                this();
            }
        }
    }

    public static final class b
    extends k4.b<I1, b>
    implements W4 {
        private b() {
            super(zzc);
        }

        /* synthetic */ b(R1 r12) {
            this();
        }
    }

    public static final class c
    extends k4<c, a>
    implements W4 {
        private static final c zzc;
        private static volatile d5<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        static {
            c c8;
            zzc = c8 = new c();
            k4.w(c.class, c8);
        }

        private c() {
        }

        public final e J() {
            e e8;
            e e9 = e8 = e.d(this.zzg);
            if (e8 == null) {
                e9 = e.c0;
            }
            return e9;
        }

        public final e K() {
            e e8;
            e e9 = e8 = e.d(this.zzf);
            if (e8 == null) {
                e9 = e.c0;
            }
            return e9;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected final Object t(int n8, Object a8, Object a9) {
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
                    synchronized (c.class) {
                        try {
                            a8 = a9 = zzd;
                            if (a9 == null) {
                                a8 = new k4.a<c>(zzc);
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
                    a8 = e.h();
                    a9 = e.h();
                    return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", new Object[]{"zze", "zzf", a8, "zzg", a9});
                }
                case 2: {
                    return new a(null);
                }
                case 1: 
            }
            return new c();
        }

        public static final class a
        extends k4.b<c, a>
        implements W4 {
            private a() {
                super(zzc);
            }

            /* synthetic */ a(R1 r12) {
                this();
            }
        }
    }

    public static final class d
    extends Enum<d>
    implements p4 {
        public static final /* enum */ d c0;
        public static final /* enum */ d d0;
        public static final /* enum */ d e0;
        private static final d[] f0;
        private final int q;

        static {
            d d8;
            d d9;
            d d10;
            c0 = d10 = new d(0);
            d0 = d9 = new d(1);
            e0 = d8 = new d(2);
            f0 = new d[]{d10, d9, d8};
        }

        private d(int n9) {
            this.q = n9;
        }

        public static d d(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return null;
                    }
                    return e0;
                }
                return d0;
            }
            return c0;
        }

        public static o4 h() {
            return S1.a;
        }

        public static d[] values() {
            return (d[])f0.clone();
        }

        @Override
        public final int a() {
            return this.q;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(d.class.getName());
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

    public static final class e
    extends Enum<e>
    implements p4 {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        public static final /* enum */ e e0;
        public static final /* enum */ e f0;
        public static final /* enum */ e g0;
        private static final e[] h0;
        private final int q;

        static {
            e e8;
            e e9;
            e e10;
            e e11;
            e e12;
            c0 = e12 = new e(0);
            d0 = e11 = new e(1);
            e0 = e10 = new e(2);
            f0 = e9 = new e(3);
            g0 = e8 = new e(4);
            h0 = new e[]{e12, e11, e10, e9, e8};
        }

        private e(int n9) {
            this.q = n9;
        }

        public static e d(int n8) {
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
            return T1.a;
        }

        public static e[] values() {
            return (e[])h0.clone();
        }

        @Override
        public final int a() {
            return this.q;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("<");
            stringBuilder.append(e.class.getName());
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

    public static final class f
    extends k4<f, a>
    implements W4 {
        private static final f zzc;
        private static volatile d5<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        static {
            f f8;
            zzc = f8 = new f();
            k4.w(f.class, f8);
        }

        private f() {
        }

        public final String J() {
            return this.zzf;
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
                    synchronized (f.class) {
                        try {
                            d52 = zzd;
                            a8 = d52;
                            if (d52 == null) {
                                a8 = new k4.a<f>(zzc);
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
                    return k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[]{"zze", "zzf", "zzg"});
                }
                case 2: {
                    return new a(null);
                }
                case 1: 
            }
            return new f();
        }

        public static final class a
        extends k4.b<f, a>
        implements W4 {
            private a() {
                super(zzc);
            }

            /* synthetic */ a(R1 r12) {
                this();
            }
        }
    }
}

