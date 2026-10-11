package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class K1 extends AbstractC1599k4<K1, a> implements W4 {
    private static final K1 zzc;
    private static volatile InterfaceC1537d5<K1> zzd;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends AbstractC1599k4.b<K1, a> implements W4 {
        private a() {
            super(K1.zzc);
        }

        public final boolean B() {
            return ((K1) this.c0).N();
        }

        public final boolean C() {
            return ((K1) this.c0).O();
        }

        public final boolean D() {
            return ((K1) this.c0).P();
        }

        public final boolean E() {
            return ((K1) this.c0).Q();
        }

        public final int w() {
            return ((K1) this.c0).n();
        }

        public final a x(String str) {
            s();
            ((K1) this.c0).J(str);
            return this;
        }

        public final String y() {
            return ((K1) this.c0).L();
        }

        public final boolean z() {
            return ((K1) this.c0).M();
        }

        /* synthetic */ a(R1 r1) {
            this();
        }
    }

    static {
        K1 k1 = new K1();
        zzc = k1;
        AbstractC1599k4.w(K1.class, k1);
    }

    private K1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String L() {
        return this.zzf;
    }

    public final boolean M() {
        return this.zzg;
    }

    public final boolean N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final int n() {
        return this.zzi;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        R1 r1 = null;
        switch (R1.a[i - 1]) {
            case 1:
                return new K1();
            case 2:
                return new a(r1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<K1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (K1.class) {
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
