package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;

/* renamed from: ax.b6.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1561g2 extends AbstractC1599k4<C1561g2, a> implements W4 {
    private static final C1561g2 zzc;
    private static volatile InterfaceC1537d5<C1561g2> zzd;
    private InterfaceC1648q4 zze = AbstractC1599k4.D();
    private InterfaceC1648q4 zzf = AbstractC1599k4.D();
    private InterfaceC1671t4<Y1> zzg = AbstractC1599k4.E();
    private InterfaceC1671t4<C1570h2> zzh = AbstractC1599k4.E();

    /* renamed from: ax.b6.g2$a */
    public static final class a extends AbstractC1599k4.b<C1561g2, a> implements W4 {
        private a() {
            super(C1561g2.zzc);
        }

        public final a B() {
            s();
            ((C1561g2) this.c0).h0();
            return this;
        }

        public final a C(Iterable<? extends C1570h2> iterable) {
            s();
            ((C1561g2) this.c0).S(iterable);
            return this;
        }

        public final a D() {
            s();
            ((C1561g2) this.c0).i0();
            return this;
        }

        public final a E(Iterable<? extends Long> iterable) {
            s();
            ((C1561g2) this.c0).X(iterable);
            return this;
        }

        public final a w() {
            s();
            ((C1561g2) this.c0).f0();
            return this;
        }

        public final a x(Iterable<? extends Y1> iterable) {
            s();
            ((C1561g2) this.c0).K(iterable);
            return this;
        }

        public final a y() {
            s();
            ((C1561g2) this.c0).g0();
            return this;
        }

        public final a z(Iterable<? extends Long> iterable) {
            s();
            ((C1561g2) this.c0).O(iterable);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1561g2 c1561g2 = new C1561g2();
        zzc = c1561g2;
        AbstractC1599k4.w(C1561g2.class, c1561g2);
    }

    private C1561g2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Iterable<? extends Y1> iterable) {
        InterfaceC1671t4<Y1> interfaceC1671t4 = this.zzg;
        if (!interfaceC1671t4.c()) {
            this.zzg = AbstractC1599k4.s(interfaceC1671t4);
        }
        AbstractC1647q3.g(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(Iterable<? extends Long> iterable) {
        InterfaceC1648q4 interfaceC1648q4 = this.zzf;
        if (!interfaceC1648q4.c()) {
            this.zzf = AbstractC1599k4.r(interfaceC1648q4);
        }
        AbstractC1647q3.g(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(Iterable<? extends C1570h2> iterable) {
        InterfaceC1671t4<C1570h2> interfaceC1671t4 = this.zzh;
        if (!interfaceC1671t4.c()) {
            this.zzh = AbstractC1599k4.s(interfaceC1671t4);
        }
        AbstractC1647q3.g(iterable, this.zzh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(Iterable<? extends Long> iterable) {
        InterfaceC1648q4 interfaceC1648q4 = this.zze;
        if (!interfaceC1648q4.c()) {
            this.zze = AbstractC1599k4.r(interfaceC1648q4);
        }
        AbstractC1647q3.g(iterable, this.zze);
    }

    public static a Y() {
        return zzc.z();
    }

    public static C1561g2 a0() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzg = AbstractC1599k4.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        this.zzf = AbstractC1599k4.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        this.zzh = AbstractC1599k4.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        this.zze = AbstractC1599k4.D();
    }

    public final int L() {
        return this.zzf.size();
    }

    public final int P() {
        return this.zzh.size();
    }

    public final int T() {
        return this.zze.size();
    }

    public final List<Y1> b0() {
        return this.zzg;
    }

    public final List<Long> c0() {
        return this.zzf;
    }

    public final List<C1570h2> d0() {
        return this.zzh;
    }

    public final List<Long> e0() {
        return this.zze;
    }

    public final int n() {
        return this.zzg.size();
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1561g2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", Y1.class, "zzh", C1570h2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1561g2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1561g2.class) {
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
