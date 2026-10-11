package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class B1 extends AbstractC1599k4<B1, a> implements W4 {
    private static final B1 zzc;
    private static volatile InterfaceC1537d5<B1> zzd;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<C1> zzh = AbstractC1599k4.E();
    private boolean zzi;
    private D1 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends AbstractC1599k4.b<B1, a> implements W4 {
        private a() {
            super(B1.zzc);
        }

        public final String B() {
            return ((B1) this.c0).R();
        }

        public final int w() {
            return ((B1) this.c0).n();
        }

        public final a x(int i, C1 c1) {
            s();
            ((B1) this.c0).J(i, c1);
            return this;
        }

        public final a y(String str) {
            s();
            ((B1) this.c0).M(str);
            return this;
        }

        public final C1 z(int i) {
            return ((B1) this.c0).I(i);
        }

        /* synthetic */ a(G1 g1) {
            this();
        }
    }

    static {
        B1 b1 = new B1();
        zzc = b1;
        AbstractC1599k4.w(B1.class, b1);
    }

    private B1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, C1 c1) {
        c1.getClass();
        InterfaceC1671t4<C1> interfaceC1671t4 = this.zzh;
        if (!interfaceC1671t4.c()) {
            this.zzh = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzh.set(i, c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a O() {
        return zzc.z();
    }

    public final C1 I(int i) {
        return this.zzh.get(i);
    }

    public final int N() {
        return this.zzf;
    }

    public final D1 Q() {
        D1 d1 = this.zzj;
        return d1 == null ? D1.K() : d1;
    }

    public final String R() {
        return this.zzg;
    }

    public final List<C1> S() {
        return this.zzh;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final boolean U() {
        return this.zzl;
    }

    public final boolean V() {
        return this.zzm;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final boolean Z() {
        return (this.zze & 64) != 0;
    }

    public final int n() {
        return this.zzh.size();
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        G1 g1 = null;
        switch (G1.a[i - 1]) {
            case 1:
                return new B1();
            case 2:
                return new a(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C1.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<B1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (B1.class) {
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
