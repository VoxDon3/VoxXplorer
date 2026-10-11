package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.C1561g2;

/* loaded from: classes3.dex */
public final class X1 extends AbstractC1599k4<X1, a> implements W4 {
    private static final X1 zzc;
    private static volatile InterfaceC1537d5<X1> zzd;
    private int zze;
    private int zzf;
    private C1561g2 zzg;
    private C1561g2 zzh;
    private boolean zzi;

    public static final class a extends AbstractC1599k4.b<X1, a> implements W4 {
        private a() {
            super(X1.zzc);
        }

        public final a w(int i) {
            s();
            ((X1) this.c0).I(i);
            return this;
        }

        public final a x(C1561g2.a aVar) {
            s();
            ((X1) this.c0).M((C1561g2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a y(C1561g2 c1561g2) {
            s();
            ((X1) this.c0).Q(c1561g2);
            return this;
        }

        public final a z(boolean z) {
            s();
            ((X1) this.c0).N(z);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        X1 x1 = new X1();
        zzc = x1;
        AbstractC1599k4.w(X1.class, x1);
    }

    private X1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(C1561g2 c1561g2) {
        c1561g2.getClass();
        this.zzg = c1561g2;
        this.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(boolean z) {
        this.zze |= 8;
        this.zzi = z;
    }

    public static a O() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(C1561g2 c1561g2) {
        c1561g2.getClass();
        this.zzh = c1561g2;
        this.zze |= 4;
    }

    public final C1561g2 S() {
        C1561g2 c1561g2 = this.zzg;
        return c1561g2 == null ? C1561g2.a0() : c1561g2;
    }

    public final C1561g2 T() {
        C1561g2 c1561g2 = this.zzh;
        return c1561g2 == null ? C1561g2.a0() : c1561g2;
    }

    public final boolean U() {
        return this.zzi;
    }

    public final boolean V() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 4) != 0;
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
                return new X1();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<X1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (X1.class) {
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
