/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import ax.Y6.b;
import ax.Y6.f;
import ax.a6.A;
import ax.a6.C0;
import ax.a6.F0;
import ax.a6.I;
import ax.a6.L;
import ax.a6.N;
import ax.a6.O;
import ax.a6.P;
import ax.a6.c;
import ax.a6.c0;
import ax.a6.p;
import ax.a6.x;
import ax.a6.y;
import ax.c0.r0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class C
implements b {
    private final Application a;
    private final P b;
    private final p c;
    private final I d;
    private final C0 e;
    private Dialog f;
    private N g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final AtomicReference i = new AtomicReference();
    private final AtomicReference j = new AtomicReference();
    private final AtomicReference k = new AtomicReference();
    boolean l = false;

    public C(Application application, c c8, P p8, p p9, I i8, C0 c02) {
        this.a = application;
        this.b = p8;
        this.c = p9;
        this.d = i8;
        this.e = c02;
    }

    static /* bridge */ /* synthetic */ Application b(C c8) {
        return c8.a;
    }

    static /* bridge */ /* synthetic */ Dialog c(C c8) {
        return c8.f;
    }

    static /* bridge */ /* synthetic */ P e(C c8) {
        return c8.b;
    }

    static /* bridge */ /* synthetic */ AtomicReference f(C c8) {
        return c8.k;
    }

    private final void l() {
        Object object = this.f;
        if (object != null) {
            object.dismiss();
            this.f = null;
        }
        this.b.a(null);
        object = this.k.getAndSet(null);
        if (object != null) {
            y.a((y)object);
        }
    }

    @Override
    public final void a(Activity object, b.a a8) {
        c0.a();
        if (!this.h.compareAndSet(false, true)) {
            object = true != this.l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.";
            a8.a(new F0(3, (String)object).a());
            return;
        }
        this.g.c();
        y y8 = new y(this, (Activity)object);
        this.a.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)y8);
        this.k.set(y8);
        this.b.a((Activity)object);
        y8 = new Dialog((Context)object, 0x1030010);
        y8.setContentView((View)this.g);
        y8.setCancelable(false);
        object = y8.getWindow();
        if (object == null) {
            a8.a(new F0(3, "Activity with null windows is passed in.").a());
            return;
        }
        object.setLayout(-1, -1);
        object.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        object.setFlags(0x1000000, 0x1000000);
        r0.b((Window)object, false);
        this.j.set(a8);
        y8.show();
        this.f = y8;
        this.g.d("UMP_messagePresented", "");
    }

    final N d() {
        return this.g;
    }

    final void g(f.b object, f.a object2) {
        N n8;
        this.g = n8 = ((O)this.e).b();
        n8.setBackgroundColor(0);
        n8.getSettings().setJavaScriptEnabled(true);
        n8.getSettings().setAllowFileAccess(false);
        n8.getSettings().setAllowContentAccess(false);
        n8.setWebViewClient(new L(n8, null));
        object = new A((f.b)object, (f.a)object2, null);
        this.i.set(object);
        object = this.g;
        object2 = this.d;
        object.loadDataWithBaseURL(((I)object2).a(), ((I)object2).b(), "text/html", "UTF-8", null);
        c0.a.postDelayed((Runnable)new x(this), 10000L);
    }

    final void h(int n8) {
        this.l();
        b.a a8 = this.j.getAndSet(null);
        if (a8 == null) {
            return;
        }
        this.c.e(n8);
        a8.a(null);
    }

    final void i(F0 f02) {
        this.l();
        b.a a8 = this.j.getAndSet(null);
        if (a8 == null) {
            return;
        }
        a8.a(f02.a());
    }

    final void j() {
        A a8 = this.i.getAndSet(null);
        if (a8 == null) {
            return;
        }
        a8.a(this);
    }

    final void k(F0 f02) {
        A a8 = this.i.getAndSet(null);
        if (a8 == null) {
            return;
        }
        a8.b(f02.a());
    }
}

