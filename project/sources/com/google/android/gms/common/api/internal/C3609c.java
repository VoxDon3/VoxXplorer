package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.J5.C0742c;
import ax.J5.C0747h;
import ax.L5.C0790b;
import ax.M5.AbstractC0813h;
import ax.M5.C0818m;
import ax.M5.C0822q;
import ax.M5.C0824t;
import ax.M5.C0825u;
import ax.M5.H;
import ax.M5.InterfaceC0826v;
import ax.j6.AbstractC2327j;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3609c implements Handler.Callback {
    public static final Status q0 = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status r0 = new Status(4, "The user must be signed in to make this API call.");
    private static final Object s0 = new Object();
    private static C3609c t0;
    private C0824t d0;
    private InterfaceC0826v e0;
    private final Context f0;
    private final C0747h g0;
    private final H h0;
    private final Handler o0;
    private volatile boolean p0;
    private long q = 10000;
    private boolean c0 = false;
    private final AtomicInteger i0 = new AtomicInteger(1);
    private final AtomicInteger j0 = new AtomicInteger(0);
    private final Map k0 = new ConcurrentHashMap(5, 0.75f, 1);
    private h l0 = null;
    private final Set m0 = new ax.B.b();
    private final Set n0 = new ax.B.b();

    private C3609c(Context context, Looper looper, C0747h c0747h) {
        this.p0 = true;
        this.f0 = context;
        ax.Y5.k kVar = new ax.Y5.k(looper, this);
        this.o0 = kVar;
        this.g0 = c0747h;
        this.h0 = new H(c0747h);
        if (ax.R5.i.a(context)) {
            this.p0 = false;
        }
        kVar.sendMessage(kVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (s0) {
            try {
                C3609c c3609c = t0;
                if (c3609c != null) {
                    c3609c.j0.incrementAndGet();
                    Handler handler = c3609c.o0;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(C0790b c0790b, C0742c c0742c) {
        return new Status(c0742c, "API: " + c0790b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c0742c));
    }

    @ResultIgnorabilityUnspecified
    private final o h(ax.K5.f fVar) {
        Map map = this.k0;
        C0790b j = fVar.j();
        o oVar = (o) map.get(j);
        if (oVar == null) {
            oVar = new o(this, fVar);
            this.k0.put(j, oVar);
        }
        if (oVar.a()) {
            this.n0.add(j);
        }
        oVar.F();
        return oVar;
    }

    private final InterfaceC0826v i() {
        if (this.e0 == null) {
            this.e0 = C0825u.a(this.f0);
        }
        return this.e0;
    }

    private final void j() {
        C0824t c0824t = this.d0;
        if (c0824t != null) {
            if (c0824t.k() > 0 || e()) {
                i().b(c0824t);
            }
            this.d0 = null;
        }
    }

    private final void k(C2328k c2328k, int i, ax.K5.f fVar) {
        s b;
        if (i == 0 || (b = s.b(this, i, fVar.j())) == null) {
            return;
        }
        AbstractC2327j a = c2328k.a();
        final Handler handler = this.o0;
        handler.getClass();
        a.c(new Executor() { // from class: ax.L5.p
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b);
    }

    @ResultIgnorabilityUnspecified
    public static C3609c u(Context context) {
        C3609c c3609c;
        synchronized (s0) {
            try {
                if (t0 == null) {
                    t0 = new C3609c(context.getApplicationContext(), AbstractC0813h.d().getLooper(), C0747h.o());
                }
                c3609c = t0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3609c;
    }

    public final void A(ax.K5.f fVar, int i, AbstractC3608b abstractC3608b) {
        this.o0.sendMessage(this.o0.obtainMessage(4, new ax.L5.x(new x(i, abstractC3608b), this.j0.get(), fVar)));
    }

    public final void B(ax.K5.f fVar, int i, AbstractC3610d abstractC3610d, C2328k c2328k, ax.L5.l lVar) {
        k(c2328k, abstractC3610d.d(), fVar);
        this.o0.sendMessage(this.o0.obtainMessage(4, new ax.L5.x(new y(i, abstractC3610d, c2328k, lVar), this.j0.get(), fVar)));
    }

    final void C(C0818m c0818m, int i, long j, int i2) {
        this.o0.sendMessage(this.o0.obtainMessage(18, new t(c0818m, i, j, i2)));
    }

    public final void D(C0742c c0742c, int i) {
        if (f(c0742c, i)) {
            return;
        }
        Handler handler = this.o0;
        handler.sendMessage(handler.obtainMessage(5, i, 0, c0742c));
    }

    public final void E() {
        Handler handler = this.o0;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void F(ax.K5.f fVar) {
        Handler handler = this.o0;
        handler.sendMessage(handler.obtainMessage(7, fVar));
    }

    public final void b(h hVar) {
        synchronized (s0) {
            try {
                if (this.l0 != hVar) {
                    this.l0 = hVar;
                    this.m0.clear();
                }
                this.m0.addAll(hVar.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final void c(h hVar) {
        synchronized (s0) {
            try {
                if (this.l0 == hVar) {
                    this.l0 = null;
                    this.m0.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final boolean e() {
        if (this.c0) {
            return false;
        }
        ax.M5.r a = C0822q.b().a();
        if (a != null && !a.z()) {
            return false;
        }
        int a2 = this.h0.a(this.f0, 203400000);
        return a2 == -1 || a2 == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean f(C0742c c0742c, int i) {
        return this.g0.y(this.f0, c0742c, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C0790b c0790b;
        boolean o;
        C0790b c0790b2;
        C0790b c0790b3;
        C0790b c0790b4;
        C0790b c0790b5;
        int i = message.what;
        o oVar = null;
        switch (i) {
            case 1:
                this.q = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.o0.removeMessages(12);
                for (C0790b c0790b6 : this.k0.keySet()) {
                    Handler handler = this.o0;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0790b6), this.q);
                }
                return true;
            case 2:
                ax.L5.E e = (ax.L5.E) message.obj;
                Iterator it = e.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C0790b c0790b7 = (C0790b) it.next();
                        o oVar2 = (o) this.k0.get(c0790b7);
                        if (oVar2 == null) {
                            e.b(c0790b7, new C0742c(13), null);
                        } else if (oVar2.Q()) {
                            e.b(c0790b7, C0742c.f0, oVar2.u().g());
                        } else {
                            C0742c s = oVar2.s();
                            if (s != null) {
                                e.b(c0790b7, s, null);
                            } else {
                                oVar2.K(e);
                                oVar2.F();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (o oVar3 : this.k0.values()) {
                    oVar3.E();
                    oVar3.F();
                }
                return true;
            case 4:
            case 8:
            case 13:
                ax.L5.x xVar = (ax.L5.x) message.obj;
                o oVar4 = (o) this.k0.get(xVar.c.j());
                if (oVar4 == null) {
                    oVar4 = h(xVar.c);
                }
                if (!oVar4.a() || this.j0.get() == xVar.b) {
                    oVar4.G(xVar.a);
                } else {
                    xVar.a.a(q0);
                    oVar4.M();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                C0742c c0742c = (C0742c) message.obj;
                Iterator it2 = this.k0.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        o oVar5 = (o) it2.next();
                        if (oVar5.p() == i2) {
                            oVar = oVar5;
                        }
                    }
                }
                if (oVar == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                } else if (c0742c.k() == 13) {
                    oVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.g0.e(c0742c.k()) + ": " + c0742c.y()));
                } else {
                    c0790b = oVar.g;
                    oVar.e(g(c0790b, c0742c));
                }
                return true;
            case 6:
                if (this.f0.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3607a.c((Application) this.f0.getApplicationContext());
                    ComponentCallbacks2C3607a.b().a(new j(this));
                    if (!ComponentCallbacks2C3607a.b().e(true)) {
                        this.q = 300000L;
                    }
                }
                return true;
            case 7:
                h((ax.K5.f) message.obj);
                return true;
            case 9:
                if (this.k0.containsKey(message.obj)) {
                    ((o) this.k0.get(message.obj)).L();
                }
                return true;
            case 10:
                Iterator it3 = this.n0.iterator();
                while (it3.hasNext()) {
                    o oVar6 = (o) this.k0.remove((C0790b) it3.next());
                    if (oVar6 != null) {
                        oVar6.M();
                    }
                }
                this.n0.clear();
                return true;
            case 11:
                if (this.k0.containsKey(message.obj)) {
                    ((o) this.k0.get(message.obj)).N();
                }
                return true;
            case 12:
                if (this.k0.containsKey(message.obj)) {
                    ((o) this.k0.get(message.obj)).b();
                }
                return true;
            case 14:
                i iVar = (i) message.obj;
                C0790b a = iVar.a();
                if (this.k0.containsKey(a)) {
                    o = ((o) this.k0.get(a)).o(false);
                    iVar.b().c(Boolean.valueOf(o));
                } else {
                    iVar.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                p pVar = (p) message.obj;
                Map map = this.k0;
                c0790b2 = pVar.a;
                if (map.containsKey(c0790b2)) {
                    Map map2 = this.k0;
                    c0790b3 = pVar.a;
                    o.C((o) map2.get(c0790b3), pVar);
                }
                return true;
            case 16:
                p pVar2 = (p) message.obj;
                Map map3 = this.k0;
                c0790b4 = pVar2.a;
                if (map3.containsKey(c0790b4)) {
                    Map map4 = this.k0;
                    c0790b5 = pVar2.a;
                    o.D((o) map4.get(c0790b5), pVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                t tVar = (t) message.obj;
                if (tVar.c == 0) {
                    i().b(new C0824t(tVar.b, Arrays.asList(tVar.a)));
                } else {
                    C0824t c0824t = this.d0;
                    if (c0824t != null) {
                        List y = c0824t.y();
                        if (c0824t.k() != tVar.b || (y != null && y.size() >= tVar.d)) {
                            this.o0.removeMessages(17);
                            j();
                        } else {
                            this.d0.z(tVar.a);
                        }
                    }
                    if (this.d0 == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(tVar.a);
                        this.d0 = new C0824t(tVar.b, arrayList);
                        Handler handler2 = this.o0;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), tVar.c);
                    }
                }
                return true;
            case 19:
                this.c0 = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }

    public final int l() {
        return this.i0.getAndIncrement();
    }

    final o t(C0790b c0790b) {
        return (o) this.k0.get(c0790b);
    }
}
