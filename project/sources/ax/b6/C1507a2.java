package ax.b6;

import ax.b6.AbstractC1599k4;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1507a2 extends AbstractC1599k4<C1507a2, a> implements W4 {
    private static final C1507a2 zzc;
    private static volatile InterfaceC1537d5<C1507a2> zzd;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzg;

    /* renamed from: ax.b6.a2$a */
    public static final class a extends AbstractC1599k4.b<C1507a2, a> implements W4 {
        private a() {
            super(C1507a2.zzc);
        }

        public final a w(long j) {
            s();
            ((C1507a2) this.c0).J(j);
            return this;
        }

        public final a x(String str) {
            s();
            ((C1507a2) this.c0).M(str);
            return this;
        }

        /* synthetic */ a(C1597k2 c1597k2) {
            this();
        }
    }

    static {
        C1507a2 c1507a2 = new C1507a2();
        zzc = c1507a2;
        AbstractC1599k4.w(C1507a2.class, c1507a2);
    }

    private C1507a2() {
    }

    public static a I() {
        return zzc.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(long j) {
        this.zze |= 2;
        this.zzg = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    @Override // ax.b6.AbstractC1599k4
    protected final Object t(int i, Object obj, Object obj2) {
        InterfaceC1537d5 interfaceC1537d5;
        C1597k2 c1597k2 = null;
        switch (C1597k2.a[i - 1]) {
            case 1:
                return new C1507a2();
            case 2:
                return new a(c1597k2);
            case 3:
                return AbstractC1599k4.u(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                InterfaceC1537d5<C1507a2> interfaceC1537d52 = zzd;
                if (interfaceC1537d52 != null) {
                    return interfaceC1537d52;
                }
                synchronized (C1507a2.class) {
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
