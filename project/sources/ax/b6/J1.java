package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class J1 extends AbstractC1599k4<J1, a> implements W4 {
    private static final J1 zzc;
    private static volatile InterfaceC1537d5<J1> zzd;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<N1> zzg = AbstractC1599k4.E();
    private boolean zzh;

    public static final class a extends AbstractC1599k4.b<J1, a> implements W4 {
        private a() {
            super(J1.zzc);
        }

        /* synthetic */ a(R1 r1) {
            this();
        }
    }

    static {
        J1 j1 = new J1();
        zzc = j1;
        AbstractC1599k4.w(J1.class, j1);
    }

    private J1() {
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
                return new J1();
            case 2:
                return new a(r1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", N1.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<J1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (J1.class) {
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
