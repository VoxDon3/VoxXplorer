/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.p;
import ax.b6.M6;
import ax.b6.Z1;
import ax.b6.b2;
import ax.b6.d2;
import ax.b6.e2;
import ax.b6.f2;
import ax.b6.i2;
import ax.b6.k4;
import ax.b6.l7;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.Z1;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.h3;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.q5;
import com.google.android.gms.measurement.internal.y;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

final class b4
extends k5 {
    public b4(q5 q52) {
        super(q52);
    }

    private static String c(String string, String string2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override
    protected final boolean x() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] y(D object, String string) {
        Throwable throwable2;
        SecurityException securityException3;
        block43: {
            int n8;
            Object object2;
            Object object3;
            Object object4;
            e2.a a8;
            Z1 z12;
            d2.b b8;
            block44: {
                block42: {
                    block41: {
                        boolean bl;
                        block40: {
                            block39: {
                                this.n();
                                this.a.Q();
                                p.l(object);
                                p.f(string);
                                if (!this.d().E(string, F.h0)) {
                                    this.k().F().b("Generating ScionPayload disabled. packageName", string);
                                    return new byte[0];
                                }
                                if (!"_iap".equals(((D)object).q) && !"_iapx".equals(((D)object).q)) {
                                    this.k().F().c("Generating a payload for this event is not available. package_name, event_name", string, ((D)object).q);
                                    return null;
                                }
                                b8 = d2.N();
                                this.q().X0();
                                z12 = this.q().H0(string);
                                if (z12 != null) break block39;
                                this.k().F().b("Log and bundle not available. package_name", string);
                                this.q().Z0();
                                return new byte[0];
                            }
                            if (z12.A()) break block40;
                            this.k().F().b("Log and bundle disabled. package_name", string);
                            this.q().Z0();
                            return new byte[0];
                        }
                        a8 = e2.M3().A0(1).a1("android");
                        if (!TextUtils.isEmpty((CharSequence)z12.l())) {
                            a8.V(z12.l());
                        }
                        if (!TextUtils.isEmpty((CharSequence)z12.n())) {
                            a8.i0(p.l(z12.n()));
                        }
                        if (!TextUtils.isEmpty((CharSequence)z12.o())) {
                            a8.p0(p.l(z12.o()));
                        }
                        if (z12.U() != Integer.MIN_VALUE) {
                            a8.l0((int)z12.U());
                        }
                        a8.s0(z12.z0()).g0(z12.v0());
                        object4 = z12.q();
                        object3 = z12.j();
                        if (!TextUtils.isEmpty((CharSequence)object4)) {
                            a8.U0((String)object4);
                        } else if (!TextUtils.isEmpty((CharSequence)object3)) {
                            a8.K((String)object3);
                        }
                        a8.K0(z12.J0());
                        object4 = this.b.S(string);
                        a8.a0(z12.t0());
                        if (this.a.p() && this.d().M(a8.h1()) && ((h3)object4).A() && !TextUtils.isEmpty(null)) {
                            a8.L0(null);
                        }
                        a8.y0(((h3)object4).y());
                        if (!((h3)object4).A() || !z12.z()) break block41;
                        object3 = this.s().z(z12.l(), (h3)object4);
                        if (!z12.z() || object3 == null || (bl = TextUtils.isEmpty((CharSequence)((CharSequence)((Pair)object3).first)))) break block41;
                        try {
                            a8.c1(b4.c((String)((Pair)object3).first, Long.toString(((D)object).e0)));
                        }
                        catch (SecurityException securityException2) {
                            this.k().F().b("Resettable device id encryption failed", securityException2.getMessage());
                            this.q().Z0();
                            return new byte[0];
                        }
                        object3 = ((Pair)object3).second;
                        if (object3 != null) {
                            a8.d0((Boolean)object3);
                        }
                    }
                    this.f().p();
                    object3 = a8.H0(Build.MODEL);
                    this.f().p();
                    ((e2.a)object3).Y0(Build.VERSION.RELEASE).J0((int)this.f().v()).g1(this.f().w());
                    try {
                        if (!((h3)object4).B() || z12.m() == null) break block42;
                        a8.c0(b4.c(p.l(z12.m()), Long.toString(((D)object).e0)));
                    }
                    catch (SecurityException securityException3) {
                        break block43;
                    }
                }
                if (!TextUtils.isEmpty((CharSequence)z12.p())) {
                    a8.S0(p.l(z12.p()));
                }
                object2 = z12.l();
                object3 = this.q().S0((String)object2);
                Iterator<Object> iterator = object3.iterator();
                while (iterator.hasNext()) {
                    object4 = (C5)iterator.next();
                    if (!"_lte".equals(((C5)object4).c)) continue;
                    break block44;
                }
                object4 = null;
            }
            if (object4 == null || ((C5)object4).e == null) {
                object4 = new C5((String)object2, "auto", "_lte", this.b().a(), 0L);
                object3.add(object4);
                this.q().f0((C5)object4);
            }
            object4 = new i2[object3.size()];
            for (n8 = 0; n8 < object3.size(); ++n8) {
                object2 = i2.a0().z(((C5)object3.get((int)n8)).c).C(((C5)object3.get((int)n8)).d);
                this.o().W((i2.a)object2, ((C5)object3.get((int)n8)).e);
                object4[n8] = (i2)((k4)((k4.b)object2).q());
            }
            try {
                long l8;
                long l9;
                long l10;
                a8.n0(Arrays.asList(object4));
                this.o().V(a8);
                this.b.x(z12, a8);
                if (M6.a() && this.d().t(F.N0)) {
                    this.b.Y(z12, a8);
                }
                object4 = a2.b((D)object);
                this.i().N(((a2)object4).d, this.q().F0(string));
                this.i().W((a2)object4, this.d().u(string));
                object2 = ((a2)object4).d;
                object2.putLong("_c", 1L);
                this.k().F().a("Marking in-app purchase as real-time");
                object2.putLong("_r", 1L);
                object2.putString("_o", ((D)object).d0);
                if (this.i().E0(a8.h1(), z12.v())) {
                    this.i().O((Bundle)object2, "_dbg", 1L);
                    this.i().O((Bundle)object2, "_r", 1L);
                }
                if ((object4 = this.q().G0(string, ((D)object).q)) == null) {
                    object4 = new y(string, ((D)object).q, 0L, 0L, ((D)object).e0, 0L, null, null, null, null);
                    l10 = 0L;
                } else {
                    l10 = ((y)object4).f;
                    object4 = ((y)object4).a(((D)object).e0);
                }
                this.q().U((y)object4);
                object3 = new A(this.a, ((D)object).d0, string, ((D)object).q, ((D)object).e0, l10, (Bundle)object2);
                object2 = ax.b6.Z1.c0().H(((A)object3).d).F(((A)object3).b).B(((A)object3).e);
                for (Object object5 : ((A)object3).f) {
                    b2.a a9 = b2.c0().C((String)object5);
                    if ((object5 = ((A)object3).f.D((String)object5)) == null) continue;
                    this.o().U(a9, object5);
                    ((Z1.a)object2).C(a9);
                }
                a8.F((Z1.a)object2).G(f2.I().w(ax.b6.a2.I().w(((y)object4).c).x(((D)object).q)));
                a8.J(this.p().z(z12.l(), Collections.EMPTY_LIST, a8.N(), ((Z1.a)object2).J(), ((Z1.a)object2).J()));
                if (((Z1.a)object2).N()) {
                    a8.G0(((Z1.a)object2).J()).m0(((Z1.a)object2).J());
                }
                if ((n8 = (int)((l9 = (l8 = z12.D0()) - 0L) == 0L ? 0 : (l9 < 0L ? -1 : 1))) != 0) {
                    a8.x0(l8);
                }
                if ((l10 = z12.H0()) != 0L) {
                    a8.B0(l10);
                } else if (n8 != 0) {
                    a8.B0(l8);
                }
                object = z12.u();
                if (l7.a() && this.d().E(string, F.s0) && object != null) {
                    a8.e1((String)object);
                }
                z12.y();
                a8.r0((int)z12.F0()).R0(97001L).N0(this.b().a()).j0(true);
                this.b.D(a8.h1(), a8);
                b8.x(a8);
                z12.C0(a8.q0());
                z12.y0(a8.k0());
                this.q().V(z12, false, false);
                this.q().b1();
                this.q().Z0();
            }
            catch (Throwable throwable2) {}
            try {
                return this.o().i0(((d2)((k4)b8.q())).l());
            }
            catch (IOException iOException) {
                this.k().G().c("Data loss. Failed to bundle and serialize. appId", V1.v(string), iOException);
                return null;
            }
        }
        this.k().F().b("app instance id encryption failed", securityException3.getMessage());
        this.q().Z0();
        return new byte[0];
        this.q().Z0();
        throw throwable2;
    }
}

