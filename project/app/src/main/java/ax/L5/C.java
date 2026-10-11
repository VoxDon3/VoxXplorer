/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import ax.J5.c;
import ax.K5.a;
import ax.K5.g;
import ax.L5.A;
import ax.L5.B;
import ax.L5.z;
import ax.M5.P;
import ax.M5.d;
import ax.M5.p;
import ax.h6.e;
import ax.h6.f;
import ax.i6.l;
import java.util.Set;

public final class C
extends ax.i6.d
implements g.a,
g.b {
    private static final a.a l = ax.h6.e.c;
    private final Context e;
    private final Handler f;
    private final a.a g;
    private final Set h;
    private final d i;
    private f j;
    private B k;

    public C(Context context, Handler handler, d d8) {
        a.a a8 = l;
        this.e = context;
        this.f = handler;
        this.i = p.m(d8, "ClientSettings must not be null");
        this.h = d8.g();
        this.g = a8;
    }

    static /* bridge */ /* synthetic */ B b2(C c8) {
        return c8.k;
    }

    static /* bridge */ /* synthetic */ void c2(C c8, l a8) {
        Object object = ((l)a8).k();
        if (((c)object).C()) {
            object = p.l(((l)a8).y());
            if (!((c)(a8 = ((P)object).k())).C()) {
                object = String.valueOf(a8);
                Exception exception = new Exception();
                Log.wtf((String)"SignInCoordinator", (String)"Sign-in succeeded with resolve account failure: ".concat((String)object), (Throwable)exception);
                c8.k.a((c)a8);
                c8.j.b();
                return;
            }
            c8.k.b(((P)object).y(), c8.h);
        } else {
            c8.k.a((c)object);
        }
        c8.j.b();
    }

    @Override
    public final void B(Bundle bundle) {
        this.j.n(this);
    }

    public final void d2(B object) {
        Object object2 = this.j;
        if (object2 != null) {
            object2.b();
        }
        this.i.k(System.identityHashCode(this));
        object2 = this.g;
        Context context = this.e;
        Handler handler = this.f;
        d d8 = this.i;
        this.j = ((a.a)object2).a(context, handler.getLooper(), d8, d8.h(), this, this);
        this.k = object;
        object = this.h;
        if (object != null && !object.isEmpty()) {
            this.j.p();
            return;
        }
        this.f.post((Runnable)new z(this));
    }

    public final void e2() {
        f f8 = this.j;
        if (f8 != null) {
            f8.b();
        }
    }

    @Override
    public final void r(c c8) {
        this.k.a(c8);
    }

    @Override
    public final void t0(l object) {
        object = new A(this, (l)object);
        this.f.post((Runnable)object);
    }

    @Override
    public final void w(int n8) {
        this.k.d(n8);
    }
}

