package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1653r2 extends AbstractC1599k4<C1653r2, b> implements W4 {
    private static final C1653r2 zzc;
    private static volatile InterfaceC1537d5<C1653r2> zzd;
    private int zze;
    private int zzf;
    private InterfaceC1671t4<C1653r2> zzg = AbstractC1599k4.E();
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzj;
    private double zzk;

    /* renamed from: ax.b6.r2$a */
    public enum a implements InterfaceC1640p4 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STRING;
            }
            if (i == 2) {
                return NUMBER;
            }
            if (i == 3) {
                return BOOLEAN;
            }
            if (i != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static InterfaceC1632o4 h() {
            return C1677u2.a;
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

    /* renamed from: ax.b6.r2$b */
    public static final class b extends AbstractC1599k4.b<C1653r2, b> implements W4 {
        private b() {
            super(C1653r2.zzc);
        }

        /* synthetic */ b(C1661s2 c1661s2) {
            this();
        }
    }

    static {
        C1653r2 c1653r2 = new C1653r2();
        zzc = c1653r2;
        AbstractC1599k4.w(C1653r2.class, c1653r2);
    }

    private C1653r2() {
    }

    public final double I() {
        return this.zzk;
    }

    public final a J() {
        a d = a.d(this.zzf);
        return d == null ? a.UNKNOWN : d;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zzi;
    }

    public final List<C1653r2> N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 16) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1661s2 c1661s2 = null;
        switch (C1661s2.a[i - 1]) {
            case 1:
                return new C1653r2();
            case 2:
                return new b(c1661s2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", a.h(), "zzg", C1653r2.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1653r2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1653r2.class) {
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
