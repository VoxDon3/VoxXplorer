package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579i2 extends AbstractC1599k4<C1579i2, a> implements W4 {
    private static final C1579i2 zzc;
    private static volatile InterfaceC1537d5<C1579i2> zzd;
    private int zze;
    private long zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzi;
    private float zzj;
    private double zzk;

    /* renamed from: ax.b6.i2$a */
    public static final class a extends AbstractC1599k4.b<C1579i2, a> implements W4 {
        private a() {
            super(C1579i2.zzc);
        }

        public final a B() {
            s();
            ((C1579i2) this.c0).k0();
            return this;
        }

        public final a C(long j) {
            s();
            ((C1579i2) this.c0).R(j);
            return this;
        }

        public final a D(String str) {
            s();
            ((C1579i2) this.c0).V(str);
            return this;
        }

        public final a E() {
            s();
            ((C1579i2) this.c0).l0();
            return this;
        }

        public final a w() {
            s();
            ((C1579i2) this.c0).j0();
            return this;
        }

        public final a x(double d) {
            s();
            ((C1579i2) this.c0).J(d);
            return this;
        }

        public final a y(long j) {
            s();
            ((C1579i2) this.c0).K(j);
            return this;
        }

        public final a z(String str) {
            s();
            ((C1579i2) this.c0).P(str);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1579i2 c1579i2 = new C1579i2();
        zzc = c1579i2;
        AbstractC1599k4.w(C1579i2.class, c1579i2);
    }

    private C1579i2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(double d) {
        this.zze |= 32;
        this.zzk = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(long j) {
        this.zze |= 8;
        this.zzi = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(long j) {
        this.zze |= 1;
        this.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    public static a a0() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        this.zze &= -33;
        this.zzk = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        this.zze &= -9;
        this.zzi = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    public final double I() {
        return this.zzk;
    }

    public final float Q() {
        return this.zzj;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Z() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzg;
    }

    public final String d0() {
        return this.zzh;
    }

    public final boolean e0() {
        return (this.zze & 32) != 0;
    }

    public final boolean f0() {
        return (this.zze & 16) != 0;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 4) != 0;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1579i2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1579i2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1579i2.class) {
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
