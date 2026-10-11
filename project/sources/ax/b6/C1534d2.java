package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.C1543e2;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1534d2 extends AbstractC1599k4<C1534d2, b> implements W4 {
    private static final C1534d2 zzc;
    private static volatile InterfaceC1537d5<C1534d2> zzd;
    private int zze;
    private InterfaceC1671t4<C1543e2> zzf = AbstractC1599k4.E();
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzi;

    /* renamed from: ax.b6.d2$a */
    public enum a implements InterfaceC1640p4 {
        SDK(0),
        SGTM(1);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            if (i == 0) {
                return SDK;
            }
            if (i != 1) {
                return null;
            }
            return SGTM;
        }

        public static InterfaceC1632o4 h() {
            return C1614m2.a;
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

    /* renamed from: ax.b6.d2$b */
    public static final class b extends AbstractC1599k4.b<C1534d2, b> implements W4 {
        private b() {
            super(C1534d2.zzc);
        }

        public final int w() {
            return ((C1534d2) this.c0).n();
        }

        public final b x(C1543e2.a aVar) {
            s();
            ((C1534d2) this.c0).L((C1543e2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final b y(String str) {
            s();
            ((C1534d2) this.c0).M(str);
            return this;
        }

        public final C1543e2 z(int i) {
            return ((C1534d2) this.c0).I(0);
        }

        /* synthetic */ b(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1534d2 c1534d2 = new C1534d2();
        zzc = c1534d2;
        AbstractC1599k4.w(C1534d2.class, c1534d2);
    }

    private C1534d2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(C1543e2 c1543e2) {
        c1543e2.getClass();
        InterfaceC1671t4<C1543e2> interfaceC1671t4 = this.zzf;
        if (!interfaceC1671t4.c()) {
            this.zzf = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzf.add(c1543e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzh = str;
    }

    public static b N() {
        return zzc.z();
    }

    public final C1543e2 I(int i) {
        return this.zzf.get(0);
    }

    public final String P() {
        return this.zzh;
    }

    public final List<C1543e2> Q() {
        return this.zzf;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzf.size();
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1534d2();
            case 2:
                return new b(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C1543e2.class, "zzg", "zzh", "zzi", a.h()});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1534d2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1534d2.class) {
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
