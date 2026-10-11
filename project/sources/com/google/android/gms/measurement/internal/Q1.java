package com.google.android.gms.measurement.internal;

import android.content.Context;
import ax.M5.C0821p;
import ax.b6.w7;
import com.google.android.gms.measurement.internal.C3667h3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class Q1 extends AbstractC3623b1 {
    private String c;
    private String d;
    private int e;
    private String f;
    private long g;
    private long h;
    private List<String> i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;
    private long o;
    private String p;

    Q1(E2 e2, long j) {
        super(e2);
        this.o = 0L;
        this.p = null;
        this.h = j;
    }

    private final String J() {
        if (w7.a() && d().t(F.n0)) {
            k().K().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(invoke, null);
                } catch (Exception unused) {
                    k().M().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                k().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0122, code lost:
    
        if (h().M().m(com.google.android.gms.measurement.internal.C3667h3.a.ANALYTICS_STORAGE) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.E5 B(java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q1.B(java.lang.String):com.google.android.gms.measurement.internal.E5");
    }

    final int C() {
        v();
        return this.k;
    }

    final int D() {
        v();
        return this.e;
    }

    final String E() {
        v();
        return this.m;
    }

    final String F() {
        v();
        C0821p.l(this.c);
        return this.c;
    }

    final String G() {
        n();
        v();
        C0821p.l(this.l);
        return this.l;
    }

    final List<String> H() {
        return this.i;
    }

    final void I() {
        String format;
        n();
        if (h().M().m(C3667h3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            i().W0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            k().F().a("Analytics Storage consent is not granted");
            format = null;
        }
        k().F().a(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.n = format;
        this.o = b().a();
    }

    final boolean K(String str) {
        String str2 = this.p;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.p = str;
        return z;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3776z o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ Q1 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ P1 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3688k3 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3654f4 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ C3689k4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.C1
    public final /* bridge */ /* synthetic */ V4 u() {
        return super.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0190 A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ac A[Catch: IllegalStateException -> 0x01a8, TryCatch #3 {IllegalStateException -> 0x01a8, blocks: (B:18:0x016b, B:21:0x0188, B:23:0x0190, B:25:0x01ac, B:27:0x01c0, B:28:0x01c5, B:30:0x01c3), top: B:17:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void y() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Q1.y():void");
    }
}
