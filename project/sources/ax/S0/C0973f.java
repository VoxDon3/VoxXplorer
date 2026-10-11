package ax.S0;

import android.os.Looper;
import ax.q7.InterfaceC2879f;

/* renamed from: ax.S0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973f<T> {
    private final InterfaceC0984q a;
    private final InterfaceC0984q b;
    private final a<T> c;
    private T d;
    private T e;
    private int f;

    /* renamed from: ax.S0.f$a */
    public interface a<T> {
        void a(T t, T t2);
    }

    public C0973f(T t, Looper looper, Looper looper2, InterfaceC0975h interfaceC0975h, a<T> aVar) {
        this.a = interfaceC0975h.d(looper, null);
        this.b = interfaceC0975h.d(looper2, null);
        this.d = t;
        this.e = t;
        this.c = aVar;
    }

    public static /* synthetic */ void a(final C0973f c0973f, InterfaceC2879f interfaceC2879f) {
        final T t = (T) interfaceC2879f.apply(c0973f.e);
        c0973f.e = t;
        c0973f.f(new Runnable() { // from class: ax.S0.e
            @Override // java.lang.Runnable
            public final void run() {
                C0973f.c(C0973f.this, t);
            }
        });
    }

    public static /* synthetic */ void b(C0973f c0973f, Object obj) {
        if (c0973f.f == 0) {
            c0973f.i(obj);
        }
    }

    public static /* synthetic */ void c(C0973f c0973f, Object obj) {
        int i = c0973f.f - 1;
        c0973f.f = i;
        if (i == 0) {
            c0973f.i(obj);
        }
    }

    private void f(Runnable runnable) {
        if (this.b.l().getThread().isAlive()) {
            this.b.c(runnable);
        }
    }

    private void i(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.a(t2, t);
    }

    public T d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == this.b.l()) {
            return this.d;
        }
        C0968a.g(myLooper == this.a.l());
        return this.e;
    }

    public void e(Runnable runnable) {
        if (this.a.l().getThread().isAlive()) {
            this.a.c(runnable);
        }
    }

    public void g(final T t) {
        this.e = t;
        f(new Runnable() { // from class: ax.S0.c
            @Override // java.lang.Runnable
            public final void run() {
                C0973f.b(C0973f.this, t);
            }
        });
    }

    public void h(InterfaceC2879f<T, T> interfaceC2879f, final InterfaceC2879f<T, T> interfaceC2879f2) {
        C0968a.g(Looper.myLooper() == this.b.l());
        this.f++;
        e(new Runnable() { // from class: ax.S0.d
            @Override // java.lang.Runnable
            public final void run() {
                C0973f.a(C0973f.this, interfaceC2879f2);
            }
        });
        i(interfaceC2879f.apply(this.d));
    }
}
