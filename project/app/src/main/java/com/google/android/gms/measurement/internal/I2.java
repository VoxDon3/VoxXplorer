/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import ax.J5.m;
import ax.J5.n;
import ax.M5.p;
import ax.b6.e;
import ax.b6.e0;
import ax.f6.a;
import ax.f6.g;
import ax.f6.q;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.B5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.C5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.H2;
import com.google.android.gms.measurement.internal.J2;
import com.google.android.gms.measurement.internal.K2;
import com.google.android.gms.measurement.internal.L2;
import com.google.android.gms.measurement.internal.M2;
import com.google.android.gms.measurement.internal.N2;
import com.google.android.gms.measurement.internal.O2;
import com.google.android.gms.measurement.internal.P2;
import com.google.android.gms.measurement.internal.Q2;
import com.google.android.gms.measurement.internal.R2;
import com.google.android.gms.measurement.internal.S2;
import com.google.android.gms.measurement.internal.T2;
import com.google.android.gms.measurement.internal.U2;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.W2;
import com.google.android.gms.measurement.internal.X2;
import com.google.android.gms.measurement.internal.Y2;
import com.google.android.gms.measurement.internal.Z2;
import com.google.android.gms.measurement.internal.a3;
import com.google.android.gms.measurement.internal.b3;
import com.google.android.gms.measurement.internal.c3;
import com.google.android.gms.measurement.internal.d3;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.h5;
import com.google.android.gms.measurement.internal.q2;
import com.google.android.gms.measurement.internal.q5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class I2
extends g {
    private final q5 e;
    private Boolean f;
    private String g;

    public I2(q5 q52) {
        this(q52, null);
    }

    private I2(q5 q52, String string) {
        p.l(q52);
        this.e = q52;
        this.g = null;
    }

    private final void B(Runnable runnable2) {
        p.l(runnable2);
        if (this.e.l().J()) {
            runnable2.run();
            return;
        }
        this.e.l().G(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b2(String string, boolean bl) {
        SecurityException securityException2;
        block11: {
            block13: {
                block12: {
                    block8: {
                        block10: {
                            block9: {
                                if (TextUtils.isEmpty((CharSequence)string)) {
                                    this.e.k().G().a("Measurement Service called without app package");
                                    throw new SecurityException("Measurement Service called without app package");
                                }
                                if (!bl) break block12;
                                try {
                                    if (this.f != null) break block8;
                                    if ("com.google.android.gms".equals(this.g) || ax.R5.p.a(this.e.a(), Binder.getCallingUid()) || n.a(this.e.a()).c(Binder.getCallingUid())) break block9;
                                    bl = false;
                                    break block10;
                                }
                                catch (SecurityException securityException2) {
                                    break block11;
                                }
                            }
                            bl = true;
                        }
                        this.f = bl;
                    }
                    if (this.f.booleanValue()) break block13;
                }
                if (this.g == null && m.k(this.e.a(), Binder.getCallingUid(), string)) {
                    this.g = string;
                }
                if (!string.equals(this.g)) {
                    SecurityException securityException3 = new SecurityException(String.format("Unknown calling package name '%s'.", string));
                    throw securityException3;
                }
            }
            return;
        }
        this.e.k().G().b("Measurement Service called with invalid calling package. appId", V1.v(string));
        throw securityException2;
    }

    private final void d2(E5 e52, boolean bl) {
        p.l(e52);
        p.f(e52.q);
        this.b2(e52.q, false);
        this.e.t0().k0(e52.c0, e52.r0);
    }

    private final void e2(Runnable runnable2) {
        p.l(runnable2);
        if (this.e.l().J()) {
            runnable2.run();
            return;
        }
        this.e.l().D(runnable2);
    }

    private final void g2(D d8, E5 e52) {
        this.e.u0();
        this.e.v(d8, e52);
    }

    static /* bridge */ /* synthetic */ q5 w(I2 i22) {
        return i22.e;
    }

    @Override
    public final void A1(E5 e52) {
        this.d2(e52, false);
        this.e2(new M2(this, e52));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<h5> B1(E5 e52, Bundle object) {
        Object var2_5;
        this.d2(e52, false);
        p.l(e52.q);
        object = this.e.l().w(new d3(this, e52, (Bundle)object));
        try {
            object = (List)object.get();
            return object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.e.k().G().c("Failed to get trigger URIs. appId", V1.v(e52.q), var2_5);
        return Collections.EMPTY_LIST;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<f> F(String object, String string, E5 object2) {
        Object var1_4;
        this.d2((E5)object2, false);
        object2 = ((E5)object2).q;
        p.l(object2);
        object = this.e.l().w(new R2(this, (String)object2, (String)object, string));
        try {
            object = (List)object.get();
            return object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.e.k().G().b("Failed to get conditional user properties", var1_4);
        return Collections.EMPTY_LIST;
    }

    @Override
    public final void F0(long l8, String string, String string2, String string3) {
        this.e2(new O2(this, string2, string3, string, l8));
    }

    @Override
    public final void I(E5 e52) {
        p.f(e52.q);
        this.b2(e52.q, false);
        this.e2(new T2(this, e52));
    }

    @Override
    public final void I0(E5 e52) {
        this.d2(e52, false);
        this.e2(new L2(this, e52));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final List<f> J0(String object, String string, String string2) {
        Object var1_4;
        this.b2((String)object, true);
        object = this.e.l().w(new U2(this, (String)object, string, string2));
        try {
            object = (List)object.get();
            return object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.e.k().G().b("Failed to get conditional user properties as", var1_4);
        return Collections.EMPTY_LIST;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List<A5> J1(E5 e52, boolean bl) {
        Iterator iterator;
        Object object;
        ArrayList<A5> arrayList;
        block5: {
            Object var3_6;
            this.d2(e52, false);
            arrayList = e52.q;
            p.l(arrayList);
            arrayList = this.e.l().w(new c3(this, (String)((Object)arrayList)));
            try {
                object = (List)arrayList.get();
                arrayList = new ArrayList<A5>(object.size());
                iterator = object.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            this.e.k().G().c("Failed to get user properties. appId", V1.v(e52.q), var3_6);
            return null;
        }
        while (iterator.hasNext()) {
            object = (C5)iterator.next();
            if (!bl && B5.J0(((C5)object).c)) continue;
            A5 a52 = new A5((C5)object);
            arrayList.add(a52);
        }
        return arrayList;
    }

    @Override
    public final void M0(f f8) {
        p.l(f8);
        p.l(f8.d0);
        p.f(f8.q);
        this.b2(f8.q, true);
        this.e2(new Q2(this, new f(f8)));
    }

    @Override
    public final void N(D d8, String string, String string2) {
        p.l(d8);
        p.f(string);
        this.b2(string, true);
        this.e2(new Y2(this, d8, string));
    }

    @Override
    public final void P(A5 a52, E5 e52) {
        p.l(a52);
        this.d2(e52, false);
        this.e2(new a3(this, a52, e52));
    }

    @Override
    public final void U1(E5 e52) {
        p.f(e52.q);
        p.l(e52.w0);
        this.B(new H2(this, e52));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List<A5> Z(String string, String arrayList, String object, boolean bl) {
        Iterator iterator;
        block5: {
            Object var2_5;
            this.b2(string, true);
            arrayList = this.e.l().w(new S2(this, string, (String)((Object)arrayList), (String)object));
            try {
                object = (List)arrayList.get();
                arrayList = new ArrayList<A5>(object.size());
                iterator = object.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            this.e.k().G().c("Failed to get user properties as. appId", V1.v(string), var2_5);
            return Collections.EMPTY_LIST;
        }
        while (iterator.hasNext()) {
            object = (C5)iterator.next();
            if (!bl && B5.J0(((C5)object).c)) continue;
            A5 a52 = new A5((C5)object);
            arrayList.add(a52);
        }
        return arrayList;
    }

    final /* synthetic */ void a2(String string, Bundle bundle) {
        this.e.h0().i0(string, bundle);
    }

    final D c2(D d8, E5 object) {
        if ("_cmp".equals(d8.q) && (object = d8.c0) != null && ((C)object).k() != 0) {
            object = d8.c0.E("_cis");
            if (!"referrer broadcast".equals(object) && !"referrer API".equals(object)) {
                return d8;
            }
            this.e.k().J().b("Event has been filtered ", d8.toString());
            return new D("_cmpx", d8.c0, d8.d0, d8.e0);
        }
        return d8;
    }

    @Override
    public final void f0(E5 e52) {
        p.f(e52.q);
        p.l(e52.w0);
        this.B(new X2(this, e52));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void f2(D object, E5 e52) {
        boolean bl;
        E5 var2_4;
        if (!this.e.n0().X(var2_4.q)) {
            this.g2((D)object, (E5)var2_4);
            return;
        }
        this.e.k().K().b("EES config found for", var2_4.q);
        Object object2 = this.e.n0();
        Object object3 = var2_4.q;
        object3 = TextUtils.isEmpty((CharSequence)object3) ? null : ((q2)object2).j.c((String)object3);
        if (object3 == null) {
            this.e.k().K().b("EES not loaded for", var2_4.q);
            this.g2((D)object, (E5)var2_4);
            return;
        }
        try {
            Object object4;
            Map<String, Object> map = this.e.s0().Q(((D)object).c0.B(), true);
            object2 = object4 = q.a(((D)object).q);
            if (object4 == null) {
                object2 = ((D)object).q;
            }
            object4 = new e((String)object2, ((D)object).e0, map);
            bl = ((ax.b6.C)object3).d((e)object4);
        }
        catch (e0 e02) {
            this.e.k().G().c("EES error. appId, eventName", var2_4.c0, ((D)object).q);
            bl = false;
        }
        if (!bl) {
            this.e.k().K().b("EES was not applied to event", ((D)object).q);
            this.g2((D)object, (E5)var2_4);
            return;
        }
        if (((ax.b6.C)object3).g()) {
            this.e.k().K().b("EES edited event", ((D)object).q);
            this.g2(this.e.s0().H(((ax.b6.C)object3).a().d()), (E5)var2_4);
        } else {
            this.g2((D)object, (E5)var2_4);
        }
        if (((ax.b6.C)object3).f()) {
            for (e e8 : ((ax.b6.C)object3).a().f()) {
                this.e.k().K().b("EES logging created event", e8.e());
                this.g2(this.e.s0().H(e8), (E5)var2_4);
            }
        }
    }

    @Override
    public final void g0(Bundle bundle, E5 object) {
        this.d2((E5)object, false);
        object = ((E5)object).q;
        p.l(object);
        this.e2(new J2(this, (String)object, bundle));
    }

    @Override
    public final void h0(E5 e52) {
        p.f(e52.q);
        p.l(e52.w0);
        this.B(new K2(this, e52));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final byte[] h1(D d8, String string) {
        Object var7_7;
        block4: {
            Object object;
            long l8;
            block3: {
                p.f(string);
                p.l(d8);
                this.b2(string, true);
                this.e.k().F().b("Log and bundle. event", this.e.j0().c(d8.q));
                l8 = this.e.b().nanoTime() / 1000000L;
                object = this.e.l().B(new b3(this, d8, string));
                try {
                    byte[] byArray = object.get();
                    object = byArray;
                    if (byArray != null) break block3;
                    this.e.k().G().b("Log and bundle returned null. appId", V1.v(string));
                    object = new byte[0];
                }
                catch (ExecutionException executionException) {
                    break block4;
                }
                catch (InterruptedException interruptedException) {
                    break block4;
                }
            }
            long l9 = this.e.b().nanoTime() / 1000000L;
            this.e.k().F().d("Log and bundle processed. event, size, time_ms", this.e.j0().c(d8.q), ((Object)object).length, l9 - l8);
            return object;
        }
        this.e.k().G().d("Failed to log and bundle. appId, event, error", V1.v(string), this.e.j0().c(d8.q), var7_7);
        return null;
    }

    final /* synthetic */ void h2(E5 e52) {
        this.e.u0();
        this.e.g0(e52);
    }

    final /* synthetic */ void i2(E5 e52) {
        this.e.u0();
        this.e.i0(e52);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final a k1(E5 e52) {
        Object var2_6;
        this.d2(e52, false);
        p.f(e52.q);
        Object object = this.e.l().B(new W2(this, e52));
        try {
            object = object.get(10000L, TimeUnit.MILLISECONDS);
            return object;
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (TimeoutException timeoutException) {
            // empty catch block
        }
        this.e.k().G().c("Failed to get consent. appId", V1.v(e52.q), var2_6);
        return new a(null);
    }

    @Override
    public final String p0(E5 e52) {
        this.d2(e52, false);
        return this.e.T(e52);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final List<A5> u1(String arrayList, String iterator, boolean bl, E5 e52) {
        Object object;
        block5: {
            Object var1_4;
            this.d2(e52, false);
            object = e52.q;
            p.l(object);
            arrayList = this.e.l().w(new P2(this, (String)object, (String)((Object)arrayList), (String)((Object)iterator)));
            try {
                iterator = (List)arrayList.get();
                arrayList = new ArrayList<A5>(iterator.size());
                iterator = iterator.iterator();
                break block5;
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {}
            this.e.k().G().c("Failed to query user properties. appId", V1.v(e52.q), var1_4);
            return Collections.EMPTY_LIST;
        }
        while (iterator.hasNext()) {
            C5 c52 = (C5)iterator.next();
            if (!bl && B5.J0(c52.c)) continue;
            object = new A5(c52);
            arrayList.add((A5)object);
        }
        return arrayList;
    }

    @Override
    public final void w1(D d8, E5 e52) {
        p.l(d8);
        this.d2(e52, false);
        this.e2(new Z2(this, d8, e52));
    }

    @Override
    public final void y0(f f8, E5 e52) {
        p.l(f8);
        p.l(f8.d0);
        this.d2(e52, false);
        f8 = new f(f8);
        f8.q = e52.q;
        this.e2(new N2(this, f8, e52));
    }
}

