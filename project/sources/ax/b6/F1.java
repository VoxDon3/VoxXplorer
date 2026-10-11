package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class F1 extends AbstractC1599k4<F1, b> implements W4 {
    private static final F1 zzc;
    private static volatile InterfaceC1537d5<F1> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<String> zzi = AbstractC1599k4.E();

    public enum a implements InterfaceC1640p4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static InterfaceC1632o4 h() {
            return Q1.a;
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

    public static final class b extends AbstractC1599k4.b<F1, b> implements W4 {
        private b() {
            super(F1.zzc);
        }

        /* synthetic */ b(G1 g1) {
            this();
        }
    }

    static {
        F1 f1 = new F1();
        zzc = f1;
        AbstractC1599k4.w(F1.class, f1);
    }

    private F1() {
    }

    public static F1 K() {
        return zzc;
    }

    public final a I() {
        a d = a.d(this.zzf);
        return d == null ? a.UNKNOWN_MATCH_TYPE : d;
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

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        G1 g1 = null;
        switch (G1.a[i - 1]) {
            case 1:
                return new F1();
            case 2:
                return new b(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.h(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<F1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (F1.class) {
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
