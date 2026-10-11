package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;

/* renamed from: ax.b6.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1630o2 extends AbstractC1599k4<C1630o2, a> implements W4 {
    private static final C1630o2 zzc;
    private static volatile InterfaceC1537d5<C1630o2> zzd;
    private InterfaceC1671t4<C1638p2> zze = AbstractC1599k4.E();

    /* renamed from: ax.b6.o2$a */
    public static final class a extends AbstractC1599k4.b<C1630o2, a> implements W4 {
        private a() {
            super(C1630o2.zzc);
        }

        /* synthetic */ a(C1661s2 c1661s2) {
            this();
        }
    }

    static {
        C1630o2 c1630o2 = new C1630o2();
        zzc = c1630o2;
        AbstractC1599k4.w(C1630o2.class, c1630o2);
    }

    private C1630o2() {
    }

    public static C1630o2 J() {
        return zzc;
    }

    public final List<C1638p2> K() {
        return this.zze;
    }

    public final int n() {
        return this.zze.size();
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1661s2 c1661s2 = null;
        switch (C1661s2.a[i - 1]) {
            case 1:
                return new C1630o2();
            case 2:
                return new a(c1661s2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C1638p2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1630o2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1630o2.class) {
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
