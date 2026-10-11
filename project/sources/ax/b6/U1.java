package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class U1 extends AbstractC1599k4<U1, a> implements W4 {
    private static final U1 zzc;
    private static volatile InterfaceC1537d5<U1> zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;

    public static final class a extends AbstractC1599k4.b<U1, a> implements W4 {
        private a() {
            super(U1.zzc);
        }

        public final a B(long j) {
            s();
            ((U1) this.c0).P(j);
            return this;
        }

        public final a C(String str) {
            s();
            ((U1) this.c0).T(str);
            return this;
        }

        public final a D() {
            s();
            ((U1) this.c0).q0();
            return this;
        }

        public final a E(String str) {
            s();
            ((U1) this.c0).Y(str);
            return this;
        }

        public final a F() {
            s();
            ((U1) this.c0).r0();
            return this;
        }

        public final a G(String str) {
            s();
            ((U1) this.c0).c0(str);
            return this;
        }

        public final a H() {
            s();
            ((U1) this.c0).s0();
            return this;
        }

        public final a I(String str) {
            s();
            ((U1) this.c0).g0(str);
            return this;
        }

        public final a J() {
            s();
            ((U1) this.c0).t0();
            return this;
        }

        public final a K(String str) {
            s();
            ((U1) this.c0).k0(str);
            return this;
        }

        public final a L() {
            s();
            ((U1) this.c0).u0();
            return this;
        }

        public final a M() {
            s();
            ((U1) this.c0).v0();
            return this;
        }

        public final long w() {
            return ((U1) this.c0).I();
        }

        public final a x(long j) {
            s();
            ((U1) this.c0).J(j);
            return this;
        }

        public final a y(String str) {
            s();
            ((U1) this.c0).N(str);
            return this;
        }

        public final long z() {
            return ((U1) this.c0).O();
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        U1 u1 = new U1();
        zzc = u1;
        AbstractC1599k4.w(U1.class, u1);
    }

    private U1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 8;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(long j) {
        this.zze |= 128;
        this.zzm = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a U() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(String str) {
        str.getClass();
        this.zze |= 64;
        this.zzl = str;
    }

    public static U1 d0() {
        return zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(String str) {
        str.getClass();
        this.zze |= 32;
        this.zzk = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(String str) {
        str.getClass();
        this.zze |= 16;
        this.zzj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        this.zze &= -2;
        this.zzf = zzc.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        this.zze &= -65;
        this.zzl = zzc.zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        this.zze &= -33;
        this.zzk = zzc.zzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        this.zze &= -17;
        this.zzj = zzc.zzj;
    }

    public final long I() {
        return this.zzi;
    }

    public final long O() {
        return this.zzm;
    }

    public final String h0() {
        return this.zzh;
    }

    public final String l0() {
        return this.zzg;
    }

    public final String m0() {
        return this.zzf;
    }

    public final String n0() {
        return this.zzl;
    }

    public final String o0() {
        return this.zzk;
    }

    public final String p0() {
        return this.zzj;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new U1();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<U1> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (U1.class) {
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
