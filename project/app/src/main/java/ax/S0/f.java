/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Looper;
import ax.S0.c;
import ax.S0.d;
import ax.S0.e;
import ax.S0.h;
import ax.S0.q;

public final class f<T> {
    private final q a;
    private final q b;
    private final a<T> c;
    private T d;
    private T e;
    private int f;

    public f(T t8, Looper looper, Looper looper2, h h8, a<T> a8) {
        this.a = h8.d(looper, null);
        this.b = h8.d(looper2, null);
        this.d = t8;
        this.e = t8;
        this.c = a8;
    }

    public static /* synthetic */ void a(f f8, ax.q7.f f9) {
        f9 = f9.apply(f8.e);
        f8.e = f9;
        f8.f(new e(f8, f9));
    }

    public static /* synthetic */ void b(f f8, Object object) {
        if (f8.f == 0) {
            f8.i(object);
        }
    }

    public static /* synthetic */ void c(f f8, Object object) {
        int n8;
        f8.f = n8 = f8.f - 1;
        if (n8 == 0) {
            f8.i(object);
        }
    }

    private void f(Runnable runnable2) {
        if (!this.b.l().getThread().isAlive()) {
            return;
        }
        this.b.c(runnable2);
    }

    private void i(T t8) {
        T t9 = this.d;
        this.d = t8;
        if (!t9.equals(t8)) {
            this.c.a(t9, t8);
        }
    }

    public T d() {
        Looper looper = Looper.myLooper();
        if (looper == this.b.l()) {
            return this.d;
        }
        boolean bl = looper == this.a.l();
        ax.S0.a.g(bl);
        return this.e;
    }

    public void e(Runnable runnable2) {
        if (!this.a.l().getThread().isAlive()) {
            return;
        }
        this.a.c(runnable2);
    }

    public void g(T t8) {
        this.e = t8;
        this.f(new c(this, t8));
    }

    public void h(ax.q7.f<T, T> f8, ax.q7.f<T, T> f9) {
        boolean bl = Looper.myLooper() == this.b.l();
        ax.S0.a.g(bl);
        ++this.f;
        this.e(new d(this, f9));
        this.i(f8.apply(this.d));
    }

    public static interface a<T> {
        public void a(T var1, T var2);
    }
}

