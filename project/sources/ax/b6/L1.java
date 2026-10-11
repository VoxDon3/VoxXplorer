package ax.b6;

import ax.b6.AbstractC1599k4;
import ax.b6.K1;
import j$.util.DesugarCollections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class L1 extends AbstractC1599k4<L1, a> implements W4 {
    private static final L1 zzc;
    private static volatile InterfaceC1537d5<L1> zzd;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private I1 zzr;
    private M1 zzs;
    private P1 zzt;
    private N1 zzu;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<O1> zzi = AbstractC1599k4.E();
    private InterfaceC1671t4<K1> zzj = AbstractC1599k4.E();
    private InterfaceC1671t4<A1> zzk = AbstractC1599k4.E();
    private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;
    private InterfaceC1671t4<C1646q2> zzn = AbstractC1599k4.E();
    private InterfaceC1671t4<J1> zzo = AbstractC1599k4.E();
    private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzq = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class a extends AbstractC1599k4.b<L1, a> implements W4 {
        private a() {
            super(L1.zzc);
        }

        public final String B() {
            return ((L1) this.c0).U();
        }

        public final List<A1> C() {
            return DesugarCollections.unmodifiableList(((L1) this.c0).V());
        }

        public final List<J1> D() {
            return DesugarCollections.unmodifiableList(((L1) this.c0).X());
        }

        public final int w() {
            return ((L1) this.c0).M();
        }

        public final K1 x(int i) {
            return ((L1) this.c0).I(i);
        }

        public final a y(int i, K1.a aVar) {
            s();
            ((L1) this.c0).J(i, (K1) ((AbstractC1599k4) aVar.q()));
            return this;
        }

        public final a z() {
            s();
            ((L1) this.c0).f0();
            return this;
        }

        /* synthetic */ a(R1 r1) {
            this();
        }
    }

    static {
        L1 l1 = new L1();
        zzc = l1;
        AbstractC1599k4.w(L1.class, l1);
    }

    private L1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i, K1 k1) {
        k1.getClass();
        InterfaceC1671t4<K1> interfaceC1671t4 = this.zzj;
        if (!interfaceC1671t4.c()) {
            this.zzj = AbstractC1599k4.s(interfaceC1671t4);
        }
        this.zzj.set(i, k1);
    }

    public static a P() {
        return zzc.z();
    }

    public static L1 R() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        this.zzk = AbstractC1599k4.E();
    }

    public final K1 I(int i) {
        return this.zzj.get(i);
    }

    public final int M() {
        return this.zzj.size();
    }

    public final long N() {
        return this.zzf;
    }

    public final I1 O() {
        I1 i1 = this.zzr;
        return i1 == null ? I1.J() : i1;
    }

    public final P1 S() {
        P1 p1 = this.zzt;
        return p1 == null ? P1.J() : p1;
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzp;
    }

    public final List<A1> V() {
        return this.zzk;
    }

    public final List<J1> X() {
        return this.zzo;
    }

    public final List<C1646q2> Y() {
        return this.zzn;
    }

    public final List<O1> Z() {
        return this.zzi;
    }

    public final boolean a0() {
        return this.zzm;
    }

    public final boolean b0() {
        return (this.zze & 128) != 0;
    }

    public final boolean c0() {
        return (this.zze & 2) != 0;
    }

    public final boolean d0() {
        return (this.zze & 512) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final int n() {
        return this.zzn.size();
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        R1 r1 = null;
        switch (R1.a[i - 1]) {
            case 1:
                return new L1();
            case 2:
                return new a(r1);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", K1.class, "zzk", A1.class, "zzl", "zzm", "zzn", C1646q2.class, "zzo", J1.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<L1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (L1.class) {
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
