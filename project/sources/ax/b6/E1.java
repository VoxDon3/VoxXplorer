package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class E1 extends AbstractC1599k4<E1, a> implements W4 {
    private static final E1 zzc;
    private static volatile InterfaceC1537d5<E1> zzd;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private C1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends AbstractC1599k4.b<E1, a> implements W4 {
        private a() {
            super(E1.zzc);
        }

        public final a w(String str) {
            s();
            ((E1) this.c0).J(str);
            return this;
        }

        /* synthetic */ a(G1 g1) {
            this();
        }
    }

    static {
        E1 e1 = new E1();
        zzc = e1;
        AbstractC1599k4.w(E1.class, e1);
    }

    private E1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a L() {
        return zzc.z();
    }

    public final C1 K() {
        C1 c1 = this.zzh;
        return c1 == null ? C1.L() : c1;
    }

    public final String N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 32) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        G1 g1 = null;
        switch (G1.a[i - 1]) {
            case 1:
                return new E1();
            case 2:
                return new a(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<E1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (E1.class) {
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
