/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import ax.M5.p;
import ax.Q5.b;
import ax.b6.M0;
import ax.b6.m6;
import ax.f6.a;
import ax.f6.e;
import com.google.android.gms.measurement.internal.A4;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B4;
import com.google.android.gms.measurement.internal.C1;
import com.google.android.gms.measurement.internal.C4;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.D4;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.E4;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.F4;
import com.google.android.gms.measurement.internal.G4;
import com.google.android.gms.measurement.internal.H4;
import com.google.android.gms.measurement.internal.J4;
import com.google.android.gms.measurement.internal.Q1;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.e5;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.m4;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.r4;
import com.google.android.gms.measurement.internal.s;
import com.google.android.gms.measurement.internal.s4;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.u4;
import com.google.android.gms.measurement.internal.v4;
import com.google.android.gms.measurement.internal.w4;
import com.google.android.gms.measurement.internal.x4;
import com.google.android.gms.measurement.internal.y4;
import com.google.android.gms.measurement.internal.z4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class k4
extends b1 {
    private final J4 c;
    private e d;
    private volatile Boolean e;
    private final s f;
    private final e5 g;
    private final List<Runnable> h = new ArrayList<Runnable>();
    private final s i;

    protected k4(E2 e22) {
        super(e22);
        this.g = new e5(e22.b());
        this.c = new J4(this);
        this.f = new q4(this, e22);
        this.i = new y4(this, e22);
    }

    static /* bridge */ /* synthetic */ e B(k4 k42) {
        return k42.d;
    }

    static /* synthetic */ void M(k4 k42, ComponentName componentName) {
        ((f3)k42).n();
        if (k42.d != null) {
            k42.d = null;
            ((f3)k42).k().K().b("Disconnected from device MeasurementService", componentName);
            ((f3)k42).n();
            k42.Y();
        }
    }

    static /* bridge */ /* synthetic */ void N(k4 k42, e e8) {
        k42.d = null;
    }

    private final void P(Runnable runnable2) throws IllegalStateException {
        ((f3)this).n();
        if (this.f0()) {
            runnable2.run();
            return;
        }
        if ((long)this.h.size() >= 1000L) {
            ((f3)this).k().G().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable2);
        this.i.b(60000L);
        this.Y();
    }

    private final void k0() {
        ((f3)this).n();
        ((f3)this).k().K().b("Processing queued up service tasks", this.h.size());
        for (Runnable runnable2 : this.h) {
            try {
                runnable2.run();
            }
            catch (RuntimeException runtimeException) {
                ((f3)this).k().G().b("Task exception while flushing queue", runtimeException);
            }
        }
        this.h.clear();
        this.i.a();
    }

    private final void l0() {
        ((f3)this).n();
        this.g.c();
        this.f.b((Long)F.K.a(null));
    }

    static /* bridge */ /* synthetic */ J4 m0(k4 k42) {
        return k42.c;
    }

    private final E5 o0(boolean bl) {
        Q1 q12 = ((C1)this).p();
        String string = bl ? ((f3)this).k().O() : null;
        return q12.B(string);
    }

    static /* synthetic */ void p0(k4 k42) {
        k42.k0();
    }

    static /* synthetic */ void q0(k4 k42) {
        ((f3)k42).n();
        if (k42.f0()) {
            ((f3)k42).k().K().a("Inactivity, disconnecting from the service");
            k42.Z();
        }
    }

    static /* synthetic */ void r0(k4 k42) {
        k42.l0();
    }

    @Override
    protected final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        ((f3)this).n();
        this.v();
        this.P(new z4(this, this.o0(false), bundle));
    }

    public final void D(M0 m02) {
        ((f3)this).n();
        this.v();
        this.P(new u4(this, this.o0(false), m02));
    }

    public final void E(M0 m02, D d8, String string) {
        ((f3)this).n();
        this.v();
        if (((f3)this).i().u(12451000) != 0) {
            ((f3)this).k().L().a("Not bundling data. Service unavailable or out of date");
            ((f3)this).i().V(m02, new byte[0]);
            return;
        }
        this.P(new B4(this, d8, string, m02));
    }

    protected final void F(M0 m02, String string, String string2) {
        ((f3)this).n();
        this.v();
        this.P(new H4(this, string, string2, this.o0(false), m02));
    }

    protected final void G(M0 m02, String string, String string2, boolean bl) {
        ((f3)this).n();
        this.v();
        this.P(new p4(this, string, string2, this.o0(false), bl, m02));
    }

    protected final void H(e e8) {
        ((f3)this).n();
        p.l(e8);
        this.d = e8;
        this.l0();
        this.k0();
    }

    final void I(e e8, ax.N5.a a8, E5 e52) {
        ((f3)this).n();
        this.v();
        int n8 = 100;
        for (int i8 = 0; i8 < 1001 && n8 == 100; ++i8) {
            ArrayList<ax.N5.a> arrayList = new ArrayList<ax.N5.a>();
            List<ax.N5.a> list = ((C1)this).q().C(100);
            if (list != null) {
                arrayList.addAll(list);
                n8 = list.size();
            } else {
                n8 = 0;
            }
            if (a8 != null && n8 < 100) {
                arrayList.add(a8);
            }
            int n9 = arrayList.size();
            int n10 = 0;
            while (n10 < n9) {
                list = arrayList.get(n10);
                ++n10;
                if ((list = (ax.N5.a)((Object)list)) instanceof D) {
                    try {
                        e8.w1((D)((Object)list), e52);
                    }
                    catch (RemoteException remoteException) {
                        ((f3)this).k().G().b("Failed to send event to the service", (Object)remoteException);
                    }
                    continue;
                }
                if (list instanceof A5) {
                    try {
                        e8.P((A5)((Object)list), e52);
                    }
                    catch (RemoteException remoteException) {
                        ((f3)this).k().G().b("Failed to send user property to the service", (Object)remoteException);
                    }
                    continue;
                }
                if (list instanceof f) {
                    try {
                        e8.y0((f)((Object)list), e52);
                    }
                    catch (RemoteException remoteException) {
                        ((f3)this).k().G().b("Failed to send conditional user property to the service", (Object)remoteException);
                    }
                    continue;
                }
                ((f3)this).k().G().a("Discarding data. Unrecognized parcel type.");
            }
        }
    }

    protected final void J(f f8) {
        p.l(f8);
        ((f3)this).n();
        this.v();
        boolean bl = ((C1)this).q().E(f8);
        f f9 = new f(f8);
        this.P(new F4(this, true, this.o0(true), bl, f9, f8));
    }

    protected final void K(D d8, String string) {
        p.l(d8);
        ((f3)this).n();
        this.v();
        boolean bl = ((C1)this).q().F(d8);
        this.P(new C4(this, true, this.o0(true), bl, d8, string));
    }

    protected final void L(d4 d42) {
        ((f3)this).n();
        this.v();
        this.P(new w4(this, d42));
    }

    protected final void O(A5 a52) {
        ((f3)this).n();
        this.v();
        boolean bl = ((C1)this).q().G(a52);
        this.P(new t4(this, this.o0(true), bl, a52));
    }

    public final void Q(AtomicReference<String> atomicReference) {
        ((f3)this).n();
        this.v();
        this.P(new v4(this, atomicReference, this.o0(false)));
    }

    protected final void R(AtomicReference<List<h5>> atomicReference, Bundle bundle) {
        ((f3)this).n();
        this.v();
        this.P(new r4(this, atomicReference, this.o0(false), bundle));
    }

    protected final void S(AtomicReference<List<f>> atomicReference, String string, String string2, String string3) {
        ((f3)this).n();
        this.v();
        this.P(new E4(this, atomicReference, string, string2, string3, this.o0(false)));
    }

    protected final void T(AtomicReference<List<A5>> atomicReference, String string, String string2, String string3, boolean bl) {
        ((f3)this).n();
        this.v();
        this.P(new G4(this, atomicReference, string, string2, string3, this.o0(false), bl));
    }

    protected final void U(boolean bl) {
        ((f3)this).n();
        this.v();
        if (!(m6.a() && ((f3)this).d().t(F.V0) || !bl)) {
            ((C1)this).q().H();
        }
        if (this.h0()) {
            this.P(new D4(this, this.o0(false)));
        }
    }

    protected final a V() {
        ((f3)this).n();
        this.v();
        Object object = this.d;
        if (object == null) {
            this.Y();
            ((f3)this).k().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        E5 e52 = this.o0(false);
        p.l(e52);
        try {
            object = object.k1(e52);
            this.l0();
            return object;
        }
        catch (RemoteException remoteException) {
            ((f3)this).k().G().b("Failed to get consents; remote exception", (Object)remoteException);
            return null;
        }
    }

    final Boolean W() {
        return this.e;
    }

    protected final void X() {
        ((f3)this).n();
        this.v();
        E5 e52 = this.o0(true);
        ((C1)this).q().I();
        this.P(new x4(this, e52));
    }

    final void Y() {
        ((f3)this).n();
        this.v();
        if (!this.f0()) {
            if (this.j0()) {
                this.c.a();
                return;
            }
            if (!((f3)this).d().V()) {
                List list = ((f3)this).a().getPackageManager().queryIntentServices(new Intent().setClassName(((f3)this).a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (list != null && !list.isEmpty()) {
                    list = new Intent("com.google.android.gms.measurement.START");
                    list.setComponent(new ComponentName(((f3)this).a(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.c.b((Intent)list);
                    return;
                }
                ((f3)this).k().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Z() {
        ((f3)this).n();
        this.v();
        this.c.d();
        try {
            b.b().c(((f3)this).a(), this.c);
        }
        catch (IllegalArgumentException | IllegalStateException runtimeException) {}
        this.d = null;
    }

    final /* synthetic */ void a0() {
        e e8 = this.d;
        if (e8 == null) {
            ((f3)this).k().G().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            E5 e52 = this.o0(false);
            p.l(e52);
            e8.h0(e52);
            this.l0();
            return;
        }
        catch (RemoteException remoteException) {
            ((f3)this).k().G().b("Failed to send Dma consent settings to the service", (Object)remoteException);
            return;
        }
    }

    final /* synthetic */ void b0() {
        e e8 = this.d;
        if (e8 == null) {
            ((f3)this).k().G().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            E5 e52 = this.o0(false);
            p.l(e52);
            e8.U1(e52);
            this.l0();
            return;
        }
        catch (RemoteException remoteException) {
            ((f3)this).k().G().b("Failed to send storage consent settings to the service", (Object)remoteException);
            return;
        }
    }

    protected final void c0() {
        ((f3)this).n();
        this.v();
        E5 e52 = this.o0(false);
        ((C1)this).q().H();
        this.P(new s4(this, e52));
    }

    protected final void d0() {
        ((f3)this).n();
        this.v();
        this.P(new m4(this));
    }

    protected final void e0() {
        ((f3)this).n();
        this.v();
        this.P(new A4(this, this.o0(true)));
    }

    public final boolean f0() {
        ((f3)this).n();
        this.v();
        return this.d != null;
    }

    final boolean g0() {
        ((f3)this).n();
        this.v();
        if (!this.j0()) {
            return true;
        }
        return ((f3)this).i().I0() >= 200900;
    }

    final boolean h0() {
        ((f3)this).n();
        this.v();
        if (!this.j0()) {
            return true;
        }
        return ((f3)this).i().I0() >= (Integer)F.p0.a(null);
    }

    final boolean i0() {
        ((f3)this).n();
        this.v();
        if (!this.j0()) {
            return true;
        }
        return ((f3)this).i().I0() >= 241200;
    }

    /*
     * Enabled aggressive block sorting
     */
    final boolean j0() {
        block2: {
            boolean bl;
            block3: {
                int n8;
                int n9;
                boolean bl2;
                block14: {
                    block4: {
                        block5: {
                            block12: {
                                block13: {
                                    block6: {
                                        boolean bl3;
                                        Boolean bl4;
                                        block7: {
                                            block11: {
                                                block8: {
                                                    block9: {
                                                        block10: {
                                                            ((f3)this).n();
                                                            this.v();
                                                            if (this.e != null) break block2;
                                                            ((f3)this).n();
                                                            this.v();
                                                            bl4 = ((f3)this).h().N();
                                                            bl2 = true;
                                                            bl = true;
                                                            bl3 = true;
                                                            if (bl4 != null && bl4.booleanValue()) break block3;
                                                            n9 = ((C1)this).p().C();
                                                            n8 = 0;
                                                            if (n9 == 1) break block4;
                                                            ((f3)this).k().K().a("Checking service availability");
                                                            n9 = ((f3)this).i().u(12451000);
                                                            if (n9 == 0) break block5;
                                                            if (n9 == 1) break block6;
                                                            if (n9 == 2) break block7;
                                                            if (n9 == 3) break block8;
                                                            if (n9 == 9) break block9;
                                                            if (n9 == 18) break block10;
                                                            ((f3)this).k().L().b("Unexpected service status", n9);
                                                            break block11;
                                                        }
                                                        ((f3)this).k().L().a("Service updating");
                                                        break block4;
                                                    }
                                                    ((f3)this).k().L().a("Service invalid");
                                                    break block11;
                                                }
                                                ((f3)this).k().L().a("Service disabled");
                                            }
                                            n9 = 0;
                                            break block12;
                                        }
                                        ((f3)this).k().F().a("Service container out of date");
                                        if (((f3)this).i().I0() < 17443) break block13;
                                        bl2 = bl4 == null ? bl3 : false;
                                        n9 = 0;
                                        break block14;
                                    }
                                    ((f3)this).k().K().a("Service missing");
                                }
                                n9 = 1;
                            }
                            bl2 = false;
                            break block14;
                        }
                        ((f3)this).k().K().a("Service available");
                    }
                    n9 = 1;
                }
                if (!bl2 && ((f3)this).d().V()) {
                    ((f3)this).k().G().a("No way to upload. Consider using the full version of Analytics");
                    n9 = n8;
                }
                bl = bl2;
                if (n9 != 0) {
                    ((f3)this).h().x(bl2);
                    bl = bl2;
                }
            }
            this.e = bl;
        }
        return this.e;
    }

    protected final void n0(boolean bl) {
        ((f3)this).n();
        this.v();
        if (!(m6.a() && ((f3)this).d().t(F.V0) || !bl)) {
            ((C1)this).q().H();
        }
        this.P(new o4(this));
    }
}

