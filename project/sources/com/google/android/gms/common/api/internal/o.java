package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.J5.C0742c;
import ax.J5.C0744e;
import ax.K5.a;
import ax.K5.g;
import ax.L5.C0790b;
import ax.L5.C0795g;
import ax.M5.C0819n;
import ax.M5.C0821p;
import ax.j6.C2328k;
import com.google.android.gms.common.api.Status;
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

/* loaded from: classes3.dex */
public final class o implements g.a, g.b {
    private final a.f f;
    private final C0790b g;
    private final C3613g h;
    private final int k;
    private final ax.L5.C l;
    private boolean m;
    final /* synthetic */ C3609c q;
    private final Queue e = new LinkedList();
    private final Set i = new HashSet();
    private final Map j = new HashMap();
    private final List n = new ArrayList();
    private C0742c o = null;
    private int p = 0;

    public o(C3609c c3609c, ax.K5.f fVar) {
        this.q = c3609c;
        a.f o = fVar.o(c3609c.o0.getLooper(), this);
        this.f = o;
        this.g = fVar.j();
        this.h = new C3613g();
        this.k = fVar.n();
        if (o.o()) {
            this.l = fVar.p(c3609c.f0, c3609c.o0);
        } else {
            this.l = null;
        }
    }

    static /* bridge */ /* synthetic */ void C(o oVar, p pVar) {
        if (oVar.n.contains(pVar) && !oVar.m) {
            if (oVar.f.a()) {
                oVar.g();
            } else {
                oVar.F();
            }
        }
    }

    static /* bridge */ /* synthetic */ void D(o oVar, p pVar) {
        C0744e c0744e;
        C0744e[] g;
        if (oVar.n.remove(pVar)) {
            oVar.q.o0.removeMessages(15, pVar);
            oVar.q.o0.removeMessages(16, pVar);
            c0744e = pVar.b;
            ArrayList arrayList = new ArrayList(oVar.e.size());
            for (A a : oVar.e) {
                if ((a instanceof ax.L5.u) && (g = ((ax.L5.u) a).g(oVar)) != null && ax.R5.b.b(g, c0744e)) {
                    arrayList.add(a);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                A a2 = (A) arrayList.get(i);
                oVar.e.remove(a2);
                a2.b(new ax.K5.n(c0744e));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C0744e c(C0744e[] c0744eArr) {
        if (c0744eArr != null && c0744eArr.length != 0) {
            C0744e[] l = this.f.l();
            if (l == null) {
                l = new C0744e[0];
            }
            ax.B.a aVar = new ax.B.a(l.length);
            for (C0744e c0744e : l) {
                aVar.put(c0744e.k(), Long.valueOf(c0744e.y()));
            }
            for (C0744e c0744e2 : c0744eArr) {
                Long l2 = (Long) aVar.get(c0744e2.k());
                if (l2 == null || l2.longValue() < c0744e2.y()) {
                    return c0744e2;
                }
            }
        }
        return null;
    }

    private final void d(C0742c c0742c) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((ax.L5.E) it.next()).b(this.g, c0742c, C0819n.b(c0742c, C0742c.f0) ? this.f.g() : null);
        }
        this.i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Status status) {
        C0821p.d(this.q.o0);
        f(status, null, false);
    }

    private final void f(Status status, Exception exc, boolean z) {
        C0821p.d(this.q.o0);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            A a = (A) it.next();
            if (!z || a.a == 2) {
                if (status != null) {
                    a.a(status);
                } else {
                    a.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void g() {
        ArrayList arrayList = new ArrayList(this.e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A a = (A) arrayList.get(i);
            if (!this.f.a()) {
                return;
            }
            if (m(a)) {
                this.e.remove(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        E();
        d(C0742c.f0);
        l();
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            ((ax.L5.y) it.next()).getClass();
            throw null;
        }
        g();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i) {
        E();
        this.m = true;
        this.h.e(i, this.f.m());
        C0790b c0790b = this.g;
        C3609c c3609c = this.q;
        c3609c.o0.sendMessageDelayed(Message.obtain(c3609c.o0, 9, c0790b), 5000L);
        C0790b c0790b2 = this.g;
        C3609c c3609c2 = this.q;
        c3609c2.o0.sendMessageDelayed(Message.obtain(c3609c2.o0, 11, c0790b2), 120000L);
        this.q.h0.c();
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((ax.L5.y) it.next()).a.run();
        }
    }

    private final void j() {
        this.q.o0.removeMessages(12, this.g);
        C0790b c0790b = this.g;
        C3609c c3609c = this.q;
        c3609c.o0.sendMessageDelayed(c3609c.o0.obtainMessage(12, c0790b), this.q.q);
    }

    private final void k(A a) {
        a.d(this.h, a());
        try {
            a.c(this);
        } catch (DeadObjectException unused) {
            w(1);
            this.f.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void l() {
        if (this.m) {
            C3609c c3609c = this.q;
            c3609c.o0.removeMessages(11, this.g);
            C3609c c3609c2 = this.q;
            c3609c2.o0.removeMessages(9, this.g);
            this.m = false;
        }
    }

    private final boolean m(A a) {
        if (!(a instanceof ax.L5.u)) {
            k(a);
            return true;
        }
        ax.L5.u uVar = (ax.L5.u) a;
        C0744e c = c(uVar.g(this));
        if (c == null) {
            k(a);
            return true;
        }
        Log.w("GoogleApiManager", this.f.getClass().getName() + " could not execute call because it requires feature (" + c.k() + ", " + c.y() + ").");
        if (!this.q.p0 || !uVar.f(this)) {
            uVar.b(new ax.K5.n(c));
            return true;
        }
        p pVar = new p(this.g, c, null);
        int indexOf = this.n.indexOf(pVar);
        if (indexOf >= 0) {
            p pVar2 = (p) this.n.get(indexOf);
            this.q.o0.removeMessages(15, pVar2);
            C3609c c3609c = this.q;
            c3609c.o0.sendMessageDelayed(Message.obtain(c3609c.o0, 15, pVar2), 5000L);
            return false;
        }
        this.n.add(pVar);
        C3609c c3609c2 = this.q;
        c3609c2.o0.sendMessageDelayed(Message.obtain(c3609c2.o0, 15, pVar), 5000L);
        C3609c c3609c3 = this.q;
        c3609c3.o0.sendMessageDelayed(Message.obtain(c3609c3.o0, 16, pVar), 120000L);
        C0742c c0742c = new C0742c(2, null);
        if (n(c0742c)) {
            return false;
        }
        this.q.f(c0742c, this.k);
        return false;
    }

    private final boolean n(C0742c c0742c) {
        synchronized (C3609c.s0) {
            try {
                C3609c c3609c = this.q;
                if (c3609c.l0 == null || !c3609c.m0.contains(this.g)) {
                    return false;
                }
                this.q.l0.s(c0742c, this.k);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(boolean z) {
        C0821p.d(this.q.o0);
        if (!this.f.a() || !this.j.isEmpty()) {
            return false;
        }
        if (!this.h.g()) {
            this.f.e("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        j();
        return false;
    }

    @Override // ax.L5.InterfaceC0791c
    public final void B(Bundle bundle) {
        if (Looper.myLooper() == this.q.o0.getLooper()) {
            h();
        } else {
            this.q.o0.post(new k(this));
        }
    }

    public final void E() {
        C0821p.d(this.q.o0);
        this.o = null;
    }

    public final void F() {
        C0821p.d(this.q.o0);
        if (this.f.a() || this.f.f()) {
            return;
        }
        try {
            C3609c c3609c = this.q;
            int b = c3609c.h0.b(c3609c.f0, this.f);
            if (b == 0) {
                C3609c c3609c2 = this.q;
                a.f fVar = this.f;
                r rVar = new r(c3609c2, fVar, this.g);
                if (fVar.o()) {
                    ((ax.L5.C) C0821p.l(this.l)).d2(rVar);
                }
                try {
                    this.f.h(rVar);
                    return;
                } catch (SecurityException e) {
                    I(new C0742c(10), e);
                    return;
                }
            }
            C0742c c0742c = new C0742c(b, null);
            Log.w("GoogleApiManager", "The service for " + this.f.getClass().getName() + " is not available: " + c0742c.toString());
            I(c0742c, null);
        } catch (IllegalStateException e2) {
            I(new C0742c(10), e2);
        }
    }

    public final void G(A a) {
        C0821p.d(this.q.o0);
        if (this.f.a()) {
            if (m(a)) {
                j();
                return;
            } else {
                this.e.add(a);
                return;
            }
        }
        this.e.add(a);
        C0742c c0742c = this.o;
        if (c0742c == null || !c0742c.B()) {
            F();
        } else {
            I(this.o, null);
        }
    }

    final void H() {
        this.p++;
    }

    public final void I(C0742c c0742c, Exception exc) {
        C0821p.d(this.q.o0);
        ax.L5.C c = this.l;
        if (c != null) {
            c.e2();
        }
        E();
        this.q.h0.c();
        d(c0742c);
        if ((this.f instanceof ax.O5.e) && c0742c.k() != 24) {
            this.q.c0 = true;
            C3609c c3609c = this.q;
            c3609c.o0.sendMessageDelayed(c3609c.o0.obtainMessage(19), 300000L);
        }
        if (c0742c.k() == 4) {
            e(C3609c.r0);
            return;
        }
        if (this.e.isEmpty()) {
            this.o = c0742c;
            return;
        }
        if (exc != null) {
            C0821p.d(this.q.o0);
            f(null, exc, false);
            return;
        }
        if (!this.q.p0) {
            e(C3609c.g(this.g, c0742c));
            return;
        }
        f(C3609c.g(this.g, c0742c), null, true);
        if (this.e.isEmpty() || n(c0742c) || this.q.f(c0742c, this.k)) {
            return;
        }
        if (c0742c.k() == 18) {
            this.m = true;
        }
        if (!this.m) {
            e(C3609c.g(this.g, c0742c));
            return;
        }
        C3609c c3609c2 = this.q;
        c3609c2.o0.sendMessageDelayed(Message.obtain(c3609c2.o0, 9, this.g), 5000L);
    }

    public final void J(C0742c c0742c) {
        C0821p.d(this.q.o0);
        a.f fVar = this.f;
        fVar.e("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c0742c));
        I(c0742c, null);
    }

    public final void K(ax.L5.E e) {
        C0821p.d(this.q.o0);
        this.i.add(e);
    }

    public final void L() {
        C0821p.d(this.q.o0);
        if (this.m) {
            F();
        }
    }

    public final void M() {
        C0821p.d(this.q.o0);
        e(C3609c.q0);
        this.h.f();
        for (C0795g c0795g : (C0795g[]) this.j.keySet().toArray(new C0795g[0])) {
            G(new z(c0795g, new C2328k()));
        }
        d(new C0742c(4));
        if (this.f.a()) {
            this.f.i(new n(this));
        }
    }

    public final void N() {
        C0821p.d(this.q.o0);
        if (this.m) {
            l();
            C3609c c3609c = this.q;
            e(c3609c.g0.g(c3609c.f0) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
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
        return o(true);
    }

    public final int p() {
        return this.k;
    }

    final int q() {
        return this.p;
    }

    @Override // ax.L5.InterfaceC0797i
    public final void r(C0742c c0742c) {
        I(c0742c, null);
    }

    public final C0742c s() {
        C0821p.d(this.q.o0);
        return this.o;
    }

    public final a.f u() {
        return this.f;
    }

    @Override // ax.L5.InterfaceC0791c
    public final void w(int i) {
        if (Looper.myLooper() == this.q.o0.getLooper()) {
            i(i);
        } else {
            this.q.o0.post(new l(this, i));
        }
    }

    public final Map x() {
        return this.j;
    }
}
