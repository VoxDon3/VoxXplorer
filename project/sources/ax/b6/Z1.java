package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.C1516b2;
import j$.util.DesugarCollections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class Z1 extends AbstractC1599k4<Z1, a> implements W4 {
    private static final Z1 zzc;
    private static volatile InterfaceC1537d5<Z1> zzd;
    private int zze;
    private InterfaceC1671t4<C1516b2> zzf = AbstractC1599k4.E();
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzh;
    private long zzi;
    private int zzj;

    public static final class a extends AbstractC1599k4.b<Z1, a> implements W4 {
        private a() {
            super(Z1.zzc);
        }

        public final a B(long j) {
            s();
            ((Z1) this.c0).K(j);
            return this;
        }

        public final a C(C1516b2.a aVar) {
            s();
            ((Z1) this.c0).S((C1516b2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a D(C1516b2 c1516b2) {
            s();
            ((Z1) this.c0).S(c1516b2);
            return this;
        }

        public final a E(Iterable<? extends C1516b2> iterable) {
            s();
            ((Z1) this.c0).T(iterable);
            return this;
        }

        public final a F(String str) {
            s();
            ((Z1) this.c0).U(str);
            return this;
        }

        public final long G() {
            return ((Z1) this.c0).a0();
        }

        public final a H(long j) {
            s();
            ((Z1) this.c0).Y(j);
            return this;
        }

        public final C1516b2 I(int i) {
            return ((Z1) this.c0).I(i);
        }

        public final long J() {
            return ((Z1) this.c0).b0();
        }

        public final a K() {
            s();
            ((Z1) this.c0).j0();
            return this;
        }

        public final String L() {
            return ((Z1) this.c0).e0();
        }

        public final List<C1516b2> M() {
            return DesugarCollections.unmodifiableList(((Z1) this.c0).f0());
        }

        public final boolean N() {
            return ((Z1) this.c0).i0();
        }

        public final int w() {
            return ((Z1) this.c0).V();
        }

        public final a x(int i) {
            s();
            ((Z1) this.c0).X(i);
            return this;
        }

        public final a y(int i, C1516b2.a aVar) {
            s();
            ((Z1) this.c0).J(i, (C1516b2) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a z(int i, C1516b2 c1516b2) {
            s();
            ((Z1) this.c0).J(i, c1516b2);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        Z1 z1 = new Z1();
        zzc = z1;
        AbstractC1599k4.w(Z1.class, z1);
    }

    private Z1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, C1516b2 c1516b2) {
        c1516b2.getClass();
        k0();
        this.zzf.set(i, c1516b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(long j) {
        this.zze |= 4;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(C1516b2 c1516b2) {
        c1516b2.getClass();
        k0();
        this.zzf.add(c1516b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Iterable<? extends C1516b2> iterable) {
        k0();
        AbstractC1647q3.g(iterable, this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(int i) {
        k0();
        this.zzf.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(long j) {
        this.zze |= 2;
        this.zzh = j;
    }

    public static a c0() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        this.zzf = AbstractC1599k4.E();
    }

    private final void k0() {
        InterfaceC1671t4<C1516b2> interfaceC1671t4 = this.zzf;
        if (interfaceC1671t4.c()) {
            return;
        }
        this.zzf = AbstractC1599k4.s(interfaceC1671t4);
    }

    public final C1516b2 I(int i) {
        return this.zzf.get(i);
    }

    public final int V() {
        return this.zzf.size();
    }

    public final long a0() {
        return this.zzi;
    }

    public final long b0() {
        return this.zzh;
    }

    public final String e0() {
        return this.zzg;
    }

    public final List<C1516b2> f0() {
        return this.zzf;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 4) != 0;
    }

    public final boolean i0() {
        return (this.zze & 2) != 0;
    }

    public final int n() {
        return this.zzj;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new Z1();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C1516b2.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<Z1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (Z1.class) {
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
