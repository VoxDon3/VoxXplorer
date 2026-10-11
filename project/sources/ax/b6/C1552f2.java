package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.C1507a2;

/* renamed from: ax.b6.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552f2 extends AbstractC1599k4<C1552f2, b> implements W4 {
    private static final C1552f2 zzc;
    private static volatile InterfaceC1537d5<C1552f2> zzd;
    private int zze;
    private int zzf = 1;
    private InterfaceC1671t4<C1507a2> zzg = AbstractC1599k4.E();

    /* renamed from: ax.b6.f2$a */
    public enum a implements InterfaceC1640p4 {
        RADS(1),
        PROVISIONING(2);

        private final int q;

        a(int i) {
            this.q = i;
        }

        public static a d(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static InterfaceC1632o4 h() {
            return C1622n2.a;
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

    /* renamed from: ax.b6.f2$b */
    public static final class b extends AbstractC1599k4.b<C1552f2, b> implements W4 {
        private b() {
            super(C1552f2.zzc);
        }

        public final b w(C1507a2.a aVar) {
            s();
            ((C1552f2) this.c0).J((C1507a2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        /* synthetic */ b(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1552f2 c1552f2 = new C1552f2();
        zzc = c1552f2;
        AbstractC1599k4.w(C1552f2.class, c1552f2);
    }

    private C1552f2() {
    }

    public static b I() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(C1507a2 c1507a2) {
        c1507a2.getClass();
        InterfaceC1671t4<C1507a2> interfaceC1671t4 = this.zzg;
        if (!interfaceC1671t4.c()) {
            this.zzg = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzg.add(c1507a2);
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1552f2();
            case 2:
                return new b(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.h(), "zzg", C1507a2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1552f2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1552f2.class) {
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
