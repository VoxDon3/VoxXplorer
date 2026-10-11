/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import ax.G0.h;
import ax.Gb.l;

public class o {
    private final g a;
    private final Handler b;
    private a c;

    public o(h h8) {
        l.f(h8, "provider");
        this.a = new g(h8);
        this.b = new Handler();
    }

    private final void f(d.a a8) {
        a a9 = this.c;
        if (a9 != null) {
            a9.run();
        }
        this.c = a9 = new a(this.a, a8);
        a8 = this.b;
        l.c(a9);
        a8.postAtFrontOfQueue(a9);
    }

    public d a() {
        return this.a;
    }

    public void b() {
        this.f(d.a.ON_START);
    }

    public void c() {
        this.f(d.a.ON_CREATE);
    }

    public void d() {
        this.f(d.a.ON_STOP);
        this.f(d.a.ON_DESTROY);
    }

    public void e() {
        this.f(d.a.ON_START);
    }

    public static final class a
    implements Runnable {
        private final d.a c0;
        private boolean d0;
        private final g q;

        public a(g g8, d.a a8) {
            l.f(g8, "registry");
            l.f((Object)a8, "event");
            this.q = g8;
            this.c0 = a8;
        }

        @Override
        public void run() {
            if (!this.d0) {
                this.q.h(this.c0);
                this.d0 = true;
            }
        }
    }
}

