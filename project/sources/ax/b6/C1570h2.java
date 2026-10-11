package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;

/* renamed from: ax.b6.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1570h2 extends AbstractC1599k4<C1570h2, a> implements W4 {
    private static final C1570h2 zzc;
    private static volatile InterfaceC1537d5<C1570h2> zzd;
    private int zze;
    private int zzf;
    private InterfaceC1648q4 zzg = AbstractC1599k4.D();

    /* renamed from: ax.b6.h2$a */
    public static final class a extends AbstractC1599k4.b<C1570h2, a> implements W4 {
        private a() {
            super(C1570h2.zzc);
        }

        public final a w(int i) {
            s();
            ((C1570h2) this.c0).N(i);
            return this;
        }

        public final a x(Iterable<? extends Long> iterable) {
            s();
            ((C1570h2) this.c0).L(iterable);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1570h2 c1570h2 = new C1570h2();
        zzc = c1570h2;
        AbstractC1599k4.w(C1570h2.class, c1570h2);
    }

    private C1570h2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(Iterable<? extends Long> iterable) {
        InterfaceC1648q4 interfaceC1648q4 = this.zzg;
        if (!interfaceC1648q4.c()) {
            this.zzg = AbstractC1599k4.r(interfaceC1648q4);
        }
        AbstractC1647q3.g(iterable, this.zzg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i) {
        this.zze |= 1;
        this.zzf = i;
    }

    public static a O() {
        return zzc.z();
    }

    public final long I(int i) {
        return this.zzg.m(i);
    }

    public final int M() {
        return this.zzf;
    }

    public final List<Long> Q() {
        return this.zzg;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
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
                return new C1570h2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1570h2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1570h2.class) {
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
