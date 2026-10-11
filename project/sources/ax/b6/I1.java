package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class I1 extends AbstractC1599k4<I1, b> implements W4 {
    private static final I1 zzc;
    private static volatile InterfaceC1537d5<I1> zzd;
    private int zze;
    private boolean zzi;
    private InterfaceC1671t4<a> zzf = AbstractC1599k4.E();
    private InterfaceC1671t4<c> zzg = AbstractC1599k4.E();
    private InterfaceC1671t4<f> zzh = AbstractC1599k4.E();
    private InterfaceC1671t4<a> zzj = AbstractC1599k4.E();

    public static final class a extends AbstractC1599k4<a, C0260a> implements W4 {
        private static final a zzc;
        private static volatile InterfaceC1537d5<a> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* renamed from: ax.b6.I1$a$a, reason: collision with other inner class name */
        public static final class C0260a extends AbstractC1599k4.b<a, C0260a> implements W4 {
            private C0260a() {
                super(a.zzc);
            }

            /* synthetic */ C0260a(R1 r1) {
                this();
            }
        }

        static {
            a aVar = new a();
            zzc = aVar;
            AbstractC1599k4.w(a.class, aVar);
        }

        private a() {
        }

        public final d J() {
            d d = d.d(this.zzg);
            return d == null ? d.CONSENT_STATUS_UNSPECIFIED : d;
        }

        public final e K() {
            e d = e.d(this.zzf);
            return d == null ? e.CONSENT_TYPE_UNSPECIFIED : d;
        }

        @Override // ax.b6.AbstractC1599k4
        protected final Object t(int i, Object obj, Object obj2) {
            InterfaceC1537d5 interfaceC1537d5;
            R1 r1 = null;
            switch (R1.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0260a(r1);
                case 3:
                    return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.h(), "zzg", d.h()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1537d5<a> interfaceC1537d52 = zzd;
                    if (interfaceC1537d52 != null) {
                        return interfaceC1537d52;
                    }
                    synchronized (a.class) {
                        try {
                            interfaceC1537d5 = zzd;
                            if (interfaceC1537d5 == null) {
                                interfaceC1537d5 = new AbstractC1599k4.a(zzc);
                                zzd = interfaceC1537d5;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC1537d5;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends AbstractC1599k4.b<I1, b> implements W4 {
        private b() {
            super(I1.zzc);
        }

        /* synthetic */ b(R1 r1) {
            this();
        }
    }

    public static final class c extends AbstractC1599k4<c, a> implements W4 {
        private static final c zzc;
        private static volatile InterfaceC1537d5<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends AbstractC1599k4.b<c, a> implements W4 {
            private a() {
                super(c.zzc);
            }

            /* synthetic */ a(R1 r1) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            AbstractC1599k4.w(c.class, cVar);
        }

        private c() {
        }

        public final e J() {
            e d = e.d(this.zzg);
            return d == null ? e.CONSENT_TYPE_UNSPECIFIED : d;
        }

        public final e K() {
            e d = e.d(this.zzf);
            return d == null ? e.CONSENT_TYPE_UNSPECIFIED : d;
        }

        @Override // ax.b6.AbstractC1599k4
        protected final Object t(int i, Object obj, Object obj2) {
            InterfaceC1537d5 interfaceC1537d5;
            R1 r1 = null;
            switch (R1.a[i - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(r1);
                case 3:
                    return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.h(), "zzg", e.h()});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1537d5<c> interfaceC1537d52 = zzd;
                    if (interfaceC1537d52 != null) {
                        return interfaceC1537d52;
                    }
                    synchronized (c.class) {
                        try {
                            interfaceC1537d5 = zzd;
                            if (interfaceC1537d5 == null) {
                                interfaceC1537d5 = new AbstractC1599k4.a(zzc);
                                zzd = interfaceC1537d5;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC1537d5;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public enum d implements InterfaceC1640p4 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);

        private final int q;

        d(int i) {
            this.q = i;
        }

        public static d d(int i) {
            if (i == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return GRANTED;
            }
            if (i != 2) {
                return null;
            }
            return DENIED;
        }

        public static InterfaceC1632o4 h() {
            return S1.a;
        }

        @Override // ax.b6.InterfaceC1640p4
        public final int a() {
            return this.q;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.q + " name=" + name() + '>';
        }
    }

    public enum e implements InterfaceC1640p4 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);

        private final int q;

        e(int i) {
            this.q = i;
        }

        public static e d(int i) {
            if (i == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return AD_STORAGE;
            }
            if (i == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i == 3) {
                return AD_USER_DATA;
            }
            if (i != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static InterfaceC1632o4 h() {
            return T1.a;
        }

        @Override // ax.b6.InterfaceC1640p4
        public final int a() {
            return this.q;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.q + " name=" + name() + '>';
        }
    }

    public static final class f extends AbstractC1599k4<f, a> implements W4 {
        private static final f zzc;
        private static volatile InterfaceC1537d5<f> zzd;
        private int zze;
        private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

        public static final class a extends AbstractC1599k4.b<f, a> implements W4 {
            private a() {
                super(f.zzc);
            }

            /* synthetic */ a(R1 r1) {
                this();
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            AbstractC1599k4.w(f.class, fVar);
        }

        private f() {
        }

        public final String J() {
            return this.zzf;
        }

        @Override // ax.b6.AbstractC1599k4
        protected final Object t(int i, Object obj, Object obj2) {
            InterfaceC1537d5 interfaceC1537d5;
            R1 r1 = null;
            switch (R1.a[i - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(r1);
                case 3:
                    return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    InterfaceC1537d5<f> interfaceC1537d52 = zzd;
                    if (interfaceC1537d52 != null) {
                        return interfaceC1537d52;
                    }
                    synchronized (f.class) {
                        try {
                            interfaceC1537d5 = zzd;
                            if (interfaceC1537d5 == null) {
                                interfaceC1537d5 = new AbstractC1599k4.a(zzc);
                                zzd = interfaceC1537d5;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return interfaceC1537d5;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        I1 i1 = new I1();
        zzc = i1;
        AbstractC1599k4.w(I1.class, i1);
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

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        R1 r1 = null;
        switch (R1.a[i - 1]) {
            case 1:
                return new I1();
            case 2:
                return new b(r1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", a.class, "zzg", c.class, "zzh", f.class, "zzi", "zzj", a.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<I1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (I1.class) {
                    try {
                        interfaceC1537d5 = zzd;
                        if (interfaceC1537d5 == null) {
                            interfaceC1537d5 = new AbstractC1599k4.a(zzc);
                            zzd = interfaceC1537d5;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC1537d5;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
