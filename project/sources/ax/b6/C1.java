package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class C1 extends AbstractC1599k4<C1, a> implements W4 {
    private static final C1 zzc;
    private static volatile InterfaceC1537d5<C1> zzd;
    private int zze;
    private F1 zzf;
    private D1 zzg;
    private boolean zzh;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class a extends AbstractC1599k4.b<C1, a> implements W4 {
        private a() {
            super(C1.zzc);
        }

        public final a w(String str) {
            s();
            ((C1) this.c0).K(str);
            return this;
        }

        /* synthetic */ a(G1 g1) {
            this();
        }
    }

    static {
        C1 c1 = new C1();
        zzc = c1;
        AbstractC1599k4.w(C1.class, c1);
    }

    private C1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static C1 L() {
        return zzc;
    }

    public final D1 M() {
        D1 d1 = this.zzg;
        return d1 == null ? D1.K() : d1;
    }

    public final F1 N() {
        F1 f1 = this.zzf;
        return f1 == null ? F1.K() : f1;
    }

    public final String O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final boolean S() {
        return (this.zze & 8) != 0;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        G1 g1 = null;
        switch (G1.a[i - 1]) {
            case 1:
                return new C1();
            case 2:
                return new a(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1.class) {
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
