package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import ax.J5.C0752m;
import ax.J5.C0753n;
import ax.M5.C0821p;
import ax.b6.C1503C;
import ax.b6.C1540e;
import ax.b6.C1541e0;
import ax.f6.AbstractBinderC2059g;
import ax.f6.C2053a;
import ax.f6.C2069q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class I2 extends AbstractBinderC2059g {
    private final q5 e;
    private Boolean f;
    private String g;

    public I2(q5 q5Var) {
        this(q5Var, null);
    }

    private final void B(Runnable runnable) {
        C0821p.l(runnable);
        if (this.e.l().J()) {
            runnable.run();
        } else {
            this.e.l().G(runnable);
        }
    }

    private final void b2(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.e.k().G().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f == null) {
                    if (!"com.google.android.gms".equals(this.g) && !ax.R5.p.a(this.e.a(), Binder.getCallingUid()) && !C0753n.a(this.e.a()).c(Binder.getCallingUid())) {
                        z2 = false;
                        this.f = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.f = Boolean.valueOf(z2);
                }
                if (this.f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.e.k().G().b("Measurement Service called with invalid calling package. appId", V1.v(str));
                throw e;
            }
        }
        if (this.g == null && C0752m.k(this.e.a(), Binder.getCallingUid(), str)) {
            this.g = str;
        }
        if (str.equals(this.g)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void d2(E5 e5, boolean z) {
        C0821p.l(e5);
        C0821p.f(e5.q);
        b2(e5.q, false);
        this.e.t0().k0(e5.c0, e5.r0);
    }

    private final void e2(Runnable runnable) {
        C0821p.l(runnable);
        if (this.e.l().J()) {
            runnable.run();
        } else {
            this.e.l().D(runnable);
        }
    }

    private final void g2(D d, E5 e5) {
        this.e.u0();
        this.e.v(d, e5);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void A1(E5 e5) {
        d2(e5, false);
        e2(new M2(this, e5));
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3669h5> B1(E5 e5, Bundle bundle) {
        d2(e5, false);
        C0821p.l(e5.q);
        try {
            return (List) this.e.l().w(new CallableC3639d3(this, e5, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.e.k().G().c("Failed to get trigger URIs. appId", V1.v(e5.q), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3649f> F(String str, String str2, E5 e5) {
        d2(e5, false);
        String str3 = e5.q;
        C0821p.l(str3);
        try {
            return (List) this.e.l().w(new R2(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.e.k().G().b("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final void F0(long j, String str, String str2, String str3) {
        e2(new O2(this, str2, str3, str, j));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void I(E5 e5) {
        C0821p.f(e5.q);
        b2(e5.q, false);
        e2(new T2(this, e5));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void I0(E5 e5) {
        d2(e5, false);
        e2(new L2(this, e5));
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<C3649f> J0(String str, String str2, String str3) {
        b2(str, true);
        try {
            return (List) this.e.l().w(new U2(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.e.k().G().b("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<A5> J1(E5 e5, boolean z) {
        d2(e5, false);
        String str = e5.q;
        C0821p.l(str);
        try {
            List<C5> list = (List) this.e.l().w(new CallableC3632c3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c5 : list) {
                if (!z && B5.J0(c5.c)) {
                }
                arrayList.add(new A5(c5));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.e.k().G().c("Failed to get user properties. appId", V1.v(e5.q), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.e.k().G().c("Failed to get user properties. appId", V1.v(e5.q), e);
            return null;
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final void M0(C3649f c3649f) {
        C0821p.l(c3649f);
        C0821p.l(c3649f.d0);
        C0821p.f(c3649f.q);
        b2(c3649f.q, true);
        e2(new Q2(this, new C3649f(c3649f)));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void N(D d, String str, String str2) {
        C0821p.l(d);
        C0821p.f(str);
        b2(str, true);
        e2(new Y2(this, d, str));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void P(A5 a5, E5 e5) {
        C0821p.l(a5);
        d2(e5, false);
        e2(new RunnableC3618a3(this, a5, e5));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void U1(final E5 e5) {
        C0821p.f(e5.q);
        C0821p.l(e5.w0);
        B(new Runnable() { // from class: com.google.android.gms.measurement.internal.H2
            @Override // java.lang.Runnable
            public final void run() {
                I2.this.i2(e5);
            }
        });
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<A5> Z(String str, String str2, String str3, boolean z) {
        b2(str, true);
        try {
            List<C5> list = (List) this.e.l().w(new S2(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c5 : list) {
                if (!z && B5.J0(c5.c)) {
                }
                arrayList.add(new A5(c5));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.e.k().G().c("Failed to get user properties as. appId", V1.v(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.e.k().G().c("Failed to get user properties as. appId", V1.v(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    final /* synthetic */ void a2(String str, Bundle bundle) {
        this.e.h0().i0(str, bundle);
    }

    final D c2(D d, E5 e5) {
        C c;
        if (!"_cmp".equals(d.q) || (c = d.c0) == null || c.k() == 0) {
            return d;
        }
        String E = d.c0.E("_cis");
        if (!"referrer broadcast".equals(E) && !"referrer API".equals(E)) {
            return d;
        }
        this.e.k().J().b("Event has been filtered ", d.toString());
        return new D("_cmpx", d.c0, d.d0, d.e0);
    }

    @Override // ax.f6.InterfaceC2057e
    public final void f0(E5 e5) {
        C0821p.f(e5.q);
        C0821p.l(e5.w0);
        B(new X2(this, e5));
    }

    final void f2(D d, E5 e5) {
        boolean z;
        if (!this.e.n0().X(e5.q)) {
            g2(d, e5);
            return;
        }
        this.e.k().K().b("EES config found for", e5.q);
        C3726q2 n0 = this.e.n0();
        String str = e5.q;
        C1503C c = TextUtils.isEmpty(str) ? null : n0.j.c(str);
        if (c == null) {
            this.e.k().K().b("EES not loaded for", e5.q);
            g2(d, e5);
            return;
        }
        try {
            Map<String, Object> Q = this.e.s0().Q(d.c0.B(), true);
            String a = C2069q.a(d.q);
            if (a == null) {
                a = d.q;
            }
            z = c.d(new C1540e(a, d.e0, Q));
        } catch (C1541e0 unused) {
            this.e.k().G().c("EES error. appId, eventName", e5.c0, d.q);
            z = false;
        }
        if (!z) {
            this.e.k().K().b("EES was not applied to event", d.q);
            g2(d, e5);
            return;
        }
        if (c.g()) {
            this.e.k().K().b("EES edited event", d.q);
            g2(this.e.s0().H(c.a().d()), e5);
        } else {
            g2(d, e5);
        }
        if (c.f()) {
            for (C1540e c1540e : c.a().f()) {
                this.e.k().K().b("EES logging created event", c1540e.e());
                g2(this.e.s0().H(c1540e), e5);
            }
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final void g0(final Bundle bundle, E5 e5) {
        d2(e5, false);
        final String str = e5.q;
        C0821p.l(str);
        e2(new Runnable() { // from class: com.google.android.gms.measurement.internal.J2
            @Override // java.lang.Runnable
            public final void run() {
                I2.this.a2(str, bundle);
            }
        });
    }

    @Override // ax.f6.InterfaceC2057e
    public final void h0(final E5 e5) {
        C0821p.f(e5.q);
        C0821p.l(e5.w0);
        B(new Runnable() { // from class: com.google.android.gms.measurement.internal.K2
            @Override // java.lang.Runnable
            public final void run() {
                I2.this.h2(e5);
            }
        });
    }

    @Override // ax.f6.InterfaceC2057e
    public final byte[] h1(D d, String str) {
        C0821p.f(str);
        C0821p.l(d);
        b2(str, true);
        this.e.k().F().b("Log and bundle. event", this.e.j0().c(d.q));
        long nanoTime = this.e.b().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.e.l().B(new CallableC3625b3(this, d, str)).get();
            if (bArr == null) {
                this.e.k().G().b("Log and bundle returned null. appId", V1.v(str));
                bArr = new byte[0];
            }
            this.e.k().F().d("Log and bundle processed. event, size, time_ms", this.e.j0().c(d.q), Integer.valueOf(bArr.length), Long.valueOf((this.e.b().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.e.k().G().d("Failed to log and bundle. appId, event, error", V1.v(str), this.e.j0().c(d.q), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.e.k().G().d("Failed to log and bundle. appId, event, error", V1.v(str), this.e.j0().c(d.q), e);
            return null;
        }
    }

    final /* synthetic */ void h2(E5 e5) {
        this.e.u0();
        this.e.g0(e5);
    }

    final /* synthetic */ void i2(E5 e5) {
        this.e.u0();
        this.e.i0(e5);
    }

    @Override // ax.f6.InterfaceC2057e
    public final C2053a k1(E5 e5) {
        d2(e5, false);
        C0821p.f(e5.q);
        try {
            return (C2053a) this.e.l().B(new W2(this, e5)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.e.k().G().c("Failed to get consent. appId", V1.v(e5.q), e);
            return new C2053a(null);
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final String p0(E5 e5) {
        d2(e5, false);
        return this.e.T(e5);
    }

    @Override // ax.f6.InterfaceC2057e
    public final List<A5> u1(String str, String str2, boolean z, E5 e5) {
        d2(e5, false);
        String str3 = e5.q;
        C0821p.l(str3);
        try {
            List<C5> list = (List) this.e.l().w(new P2(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C5 c5 : list) {
                if (!z && B5.J0(c5.c)) {
                }
                arrayList.add(new A5(c5));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.e.k().G().c("Failed to query user properties. appId", V1.v(e5.q), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.e.k().G().c("Failed to query user properties. appId", V1.v(e5.q), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ax.f6.InterfaceC2057e
    public final void w1(D d, E5 e5) {
        C0821p.l(d);
        d2(e5, false);
        e2(new Z2(this, d, e5));
    }

    @Override // ax.f6.InterfaceC2057e
    public final void y0(C3649f c3649f, E5 e5) {
        C0821p.l(c3649f);
        C0821p.l(c3649f.d0);
        d2(e5, false);
        C3649f c3649f2 = new C3649f(c3649f);
        c3649f2.q = e5.q;
        e2(new N2(this, c3649f2, e5));
    }

    private I2(q5 q5Var, String str) {
        C0821p.l(q5Var);
        this.e = q5Var;
        this.g = null;
    }
}
