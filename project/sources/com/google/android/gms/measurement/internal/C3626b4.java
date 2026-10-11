package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.C0821p;
import ax.b6.AbstractC1599k4;
import ax.b6.C1507a2;
import ax.b6.C1516b2;
import ax.b6.C1534d2;
import ax.b6.C1543e2;
import ax.b6.C1552f2;
import ax.b6.C1579i2;
import ax.b6.M6;
import ax.b6.Z1;
import ax.b6.l7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3626b4 extends AbstractC3690k5 {
    public C3626b4(q5 q5Var) {
        super(q5Var);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3690k5
    protected final boolean x() {
        return false;
    }

    public final byte[] y(D d, String str) {
        C5 c5;
        List<C5> list;
        C1534d2.b bVar;
        Bundle bundle;
        byte[] bArr;
        Z1 z1;
        C1543e2.a aVar;
        C3770y a;
        long j;
        n();
        this.a.Q();
        C0821p.l(d);
        C0821p.f(str);
        if (!d().E(str, F.h0)) {
            k().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(d.q) && !"_iapx".equals(d.q)) {
            k().F().c("Generating a payload for this event is not available. package_name, event_name", str, d.q);
            return null;
        }
        C1534d2.b N = C1534d2.N();
        q().X0();
        try {
            Z1 H0 = q().H0(str);
            if (H0 == null) {
                k().F().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!H0.A()) {
                k().F().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C1543e2.a a1 = C1543e2.M3().A0(1).a1("android");
            if (!TextUtils.isEmpty(H0.l())) {
                a1.V(H0.l());
            }
            if (!TextUtils.isEmpty(H0.n())) {
                a1.i0((String) C0821p.l(H0.n()));
            }
            if (!TextUtils.isEmpty(H0.o())) {
                a1.p0((String) C0821p.l(H0.o()));
            }
            if (H0.U() != -2147483648L) {
                a1.l0((int) H0.U());
            }
            a1.s0(H0.z0()).g0(H0.v0());
            String q = H0.q();
            String j2 = H0.j();
            if (!TextUtils.isEmpty(q)) {
                a1.U0(q);
            } else if (!TextUtils.isEmpty(j2)) {
                a1.K(j2);
            }
            a1.K0(H0.J0());
            C3667h3 S = this.b.S(str);
            a1.a0(H0.t0());
            if (this.a.p() && d().M(a1.h1()) && S.A() && !TextUtils.isEmpty(null)) {
                a1.L0(null);
            }
            a1.y0(S.y());
            if (S.A() && H0.z()) {
                Pair<String, Boolean> z = s().z(H0.l(), S);
                if (H0.z() && z != null && !TextUtils.isEmpty((CharSequence) z.first)) {
                    a1.c1(c((String) z.first, Long.toString(d.e0)));
                    Object obj = z.second;
                    if (obj != null) {
                        a1.d0(((Boolean) obj).booleanValue());
                    }
                }
            }
            f().p();
            C1543e2.a H02 = a1.H0(Build.MODEL);
            f().p();
            H02.Y0(Build.VERSION.RELEASE).J0((int) f().v()).g1(f().w());
            if (S.B() && H0.m() != null) {
                a1.c0(c((String) C0821p.l(H0.m()), Long.toString(d.e0)));
            }
            if (!TextUtils.isEmpty(H0.p())) {
                a1.S0((String) C0821p.l(H0.p()));
            }
            String l = H0.l();
            List<C5> S0 = q().S0(l);
            Iterator<C5> it = S0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c5 = null;
                    break;
                }
                c5 = it.next();
                if ("_lte".equals(c5.c)) {
                    break;
                }
            }
            if (c5 == null || c5.e == null) {
                list = S0;
                C5 c52 = new C5(l, "auto", "_lte", b().a(), 0L);
                list.add(c52);
                q().f0(c52);
            } else {
                list = S0;
            }
            C1579i2[] c1579i2Arr = new C1579i2[list.size()];
            for (int i = 0; i < list.size(); i++) {
                C1579i2.a C = C1579i2.a0().z(list.get(i).c).C(list.get(i).d);
                o().W(C, list.get(i).e);
                c1579i2Arr[i] = (C1579i2) ((AbstractC1599k4) C.q());
            }
            a1.n0(Arrays.asList(c1579i2Arr));
            o().V(a1);
            this.b.x(H0, a1);
            if (M6.a() && d().t(F.N0)) {
                this.b.Y(H0, a1);
            }
            C3617a2 b = C3617a2.b(d);
            i().N(b.d, q().F0(str));
            i().W(b, d().u(str));
            Bundle bundle2 = b.d;
            bundle2.putLong("_c", 1L);
            k().F().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", d.d0);
            if (i().E0(a1.h1(), H0.v())) {
                i().O(bundle2, "_dbg", 1L);
                i().O(bundle2, "_r", 1L);
            }
            C3770y G0 = q().G0(str, d.q);
            if (G0 == null) {
                z1 = H0;
                bArr = null;
                bundle = bundle2;
                aVar = a1;
                bVar = N;
                a = new C3770y(str, d.q, 0L, 0L, d.e0, 0L, null, null, null, null);
                j = 0;
            } else {
                bVar = N;
                bundle = bundle2;
                bArr = null;
                z1 = H0;
                aVar = a1;
                long j3 = G0.f;
                a = G0.a(d.e0);
                j = j3;
            }
            C3770y c3770y = a;
            q().U(c3770y);
            A a2 = new A(this.a, d.d0, str, d.q, d.e0, j, bundle);
            Z1.a B = ax.b6.Z1.c0().H(a2.d).F(a2.b).B(a2.e);
            Iterator<String> it2 = a2.f.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                C1516b2.a C2 = C1516b2.c0().C(next);
                Object D = a2.f.D(next);
                if (D != null) {
                    o().U(C2, D);
                    B.C(C2);
                }
            }
            C1543e2.a aVar2 = aVar;
            aVar2.F(B).G(C1552f2.I().w(C1507a2.I().w(c3770y.c).x(d.q)));
            aVar2.J(p().z(z1.l(), Collections.EMPTY_LIST, aVar2.N(), Long.valueOf(B.J()), Long.valueOf(B.J())));
            if (B.N()) {
                aVar2.G0(B.J()).m0(B.J());
            }
            long D0 = z1.D0();
            if (D0 != 0) {
                aVar2.x0(D0);
            }
            long H03 = z1.H0();
            if (H03 != 0) {
                aVar2.B0(H03);
            } else if (D0 != 0) {
                aVar2.B0(D0);
            }
            String u = z1.u();
            if (l7.a() && d().E(str, F.s0) && u != null) {
                aVar2.e1(u);
            }
            z1.y();
            aVar2.r0((int) z1.F0()).R0(97001L).N0(b().a()).j0(true);
            this.b.D(aVar2.h1(), aVar2);
            C1534d2.b bVar2 = bVar;
            bVar2.x(aVar2);
            Z1 z12 = z1;
            z12.C0(aVar2.q0());
            z12.y0(aVar2.k0());
            q().V(z12, false, false);
            q().b1();
            try {
                return o().i0(((C1534d2) ((AbstractC1599k4) bVar2.q())).l());
            } catch (IOException e) {
                k().G().c("Data loss. Failed to bundle and serialize. appId", V1.v(str), e);
                return bArr;
            }
        } catch (SecurityException e2) {
            k().F().b("Resettable device id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            k().F().b("app instance id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            q().Z0();
        }
    }
}
