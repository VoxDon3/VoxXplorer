package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import ax.J5.C0752m;
import ax.M5.C0821p;
import ax.b6.C1618m6;
import ax.f6.C2053a;
import ax.f6.InterfaceC2057e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3689k4 extends AbstractC3623b1 {
    private final J4 c;
    private InterfaceC2057e d;
    private volatile Boolean e;
    private final AbstractC3734s f;
    private final C3648e5 g;
    private final List<Runnable> h;
    private final AbstractC3734s i;

    protected C3689k4(E2 e2) {
        super(e2);
        this.h = new ArrayList();
        this.g = new C3648e5(e2.b());
        this.c = new J4(this);
        this.f = new C3728q4(this, e2);
        this.i = new C3775y4(this, e2);
    }

    static /* synthetic */ void M(C3689k4 c3689k4, ComponentName componentName) {
        c3689k4.n();
        if (c3689k4.d != null) {
            c3689k4.d = null;
            c3689k4.k().K().b("Disconnected from device MeasurementService", componentName);
            c3689k4.n();
            c3689k4.Y();
        }
    }

    private final void P(Runnable runnable) throws IllegalStateException {
        n();
        if (f0()) {
            runnable.run();
        } else {
            if (this.h.size() >= 1000) {
                k().G().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.h.add(runnable);
            this.i.b(60000L);
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        n();
        k().K().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        Iterator<Runnable> it = this.h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (RuntimeException e) {
                k().G().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        n();
        this.g.c();
        this.f.b(F.K.a(null).longValue());
    }

    private final E5 o0(boolean z) {
        return p().B(z ? k().O() : null);
    }

    static /* synthetic */ void q0(C3689k4 c3689k4) {
        c3689k4.n();
        if (c3689k4.f0()) {
            c3689k4.k().K().a("Inactivity, disconnecting from the service");
            c3689k4.Z();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3623b1
    protected final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        n();
        v();
        P(new RunnableC3781z4(this, o0(false), bundle));
    }

    public final void D(ax.b6.M0 m0) {
        n();
        v();
        P(new RunnableC3751u4(this, o0(false), m0));
    }

    public final void E(ax.b6.M0 m0, D d, String str) {
        n();
        v();
        if (i().u(C0752m.a) == 0) {
            P(new B4(this, d, str, m0));
        } else {
            k().L().a("Not bundling data. Service unavailable or out of date");
            i().V(m0, new byte[0]);
        }
    }

    protected final void F(ax.b6.M0 m0, String str, String str2) {
        n();
        v();
        P(new H4(this, str, str2, o0(false), m0));
    }

    protected final void G(ax.b6.M0 m0, String str, String str2, boolean z) {
        n();
        v();
        P(new RunnableC3722p4(this, str, str2, o0(false), z, m0));
    }

    protected final void H(InterfaceC2057e interfaceC2057e) {
        n();
        C0821p.l(interfaceC2057e);
        this.d = interfaceC2057e;
        l0();
        k0();
    }

    final void I(InterfaceC2057e interfaceC2057e, ax.N5.a aVar, E5 e5) {
        int i;
        n();
        v();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<ax.N5.a> C = q().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i = C.size();
            } else {
                i = 0;
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ax.N5.a aVar2 = (ax.N5.a) obj;
                if (aVar2 instanceof D) {
                    try {
                        interfaceC2057e.w1((D) aVar2, e5);
                    } catch (RemoteException e) {
                        k().G().b("Failed to send event to the service", e);
                    }
                } else if (aVar2 instanceof A5) {
                    try {
                        interfaceC2057e.P((A5) aVar2, e5);
                    } catch (RemoteException e2) {
                        k().G().b("Failed to send user property to the service", e2);
                    }
                } else if (aVar2 instanceof C3649f) {
                    try {
                        interfaceC2057e.y0((C3649f) aVar2, e5);
                    } catch (RemoteException e3) {
                        k().G().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    k().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    protected final void J(C3649f c3649f) {
        C0821p.l(c3649f);
        n();
        v();
        P(new F4(this, true, o0(true), q().E(c3649f), new C3649f(c3649f), c3649f));
    }

    protected final void K(D d, String str) {
        C0821p.l(d);
        n();
        v();
        P(new C4(this, true, o0(true), q().F(d), d, str));
    }

    protected final void L(C3640d4 c3640d4) {
        n();
        v();
        P(new RunnableC3763w4(this, c3640d4));
    }

    protected final void O(A5 a5) {
        n();
        v();
        P(new RunnableC3745t4(this, o0(true), q().G(a5), a5));
    }

    public final void Q(AtomicReference<String> atomicReference) {
        n();
        v();
        P(new RunnableC3757v4(this, atomicReference, o0(false)));
    }

    protected final void R(AtomicReference<List<C3669h5>> atomicReference, Bundle bundle) {
        n();
        v();
        P(new RunnableC3733r4(this, atomicReference, o0(false), bundle));
    }

    protected final void S(AtomicReference<List<C3649f>> atomicReference, String str, String str2, String str3) {
        n();
        v();
        P(new E4(this, atomicReference, str, str2, str3, o0(false)));
    }

    protected final void T(AtomicReference<List<A5>> atomicReference, String str, String str2, String str3, boolean z) {
        n();
        v();
        P(new G4(this, atomicReference, str, str2, str3, o0(false), z));
    }

    protected final void U(boolean z) {
        n();
        v();
        if ((!C1618m6.a() || !d().t(F.V0)) && z) {
            q().H();
        }
        if (h0()) {
            P(new D4(this, o0(false)));
        }
    }

    protected final C2053a V() {
        n();
        v();
        InterfaceC2057e interfaceC2057e = this.d;
        if (interfaceC2057e == null) {
            Y();
            k().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        E5 o0 = o0(false);
        C0821p.l(o0);
        try {
            C2053a k1 = interfaceC2057e.k1(o0);
            l0();
            return k1;
        } catch (RemoteException e) {
            k().G().b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    final Boolean W() {
        return this.e;
    }

    protected final void X() {
        n();
        v();
        E5 o0 = o0(true);
        q().I();
        P(new RunnableC3769x4(this, o0));
    }

    final void Y() {
        n();
        v();
        if (f0()) {
            return;
        }
        if (j0()) {
            this.c.a();
            return;
        }
        if (d().V()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            k().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.c.b(intent);
    }

    public final void Z() {
        n();
        v();
        this.c.d();
        try {
            ax.Q5.b.b().c(a(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final /* synthetic */ void a0() {
        InterfaceC2057e interfaceC2057e = this.d;
        if (interfaceC2057e == null) {
            k().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            E5 o0 = o0(false);
            C0821p.l(o0);
            interfaceC2057e.h0(o0);
            l0();
        } catch (RemoteException e) {
            k().G().b("Failed to send Dma consent settings to the service", e);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    final /* synthetic */ void b0() {
        InterfaceC2057e interfaceC2057e = this.d;
        if (interfaceC2057e == null) {
            k().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            E5 o0 = o0(false);
            C0821p.l(o0);
            interfaceC2057e.U1(o0);
            l0();
        } catch (RemoteException e) {
            k().G().b("Failed to send storage consent settings to the service", e);
        }
    }

    protected final void c0() {
        n();
        v();
        E5 o0 = o0(false);
        q().H();
        P(new RunnableC3739s4(this, o0));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    protected final void d0() {
        n();
        v();
        P(new Runnable() { // from class: com.google.android.gms.measurement.internal.m4
            @Override // java.lang.Runnable
            public final void run() {
                C3689k4.this.a0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    protected final void e0() {
        n();
        v();
        P(new A4(this, o0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    public final boolean f0() {
        n();
        v();
        return this.d != null;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    final boolean g0() {
        n();
        v();
        return !j0() || i().I0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    final boolean h0() {
        n();
        v();
        return !j0() || i().I0() >= F.p0.a(null).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    final boolean i0() {
        n();
        v();
        return !j0() || i().I0() >= 241200;
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean j0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3689k4.j0():boolean");
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

    protected final void n0(boolean z) {
        n();
        v();
        if ((!C1618m6.a() || !d().t(F.V0)) && z) {
            q().H();
        }
        P(new Runnable() { // from class: com.google.android.gms.measurement.internal.o4
            @Override // java.lang.Runnable
            public final void run() {
                C3689k4.this.b0();
            }
        });
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
}
