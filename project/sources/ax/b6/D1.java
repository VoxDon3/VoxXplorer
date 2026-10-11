package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class D1 extends AbstractC1599k4<D1, b> implements W4 {
    private static final D1 zzc;
    private static volatile InterfaceC1537d5<D1> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;

    public enum a implements InterfaceC1640p4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static InterfaceC1632o4 h() {
            return H1.a;
        }

        @Override // ax.b6.InterfaceC1640p4
        public final int a() {
            return this.q;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.q + " name=" + name() + '>';
        }
    }

    public static final class b extends AbstractC1599k4.b<D1, b> implements W4 {
        private b() {
            super(D1.zzc);
        }

        /* synthetic */ b(G1 g1) {
            this();
        }
    }

    static {
        D1 d1 = new D1();
        zzc = d1;
        AbstractC1599k4.w(D1.class, d1);
    }

    private D1() {
    }

    public static D1 K() {
        return zzc;
    }

    public final a I() {
        a d = a.d(this.zzf);
        return d == null ? a.UNKNOWN_COMPARISON_TYPE : d;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zzj;
    }

    public final String N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final boolean S() {
        return (this.zze & 16) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        G1 g1 = null;
        switch (G1.a[i - 1]) {
            case 1:
                return new D1();
            case 2:
                return new b(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", a.h(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<D1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (D1.class) {
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
