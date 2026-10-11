package ax.b6;

import ax.b6.AbstractC1599k4;

/* loaded from: classes3.dex */
public final class Y1 extends AbstractC1599k4<Y1, a> implements W4 {
    private static final Y1 zzc;
    private static volatile InterfaceC1537d5<Y1> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public static final class a extends AbstractC1599k4.b<Y1, a> implements W4 {
        private a() {
            super(Y1.zzc);
        }

        public final a w(int i) {
            s();
            ((Y1) this.c0).I(i);
            return this;
        }

        public final a x(long j) {
            s();
            ((Y1) this.c0).J(j);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        Y1 y1 = new Y1();
        zzc = y1;
        AbstractC1599k4.w(Y1.class, y1);
    }

    private Y1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    public static a N() {
        return zzc.z();
    }

    public final long M() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzf;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new Y1();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<Y1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (Y1.class) {
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
