/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.K5.f;
import ax.L5.E;
import ax.L5.l;
import ax.M5.H;
import ax.M5.m;
import ax.M5.q;
import ax.M5.r;
import ax.M5.u;
import ax.M5.v;
import ax.j6.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class c
implements Handler.Callback {
    public static final Status q0 = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status r0 = new Status(4, "The user must be signed in to make this API call.");
    private static final Object s0 = new Object();
    private static c t0;
    private boolean c0 = false;
    private ax.M5.t d0;
    private v e0;
    private final Context f0;
    private final ax.J5.h g0;
    private final H h0;
    private final AtomicInteger i0 = new AtomicInteger(1);
    private final AtomicInteger j0 = new AtomicInteger(0);
    private final Map k0 = new j.ConcurrentHashMap(5, 0.75f, 1);
    private h l0 = null;
    private final Set m0 = new ax.B.b();
    private final Set n0 = new ax.B.b();
    private final Handler o0;
    private volatile boolean p0 = true;
    private long q = 10000L;

    private c(Context context, Looper object, ax.J5.h h8) {
        this.f0 = context;
        object = new ax.Y5.k((Looper)object, this);
        this.o0 = object;
        this.g0 = h8;
        this.h0 = new H(h8);
        if (ax.R5.i.a(context)) {
            this.p0 = false;
        }
        object.sendMessage(object.obtainMessage(6));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        Object object = s0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        c c8 = t0;
                        if (c8 == null) break block3;
                        c8.j0.incrementAndGet();
                        c8 = c8.o0;
                        c8.sendMessageAtFrontOfQueue(c8.obtainMessage(10));
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    static /* bridge */ /* synthetic */ boolean d(c c8) {
        return c8.p0;
    }

    private static Status g(ax.L5.b object, ax.J5.c c8) {
        String string = ((ax.L5.b)object).b();
        String string2 = String.valueOf(c8);
        object = new StringBuilder();
        ((StringBuilder)object).append("API: ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" is not available on this device. Connection failed with: ");
        ((StringBuilder)object).append(string2);
        return new Status(c8, ((StringBuilder)object).toString());
    }

    @ResultIgnorabilityUnspecified
    private final o h(f f8) {
        Object object = this.k0;
        ax.L5.b b8 = f8.j();
        o o8 = (o)object.get(b8);
        object = o8;
        if (o8 == null) {
            object = new o(this, f8);
            this.k0.put(b8, object);
        }
        if (((o)object).a()) {
            this.n0.add(b8);
        }
        ((o)object).F();
        return object;
    }

    private final v i() {
        if (this.e0 == null) {
            this.e0 = u.a(this.f0);
        }
        return this.e0;
    }

    private final void j() {
        ax.M5.t t8 = this.d0;
        if (t8 != null) {
            if (t8.k() > 0 || this.e()) {
                this.i().b(t8);
            }
            this.d0 = null;
        }
    }

    private final void k(k object, int n8, f object2) {
        if (n8 != 0 && (object2 = s.b(this, n8, ((f)object2).j())) != null) {
            object = ((k)object).a();
            Handler handler = this.o0;
            handler.getClass();
            ((ax.j6.j)object).c(new ax.L5.p(handler), object2);
        }
    }

    static /* bridge */ /* synthetic */ long m(c c8) {
        return c8.q;
    }

    static /* bridge */ /* synthetic */ Context n(c c8) {
        return c8.f0;
    }

    static /* bridge */ /* synthetic */ Handler o(c c8) {
        return c8.o0;
    }

    static /* bridge */ /* synthetic */ ax.J5.h p(c c8) {
        return c8.g0;
    }

    static /* bridge */ /* synthetic */ Status q() {
        return r0;
    }

    static /* bridge */ /* synthetic */ Status r(ax.L5.b b8, ax.J5.c c8) {
        return c.g(b8, c8);
    }

    static /* bridge */ /* synthetic */ h s(c c8) {
        return c8.l0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ResultIgnorabilityUnspecified
    public static c u(Context object) {
        Object object2 = s0;
        synchronized (object2) {
            try {
                c c8;
                if (t0 != null) return t0;
                Looper looper = ax.M5.h.d().getLooper();
                t0 = c8 = new c(object.getApplicationContext(), looper, ax.J5.h.o());
                return t0;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static /* bridge */ /* synthetic */ H v(c c8) {
        return c8.h0;
    }

    static /* bridge */ /* synthetic */ Object w() {
        return s0;
    }

    static /* bridge */ /* synthetic */ Map x(c c8) {
        return c8.k0;
    }

    static /* bridge */ /* synthetic */ Set y(c c8) {
        return c8.m0;
    }

    static /* bridge */ /* synthetic */ void z(c c8, boolean bl) {
        c8.c0 = true;
    }

    public final void A(f object, int n8, b b8) {
        object = new ax.L5.x(new x(n8, b8), this.j0.get(), (f)object);
        object = this.o0.obtainMessage(4, object);
        this.o0.sendMessage((Message)object);
    }

    public final void B(f object, int n8, d d8, k k8, l l8) {
        this.k(k8, d8.d(), (f)object);
        object = new ax.L5.x(new y(n8, d8, k8, l8), this.j0.get(), (f)object);
        object = this.o0.obtainMessage(4, object);
        this.o0.sendMessage((Message)object);
    }

    final void C(m object, int n8, long l8, int n9) {
        object = new t((m)object, n8, l8, n9);
        object = this.o0.obtainMessage(18, object);
        this.o0.sendMessage((Message)object);
    }

    public final void D(ax.J5.c c8, int n8) {
        if (!this.f(c8, n8)) {
            Handler handler = this.o0;
            handler.sendMessage(handler.obtainMessage(5, n8, 0, (Object)c8));
        }
    }

    public final void E() {
        Handler handler = this.o0;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(f f8) {
        Handler handler = this.o0;
        handler.sendMessage(handler.obtainMessage(7, (Object)f8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(h h8) {
        Object object = s0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.l0 == h8) break block3;
                        this.l0 = h8;
                        this.m0.clear();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.m0.addAll(h8.t());
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void c(h h8) {
        Object object = s0;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.l0 != h8) break block3;
                        this.l0 = null;
                        this.m0.clear();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    final boolean e() {
        if (this.c0) {
            return false;
        }
        r r8 = ax.M5.q.b().a();
        if (r8 != null && !r8.z()) {
            return false;
        }
        int n8 = this.h0.a(this.f0, 203400000);
        return n8 == -1 || n8 == 0;
        {
        }
    }

    @ResultIgnorabilityUnspecified
    final boolean f(ax.J5.c c8, int n8) {
        return this.g0.y(this.f0, c8, n8);
    }

    public final boolean handleMessage(Message object) {
        int n8 = ((Message)object).what;
        long l8 = 300000L;
        Object object22 = null;
        block0 : switch (n8) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown message id: ");
                ((StringBuilder)object).append(n8);
                Log.w((String)"GoogleApiManager", (String)((StringBuilder)object).toString());
                return false;
            }
            case 19: {
                this.c0 = false;
                break;
            }
            case 18: {
                object = (t)((Message)object).obj;
                if (((t)object).c == 0L) {
                    object = new ax.M5.t(((t)object).b, Arrays.asList(((t)object).a));
                    this.i().b((ax.M5.t)object);
                    break;
                }
                object22 = this.d0;
                if (object22 != null) {
                    List list = ((ax.M5.t)object22).y();
                    if (((ax.M5.t)object22).k() == ((t)object).b && (list == null || list.size() < ((t)object).d)) {
                        this.d0.z(((t)object).a);
                    } else {
                        this.o0.removeMessages(17);
                        this.j();
                    }
                }
                if (this.d0 != null) break;
                object22 = new ArrayList();
                ((ArrayList)object22).add(((t)object).a);
                this.d0 = new ax.M5.t(((t)object).b, (List)object22);
                object22 = this.o0;
                object22.sendMessageDelayed(object22.obtainMessage(17), ((t)object).c);
                break;
            }
            case 17: {
                this.j();
                break;
            }
            case 16: {
                object = (p)((Message)object).obj;
                if (!this.k0.containsKey(p.b((p)object))) break;
                o.D((o)this.k0.get(p.b((p)object)), (p)object);
                break;
            }
            case 15: {
                object = (p)((Message)object).obj;
                if (!this.k0.containsKey(p.b((p)object))) break;
                o.C((o)this.k0.get(p.b((p)object)), (p)object);
                break;
            }
            case 14: {
                object22 = (i)((Message)object).obj;
                object = ((i)object22).a();
                if (!this.k0.containsKey(object)) {
                    ((i)object22).b().c(Boolean.FALSE);
                    break;
                }
                boolean bl = o.P((o)this.k0.get(object), false);
                ((i)object22).b().c(bl);
                break;
            }
            case 12: {
                if (!this.k0.containsKey(((Message)object).obj)) break;
                ((o)this.k0.get(((Message)object).obj)).b();
                break;
            }
            case 11: {
                if (!this.k0.containsKey(((Message)object).obj)) break;
                ((o)this.k0.get(((Message)object).obj)).N();
                break;
            }
            case 10: {
                for (Object object22 : this.n0) {
                    if ((object22 = (o)this.k0.remove(object22)) == null) continue;
                    ((o)object22).M();
                }
                this.n0.clear();
                break;
            }
            case 9: {
                if (!this.k0.containsKey(((Message)object).obj)) break;
                ((o)this.k0.get(((Message)object).obj)).L();
                break;
            }
            case 7: {
                this.h((f)((Message)object).obj);
                break;
            }
            case 6: {
                if (!(this.f0.getApplicationContext() instanceof Application)) break;
                a.c((Application)this.f0.getApplicationContext());
                a.b().a(new j(this));
                if (a.b().e(true)) break;
                this.q = 300000L;
                break;
            }
            case 5: {
                n8 = ((Message)object).arg1;
                Object object3 = (ax.J5.c)((Message)object).obj;
                Object object4 = this.k0.values().iterator();
                do {
                    object = object22;
                } while (object4.hasNext() && ((o)(object = (o)object4.next())).p() != n8);
                if (object != null) {
                    if (((ax.J5.c)object3).k() == 13) {
                        object22 = this.g0.e(((ax.J5.c)object3).k());
                        object4 = ((ax.J5.c)object3).y();
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Error resolution was canceled by the user, original error message: ");
                        ((StringBuilder)object3).append((String)object22);
                        ((StringBuilder)object3).append(": ");
                        ((StringBuilder)object3).append((String)object4);
                        o.y((o)object, new Status(17, ((StringBuilder)object3).toString()));
                        break;
                    }
                    o.y((o)object, c.g(o.v((o)object), (ax.J5.c)object3));
                    break;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Could not find API instance ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(" while trying to fail enqueued calls.");
                Log.wtf((String)"GoogleApiManager", (String)((StringBuilder)object).toString(), (Throwable)new Exception());
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                ax.L5.x x8 = (ax.L5.x)((Message)object).obj;
                object = object22 = (o)this.k0.get(x8.c.j());
                if (object22 == null) {
                    object = this.h(x8.c);
                }
                if (((o)object).a() && this.j0.get() != x8.b) {
                    x8.a.a(q0);
                    ((o)object).M();
                    break;
                }
                ((o)object).G(x8.a);
                break;
            }
            case 3: {
                for (Object object22 : this.k0.values()) {
                    ((o)object22).E();
                    ((o)object22).F();
                }
                break;
            }
            case 2: {
                E e8 = (E)((Message)object).obj;
                for (ax.L5.b b8 : e8.a()) {
                    object22 = (o)this.k0.get(b8);
                    if (object22 == null) {
                        e8.b(b8, new ax.J5.c(13), null);
                        break block0;
                    }
                    if (((o)object22).Q()) {
                        e8.b(b8, ax.J5.c.f0, ((o)object22).u().g());
                        continue;
                    }
                    object = ((o)object22).s();
                    if (object != null) {
                        e8.b(b8, (ax.J5.c)object, null);
                        continue;
                    }
                    ((o)object22).K(e8);
                    ((o)object22).F();
                }
                break;
            }
            case 1: {
                if (((Boolean)((Message)object).obj).booleanValue()) {
                    l8 = 10000L;
                }
                this.q = l8;
                this.o0.removeMessages(12);
                for (ax.L5.b b9 : this.k0.keySet()) {
                    object22 = this.o0;
                    object22.sendMessageDelayed(object22.obtainMessage(12, (Object)b9), this.q);
                }
            }
        }
        return true;
    }

    public final int l() {
        return this.i0.getAndIncrement();
    }

    final o t(ax.L5.b b8) {
        return (o)this.k0.get(b8);
    }
}

