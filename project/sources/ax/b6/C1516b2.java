package ax.b6;

import ax.b6.AbstractC1599k4;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.b2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1516b2 extends AbstractC1599k4<C1516b2, a> implements W4 {
    private static final C1516b2 zzc;
    private static volatile InterfaceC1537d5<C1516b2> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<C1516b2> zzk = AbstractC1599k4.E();

    /* renamed from: ax.b6.b2$a */
    public static final class a extends AbstractC1599k4.b<C1516b2, a> implements W4 {
        private a() {
            super(C1516b2.zzc);
        }

        public final a B(Iterable<? extends C1516b2> iterable) {
            s();
            ((C1516b2) this.c0).R(iterable);
            return this;
        }

        public final a C(String str) {
            s();
            ((C1516b2) this.c0).S(str);
            return this;
        }

        public final a D() {
            s();
            ((C1516b2) this.c0).n0();
            return this;
        }

        public final a E(String str) {
            s();
            ((C1516b2) this.c0).X(str);
            return this;
        }

        public final a F() {
            s();
            ((C1516b2) this.c0).o0();
            return this;
        }

        public final a G() {
            s();
            ((C1516b2) this.c0).p0();
            return this;
        }

        public final a H() {
            s();
            ((C1516b2) this.c0).q0();
            return this;
        }

        public final String I() {
            return ((C1516b2) this.c0).f0();
        }

        public final String J() {
            return ((C1516b2) this.c0).g0();
        }

        public final int w() {
            return ((C1516b2) this.c0).Y();
        }

        public final a x(double d) {
            s();
            ((C1516b2) this.c0).J(d);
            return this;
        }

        public final a y(long j) {
            s();
            ((C1516b2) this.c0).K(j);
            return this;
        }

        public final a z(a aVar) {
            s();
            ((C1516b2) this.c0).d0((C1516b2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1516b2 c1516b2 = new C1516b2();
        zzc = c1516b2;
        AbstractC1599k4.w(C1516b2.class, c1516b2);
    }

    private C1516b2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(double d) {
        this.zze |= 16;
        this.zzj = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(long j) {
        this.zze |= 4;
        this.zzh = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(Iterable<? extends C1516b2> iterable) {
        r0();
        AbstractC1647q3.g(iterable, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a c0() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(C1516b2 c1516b2) {
        c1516b2.getClass();
        r0();
        this.zzk.add(c1516b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        this.zze &= -5;
        this.zzh = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        this.zzk = AbstractC1599k4.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    private final void r0() {
        InterfaceC1671t4<C1516b2> interfaceC1671t4 = this.zzk;
        if (interfaceC1671t4.c()) {
            return;
        }
        this.zzk = AbstractC1599k4.s(interfaceC1671t4);
    }

    public final double I() {
        return this.zzj;
    }

    public final float T() {
        return this.zzi;
    }

    public final int Y() {
        return this.zzk.size();
    }

    public final long a0() {
        return this.zzh;
    }

    public final String f0() {
        return this.zzf;
    }

    public final String g0() {
        return this.zzg;
    }

    public final List<C1516b2> h0() {
        return this.zzk;
    }

    public final boolean i0() {
        return (this.zze & 16) != 0;
    }

    public final boolean j0() {
        return (this.zze & 8) != 0;
    }

    public final boolean k0() {
        return (this.zze & 4) != 0;
    }

    public final boolean l0() {
        return (this.zze & 1) != 0;
    }

    public final boolean m0() {
        return (this.zze & 2) != 0;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1516b2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C1516b2.class});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1516b2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1516b2.class) {
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
