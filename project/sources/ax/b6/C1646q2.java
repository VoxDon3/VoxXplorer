package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;

/* renamed from: ax.b6.q2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1646q2 extends AbstractC1599k4<C1646q2, a> implements W4 {
    private static final C1646q2 zzc;
    private static volatile InterfaceC1537d5<C1646q2> zzd;
    private int zze;
    private InterfaceC1671t4<C1653r2> zzf = AbstractC1599k4.E();
    private C1630o2 zzg;

    /* renamed from: ax.b6.q2$a */
    public static final class a extends AbstractC1599k4.b<C1646q2, a> implements W4 {
        private a() {
            super(C1646q2.zzc);
        }

        /* synthetic */ a(C1661s2 c1661s2) {
            this();
        }
    }

    static {
        C1646q2 c1646q2 = new C1646q2();
        zzc = c1646q2;
        AbstractC1599k4.w(C1646q2.class, c1646q2);
    }

    private C1646q2() {
    }

    public final C1630o2 I() {
        C1630o2 c1630o2 = this.zzg;
        return c1630o2 == null ? C1630o2.J() : c1630o2;
    }

    public final List<C1653r2> K() {
        return this.zzf;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1661s2 c1661s2 = null;
        switch (C1661s2.a[i - 1]) {
            case 1:
                return new C1646q2();
            case 2:
                return new a(c1661s2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C1653r2.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1646q2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1646q2.class) {
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
