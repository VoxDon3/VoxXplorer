package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import ax.n2.C2575c;
import ax.n2.InterfaceC2576d;

/* loaded from: classes.dex */
class x implements androidx.lifecycle.c, InterfaceC2576d, ax.G0.v {
    private final Fragment a;
    private final androidx.lifecycle.r b;
    private androidx.lifecycle.g c = null;
    private C2575c d = null;

    x(Fragment fragment, androidx.lifecycle.r rVar) {
        this.a = fragment;
        this.b = rVar;
    }

    void a(d.a aVar) {
        this.c.h(aVar);
    }

    void b() {
        if (this.c == null) {
            this.c = new androidx.lifecycle.g(this);
            C2575c a = C2575c.a(this);
            this.d = a;
            a.c();
        }
    }

    boolean c() {
        return this.c != null;
    }

    void d(Bundle bundle) {
        this.d.d(bundle);
    }

    void e(Bundle bundle) {
        this.d.e(bundle);
    }

    void f(d.b bVar) {
        this.c.m(bVar);
    }

    @Override // androidx.lifecycle.c
    public ax.I0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.a.p2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        ax.I0.d dVar = new ax.I0.d();
        if (application != null) {
            dVar.c(q.a.g, application);
        }
        dVar.c(androidx.lifecycle.m.a, this.a);
        dVar.c(androidx.lifecycle.m.b, this);
        if (this.a.j0() != null) {
            dVar.c(androidx.lifecycle.m.c, this.a.j0());
        }
        return dVar;
    }

    @Override // ax.G0.h
    public androidx.lifecycle.d getLifecycle() {
        b();
        return this.c;
    }

    @Override // ax.n2.InterfaceC2576d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.d.b();
    }

    @Override // ax.G0.v
    public androidx.lifecycle.r getViewModelStore() {
        b();
        return this.b;
    }
}
