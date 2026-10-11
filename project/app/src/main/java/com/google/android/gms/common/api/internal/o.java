/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.B.a;
import ax.K5.a;
import ax.K5.f;
import ax.K5.g;
import ax.L5.B;
import ax.L5.C;
import ax.L5.E;
import ax.L5.b;
import ax.L5.u;
import ax.L5.y;
import ax.M5.c;
import ax.O5.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.z;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class o
implements g.a,
g.b {
    private final Queue e;
    private final a.f f;
    private final b g;
    private final g h;
    private final Set i;
    private final Map j;
    private final int k;
    private final C l;
    private boolean m;
    private final List n;
    private ax.J5.c o;
    private int p;
    final c q;

    public o(c c8, f f8) {
        a.f f9;
        this.q = c8;
        this.e = new LinkedList();
        this.i = new HashSet();
        this.j = new HashMap();
        this.n = new ArrayList();
        this.o = null;
        this.p = 0;
        this.f = f9 = f8.o(c.o(c8).getLooper(), this);
        this.g = f8.j();
        this.h = new g();
        this.k = f8.n();
        if (f9.o()) {
            this.l = f8.p(c.n(c8), c.o(c8));
            return;
        }
        this.l = null;
    }

    static /* bridge */ /* synthetic */ void A(o o8, int n8) {
        o8.i(n8);
    }

    static /* bridge */ /* synthetic */ void C(o o8, p p8) {
        if (o8.n.contains(p8) && !o8.m) {
            if (!o8.f.a()) {
                o8.F();
                return;
            }
            o8.g();
        }
    }

    static /* bridge */ /* synthetic */ void D(o o8, p object) {
        if (o8.n.remove(object)) {
            c.o(o8.q).removeMessages(15, object);
            c.o(o8.q).removeMessages(16, object);
            object = com.google.android.gms.common.api.internal.p.a((p)object);
            ArrayList<A> arrayList = new ArrayList<A>(o8.e.size());
            for (A a8 : o8.e) {
                ax.J5.e[] eArray;
                if (!(a8 instanceof u) || (eArray = ((u)a8).g(o8)) == null || !ax.R5.b.b(eArray, object)) continue;
                arrayList.add(a8);
            }
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                A a8;
                a8 = (A)arrayList.get(i8);
                o8.e.remove(a8);
                a8.b(new ax.K5.n((ax.J5.e)object));
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean O(o o8) {
        return o8.m;
    }

    static /* bridge */ /* synthetic */ boolean P(o o8, boolean bl) {
        return o8.o(false);
    }

    private final ax.J5.e c(ax.J5.e[] eArray) {
        if (eArray != null && eArray.length != 0) {
            Object object;
            int n8;
            Object object2 = this.f.l();
            int n9 = 0;
            Object object3 = object2;
            if (object2 == null) {
                object3 = new ax.J5.e[]{};
            }
            object2 = new a(((ax.J5.e[])object3).length);
            for (n8 = 0; n8 < ((ax.J5.e[])object3).length; ++n8) {
                object = object3[n8];
                object2.put(((ax.J5.e)object).k(), ((ax.J5.e)object).y());
            }
            int n10 = eArray.length;
            for (n8 = n9; n8 < n10; ++n8) {
                object3 = eArray[n8];
                object = (Long)object2.get(((ax.J5.e)object3).k());
                if (object != null && (Long)object >= ((ax.J5.e)object3).y()) {
                    continue;
                }
                return object3;
            }
        }
        return null;
    }

    private final void d(ax.J5.c c8) {
        for (E e8 : this.i) {
            String string = ax.M5.n.b(c8, ax.J5.c.f0) ? this.f.g() : null;
            e8.b(this.g, c8, string);
        }
        this.i.clear();
    }

    private final void e(Status status) {
        ax.M5.p.d(c.o(this.q));
        this.f(status, null, false);
    }

    private final void f(Status status, Exception exception, boolean bl) {
        ax.M5.p.d(c.o(this.q));
        boolean bl2 = true;
        boolean bl3 = status == null;
        if (exception != null) {
            bl2 = false;
        }
        if (bl3 != bl2) {
            Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                A a8 = (A)iterator.next();
                if (bl && a8.a != 2) continue;
                if (status != null) {
                    a8.a(status);
                } else {
                    a8.b(exception);
                }
                iterator.remove();
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.e);
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            A a8 = (A)arrayList.get(i8);
            if (!this.f.a()) break;
            if (!this.m(a8)) continue;
            this.e.remove(a8);
        }
    }

    private final void h() {
        this.E();
        this.d(ax.J5.c.f0);
        this.l();
        Iterator iterator = this.j.values().iterator();
        if (!iterator.hasNext()) {
            this.g();
            this.j();
            return;
        }
        ((y)iterator.next()).getClass();
        throw null;
    }

    private final void i(int n8) {
        this.E();
        this.m = true;
        Iterator iterator = this.f.m();
        this.h.e(n8, (String)((Object)iterator));
        b b8 = this.g;
        iterator = this.q;
        c.o((c)((Object)iterator)).sendMessageDelayed(Message.obtain((Handler)c.o((c)((Object)iterator)), (int)9, (Object)b8), 5000L);
        b8 = this.g;
        iterator = this.q;
        c.o((c)((Object)iterator)).sendMessageDelayed(Message.obtain((Handler)c.o((c)((Object)iterator)), (int)11, (Object)b8), 120000L);
        c.v(this.q).c();
        iterator = this.j.values().iterator();
        while (iterator.hasNext()) {
            ((y)iterator.next()).a.run();
        }
    }

    private final void j() {
        b b8 = this.g;
        c.o(this.q).removeMessages(12, (Object)b8);
        b8 = this.g;
        c c8 = this.q;
        c.o(c8).sendMessageDelayed(c.o(c8).obtainMessage(12, (Object)b8), c.m(this.q));
    }

    private final void k(A a8) {
        a8.d(this.h, this.a());
        try {
            a8.c(this);
            return;
        }
        catch (DeadObjectException deadObjectException) {
            this.w(1);
            this.f.e("DeadObjectException thrown while running ApiCallRunner.");
            return;
        }
    }

    private final void l() {
        if (this.m) {
            c c8 = this.q;
            b b8 = this.g;
            c.o(c8).removeMessages(11, (Object)b8);
            c8 = this.q;
            b8 = this.g;
            c.o(c8).removeMessages(9, (Object)b8);
            this.m = false;
        }
    }

    private final boolean m(A object) {
        if (!(object instanceof u)) {
            this.k((A)object);
            return true;
        }
        u u8 = (u)object;
        Object object2 = this.c(u8.g(this));
        if (object2 == null) {
            this.k((A)object);
            return true;
        }
        String string = this.f.getClass().getName();
        String string2 = ((ax.J5.e)object2).k();
        long l8 = ((ax.J5.e)object2).y();
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" could not execute call because it requires feature (");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", ");
        ((StringBuilder)object).append(l8);
        ((StringBuilder)object).append(").");
        Log.w((String)"GoogleApiManager", (String)((StringBuilder)object).toString());
        if (c.d(this.q) && u8.f(this)) {
            object = new p(this.g, (ax.J5.e)object2, null);
            int n8 = this.n.indexOf(object);
            if (n8 >= 0) {
                object2 = (p)this.n.get(n8);
                c.o(this.q).removeMessages(15, object2);
                object = this.q;
                c.o((c)object).sendMessageDelayed(Message.obtain((Handler)c.o((c)object), (int)15, (Object)object2), 5000L);
            } else {
                this.n.add(object);
                object2 = this.q;
                c.o((c)object2).sendMessageDelayed(Message.obtain((Handler)c.o((c)object2), (int)15, (Object)object), 5000L);
                object2 = this.q;
                c.o((c)object2).sendMessageDelayed(Message.obtain((Handler)c.o((c)object2), (int)16, (Object)object), 120000L);
                object = new ax.J5.c(2, null);
                if (!this.n((ax.J5.c)object)) {
                    this.q.f((ax.J5.c)object, this.k);
                }
            }
            return false;
        }
        u8.b(new ax.K5.n((ax.J5.e)object2));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean n(ax.J5.c c8) {
        Object object = c.w();
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    c c9 = this.q;
                    if (c.s(c9) != null && c.y(c9).contains(this.g)) {
                        c.s(this.q).s(c8, this.k);
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return false;
            }
            throw throwable2;
        }
    }

    private final boolean o(boolean bl) {
        ax.M5.p.d(c.o(this.q));
        if (this.f.a() && this.j.isEmpty()) {
            if (this.h.g()) {
                if (bl) {
                    this.j();
                }
            } else {
                this.f.e("Timing out service connection.");
                return true;
            }
        }
        return false;
    }

    static /* bridge */ /* synthetic */ a.f t(o o8) {
        return o8.f;
    }

    static /* bridge */ /* synthetic */ b v(o o8) {
        return o8.g;
    }

    static /* bridge */ /* synthetic */ void y(o o8, Status status) {
        o8.e(status);
    }

    static /* bridge */ /* synthetic */ void z(o o8) {
        o8.h();
    }

    @Override
    public final void B(Bundle object) {
        object = this.q;
        if (Looper.myLooper() == c.o((c)object).getLooper()) {
            this.h();
            return;
        }
        c.o(this.q).post((Runnable)new k(this));
    }

    public final void E() {
        ax.M5.p.d(c.o(this.q));
        this.o = null;
    }

    public final void F() {
        block7: {
            IllegalStateException illegalStateException2;
            block8: {
                Object object;
                block6: {
                    int n8;
                    ax.M5.p.d(c.o(this.q));
                    if (this.f.a() || this.f.f()) break block7;
                    try {
                        object = this.q;
                        n8 = c.v((c)object).b(c.n((c)object), this.f);
                        if (n8 == 0) break block6;
                    }
                    catch (IllegalStateException illegalStateException2) {}
                    object = new ax.J5.c(n8, null);
                    String string = this.f.getClass().getName();
                    String string2 = object.toString();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The service for ");
                    stringBuilder.append(string);
                    stringBuilder.append(" is not available: ");
                    stringBuilder.append(string2);
                    Log.w((String)"GoogleApiManager", (String)stringBuilder.toString());
                    this.I((ax.J5.c)object, null);
                    return;
                    break block8;
                }
                Object object2 = this.q;
                object = this.f;
                object2 = new r((c)object2, (a.f)object, this.g);
                if (object.o()) {
                    ax.M5.p.l(this.l).d2((B)object2);
                }
                try {
                    this.f.h((c.c)object2);
                    return;
                }
                catch (SecurityException securityException) {
                    this.I(new ax.J5.c(10), securityException);
                    return;
                }
            }
            this.I(new ax.J5.c(10), illegalStateException2);
        }
    }

    public final void G(A object) {
        ax.M5.p.d(c.o(this.q));
        if (this.f.a()) {
            if (this.m((A)object)) {
                this.j();
                return;
            }
            this.e.add(object);
            return;
        }
        this.e.add(object);
        object = this.o;
        if (object != null && ((ax.J5.c)object).B()) {
            this.I(this.o, null);
            return;
        }
        this.F();
    }

    final void H() {
        ++this.p;
    }

    public final void I(ax.J5.c object, Exception object2) {
        ax.M5.p.d(c.o(this.q));
        Object object3 = this.l;
        if (object3 != null) {
            ((C)object3).e2();
        }
        this.E();
        c.v(this.q).c();
        this.d((ax.J5.c)object);
        if (this.f instanceof e && ((ax.J5.c)object).k() != 24) {
            c.z(this.q, true);
            object3 = this.q;
            c.o((c)object3).sendMessageDelayed(c.o((c)object3).obtainMessage(19), 300000L);
        }
        if (((ax.J5.c)object).k() == 4) {
            this.e(c.q());
            return;
        }
        if (this.e.isEmpty()) {
            this.o = object;
            return;
        }
        if (object2 != null) {
            ax.M5.p.d(c.o(this.q));
            this.f(null, (Exception)object2, false);
            return;
        }
        if (c.d(this.q)) {
            this.f(c.r(this.g, (ax.J5.c)object), null, true);
            if (!(this.e.isEmpty() || this.n((ax.J5.c)object) || this.q.f((ax.J5.c)object, this.k))) {
                if (((ax.J5.c)object).k() == 18) {
                    this.m = true;
                }
                if (this.m) {
                    object2 = this.q;
                    object = this.g;
                    c.o((c)object2).sendMessageDelayed(Message.obtain((Handler)c.o((c)object2), (int)9, (Object)object), 5000L);
                    return;
                }
                this.e(c.r(this.g, (ax.J5.c)object));
            }
            return;
        }
        this.e(c.r(this.g, (ax.J5.c)object));
    }

    public final void J(ax.J5.c c8) {
        ax.M5.p.d(c.o(this.q));
        a.f f8 = this.f;
        String string = f8.getClass().getName();
        String string2 = String.valueOf(c8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onSignInFailed for ");
        stringBuilder.append(string);
        stringBuilder.append(" with ");
        stringBuilder.append(string2);
        f8.e(stringBuilder.toString());
        this.I(c8, null);
    }

    public final void K(E e8) {
        ax.M5.p.d(c.o(this.q));
        this.i.add(e8);
    }

    public final void L() {
        ax.M5.p.d(c.o(this.q));
        if (this.m) {
            this.F();
        }
    }

    public final void M() {
        ax.M5.p.d(c.o(this.q));
        this.e(c.q0);
        this.h.f();
        ax.L5.g[] gArray = this.j.keySet();
        gArray = gArray.toArray(new ax.L5.g[0]);
        int n8 = gArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.G(new z(gArray[i8], new ax.j6.k()));
        }
        this.d(new ax.J5.c(4));
        if (this.f.a()) {
            this.f.i(new n(this));
        }
    }

    public final void N() {
        ax.M5.p.d(c.o(this.q));
        if (this.m) {
            this.l();
            Object object = this.q;
            object = c.p((c)object).g(c.n((c)object)) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.");
            this.e((Status)object);
            this.f.e("Timing out connection while resuming.");
        }
    }

    final boolean Q() {
        return this.f.a();
    }

    public final boolean a() {
        return this.f.o();
    }

    @ResultIgnorabilityUnspecified
    public final boolean b() {
        return this.o(true);
    }

    public final int p() {
        return this.k;
    }

    final int q() {
        return this.p;
    }

    @Override
    public final void r(ax.J5.c c8) {
        this.I(c8, null);
    }

    public final ax.J5.c s() {
        ax.M5.p.d(c.o(this.q));
        return this.o;
    }

    public final a.f u() {
        return this.f;
    }

    @Override
    public final void w(int n8) {
        c c8 = this.q;
        if (Looper.myLooper() == c.o(c8).getLooper()) {
            this.i(n8);
            return;
        }
        c.o(this.q).post((Runnable)new l(this, n8));
    }

    public final Map x() {
        return this.j;
    }
}

