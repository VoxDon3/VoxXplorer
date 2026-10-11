package ax.b6;

import ax.b6.AbstractC1599k4;

/* loaded from: classes3.dex */
public final class W1 extends AbstractC1599k4<W1, a> implements W4 {
    private static final W1 zzc;
    private static volatile InterfaceC1537d5<W1> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    public static final class a extends AbstractC1599k4.b<W1, a> implements W4 {
        private a() {
            super(W1.zzc);
        }

        public final a B(boolean z) {
            s();
            ((W1) this.c0).V(z);
            return this;
        }

        public final a C(boolean z) {
            s();
            ((W1) this.c0).Z(z);
            return this;
        }

        public final a D(boolean z) {
            s();
            ((W1) this.c0).c0(z);
            return this;
        }

        public final a w(boolean z) {
            s();
            ((W1) this.c0).K(z);
            return this;
        }

        public final a x(boolean z) {
            s();
            ((W1) this.c0).N(z);
            return this;
        }

        public final a y(boolean z) {
            s();
            ((W1) this.c0).Q(z);
            return this;
        }

        public final a z(boolean z) {
            s();
            ((W1) this.c0).S(z);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        W1 w1 = new W1();
        zzc = w1;
        AbstractC1599k4.w(W1.class, w1);
    }

    private W1() {
    }

    public static a I() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(boolean z) {
        this.zze |= 32;
        this.zzk = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean z) {
        this.zze |= 16;
        this.zzj = z;
    }

    public static W1 O() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(boolean z) {
        this.zze |= 1;
        this.zzf = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(boolean z) {
        this.zze |= 64;
        this.zzl = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(boolean z) {
        this.zze |= 2;
        this.zzg = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(boolean z) {
        this.zze |= 4;
        this.zzh = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final boolean X() {
        return this.zzj;
    }

    public final boolean a0() {
        return this.zzf;
    }

    public final boolean d0() {
        return this.zzl;
    }

    public final boolean e0() {
        return this.zzg;
    }

    public final boolean f0() {
        return this.zzh;
    }

    public final boolean g0() {
        return this.zzi;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new W1();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<W1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (W1.class) {
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
