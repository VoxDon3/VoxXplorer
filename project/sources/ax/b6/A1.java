package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.B1;
import ax.b6.E1;
import java.util.List;

/* loaded from: classes3.dex */
public final class A1 extends AbstractC1599k4<A1, a> implements W4 {
    private static final A1 zzc;
    private static volatile InterfaceC1537d5<A1> zzd;
    private int zze;
    private int zzf;
    private InterfaceC1671t4<E1> zzg = AbstractC1599k4.E();
    private InterfaceC1671t4<B1> zzh = AbstractC1599k4.E();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends AbstractC1599k4.b<A1, a> implements W4 {
        private a() {
            super(A1.zzc);
        }

        public final int B() {
            return ((A1) this.c0).P();
        }

        public final E1 C(int i) {
            return ((A1) this.c0).O(i);
        }

        public final int w() {
            return ((A1) this.c0).N();
        }

        public final a x(int i, B1.a aVar) {
            s();
            ((A1) this.c0).J(i, (B1) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a y(int i, E1.a aVar) {
            s();
            ((A1) this.c0).K(i, (E1) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final B1 z(int i) {
            return ((A1) this.c0).I(i);
        }

        /* synthetic */ a(G1 g1) {
            this();
        }
    }

    static {
        A1 a1 = new A1();
        zzc = a1;
        AbstractC1599k4.w(A1.class, a1);
    }

    private A1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, B1 b1) {
        b1.getClass();
        InterfaceC1671t4<B1> interfaceC1671t4 = this.zzh;
        if (!interfaceC1671t4.c()) {
            this.zzh = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzh.set(i, b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i, E1 e1) {
        e1.getClass();
        InterfaceC1671t4<E1> interfaceC1671t4 = this.zzg;
        if (!interfaceC1671t4.c()) {
            this.zzg = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzg.set(i, e1);
    }

    public final B1 I(int i) {
        return this.zzh.get(i);
    }

    public final int N() {
        return this.zzh.size();
    }

    public final E1 O(int i) {
        return this.zzg.get(i);
    }

    public final int P() {
        return this.zzg.size();
    }

    public final List<B1> R() {
        return this.zzh;
    }

    public final List<E1> S() {
        return this.zzg;
    }

    public final boolean T() {
        return (this.zze & 1) != 0;
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
                return new A1();
            case 2:
                return new a(g1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", E1.class, "zzh", B1.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<A1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (A1.class) {
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
