package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.c2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1525c2 extends AbstractC1599k4<C1525c2, a> implements W4 {
    private static final C1525c2 zzc;
    private static volatile InterfaceC1537d5<C1525c2> zzd;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private V1 zzh;

    /* renamed from: ax.b6.c2$a */
    public static final class a extends AbstractC1599k4.b<C1525c2, a> implements W4 {
        private a() {
            super(C1525c2.zzc);
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1525c2 c1525c2 = new C1525c2();
        zzc = c1525c2;
        AbstractC1599k4.w(C1525c2.class, c1525c2);
    }

    private C1525c2() {
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1525c2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1525c2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1525c2.class) {
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
