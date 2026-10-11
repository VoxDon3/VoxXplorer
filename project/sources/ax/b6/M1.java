package ax.b6;

import ax.b6.AbstractC1599k4;

/* loaded from: classes3.dex */
public final class M1 extends AbstractC1599k4<M1, a> implements W4 {
    private static final M1 zzc;
    private static volatile InterfaceC1537d5<M1> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    public static final class a extends AbstractC1599k4.b<M1, a> implements W4 {
        private a() {
            super(M1.zzc);
        }

        /* synthetic */ a(R1 r1) {
            this();
        }
    }

    static {
        M1 m1 = new M1();
        zzc = m1;
        AbstractC1599k4.w(M1.class, m1);
    }

    private M1() {
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        R1 r1 = null;
        switch (R1.a[i - 1]) {
            case 1:
                return new M1();
            case 2:
                return new a(r1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<M1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (M1.class) {
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
